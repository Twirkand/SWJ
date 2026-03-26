package com.docencia.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Clase que representa un usuario del sistema para identicarse
 * Extiende la clase Persona e incluye email, password, numero de intentos fallidos y estado de bloqueo del usuario
 * 
 * @author santiago
 * @version 1.0.0
 */
public class Usuario extends Persona {

    private final String email;
    private String password;
    private int intentosFallidos;
    private boolean bloqueado;
    private final LocalDate fechaRegistro;

    /**
     * Constructor que crea un usuario con su id
     * @param id Id del usuario
     */
    public Usuario(int id) {
        super(id);
        email = null;
        fechaRegistro = null;
    }

     /**
     * Constructor que crea un usuario con su email
     * @param email email del usuario
     */
    public Usuario(String email) {
        super(0);
        this.email = email;
        this.fechaRegistro = null;
    }


    /**
     * Constructor que crea un usuario con todos los datos necesarios
     * @param id       Id del usuario
     * @param nombre   nombre del usuario
     * @param email    email del usuario
     * @param password password del usuario
     */
    public Usuario(int id, String email, String password, String nombre) {
        super(id, nombre);
        this.email = email;
        this.password = password;
        this.intentosFallidos = 0;
        this.bloqueado = false;
        this.fechaRegistro = LocalDate.now();
    }
    
    // Getters y setters
    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIntentosFallidos() {
        return this.intentosFallidos;
    }

    public void setIntentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public boolean isBloqueado() {
        return this.bloqueado;
    }

    public boolean getBloqueado() {
        return this.bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public LocalDate getFechaRegistro() {
        return this.fechaRegistro;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "{ id='" + getId() + "'"
                + " email='" + getEmail() + "'"
                + ", password='" + getPassword() + "'"
                + ", intentosFallidos='" + getIntentosFallidos() + "'"
                + ", bloqueado='" + isBloqueado() + "'"
                + ", fechaRegistro='" + getFechaRegistro() + "'"
                + "}";
    }

    public void incrementarIntentosFallidos() {
        this.intentosFallidos++;
    }

    public void resetearIntentosFallidos() {
        this.intentosFallidos = 0;
    }

    public void bloquear() {
        this.bloqueado = true;

    }
}
