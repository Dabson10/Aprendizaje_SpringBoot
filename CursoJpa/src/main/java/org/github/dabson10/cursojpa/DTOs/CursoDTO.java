package org.github.dabson10.cursojpa.DTOs;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class CursoDTO {
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private LocalDate fecha_Finalizacion;

    public CursoDTO(){}

    public CursoDTO(Long id_curso, String nombre, String modalidad, LocalDate fecha_Finalizacion) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_Finalizacion = fecha_Finalizacion;
    }
}
