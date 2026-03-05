package org.docencia.ejercicio.calificable;

import java.util.Objects;

public class Persona {
    private String id;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String id, String nombre, int edad) {
        
    }


    public String getId() {
        return "";
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
