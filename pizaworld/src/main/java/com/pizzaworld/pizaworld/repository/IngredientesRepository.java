package com.pizzaworld.pizaworld.repository;

import com.pizzaworld.pizaworld.Entity.Ingrediente;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * IngredientesRepository
 */
@Repository
public interface IngredientesRepository extends JpaRepository<Ingrediente, Long> {

    
}