package com.insideshine.structurals.patterns.facade.services;


import com.insideshine.structurals.patterns.facade.dao.BBDD;

public class ServicioConfiguracion {

	public void addEmail(String cliente, String email) {
		BBDD.INSTANCE.setEmail(cliente, email);
	}

	
}
