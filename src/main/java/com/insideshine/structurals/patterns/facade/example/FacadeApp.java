package com.insideshine.structurals.patterns.facade.example;

import com.insideshine.structurals.patterns.facade.facade.FacadeService;

import java.util.Scanner;

public class FacadeApp {

    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de FacadeService
        FacadeService facadeService = new FacadeService();

        // Bucle para solicitar la entrada del usuario hasta que decida salir
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Ingresar un nuevo cliente");
            System.out.println("2. Mostrar los datos del cliente asociado");
            System.out.println("3. Salir");

            // Leer la opción del usuario
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del cliente:");
                    String cliente = scanner.nextLine();
                    System.out.println("Ingrese el correo electrónico del cliente:");
                    String email = scanner.nextLine();
                    // Realizar la inscripción express
                    facadeService.inscripcionExpress(cliente, email);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del cliente para mostrar sus datos:");
                    String nombreCliente = scanner.nextLine();
                    // Mostrar los datos del cliente asociado
                    facadeService.mostrarDatosCliente(nombreCliente);
                    break;
                case 3:
                    // Salir del programa
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
