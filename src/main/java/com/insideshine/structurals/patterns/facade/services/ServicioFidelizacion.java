package com.insideshine.structurals.patterns.facade.services;

import com.insideshine.structurals.patterns.facade.dao.BBDD;

public class ServicioFidelizacion {

	public enum Tipo { BASICA, PREMIUM, VIP }
	
	public void crearTarjeta(String cliente, Tipo tipo) {
		BBDD.INSTANCE.addTarjeta(cliente, tipo);
	}

}
