package com.github.Dabson10.PruebaJPA.service;

import com.github.Dabson10.PruebaJPA.entity.Persona;
import com.github.Dabson10.PruebaJPA.repository.InPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements InPersonaService{
    private final InPersonaRepository persoRepo;

    public PersonaService(InPersonaRepository persoRepo) {
        this.persoRepo = persoRepo;
    }


    @Override
    public List<Persona> getPersonas() {
        List<Persona> listPer = persoRepo.findAll();
        return listPer;
    }

    @Override
    public void saveUsuarios(Persona persona) {
        persoRepo.save(persona);
    }

    @Override
    public void deleteUsuarios(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona getPersona(Long id) {
        Persona per = persoRepo.findById(id).orElse(null);
        return per;
    }

    @Override
    public void editPersona(Long id, Long newID, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        //Buscar el objeto original
        Persona per = this.getPersona(id);

        per.setId(newID);
        per.setNombre(nuevoNombre);
        per.setApellido(nuevoApellido);
        per.setEdad(nuevaEdad);
        persoRepo.save(per);
    }
}
