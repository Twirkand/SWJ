package com.docente.modelo;

import java.util.Objects;

/**
 * TODO alumnado: Implementa esta clase completa a partir del enunciado del
 * README.
 *
 * Requisitos mínimos: - atributos: codigo, nombre, horasSemanales -
 * constructores - getters y setters - equals y hashCode por codigo - toString -
 * toCsv
 */
public class Asignatura {

    private String codigo;
    private String nombre;
    private int horasSemanales;

    public Asignatura(String codigo) {
        this.codigo = codigo;
    }

    public Asignatura(String codigo, String nombre, int horasSemanales) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public String toCsv() {
        return String.format("%s" + "|" + "%s" + "|" + "%d",
                getCodigo(), getNombre(), getHorasSemanales());
    }

    @Override
    public String toString() {
        return "Asignatura [codigo=" + getCodigo() + ", nombre=" + getNombre() + ", horasSemanales=" + getHorasSemanales() + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Asignatura other = (Asignatura) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

}
