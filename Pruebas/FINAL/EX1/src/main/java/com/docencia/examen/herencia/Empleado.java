package com.docencia.examen.herencia;

import com.docencia.examen.clases.Usuario;

//TODO: Completar clase Empleado con las funciones necesarias, y documenta la clase.
public class Empleado extends Usuario {

    String departamento;
    double salario;

    public Empleado() {

    }

    public Empleado(String identificador) {

    }

    public Empleado(String identificador, String nombre, String apellidos,
                    String departamento, double salario) {

    }

    public String getDepartamento() {
        return null;
    }

    public double getSalario() {
        return 0;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "identificador='" + getIdentificador() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellidos='" + getApellidos() + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }

}
