package com.insideshine.structurals.patterns.flyweight;

public class Jugador3 {

	private String nombre;
	private int altura;
	// Otros atributos específicos de Jugador1

	public Jugador3(String nombre, int altura) {
		this.nombre = nombre;
		this.altura = altura;
		// Inicializar otros atributos específicos de Jugador1
	}

	public String dibuja() {
		return "Jugador: " + nombre + ", Altura: " + altura + "\n" + Camiseta.UNICA.dibuja("3");
	}

}
