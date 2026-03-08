package services;

import entity.Persona;
import java.util.List;

public interface InPersonaService {
    public void crearPersona(Persona per);
    public List<Persona> traerPersonas();
}
