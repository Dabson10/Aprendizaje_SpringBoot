package org.github.dabson10.cursojpa.services;

import org.github.dabson10.cursojpa.DTOs.TemaDTO;
import org.github.dabson10.cursojpa.entity.Tema;

import java.util.List;

public interface InTemaService{

    public void createTema(Tema tema);

    public List<Tema> getTemas();
    public Tema getTema(Long id);

    public void updateTema(TemaDTO tema);

    public void deleteTema(Long id);
}
