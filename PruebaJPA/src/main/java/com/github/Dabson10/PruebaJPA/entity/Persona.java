package com.github.Dabson10.PruebaJPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

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
    @OneToOne
    @JoinColumn(name = "mascota_id_mascota", referencedColumnName = "id_mascota")
    private Mascota mascota;

    public Persona(){}

    public Persona(Long id, String nombre, String apellido, int edad, Mascota mascota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mascota = mascota;
    }
}
