package edu.luisguzman.reto4.Data;

public class Pasajero {
    private Usuario usuario;
    private Boleto boleto;

    public Pasajero(Usuario usuario, Boleto boleto) {
        this.usuario = usuario;
        this.boleto = boleto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Boleto getBoleto() {
        return boleto;
    }
}

