package com.pizzaworld.pizaworld.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Pizza
 */

@Entity
@Table(name = "Pizzas")
public class Pizza {

    @Id // pk no nula
    @GeneratedValue(strategy = GenerationType.AUTO) // auto increment
    private Long id;

    @NotNull //no nulo
    private String nombre;

    @NotNull //no nulo
    private String foto;

    @NotNull //no nulo
    private String ingredientes;

    @NotNull //no nulo
    private String descripcion;

    @NotNull //no nulo
    private String comentarios;

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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Pizza(@NotNull String nombre, @NotNull String foto, @NotNull String ingredientes,
            @NotNull String descripcion, @NotNull String comentarios, @NotNull Float precio) {
        this.nombre = nombre;
        this.foto = foto;
        this.ingredientes = ingredientes;
        this.descripcion = descripcion;
        this.comentarios = comentarios;
        this.precio = precio;
    }

    public Pizza() {
    }

}