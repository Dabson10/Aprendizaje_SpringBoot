package org.github.dabson10.cursojpa.controller;

import org.github.dabson10.cursojpa.entity.Tema;
import org.github.dabson10.cursojpa.services.InTemaService;
import org.github.dabson10.cursojpa.services.TemaService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {

    final TemaService teSe;

    public TemaController(TemaService teSe){
        this.teSe = teSe;
    }

    public String guardarTema(
            @RequestBody Tema tema
    ){
        teSe.createTema(tema);
        return "Tema creado correctamente";
    }

}
