package org.github.dabson10.cursojpa.controller;

import org.github.dabson10.cursojpa.entity.Curso;
import org.github.dabson10.cursojpa.entity.Tema;
import org.github.dabson10.cursojpa.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    final CursoService cruse;

    public CursoController(CursoService cruse) {
        this.cruse = cruse;
    }
    //Metodo para crear nuevos cursos.
    @PostMapping("/crear")
    public String createCurso(
            @RequestBody Curso curso){
        cruse.createCurso(curso);
        if(curso.getTemas() != null){
            for(Tema tema : curso.getTemas()){
                tema.setCurso(curso);
            }
        }
        return "Curso creado";
    }

    //Metodos de lectura de datos.
    @GetMapping("/traerCursos")
    public List<Curso> getCursos(){
        return cruse.getCursos();
    }

    @GetMapping("/traer")
    public Curso getCurso(
            @RequestParam Long id
    ){
        return cruse.getCurso(id);
    }

    //Metodos para actualizar
    @PutMapping("/actualizar")
    public String updateCurso(
            @RequestBody Curso curso
    ){
        cruse.updateCurso(curso);
        return "Curso actualizado correctamente.";
    }

    @DeleteMapping("/borrar")
    public String deleteCurso(
            @RequestParam Long id
    ){
        cruse.deleteCurso(id);
        return "Curso eliminado correctamente.";
    }

}
