package com.docencia.model;

import java.util.Objects;

/**
 * Clase abstracta que representa a una persona con informacion basica.
 * Contiene el identificador y el nombre de la persona.
 * Sirve como clase base para otras entidades como Usuario.
 * 
 * @author santiago
 * @version 1.0.0
 */
public class Persona {
    private final int id;
    private String nombre;

    public Persona(int id) {
        this.id = id;
    }

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this){
            return true;
        }
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombre='" + getNombre() + "'" +
                "}";
    }

}
