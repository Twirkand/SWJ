package com.docencia.herencia.ejercicio1;

import java.util.Objects;
import java.util.UUID;

/**
 * Clase base abstracta.
 * Incluye un identificador unico (UUID) y campos comunes.
 */
public abstract class Persona {

    private UUID id;
    private String nombre;
    private int edad;

    protected Persona(UUID id, String nombre, int edad) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public UUID getId() { return id; }
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }

    /** Metodo abstracto para demostrar polimorfismo. */
    public abstract String rol();

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("El metodo no esta implementado");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("El metodo no esta implementado");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("El metodo no esta implementado");
    }
}
