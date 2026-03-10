package com.github.Dabson10.Ejercicios2.controller;

import com.github.Dabson10.Ejercicios2.Entity.Jugador;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerEjercicio2 {

    @PostMapping("/jugadores")
    public void guardar(
            @RequestBody List<Jugador> lista
    ) {
        double alturaSumada = 0;
        for(Jugador list : lista){
            alturaSumada += list.getEstatura();
            System.out.println(list.mostrarDatos());
        }

        double promedioAlt = alturaSumada / lista.size();
        System.out.println("El promedio de altura es: " + promedioAlt);
    }



    /**
     * Para realizar la prueba agregar el siguiente JSON
     [
         {
         "numero" : 26,
         "nombre" : "Juan David",
         "apellido" : "Almaraz"
         },
         {
         "numero" : 12,
         "nombre" : "Kevin Tadeo",
         "apellido" : "Almaraz"
         },
         {
         "numero" : 27,
         "nombre" : "Maria",
         "apellido" : "Almaraz"
         }
     ]

     */
}
