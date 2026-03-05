package com.docencia.examen.clases;

//TODO: Completar clase Usuario con las funciones necesarias, y documenta la clase.
public class Usuario {

    String identificador;
    String nombre;
    String apellidos;

   public Usuario() {
    }

   public Usuario(String identificador) {

    }
    
    @Override
    public int hashCode() {
        return 0;
    }


    public Usuario(String identificador, String nombre, String apellidos) {

    }

    public String getIdentificador() {
        return identificador;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }

}
