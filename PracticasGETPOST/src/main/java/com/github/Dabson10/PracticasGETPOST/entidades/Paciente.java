package com.github.Dabson10.PracticasGETPOST.entidades;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.Period;

@Getter @Setter
public class Paciente {
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Paciente(){}

    public int getEdad(){
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public Paciente(int id, String dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    public String mostrarPacientes(){
        return "<br>ID: " + id +
                "<br>Dni: " + dni +
                "<br>Nombre: " + nombre +
                "<br>Apellido: " + apellido +
                "<br>Fecha de Nacimiento: " + fechaNacimiento +
                "<br>Edad: " + getEdad() + "<hr>";
    }
}
