package org.github.dabson10.cursojpa.services;

import org.github.dabson10.cursojpa.entity.Curso;
import org.github.dabson10.cursojpa.repository.InCursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CursoService implements InCursoService{


    final InCursoRepository curRepo;

    public CursoService(InCursoRepository curRepo){
        this.curRepo = curRepo;
    }

    @Override
    public void createCurso(Curso curso) {
        curRepo.save(curso);
    }

    @Override
    public List<Curso> getCursos() {
        return curRepo.findAll();
    }

    @Override
    public Curso getCurso(Long id) {
        return curRepo.findById(id).orElse(null);
    }

    @Override
    public void updateCurso(Curso curso) {
        curRepo.save(curso);
    }

    @Override
    public void deleteCurso(Long id) {
        curRepo.deleteById(id);
    }
}
