package com.pizzaworld.pizaworld.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Usuario
 */

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id // pk no nula
    @GeneratedValue(strategy = GenerationType.AUTO) // auto increment
    private Long id;

    @NotNull //no nulo
    private String email;

    @NotNull //no nulo
    private String nombre;

    @NotNull //no nulo
    private String apellidos;

    @NotNull //no nulo
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(@NotNull String email, @NotNull String nombre, @NotNull String apellidos, @NotNull String password) {
        this.email = email;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.password = password;
    }

    public Usuario() {
    }

}