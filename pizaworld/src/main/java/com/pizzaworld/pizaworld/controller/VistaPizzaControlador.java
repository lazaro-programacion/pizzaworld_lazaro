package com.pizzaworld.pizaworld.controller;

import com.pizzaworld.pizaworld.Entity.Ingrediente;
import com.pizzaworld.pizaworld.repository.IngredientesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * VistaPizzaControlador
 */
@Controller
public class VistaPizzaControlador {

    @Autowired
    private IngredientesRepository ir;

    @GetMapping("/ingredientes")
    @ResponseBody
    public ModelAndView ingrediente() {

        ModelAndView modelAndView=new ModelAndView("Ingredientes");
        modelAndView.addObject("ingrediente", ir.findAll());
        
        modelAndView.addObject("mensaje", "");

        
        return modelAndView;
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