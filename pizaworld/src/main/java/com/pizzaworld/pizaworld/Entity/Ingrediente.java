package com.pizzaworld.pizaworld.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Ingredientes
 */

@Entity
@Table(name = "ingredientes")
public class Ingrediente {

    @Id // pk no nula
    @GeneratedValue(strategy = GenerationType.AUTO) // auto increment
    private Long id;

    @NotNull //no nulo
    private String nombre;

    @NotNull
    private Float precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Ingrediente(@NotNull String nombre, @NotNull Float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Ingrediente() {
    }
}