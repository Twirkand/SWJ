package com.docencia.examen.herencia;

import com.docencia.examen.interfaces.TarificableJuego;

public class JuegoMesa extends Juego implements TarificableJuego {

    public JuegoMesa() { super(); }

    public JuegoMesa(String id, String titulo, double complemento) {
        super(id, titulo, complemento);
    }

    @Override
    public String tipoJuego() {
        return "MESA";
    }

    @Override
    public double precio() {
        return 0.0;
    }
}
