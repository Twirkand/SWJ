package com.docencia.herencia.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
        private final String especialidad;

        public Profesor(String nombre, String especialidad) {
            super(nombre);
            this.especialidad = especialidad;
        }

        public String getEspecialidad() {
            return especialidad;
        }

        @Override
        public String descripcionRol() {
            // TODO: devolver descripción según tests.
            return "";
        }
    public static List<String> descripciones(List<Persona> personas) {
        // TODO: devolver lista de descripciones de personas no nulas.
        return new ArrayList<>();
    }    
    }

    
