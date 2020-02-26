package com.pizzaworld.pizaworld.repository;

import com.pizzaworld.pizaworld.Entity.Ingredientes;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * IngredientesRepository
 */
public interface IngredientesRepository extends JpaRepository<Ingredientes, Long> {

    
}