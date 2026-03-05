package com.docencia.examen.herencia;

import com.docencia.examen.interfaces.TarificableJuego;

public class Arcade extends Juego implements TarificableJuego {

    public Arcade() { super(); }

    public Arcade(String id, String titulo, double complemento) {
        super(id, titulo, complemento);
    }

    @Override
    public String tipoJuego() {
        return "ARCADE";
    }

    @Override
    public double precio() {
        return 0.0;
    }
}
