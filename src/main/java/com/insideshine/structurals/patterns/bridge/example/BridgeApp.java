package com.insideshine.structurals.patterns.bridge.example;


import com.insideshine.structurals.patterns.bridge.banca.concrete.implementor.ServicioCredito;
import com.insideshine.structurals.patterns.bridge.banca.concrete.implementor.ServicioTarjeta;
import com.insideshine.structurals.patterns.bridge.banca.refined.abstration.EmpresaServicioFactory;
import com.insideshine.structurals.patterns.bridge.banca.refined.abstration.ParticularServicioFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BridgeApp {

	public static void main(String[] args) {

		System.out.println("Brige pattern");

		/*//Create machines
		ChurroMachineChocolate cmChocolate = new ChurroMachineChocolate();
		ChurroMachineStrawberry cmStrawberry = new ChurroMachineStrawberry();

		//Create Factory

		SmallChurroFactory smallChurroFactory = new SmallChurroFactory(cmChocolate);
		MediumChurroFactory mediumChurroFactory =  new MediumChurroFactory(cmStrawberry);
		LargeChurroFactory largeChurroFactory = new LargeChurroFactory(cmChocolate);

		//Start Factory

		smallChurroFactory.prepareChurro();
		mediumChurroFactory.prepareChurro();
		largeChurroFactory.prepareChurro();*/



		//Crear servicio
		ServicioCredito servicioCredito = new ServicioCredito();
		ServicioTarjeta servicioTarjeta = new ServicioTarjeta();

		//Crear Fabrica
		EmpresaServicioFactory empresaServicioFactory = new EmpresaServicioFactory(servicioCredito);
		ParticularServicioFactory particularServicioFactory = new ParticularServicioFactory(servicioTarjeta);

		//Empezar fabrica
		empresaServicioFactory.prepararServicio();
		particularServicioFactory.prepararServicio();

		//Editar Fabrica
		 empresaServicioFactory = new EmpresaServicioFactory(servicioTarjeta);
		 particularServicioFactory = new ParticularServicioFactory(servicioCredito);

		//Empezar fabrica
		empresaServicioFactory.prepararServicio();
		particularServicioFactory.prepararServicio();


	}

}
