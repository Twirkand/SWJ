package com.docencia.service;

import java.util.Set;

import com.docencia.model.Usuario;

public interface IUserService {

  Usuario crearUsuario(int id, String nombre, String email, String password);

  Set<Usuario> listarUsuarios();

  /**
   * Funcion que retorna un usuario a traves de su email
   * 
   * @param email String con el email del usuario
   * @return Objeto de clase usuario
   */
  Usuario buscarPorEmail(String email);

  /**
   * Funcion que elimina un usuario por email
   * @param email String con el email del usuario
   * @return true/false
   */
  boolean eliminarPorEmail(String email);

  /**
   * Funcion que cambia el nombre del usuario
   * @param email
   * @param nuevoNombre
   * @return
   */
  Usuario cambiarNombre(String email, String nuevoNombre);

  /**
   * Funcion que cambia la password de un usuario
   * @param email
   * @param nuevaPassword
   * @return
   */
  Usuario cambiarPassword(String email, String nuevaPassword);
}