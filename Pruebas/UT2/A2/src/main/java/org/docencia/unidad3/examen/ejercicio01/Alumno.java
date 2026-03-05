package org.docencia.unidad3.examen.ejercicio01;

import java.util.Objects;

public class Alumno {

    private String nombre;
    private int nota;
    
    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return 0;
    }


    public void setNota(int nota) {

        this.nota = nota;
    }


    public String getCalificacionTexto() {
        return "";
    }

    

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
