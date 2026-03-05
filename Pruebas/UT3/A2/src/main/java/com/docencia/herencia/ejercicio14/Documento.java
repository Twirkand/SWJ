package com.docencia.herencia.ejercicio14;


import java.util.ArrayList;
import java.util.List;


public abstract class Documento {
    private final String titulo;

    protected Documento(String titulo) {
        this.titulo = null;
    }

    public String getTitulo() {
        return "";
    }

    public abstract String descripcion();
}
