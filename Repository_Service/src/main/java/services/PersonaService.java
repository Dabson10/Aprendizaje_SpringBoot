package services;

import entity.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements InPersonaService{
    //Todos los metodos de la logica de negocio sobre Persona
    @Override
    public void crearPersona(Persona per) {
        System.out.println("Persona creada.");
    }

    @Override
    public List<Persona> traerPersonas() {


        return List.of();
    }

}
