package edu.luisguzman.reto3.diccionario.ui;

import edu.luisguzman.reto3.process.Diccionario;

import java.until.Scanner
public class CLI {
    public static void showMenu(Diccionario diccionario){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("-----diccionario-----");
            System.out.println("**********************");
            System.out.println("1. Mostrar palabras del diccionario");
            System.out.println("2. Buscar palabra del diccionario");
            System.out.println("3. Detalle del diccionario");
            System.out.println("4. Salir del progrma");
            System.out.println("**********************");
            String opcion = scanner.nextLine();
            switch (opcion) {
                case "a":
                    diccionario.printList();
                    break;
                case "b":
                    System.out.println("¿Que palabra quiere conocer");
                    String palabra = scanner.nextLine();
                    String significado = diccionario.buscarSignificado(palabra);
                    System.out.print( % s: );
            }
        }
    }
}
