package com.github.Dabson10.PracticasGETPOST.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Platillo {
    private int id;
    private String nombre;
    private String categoria;
    private double precio;

    public Platillo(){}

    public Platillo(int id, String nombre, String categoria, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String mostrarDatos(){
        return "ID: " + id +
                "<br>Nombre: " + nombre +
                "<br>Categoria: " + categoria +
                "<br>Precio: " + precio;
    }
    public String datosBasicos(){
        return "ID: " + id +
                ", Nombre: " + nombre;
    }
}
