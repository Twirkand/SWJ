package com.docencia.ejercicio.clases.cinco;

public class Estudiante {
    private String dni;
    private String nombre;

    public Estudiante(String dni, String nombre) {

    }

    public String getDni() { return dni; }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }


    @Override
    public String toString() {
        return "";
    }
}

