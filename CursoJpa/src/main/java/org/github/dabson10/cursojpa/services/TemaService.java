package org.github.dabson10.cursojpa.services;

import org.github.dabson10.cursojpa.DTOs.TemaDTO;
import org.github.dabson10.cursojpa.entity.Curso;
import org.github.dabson10.cursojpa.entity.Tema;
import org.github.dabson10.cursojpa.repository.InTemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements InTemaService{

    final InTemaRepository temaRep;
    final CursoService curSe;

    public TemaService(InTemaRepository temaRep, CursoService curSe){
        this.temaRep = temaRep;
        this.curSe = curSe;
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
    public void updateTema(TemaDTO tema) {

        Tema tem = this.getTema(tema.getId_tema());
        Curso cur = curSe.getCurso(tema.getId_tema());

        tem.setNombre(tema.getNombre());
        tem.setDescripcion(tema.getDescripcion());
        tem.setCurso(cur);



        temaRep.save(tem);
    }

    @Override
    public void deleteTema(Long id) {
        temaRep.deleteById(id);
    }
}
