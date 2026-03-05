package com.docencia.examen.herencia;

//TODO: Completar clase Directivo con las funciones necesarias, y documenta la clase.
public class Directivo extends Empleado {

    String categoria;   
    double complemento; 

    public Directivo() {

    }

    public Directivo(String identificador) {

    }

    public Directivo(String identificador,
                     String nombre,
                     String apellidos,
                     String departamento,
                     double salario,
                     String categoria,
                     double complemento) {

    }

    public String getCategoria() {
        return categoria;
    }

    public double getComplemento() {
        return 0.0;
    }

    //TODO: devuelve el salario total (salario base + complemento)
    public double getSalarioTotal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "identificador='" + getIdentificador() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos()+ '\'' +
                ", departamento='" + departamento + '\'' +
                ", salarioBase=" + salario +
                ", categoria='" + categoria + '\'' +
                ", complemento=" + complemento +
                ", salarioTotal=" + getSalarioTotal() +
                '}';
    }

}
