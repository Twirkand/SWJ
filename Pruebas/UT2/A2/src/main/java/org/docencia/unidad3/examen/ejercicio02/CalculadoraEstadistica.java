package org.docencia.unidad3.examen.ejercicio02;


public class CalculadoraEstadistica {

    public double operar(double a, double b, int opcion) {
        return 0;
    }

    public Estadisticas calcularEstadisticas(double[] numeros) {
        
        return null;
    }

    
    public static class Estadisticas {
        private final int cantidad;
        private final double media;
        private final double maximo;
        private final double minimo;

        public Estadisticas(int cantidad, double media, double maximo, double minimo) {
            this.cantidad = 0;
            this.media = 0;
            this.maximo = 0;
            this.minimo = 0;
        }

        public int getCantidad() {
            return cantidad;
        }

        public double getMedia() {
            return media;
        }

        public double getMaximo() {
            return maximo;
        }

        public double getMinimo() {
            return minimo;
        }

        @Override
        public String toString() {
         return "";
        }
        @Override
        public boolean equals(Object o) {
         return false;
        }

        
    }
}
