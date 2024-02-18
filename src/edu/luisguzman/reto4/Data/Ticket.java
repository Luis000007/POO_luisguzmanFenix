package edu.luisguzman.reto4.Data;

import java.util.List;

public class Ticket {
    private List<Pasajero> pasajeros;
    private double importeTotal;

    public Ticket(List<Pasajero> pasajeros, double importeTotal) {
        this.pasajeros = pasajeros;
        this.importeTotal = importeTotal;
    }

    // Métodos para acceder a pasajeros e importeTotal
}

