package com.docencia.ejercicio.clases.cuatro;

import java.time.Year;

public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private int anio;

    public Coche() { }

    public Coche(String matricula) {

    }

    public Coche(String matricula, String marca, String modelo, int anio) {

    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) {
        this.anio = anio;
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

