package com.github.Dabson10.PruebaJPA.service;

import com.github.Dabson10.PruebaJPA.entity.Persona;

import java.util.List;

public interface InPersonaService {
    //Listar todos los usuarios
    public List<Persona> getPersonas();
    //Crear nuevas personas
    public void saveUsuarios(Persona persona);
    //Eliminar personas
    public void deleteUsuarios(Long id);
    //Obtener 1 persona
    public Persona getPersona(Long id);
    //Editar usuarios
    public void editPersona(Long id, Long newID,String nuevoNombre, String nuevoApellido, int nuevaEdad);
}
