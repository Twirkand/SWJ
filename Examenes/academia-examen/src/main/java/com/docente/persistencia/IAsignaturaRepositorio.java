package com.docente.persistencia;

import java.util.List;

import com.docente.modelo.Asignatura;

public interface IAsignaturaRepositorio {
    /**
     * Funcion que obtiene todos las asignaturas del repositorio
     * @return Lista de asignaturas
     * */
    List<Asignatura> obtenerAsignaturas();
    /**
     * Funcion que guarda una asignatura en el repositorio
     * @return true/false
     */
    boolean guardarAsignaturas(List<Asignatura> asignaturas);
}
