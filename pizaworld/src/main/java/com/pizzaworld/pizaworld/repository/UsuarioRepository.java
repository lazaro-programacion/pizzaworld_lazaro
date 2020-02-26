package com.pizzaworld.pizaworld.repository;

import com.pizzaworld.pizaworld.Entity.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UsuarioRepository
 */
@Repository
public interface UsuarioRepository extends  JpaRepository<Usuario, Long> {

    
}