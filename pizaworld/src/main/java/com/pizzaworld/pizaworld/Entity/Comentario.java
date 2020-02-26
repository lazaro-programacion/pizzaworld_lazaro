package com.pizzaworld.pizaworld.Entity;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Comentario
 */
@Entity
@Table(name = "comentarios")
public class Comentario {

    @Id // pk no nula
    @GeneratedValue(strategy = GenerationType.AUTO) // auto increment
    private Long id;

    @NotNull //no nulo
    private String texto;
    
    @NotNull //no nulo
    private String puntuacion;
    
    @NotNull //no nulo
    private Calendar fecha;
    
    @NotNull //no nulo
    private String usuario;
    
    @NotNull //no nulo
    private String pizza;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public Comentario(@NotNull String texto, @NotNull String puntuacion, @NotNull Calendar fecha,
            @NotNull String usuario, @NotNull String pizza) {
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.usuario = usuario;
        this.pizza = pizza;
    }

    public Comentario() {
    }
}