package com.pizzaworld.pizaworld.controller;

import com.pizzaworld.pizaworld.Entity.Ingrediente;
import com.pizzaworld.pizaworld.repository.IngredientesRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * PizaControlador
 */
@RestController

@ResponseBody
@RequestMapping("/v1") //http://localhost:8080/v1
public class IngredientesControlador {

private IngredientesRepository ir;

    @GetMapping("/ingredientes") //http://localhost:8080/v1
    public Iterable<Ingrediente> getAllIngrediente() {
        return ir.findAll(); // Devolvemos objetos del tipo Producto
    }
       @PostMapping("/ingredientes")
    public ModelAndView showListaIngredientesAndViewPost(@RequestParam("nombre") String nombre,
             @RequestParam("precio") Float precio) {

        {
            ModelAndView mdl = new ModelAndView();
            try {

                mdl.setViewName("Ingredientes");
                Ingrediente ingrediente = new Ingrediente(nombre, precio);
                ir.save(ingrediente);
                mdl.addObject("ingrediente", ir.findAll());

                mdl.addObject("mensaje", "");

                return mdl;
            } catch (Exception e) {
                mdl.setViewName("404");
                mdl.addObject("errormsg", e.getMessage());
                return mdl;
            }
        }

    } 
}