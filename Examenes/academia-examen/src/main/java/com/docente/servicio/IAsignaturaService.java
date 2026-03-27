package com.docente.servicio;

import java.util.List;

import com.docente.modelo.Asignatura;

public interface IAsignaturaService {
    /**
     * Funcion que lee la lista de asignaturas
     * @return String de asignaturas
     */
    List<String> read();
    /**
     * Funcion que crea una asignatura
     * @return true/false
     */
    boolean crearAsignatura(String codigo, String nombre, int horasSemanales);
    /**
     * Funcion que actualiza una asignatura
     * @return true/false
     */
    boolean actualizarAsignatura(String codigo, String nombre, int horasSemanales);
    /**
     * Funcion que borra una asignatura mediante su codigo
     * @return true/false
     */
    boolean deleteAsignatura(String codigo);
    /**
     * Funcion qu busca una asignatura mediante su codigo
     * @return true/false
     */
    Asignatura buscarAsignatura(String codigo);
}
