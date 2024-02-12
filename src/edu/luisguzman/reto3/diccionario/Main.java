package edu.luisguzman.reto3.ui;

import edu.luisguzman.reto3.process.Diccionario;

public class Main {
    public static void main(String[] args) {
        String palabras [] = {" perro " , " casa "};
        String significado [] = {" Amigo del humano " , "casa del humano "};
        Diccionario diccionario = new Diccionario(palabras, significado);
        CLI.showMenu(diccionario);
    }
}
