package org.github.dabson10.cursojpa.controller;

import org.github.dabson10.cursojpa.DTOs.CursoDTO;
import org.github.dabson10.cursojpa.entity.Curso;
import org.github.dabson10.cursojpa.entity.Tema;
import org.github.dabson10.cursojpa.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

        if(curso.getTemas() != null){
            for(Tema tema : curso.getTemas()){
                tema.setCurso(curso);
            }
        }
        cruse.createCurso(curso);
        return "Curso creado";
    }
    @PostMapping("/crear/varios")
    public void createCursos(
            @RequestBody List<Curso> curso){

        for(Curso cur : curso){
            if(cur.getTemas() != null){
                for(Tema tema : cur.getTemas()){
                    tema.setCurso(cur);
                }
                cruse.createCurso(cur);
                System.out.println("Curso creado");
            }else{
                cruse.createCurso(cur);
            }

        }
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

    //Filtro en la busqueda. // Traerá todos lo que contengan de nombre "java"
    @GetMapping("/filtro")
    public List<CursoDTO> getCursoJava(){
        List<Curso> list = cruse.getCursos();
        List<CursoDTO> listFiltro = new ArrayList<>();

        for(Curso curso : list){
            if(curso.getNombre().toLowerCase().contains("java")){
                 listFiltro.add(new CursoDTO(
                         curso.getId_curso(),
                         curso.getNombre(),
                         curso.getModalidad(),
                         curso.getFecha_Finalizacion()
                 ));
             }
        }

        return listFiltro;
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
