package com.pizzaworld.pizaworld.controller;

import com.pizzaworld.pizaworld.Entity.Ingrediente;
import com.pizzaworld.pizaworld.repository.IngredientesRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * PizaControlador
 */
@RestController

@ResponseBody
@RequestMapping("/v1") //http://localhost:8080/v1
public class PizaControlador {

private IngredientesRepository ir;

    @GetMapping("/ingredientes") //http://localhost:8080/v1
    public Iterable<Ingrediente> getAllIngrediente() {
        return ir.findAll(); // Devolvemos objetos del tipo Producto
    }
}