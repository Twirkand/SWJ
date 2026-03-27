package com.docente.persistencia.impl;

import com.docente.modelo.Asignatura;
import com.docente.persistencia.IAsignaturaRepositorio;
import com.docente.ficheros.FicheroAsignatura;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.docente.servicio.AsignaturaService;

/**
 * TODO alumnado: Implementa la lectura y escritura en CSV de la entidad
 * Asignatura.
 */
public class AsignaturaRepositorioCSV extends FicheroAsignatura implements IAsignaturaRepositorio {

    private static final String path = "src/main/resources/asignaturas.csv";
    private final File file;

    public AsignaturaRepositorioCSV() {
        this(path);
    }

    public AsignaturaRepositorioCSV(String path) {
        this.file = new File(path);
        try {
            File parent = file.getParentFile();
            if (parent != null && !parent.exists()) {
                parent.mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new IllegalStateException("No se ha podido crear el fichero de asignaturas", e);
        }
    }

    @Override
    public List<Asignatura> obtenerAsignaturas() {
        return readAsignaturas();
    }

    @Override
    public boolean guardarAsignaturas(List<Asignatura> asignaturas) {
        updateFicheroAsignaturas(asignaturas);
        return true;
    }
}
