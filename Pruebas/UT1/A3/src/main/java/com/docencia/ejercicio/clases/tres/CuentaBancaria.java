package com.docencia.ejercicio.clases.tres;

public class CuentaBancaria {
    private String titular;
    private String numero;
    private double saldo;

    public CuentaBancaria(String titular, String numero) {
    }

    public CuentaBancaria(String titular, String numero, double saldoInicial) {

    }

    public String getTitular() { return titular; }
    public void setTitular(String titular) {
        
        this.titular = titular;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return numero.toUpperCase().hashCode();
    }

    @Override
    public String toString() {
        return "";
    }
}

