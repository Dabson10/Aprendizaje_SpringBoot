package org.github.dabson10.clinicaveterinaria.controller;

import org.github.dabson10.clinicaveterinaria.entity.Mascota;
import org.github.dabson10.clinicaveterinaria.service.MascotaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mascota")
public class MascotaController {

    final MascotaService masSe;

    public MascotaController(MascotaService masSe){
        this.masSe = masSe;
    }

    //Crear mascota
    @PostMapping("/crear")
    public void crearMascota(
            @RequestBody Mascota mascota
    ){
        masSe.createMascota(mascota);
    }

    //Lectura de datos
    @GetMapping("traer")
    public void getMascota(
            @RequestParam Long id
    ){
        masSe.getMascota(id);
    }

    @GetMapping("/traer/todos")
    public void getMascotas(){
        masSe.getMascotas();
    }

    //Editar
    @PutMapping("/editar")
    public void editMascotas(
            @RequestBody Mascota mascota
    ){
        masSe.updateMascota(mascota);
    }

    //Eliminar
    @DeleteMapping("borrar")
    public void borrarMascota(
            @RequestParam Long id
    ){
        masSe.deleteMascota(id);
    }
}
