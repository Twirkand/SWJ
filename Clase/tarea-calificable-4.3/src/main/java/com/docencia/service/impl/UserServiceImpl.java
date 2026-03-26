package com.docencia.service.impl;

import java.util.Set;

import com.docencia.model.Usuario;
import com.docencia.repository.IUserRepository;
import com.docencia.service.IUserService;
import com.docencia.util.Validaciones;

/**
 * Implemento del servicio de gestion de usuarios
 *
 * @author santiago
 * @version 1.0.0
 */
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Funcion que crea un usuario mediante sus datos, validando su email y
     * password
     *
     * @param id Id del usuario
     * @param nombre nombre del usuario
     * @param email email del usuario
     * @param password password del usuario
     * @return el usuario creado o null si los datos son invalidos
     */
    @Override
    public Usuario crearUsuario(int id, String nombre, String email, String password) {
        Usuario usuario = new Usuario(id, nombre, email, password);
        this.userRepository.save(usuario);
        return usuario;
    }

    @Override
    public Set<Usuario> listarUsuarios() {
        return userRepository.findAll();

    }

    /**
     * Funcion que devuelve un usuario mediante su email
     *
     * @param email String con el email del usuario
     * @return Objeto de clase usuario
     */
    @Override
    public Usuario buscarPorEmail(String email) {
        if (Validaciones.emailValida(email)) {
            return null;
        }
        email = Validaciones.normalizarEmail(email);
        return userRepository.findByEmail(email);
    }

    /**
     * Funcion que elimina un usuario mediante email
     *
     * @param email String con el email del usuario
     * @return true/false
     */
    @Override
    public boolean eliminarPorEmail(String email) {
        if (Validaciones.emailValida(email)) {
            return false;
        }
        email = Validaciones.normalizarEmail(email);
        return userRepository.deleteByEmail(email);

    }

    /**
     * Funcion que cambia el nombre del usuario
     * @param email String con el email del usuario
     * @param nuevoNombre String con el nuevo nombre del usuario
     * @return el usuario con el nombre actualizado o null si los datos son invalidos
     */
    @Override
    public Usuario cambiarNombre(String email, String nuevoNombre) {
        Validaciones.validarEmail(email);
        Validaciones.validarNombre(nuevoNombre);
        email = Validaciones.normalizarEmail(email);

        Usuario usuario = userRepository.findByEmail(email);
        if (usuario == null) {
            throw new IllegalArgumentException("No se encontró un usuario con ese email");
        }

        usuario.setNombre(nuevoNombre);
        userRepository.save(usuario);

        return usuario;
    }

    /**
     * Funcion que permite cambiar la password de un usuario, validando la nueva contraseña
     * @param email String con el email del usuario
     * @param nuevaPassword String con la nueva password del usuario
     * @return el usuario con la password actualizada o null si los datos son invalidos
     */
    @Override
    public Usuario cambiarPassword(String email, String nuevaPassword) {
        Validaciones.validarEmail(email);
        Validaciones.validarPassword(nuevaPassword);

        email = Validaciones.normalizarEmail(email);

        Usuario usuario = userRepository.findByEmail(email);
        if (usuario == null) {
            throw new IllegalArgumentException("No se encontró un usuario con ese email");
        }

        usuario.setPassword(nuevaPassword);
        userRepository.save(usuario);
        return usuario;
    }

}
