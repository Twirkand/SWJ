package com.docencia.examen.herencia;

import java.util.Objects;

public abstract class Juego {

    protected String id;
    protected String titulo;
    protected double complemento; // porcentaje (0..100)

    protected Juego() {}

    protected Juego(String id, String titulo, double complemento) {
    }

    public String getId() { return id; }
    public String getTitulo() { return titulo; }
    public double getComplemento() { return complemento; }

    public abstract String tipoJuego();

    
}
