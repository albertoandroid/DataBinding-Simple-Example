package com.androiddesdecero.databindingandroid;

/**
 * Created by albertopalomarrobledo on 19/4/18.
 */

public class User {
    private String nombre;
    private String edad;
    private String email;
    private String altura;
    private String peso;

    public User(String nombre, String edad, String email, String altura, String peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
