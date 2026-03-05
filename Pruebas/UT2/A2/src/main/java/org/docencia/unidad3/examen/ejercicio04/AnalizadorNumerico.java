package org.docencia.unidad3.examen.ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class AnalizadorNumerico {

    public ContadorSignos contarSignos(int[] numeros) {
        return null;
    }

    
    public ParesImpares calcularParesImpares(int a, int b) {
    
        return null;
    }

    
    public int contarPrimos(int a, int b) {
    
        return 0;
    }

    public static class ContadorSignos {
        private final int positivos;
        private final int negativos;
        private final int ceros;

        public ContadorSignos(int positivos, int negativos, int ceros) {
            this.positivos = 0;
            this.negativos = 0;
            this.ceros = 0;
        }

        public int getPositivos() {
            return positivos;
        }

        public int getNegativos() {
            return negativos;
        }

        public int getCeros() {
            return ceros;
        }

        

        

        
    }

    
    public static class ParesImpares {
        private final List<Integer> pares;
        private final List<Integer> impares;

        public ParesImpares(List<Integer> pares, List<Integer> impares) {
            this.pares = new ArrayList<>(pares);
            this.impares = new ArrayList<>(impares);
        }

        public List<Integer> getPares() {
            return null;
        }

        public List<Integer> getImpares() {
            return null;
        }

        

        
    }
}
