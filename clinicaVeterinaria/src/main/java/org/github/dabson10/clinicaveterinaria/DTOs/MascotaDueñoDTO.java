package org.github.dabson10.clinicaveterinaria.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class MascotaDueñoDTO {
    private String nombre;
    private String especie;
    private String raza;
    private String nombreDueño;
    private String apellido_dueño;

}
