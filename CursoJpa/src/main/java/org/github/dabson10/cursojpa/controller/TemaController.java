package org.github.dabson10.cursojpa.controller;

import org.github.dabson10.cursojpa.DTOs.TemaDTO;
import org.github.dabson10.cursojpa.entity.Tema;
import org.github.dabson10.cursojpa.services.InTemaService;
import org.github.dabson10.cursojpa.services.TemaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tema")
public class TemaController {

    final TemaService teSe;

    public TemaController(TemaService teSe){
        this.teSe = teSe;
    }

    @GetMapping("crear")
    public String guardarTema(
            @RequestBody Tema tema
    ){
        teSe.createTema(tema);
        return "Tema creado correctamente";
    }

    @PutMapping("/edit")
    public void editTema(
            @RequestBody TemaDTO tema
    ){
        teSe.updateTema(tema);
        System.out.println("Tema actualizado");
    }

}
