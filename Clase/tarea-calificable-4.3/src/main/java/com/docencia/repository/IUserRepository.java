package com.docencia.repository;

import java.util.Set;

import com.docencia.model.Usuario;

public interface IUserRepository {

  /**
   * Funcion que almacena un usuario en el repositorio
   * 
   * @param usuario que retorna del repositorio
   */
  void save(Usuario usuario);

  Usuario findByEmail(String email);

  public boolean existsByEmail(String email);

  Set<Usuario> findAll();

  public boolean deleteByEmail(String email);
}
