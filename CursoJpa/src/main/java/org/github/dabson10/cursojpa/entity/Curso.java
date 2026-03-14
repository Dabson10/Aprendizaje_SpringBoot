package org.github.dabson10.cursojpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_curso;
    @Basic
    private String nombre;
    private String modalidad;
//    @Temporal(TemporalType.DATE)
    private LocalDate fecha_Finalizacion;
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tema> temas;

    public Curso(){}

    public Curso(Long id_curso, String nombre, String modalidad, LocalDate fecha_Finalizacion, List<Tema> temas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_Finalizacion = fecha_Finalizacion;
        this.temas = temas;
    }

    public void addTema(Tema tema){
        this.temas.add(tema);
        tema.setCurso(this);
    }
}
