package com.insideshine.structurals.patterns.proxy;

public interface Cuenta {

	String getCliente();

	int getCantidad();

	void movimiento(int importe);

}