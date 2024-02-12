package edu.luisguzman.reto3.diccionario.process;

import java.util.Arrays;

public class Diccionario {
    private String[] palabras;
    private String[] significado;

    public Diccionario(String[] palabras, String[] significados) {
        this.palabras = palabras;
        this.significado = significados;
    }

    public String buscarSignificados(String palabra){
        return getDescription(buscarIndice(palabra));
    }

    private int buscarIndice(String palabra){
        int index = 0;
        boolean found = false;
        while(index < palabras.length && !found ){
            if(palabra.equalsIgnoreCase(palabras[index])) return index;
            index++;
        }
        return -1;
    }

    public String getDescription(int index){
        if(index == -1) return "La palabra que busca no está en el diccionario";
        return significado[index];
    }

    public void printList(){
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i] + ": " + significado[i]);
        }
    }
}
