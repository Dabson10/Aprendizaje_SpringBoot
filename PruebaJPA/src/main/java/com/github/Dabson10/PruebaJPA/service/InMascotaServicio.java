package com.github.Dabson10.PruebaJPA.service;

import com.github.Dabson10.PruebaJPA.entity.Mascota;
import com.github.Dabson10.PruebaJPA.repository.InMascotaRepository;

import java.util.List;

public interface InMascotaServicio{

    public List<Mascota> traerMascotas();
    public Mascota getMascota(Long id);

    public void createMascota(Mascota mascota);

    public void editMascota(Long idOg, Long idNew,
                            String newNombre, String nuevaEspecie,
                            String nuevaRaza, String nuevoColor);

    public void borrarMascota(Long id);
}
