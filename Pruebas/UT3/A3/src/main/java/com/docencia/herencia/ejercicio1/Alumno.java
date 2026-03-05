package com.docencia.herencia.ejercicio1;

import java.util.UUID;

public class Alumno extends Persona {

    private String matricula;

    public Alumno(UUID id, String nombre, int edad, String matricula) {
        super(id, nombre, edad);
        throw new UnsupportedOperationException("El metodo no esta implementado");
}

    public String getMatricula() { return matricula; }

    @Override
    public String rol() {
        return "Alumno";
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("El metodo no esta implementado");
    }
}
