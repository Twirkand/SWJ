package com.docencia.service.impl;

import com.docencia.model.Usuario;
import com.docencia.repository.IUserRepository;
import com.docencia.service.IAuthService;
import com.docencia.util.Validaciones;

/**
 * Implemento del servicio de autentificacion
 * @author santiago
 * @version 1.0.0
 */
public class AuthServiceImpl implements IAuthService{

    final IUserRepository userRepository;

    public AuthServiceImpl(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

     /**
     * Funcion que permite registrar a un usuario dentro del sistema, validando su email y password, ademas de verificar que el email no exista previamente
     * @param id Id del usuario
     * @param nombre nombre del usuario
     * @param email email del usuario
     * @param password password del usuario
     * @return el usuario registrado o null si los datos son invalidos
     */
    @Override
    public Usuario register(int id, String nombre, String email, String password) {
        if(id < 1 || !Validaciones.emailValida(email) || !Validaciones.passwordValido(password)){
            return null;
        }
        email = Validaciones.normalizarEmail(email);
        Validaciones.validarPassword(password);

        if (userRepository.findByEmail(email) != null) {
            throw new IllegalArgumentException();
        }
        
        Usuario usuario = new Usuario(id, nombre, email, password);
        userRepository.save(usuario);
        return usuario;
    
    }

     /**
     * Funcion que permite iniciar sesion a un usuario dentro del sistema, bloqueando
     * @param email email del usuario
     * @param password password del usuario
     * @return true/false
     */
    @Override
    public boolean login(String email, String password) {
        Usuario usuario = userRepository.findByEmail(email);

        if(isBloqueado(email)){
            return false;
        }

        if(usuario.getPassword().equals(password)){
            usuario.resetearIntentosFallidos();
            return true;
        }

        usuario.incrementarIntentosFallidos();
        return false;
    }

    @Override
    public boolean isBloqueado(String email) {
       Usuario usuario = userRepository.findByEmail(email);
        return usuario.getIntentosFallidos() >= 3;
    }

    @Override
    public void desbloquear(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desbloquear'");
    }

}
