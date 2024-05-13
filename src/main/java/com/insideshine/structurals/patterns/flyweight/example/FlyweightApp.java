package com.insideshine.structurals.patterns.flyweight.example;

import com.insideshine.structurals.patterns.flyweight.Jugador1;
import com.insideshine.structurals.patterns.flyweight.Jugador2;
import com.insideshine.structurals.patterns.flyweight.Jugador3;

public class FlyweightApp {

	public static void main(String[] args) {
		Jugador1 jugador1 = new Jugador1("Messi", 170);
		Jugador2 jugador2 = new Jugador2("Ronaldo", 185);
		Jugador3 jugador3 = new Jugador3("Neymar", 175);

		System.out.println("\n\n------ Jugador 1 -----\n\n");
		System.out.println(jugador1.dibuja());
		System.out.println("\n\n------ Jugador 2 -----\n\n");
		System.out.println(jugador2.dibuja());
		System.out.println("\n\n------ Jugador 3 -----\n\n");
		System.out.println(jugador3.dibuja());
	}

}
