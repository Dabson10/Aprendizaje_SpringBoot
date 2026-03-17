package org.github.dabson10.clinicaveterinaria.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Dueño {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_dueno;
    @Basic
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_mascota")
    private Mascota mascota;
}
