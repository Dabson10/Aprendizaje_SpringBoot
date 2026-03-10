package com.github.Dabson10.Autowired.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Posteo {
    private Long id;
    private String mensaje;
    private String autor;

    public Posteo(){}

    public Posteo(Long id, String mensaje, String autor) {
        this.id = id;
        this.mensaje = mensaje;
        this.autor = autor;
    }
}
