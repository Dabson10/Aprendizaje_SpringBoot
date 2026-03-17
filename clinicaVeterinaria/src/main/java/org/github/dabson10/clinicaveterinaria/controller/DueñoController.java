package org.github.dabson10.clinicaveterinaria.controller;

import org.github.dabson10.clinicaveterinaria.DTOs.DueñoDTO;
import org.github.dabson10.clinicaveterinaria.entity.Dueño;
import org.github.dabson10.clinicaveterinaria.service.DueñoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dueno")
public class DueñoController {

    final DueñoService dueSe;

    public DueñoController(DueñoService dueSe){
        this.dueSe = dueSe;
    }

    //Crear
    @PostMapping("/crear")
    public void crearDueños(
            @RequestBody Dueño dueño
    ){
        dueSe.createDueño(dueño);
    }

    //Lectura
    @GetMapping("/traer")
    public Dueño getDueño(
            @RequestParam Long id
    ){
        return dueSe.getDueño(id);
    }

    @GetMapping("/traer/todos")
    public List<DueñoDTO> getDueños(){
        return dueSe.getDueños();
    }

    //Editar
    @PutMapping("/editar")
    public void editDueño(
            @RequestBody DueñoDTO dueño
    ){
     dueSe.editDueño(dueño);
    }

}
