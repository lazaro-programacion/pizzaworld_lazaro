package com.pizzaworld.pizaworld.controller;

import com.pizzaworld.pizaworld.repository.IngredientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

   
 
}