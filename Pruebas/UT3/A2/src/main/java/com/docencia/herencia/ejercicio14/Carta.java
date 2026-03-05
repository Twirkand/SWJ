package com.docencia.herencia.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class Carta extends Documento {
    public Carta(String titulo) {
        super(titulo);
        //TODO Auto-generated constructor stub
    }

    private String destinatario;

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getDestinatario() {
        return destinatario;
    }

    @Override
    public String descripcion() {
        return "";
    }
}
