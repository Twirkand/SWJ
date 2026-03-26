package com.docencia.util;

import java.util.regex.Pattern;

/**
 * Clase con las utilidades para validaciones de datos, como email y password
 * 
 * @author santiago
 * @version 1.0.0
 */
public class Validaciones {

    public static String normalizarEmail(String email) {
        if (email == null || email.isBlank()) {
            return null;
        }
        return email.trim().toLowerCase();
    }

    public static boolean emailValida(String email) {
        email = normalizarEmail(email);
        if (email == null) {
            return false;
        }
        String patron = "^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$";
        return Pattern.matches(patron, email);
    }

    public static boolean emailValido(String email) {
        return emailValida(email);
    }

    public static boolean passwordValido(String password) {
        return password != null && !password.isBlank();
    }

    public static boolean passwordValida(String password) {
        return passwordValido(password);
    }

    public static void validarNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser null o vacío");
        }
    }

    public static void validarEmail(String email) {
        if (!emailValida(email)) {
            throw new IllegalArgumentException("Email inválido");
        }
    }

    public static void validarPassword(String password) {
        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("La contraseña no puede ser null o vacía");
        }
    }
}
