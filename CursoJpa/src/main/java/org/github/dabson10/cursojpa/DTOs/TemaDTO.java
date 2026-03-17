package org.github.dabson10.cursojpa.DTOs;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class TemaDTO {
    private Long id_tema;
    private String nombre;
    private String descripcion;
    private int id_curso;


}
