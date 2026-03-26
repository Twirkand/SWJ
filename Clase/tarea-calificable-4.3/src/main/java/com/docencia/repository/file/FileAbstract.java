package com.docencia.repository.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;

import com.docencia.model.Usuario;

public abstract class FileAbstract {

    private final String path;
    private final File file;

    public FileAbstract(String path) {
        this.path = path;
        file = new File(path);
        if (!file.exists() || !file.isFile()) {
            System.out.println("La ruta " + path + " no es una ruta valida o un fichero");
            throw new IllegalArgumentException(path);
        }
    }

    public Set<Usuario> read(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void write(File file, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(data);
            writer.newLine(); // Añadir una nueva línea después del registro
            System.out.println("Registro agregado.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}

