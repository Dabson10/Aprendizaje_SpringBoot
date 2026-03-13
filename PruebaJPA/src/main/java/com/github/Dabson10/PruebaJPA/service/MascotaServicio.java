package com.github.Dabson10.PruebaJPA.service;

import com.github.Dabson10.PruebaJPA.entity.Mascota;
import com.github.Dabson10.PruebaJPA.repository.InMascotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServicio implements InMascotaServicio {

    final InMascotaRepository masRepo;

    public MascotaServicio(InMascotaRepository masRepo){
        this.masRepo = masRepo;
    }

    @Override
    public List<Mascota> traerMascotas() {
        return masRepo.findAll();
    }

    @Override
    public Mascota getMascota(Long id) {
        return masRepo.findById(id).orElse(null);
    }

    @Override
    public void createMascota(Mascota mascota) {
        masRepo.save(mascota);
    }

    @Override
    public void editMascota(Long idOg, Long idNew,
                            String newNombre, String nuevaEspecie,
                            String nuevaRaza, String nuevoColor) {
        Mascota mas = this.getMascota(idOg);

        mas.setId_mascota(idNew);
        mas.setNombre(newNombre);
        mas.setEspecie(nuevaEspecie);
        mas.setRaza(nuevaRaza);
        mas.setColor(nuevoColor);

        masRepo.save(mas);
    }

    @Override
    public void borrarMascota(Long id) {
        masRepo.deleteById(id);
    }
}
