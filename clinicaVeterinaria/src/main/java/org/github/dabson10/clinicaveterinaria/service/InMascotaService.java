package org.github.dabson10.clinicaveterinaria.service;

import org.github.dabson10.clinicaveterinaria.entity.Mascota;

import java.util.List;

public interface InMascotaService {
    //Create
    public void createMascota(Mascota mascota);
    //Read
    public Mascota getMascota(Long id);
    public List<Mascota> getMascotas();
    //Update
    public void updateMascota(Mascota mascota);
    //Delete
    public void deleteMascota(Long id);
}
