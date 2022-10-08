package com.siet.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siet.app.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

    public Optional<Usuario> findByUsuarioAndContrasena(String usuario, String contrasena);
    
}
