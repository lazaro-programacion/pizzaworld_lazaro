package com.pizzaworld.pizaworld.repository;

import com.pizzaworld.pizaworld.Entity.Pizza;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PizzaRepository
 */
@Repository
public interface PizzaRepository extends  JpaRepository<Pizza, Long> {

    
}