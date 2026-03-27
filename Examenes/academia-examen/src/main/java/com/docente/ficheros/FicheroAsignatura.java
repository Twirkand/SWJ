package com.docente.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.docente.modelo.Asignatura;
import static com.docente.utils.Utilidades.DELIMITER;

public class FicheroAsignatura {

    File file;
    String path;

    public List<Asignatura> readAsignaturas() {
        List<Asignatura> asignaturas = new ArrayList<>();
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(DELIMITER);
                    asignaturas.add(new Asignatura(values[0], values[1], Integer.parseInt(values[2].strip())));
                }
            }
        } catch (Exception e) {
            System.err.printf("No se ha podido leer el fichero :%s", path);
        }
        return asignaturas;
    }

    public boolean cleanFile() {
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.err.printf("No se ha podido crear el fichero :%s", path);
            e.printStackTrace();
        }
        return true;
    }

    public void writeAsignaturas(Asignatura asignatura) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(asignatura.toCsv());
            bw.newLine();
        } catch (IOException e) {
            throw new IllegalStateException("Error al guardar el fichero CSV.", e);
        }
    }

    public void updateFicheroAsignaturas(List<Asignatura> asignaturas) {
        cleanFile();
        for (Asignatura asignatura : asignaturas) {
            writeAsignaturas(asignatura);
        }
    }
}
