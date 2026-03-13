package com.github.Dabson10.PruebaJPA.controller;

import com.github.Dabson10.PruebaJPA.entity.Mascota;
import com.github.Dabson10.PruebaJPA.service.MascotaServicio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    final MascotaServicio masSer;

    public MascotaController(MascotaServicio masSer){
        this.masSer = masSer;
    }

    //Obtener los datos de mascota
    @PostMapping("/mascota/crear")
    public String crearMascota(
            @RequestBody Mascota mascota
    ){
        masSer.createMascota(mascota);
        return "La mascota fue creada.";
    }


}
