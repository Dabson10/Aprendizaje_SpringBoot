package org.github.dabson10.clinicaveterinaria.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascota;
    @Basic
    private String nombre;
    private String especie;
    private String raza;
    private String color;
    @OneToOne(mappedBy = "mascota")
    private Dueño dueño;
}
