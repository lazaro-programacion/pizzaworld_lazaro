package com.pizzaworld.pizaworld.repository;

import com.pizzaworld.pizaworld.Entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UsuarioRepository
 */
public interface UsuarioRepository extends  JpaRepository<Usuario, Long> {

    
}