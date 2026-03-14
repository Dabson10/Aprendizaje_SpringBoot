package org.github.dabson10.cursojpa.services;

import org.github.dabson10.cursojpa.entity.Curso;
import org.github.dabson10.cursojpa.repository.InCursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface InCursoService{

    public void createCurso(Curso curso);

    public List<Curso>  getCursos();
    public Curso getCurso(Long id);

    public void updateCurso(Curso curso);

    public void deleteCurso(Long id);


}
