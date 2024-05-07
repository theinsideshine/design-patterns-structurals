package com.insideshine.structurals.patterns.bridge.example;


import com.insideshine.structurals.patterns.bridge.banca.concrete.implementor.ServicioCredito;
import com.insideshine.structurals.patterns.bridge.banca.concrete.implementor.ServicioTarjeta;
import com.insideshine.structurals.patterns.bridge.banca.refined.abstration.EmpresaServicioFactory;
import com.insideshine.structurals.patterns.bridge.banca.refined.abstration.ParticularServicioFactory;
import com.insideshine.structurals.patterns.composite.Archivo;
import com.insideshine.structurals.patterns.composite.Directorio;
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

		/*System.out.println("Brige pattern");


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
		particularServicioFactory.prepararServicio();*/

		Directorio doc = new Directorio("Documentos");
		Directorio java = new Directorio("Java");

		java.addComponente(new Archivo("patron-composite.doc"));
		Directorio stream = new Directorio("Api Stream");
		stream.addComponente(new Archivo("stream-map.doc"));
		java.addComponente(stream);
        doc.addComponente(java);
		doc.addComponente(new Archivo("logo.png"));
		doc.addComponente(new Archivo("cv.doc"));

		System.out.println(doc.mostrar(0));
	}

}
