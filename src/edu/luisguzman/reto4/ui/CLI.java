package edu.luisguzman.reto4.ui;

import java.util.Scanner;

public class CLI {
    public char mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menú:");
        System.out.println("A. Realizar venta de boleto");
        System.out.println("B. Mostrar datos de la lista de ventas");
        System.out.println("S. Finalizar programa");
        System.out.print("Seleccione una opción: ");
        return scanner.next().charAt(0);
    }

    // Otros métodos según necesidades
}




