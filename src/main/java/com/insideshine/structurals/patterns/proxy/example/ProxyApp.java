package com.insideshine.structurals.patterns.proxy.example;

import com.insideshine.structurals.patterns.proxy.Cuenta;
import com.insideshine.structurals.patterns.proxy.CuentaNormal;
import com.insideshine.structurals.patterns.proxy.CuentaNueva;

public class ProxyApp {
    public static void main(String[] args) {
        // Supongamos que el usuario tiene diferentes niveles de acceso
        boolean usuarioProtegido = true; // Cambiar a false si el usuario no está protegido

        Cuenta cuenta;

        // Si el usuario está protegido, usar la cuenta protegida (proxy)
        if (usuarioProtegido) {
            cuenta = new CuentaNueva("María");
        } else {
            cuenta = new CuentaNormal("Juan");
        }

        // Realizar movimientos en la cuenta
        cuenta.movimiento(200); // Depositar 200
        cuenta.movimiento(-150); // Retirar 150
        cuenta.movimiento(-300); // Intentar retirar 300

        // Mostrar el estado del usuario y los detalles de la cuenta
        System.out.println("Estado del usuario: " + (usuarioProtegido ? "Protegido" : "No Protegido"));
        System.out.println("Detalles de la cuenta:");
        System.out.println("Cliente: " + cuenta.getCliente());
        System.out.println("Cantidad: " + cuenta.getCantidad());
    }
}
