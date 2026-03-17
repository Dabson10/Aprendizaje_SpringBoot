package org.github.dabson10.clinicaveterinaria.controller;

import org.github.dabson10.clinicaveterinaria.DTOs.DueñoDTO;
import org.github.dabson10.clinicaveterinaria.DTOs.MascotaDueñoDTO;
import org.github.dabson10.clinicaveterinaria.entity.Dueño;
import org.github.dabson10.clinicaveterinaria.service.DueñoService;
import org.github.dabson10.clinicaveterinaria.service.Mascota_DueñoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dueno")
public class DueñoController {

    final DueñoService dueSe;
    final Mascota_DueñoDTO masDe;
    public DueñoController(DueñoService dueSe, Mascota_DueñoDTO masDe){
        this.dueSe = dueSe;
        this.masDe = masDe;
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
    public DueñoDTO getDueño(
            @RequestParam Long id
    ){
        return dueSe.getDueñoDTO(id);
    }

    @GetMapping("/traer/todos")
    public List<DueñoDTO> getDueños(){
        return dueSe.getDueños();
    }

    @GetMapping("/datos/paciente")
    public MascotaDueñoDTO getDatosDTO(
            @RequestParam Long id
    ){
        return masDe.getDatos(id);
    }
    //Editar
    @PutMapping("/editar")
    public void editDueño(
            @RequestBody DueñoDTO dueño
    ){
     dueSe.editDueño(dueño);
    }

    @DeleteMapping("/borrar")
    public void delete(
            @RequestParam Long id
    ){
        dueSe.deletDueño(id);
    }
}
