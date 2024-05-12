package com.insideshine.structurals.patterns.facade.facade;

import com.insideshine.structurals.patterns.facade.dao.BBDD;
import com.insideshine.structurals.patterns.facade.services.PreferenciasComunicacion;
import com.insideshine.structurals.patterns.facade.services.ServicioComunicacion;
import com.insideshine.structurals.patterns.facade.services.ServicioConfiguracion;
import com.insideshine.structurals.patterns.facade.services.ServicioFidelizacion;

public class FacadeService {

	private ServicioConfiguracion configuracion = new ServicioConfiguracion();
	private ServicioFidelizacion fidelizacion = new ServicioFidelizacion();
	private ServicioComunicacion comunicacion = new ServicioComunicacion();


	public boolean clienteYaInscrito(String cliente) {
		// Verificar si el cliente ya tiene una tarjeta de fidelización
		ServicioFidelizacion.Tipo tipoTarjeta = BBDD.INSTANCE.getTarjeta(cliente);
		return tipoTarjeta != null;
	}

	public void inscripcionExpress(String cliente, String email) {
		try {
			// Verificar si el cliente ya está inscrito
			if (clienteYaInscrito(cliente)) {
				System.out.println("El cliente " + cliente + " ya está inscrito.");
				return;
			}

			// Realizar la inscripción express
			fidelizacion.crearTarjeta(cliente, ServicioFidelizacion.Tipo.BASICA);
			configuracion.addEmail(cliente, email);
			PreferenciasComunicacion preferencias = new PreferenciasComunicacion(false, true, true);
			comunicacion.setPreferencias(cliente, preferencias);

			System.out.println("¡Inscripción express realizada con éxito para el cliente " + cliente + "!");
		} catch (Exception e) {
			System.err.println("Error al realizar la inscripción express para el cliente " + cliente + ": " + e.getMessage());
		}
	}
	public void mostrarDatosCliente(String cliente) {
		// Obtener el correo electrónico del cliente
		String email = BBDD.INSTANCE.getEmail(cliente);
		if (email != null) {
			System.out.println("Datos del cliente:");
			System.out.println("Nombre: " + cliente);
			System.out.println("Correo electrónico: " + email);

			// Obtener las preferencias de comunicación del cliente
			PreferenciasComunicacion preferencias = BBDD.INSTANCE.getPreferencias(cliente);
			if (preferencias != null) {
				System.out.println("Preferencias de comunicación:");
				System.out.println("  - Correos electrónicos diarios: " + (preferencias.isEmailDiario() ? "Sí" : "No"));
				System.out.println("  - Correos electrónicos semanales: " + (preferencias.isEmailSemanal() ? "Sí" : "No"));
				System.out.println("  - Correos electrónicos en formato HTML: " + (preferencias.isEmailHtml() ? "Sí" : "No"));
			} else {
				System.out.println("El cliente " + cliente + " no tiene preferencias de comunicación registradas.");
			}
		} else {
			System.out.println("No se encontraron datos para el cliente " + cliente);
		}
	}
}
