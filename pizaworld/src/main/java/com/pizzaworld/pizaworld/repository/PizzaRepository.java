package com.pizzaworld.pizaworld.repository;

import com.pizzaworld.pizaworld.Entity.Pizza;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PizzaRepository
 */
public interface PizzaRepository extends  JpaRepository<Pizza, Long> {

    
}