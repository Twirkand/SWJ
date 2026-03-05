package com.docencia.ejercicio.clases.uno;

import java.util.Objects;

public class Punto2D {
    private double x;
    private double y;

    public Punto2D() {
    
    }

    public Punto2D(double x, double y) {

    }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "";
    }

    
}

