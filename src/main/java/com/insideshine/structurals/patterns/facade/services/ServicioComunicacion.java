package com.insideshine.structurals.patterns.facade.services;

import com.insideshine.structurals.patterns.facade.dao.BBDD;

public class ServicioComunicacion {

	public void setPreferencias (String cliente, PreferenciasComunicacion preferencias) {
		BBDD.INSTANCE.setPreferencias(cliente, preferencias);
	}

}
