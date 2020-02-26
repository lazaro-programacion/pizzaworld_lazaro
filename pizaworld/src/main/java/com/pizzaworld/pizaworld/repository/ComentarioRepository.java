package com.pizzaworld.pizaworld.repository;

import com.pizzaworld.pizaworld.Entity.Comentario;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * ComentarioRepository
 */
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

    
}