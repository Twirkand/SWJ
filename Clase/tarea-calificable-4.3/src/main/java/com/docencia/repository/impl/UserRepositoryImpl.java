package com.docencia.repository.impl;

import java.util.HashSet;
import java.util.Set;

import com.docencia.model.Usuario;
import com.docencia.repository.IUserRepository;

/** Implementa en la memoria del repositorio de usuarios utilizando un HashSet
 * Almacena los usuarios y normaliza sus emails para asegurar busquedas consistentes
 * Proporciona operaciones basicas de almacenamiento y recuperacion de usuarios
 * 
 * @author santiago
 * @version 1.0.0
 */
 
public class UserRepositoryImpl implements IUserRepository {

    final Set<Usuario> usuarios;

    public UserRepositoryImpl(){
        usuarios = new HashSet<>();
    }

    @Override
    public Usuario findByEmail(String email){
        if(!existsByEmail(email)){
            return null;
        }
        Usuario usuarioBuscar = new Usuario(email);
        for (Usuario usuario: usuarios) {
            if(usuario.equals(usuarioBuscar)){
                return usuario;
            }
            
        }
        return null;
    }

    @Override
    public boolean existsByEmail(String email){
        Usuario usuarioBuscar = new Usuario(email);
        return usuarios.contains(usuarioBuscar);
    }

    @Override
    public boolean deleteByEmail(String email) {
       if(!existsByEmail(email)){
        return false;
       }
      return usuarios.remove(new Usuario(email));
       
    }

    @Override
    public void save(Usuario usuario) {
        usuarios.add(usuario);
       
    }

    @Override
    public Set<Usuario> findAll() {
        return  usuarios;
    }
}
