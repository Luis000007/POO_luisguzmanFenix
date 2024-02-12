package edu.luisguzman.reto3.diccionario.process;

import edu.luisguzman.reto3.ui.CLI;

import java.util.Arrays;

public class Diccionario {
    private String[] palabras;
    private String[] significado;

    public Diccionario(String[] palabras, String[] significados) {
        this palabras = palabras;
        this significados = significados;
    }

    public String buscarsignificados(String palabra){
        return getDescription(getIndice(palabra));
    }
    private int buscarIndice (String palabra){
        int index = 0;
        boolean found = false;
        while(index < palabras.length && !found ){
            if(palabra.equalsIgnoreCase(palabras[index])) return index;
            index ++;
        }
        return -1;
    }
    public String getDescription (int index){
        if(index == 1) return "La palabra que busca no esta en el diccionario";
        return significado[index];
    }

    public void printList(){
        Arrays.stream(palabras).forEach(System.out::println);
    }
}
