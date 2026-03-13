package com.github.Dabson10.PruebaJPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Basic
    private String nombre;
    private String apellido;
    private int edad;
    @OneToMany
    private List<Mascota> mascotas;

    public Persona(){}

    public Persona(Long id, String nombre,
                   String apellido, int edad,
                   List<Mascota> mascotas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mascotas = mascotas;
    }
}
