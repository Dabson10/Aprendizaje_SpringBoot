package org.github.dabson10.clinicaveterinaria.service;

import lombok.AllArgsConstructor;
import org.github.dabson10.clinicaveterinaria.DTOs.MascotaDueñoDTO;
import org.github.dabson10.clinicaveterinaria.entity.Dueño;
import org.github.dabson10.clinicaveterinaria.entity.Mascota;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Mascota_DueñoDTO implements InMascota_DueñoService{
    //Datos para la inyeccion de dependencias.
    final DueñoService dueSe;
    final MascotaService masSe;


    @Override
    public MascotaDueñoDTO getDatos(Long id) {
        Dueño duen = dueSe.getDueño(id);
        Mascota masc = duen.getMascota();

        MascotaDueñoDTO dtoDuenMas = new MascotaDueñoDTO();
        dtoDuenMas.setNombre(masc.getNombre());
        dtoDuenMas.setEspecie(masc.getEspecie());
        dtoDuenMas.setRaza(masc.getRaza());
        dtoDuenMas.setNombreDueño(duen.getNombre());
        dtoDuenMas.setApellido_dueño(duen.getApellido());

        return dtoDuenMas;
    }
}
