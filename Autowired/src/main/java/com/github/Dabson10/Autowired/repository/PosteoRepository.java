package com.github.Dabson10.Autowired.repository;

import com.github.Dabson10.Autowired.Entity.Posteo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PosteoRepository implements InPosteoRepository{
    @Override
    public List<Posteo> traerTodos() {
        List<Posteo> lista = new ArrayList<Posteo>();
        lista.add(new Posteo(1L, "¿Como dormir?", "Dabson"));
        lista.add(new Posteo(1L, "¿Como despertar?", "Dabson"));
        lista.add(new Posteo(1L, "¿Como respirar?", "Dabson"));
        lista.add(new Posteo(1L, "¿Como pensar?", "Dabson"));
        return lista;
    }
}
