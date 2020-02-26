package com.pizzaworld.pizaworld.repository;

import com.pizzaworld.pizaworld.Entity.Comentario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ComentarioRepository
 */
@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

    
}