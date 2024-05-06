package com.insideshine.structurals.patterns.composite.example;

import com.insideshine.structurals.patterns.composite.Archivo;
import com.insideshine.structurals.patterns.composite.Directorio;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeApp {

	public static void main(String[] args) {

		System.out.println("Composite pattern");

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

		/*boolean encontrado = doc.buscar("patron-composite.doc");
		System.out.println("Encontrado \"patron-composite.doc\":"+encontrado);

		 encontrado = doc.buscar("Api Stream");
		System.out.println("Encontrado \"Api Stream\":"+encontrado);

		encontrado = doc.buscar("Api Stre");
		System.out.println("Encontrado \"Api Stre\":"+encontrado);*/
	}

}
