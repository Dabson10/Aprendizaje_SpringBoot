package org.github.dabson10.cursojpa.services;

import org.github.dabson10.cursojpa.entity.Tema;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InTemaService{

    public void createTema(Tema tema);

    public List<Tema> getTemas();
    public Tema getTema(Long id);

    public void updateTema(Tema tema);

    public void deleteTema(Long id);
}
