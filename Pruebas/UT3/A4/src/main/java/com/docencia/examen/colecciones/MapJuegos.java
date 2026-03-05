package com.docencia.examen.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.docencia.examen.herencia.Juego;

public class MapJuegos {

    private final Map<String, Juego> juegos = new HashMap<>();

    public boolean crearJuego(Juego juego) {
        
        return false;
    }

    public Juego buscarId(String id) {
        return null;
    }

    public Juego buscarJuego(Juego juego) {
        return null;
    }

    public boolean actualizarJuego(Juego juego) {
        return false;
    }

    public boolean eliminarId(String id) {
        return false;
    }

    public boolean existeJuego(String id) {
        return false;
    }

    public double calcularPrecio(String tipo) {
        return 0.0;
    }

    public double calcularPrecioTotal() {
        return 0.0;
    }

    public int contarPorTipo(String tipo) {
        return 0;
    }

    public int contar() { return 0; }

    public List<Juego> listar() { return null; }
}
