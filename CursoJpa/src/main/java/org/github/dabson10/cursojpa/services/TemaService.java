package org.github.dabson10.cursojpa.services;

import org.github.dabson10.cursojpa.entity.Tema;
import org.github.dabson10.cursojpa.repository.InTemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements InTemaService{

    final InTemaRepository temaRep;

    public TemaService(InTemaRepository temaRep){
        this.temaRep = temaRep;
    }

    @Override
    public void createTema(Tema tema) {
        temaRep.save(tema);
    }

    @Override
    public List<Tema> getTemas() {
        return temaRep.findAll();
    }

    @Override
    public Tema getTema(Long id) {
        return temaRep.findById(id).orElse(null);
    }

    @Override
    public void updateTema(Tema tema) {
        temaRep.save(tema);
    }

    @Override
    public void deleteTema(Long id) {
        temaRep.deleteById(id);
    }
}
