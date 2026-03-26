package com.docencia.service;

import com.docencia.model.Usuario;

/**
 * Interfaz de servicio de verificacion
 * @author santiago
 * @version 1.0.0
 */
public interface IAuthService {

  /**
   * Funcion que permite registrar un usuario dentro del sistema
   * @param id Id del usuario
   * @param nombre nombre del usuario
   * @param email email del usuario
   * @param password password del usuario
   * @return 
   */
  Usuario register(int id, String nombre, String email, String password);

  /**
   * Funcion que permite iniciar sesion a un usuario dentro del sistema, bloqueando
   * @param email
   * @param password
   * @return
   */
  boolean login(String email, String password);

  /**
   * Funcion que permite verificar si un usuario está bloqueado
   * @param email
   * @return
   */
  boolean isBloqueado(String email);

  /**
   * Funcion que permite desbloquear un usuario bloqueado
   * @param email
   */
  void desbloquear(String email);
}