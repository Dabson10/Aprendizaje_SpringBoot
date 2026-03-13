package com.github.Dabson10.PruebaJPA.controller;

import com.github.Dabson10.PruebaJPA.entity.Mascota;
import com.github.Dabson10.PruebaJPA.entity.Persona;
import com.github.Dabson10.PruebaJPA.service.InPersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

    final InPersonaService perServi;

    public PersonaController(InPersonaService peroServi) {
        this.perServi = peroServi;
    }

    @GetMapping("/persona/traer")
    public List<Persona> traerPersonas(){
        return perServi.getPersonas();
    }

    @PostMapping("/persona/crear")
    public String savePersona(@RequestBody Persona per){
        perServi.saveUsuarios(per);
        return "Usuario agregado correctamente.";
    }

    @DeleteMapping("/persona/eliminar/{ID}")
    public String eliminarPersona(@PathVariable Long ID){
        perServi.deleteUsuarios(ID);
        return "Usuario eliminado correctamente.";
    }

//    @PutMapping("/persona/editar/{ID}/{idnew}/{nombre}/{apellido}/{edad}")
    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam(required = false, name = "id") Long newID,
                               @RequestParam(required = false, name = "nombre") String nuevoNombre,
                               @RequestParam(required = false, name = "apellido") String nuevoApellido,
                               @RequestParam(required = false, name = "edad") int nuevaEdad,
                               @RequestBody Mascota mascota
                               ){
        perServi.editPersona(id, newID,nuevoNombre, nuevoApellido, nuevaEdad);
        return perServi.getPersona(newID);
    }

    @PutMapping("/persona/editar")
    public Persona editPersona2(
            @RequestBody Persona persona
    ){
        perServi.editPersona2(persona);

        return perServi.getPersona(persona.getId());
    }

}
