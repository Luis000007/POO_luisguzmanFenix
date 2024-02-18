package edu.luisguzman.reto4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CLI cli = new CLI();
        char opcion;
        List<Pasajero> listaPasajeros = new ArrayList<>();

        do {
            opcion = cli.mostrarMenu();

            switch (opcion) {
                case 'A':
                    // Lógica para realizar venta de boletos
                    break;
                case 'B':
                    // Lógica para mostrar datos de la lista de ventas
                    break;
                case 'S':
                    System.out.println("Finalizando programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 'S');
    }
}
