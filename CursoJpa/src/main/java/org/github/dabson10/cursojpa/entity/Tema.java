package org.github.dabson10.cursojpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Tema {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_tema;
    @Basic
    private String nombre;
    private String descripcion;
    @ManyToOne
    @JoinColumn(name = "id_curso")
    private Curso curso;

    public Tema(){}

    public Tema(Long id_tema, String nombre, String descripcion, Curso curso) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.curso = curso;
    }
}
