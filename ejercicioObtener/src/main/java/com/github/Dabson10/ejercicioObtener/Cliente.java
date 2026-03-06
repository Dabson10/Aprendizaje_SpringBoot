package com.github.Dabson10.ejercicioObtener;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {

    private long id;
    private String nombre;
    private String apellido;

    public Cliente(long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente() {
    }
}
