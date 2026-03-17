package org.github.dabson10.clinicaveterinaria.service;

import org.github.dabson10.clinicaveterinaria.entity.Mascota;
import org.github.dabson10.clinicaveterinaria.repository.InMascotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MascotaService implements InMascotaService{


    final InMascotaRepository masRe;

    public MascotaService(InMascotaRepository masRe){
        this.masRe = masRe;
    }


    @Override
    public void createMascota(Mascota mascota) {
        masRe.save(mascota);
    }

    @Override
    public Mascota getMascota(Long id) {
        return masRe.findById(id).orElse(null);
    }

    @Override
    public List<Mascota> getMascotas() {
        return masRe.findAll();
    }

    @Override
    public void updateMascota(Mascota mascota) {
        Mascota masc = this.getMascota(mascota.getId_mascota());

        masc.setNombre(mascota.getNombre());
        masc.setEspecie(mascota.getEspecie());
        masc.setRaza(mascota.getRaza());
        masc.setColor(mascota.getColor());

        masRe.save(masc);

    }

    @Override
    public void deleteMascota(Long id) {
        masRe.deleteById(id);
    }
}
