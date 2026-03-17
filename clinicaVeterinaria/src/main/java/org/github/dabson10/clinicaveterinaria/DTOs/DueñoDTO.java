package org.github.dabson10.clinicaveterinaria.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class DueñoDTO {

    private Long id_dueno;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;
    private Long id_mascota;

}
