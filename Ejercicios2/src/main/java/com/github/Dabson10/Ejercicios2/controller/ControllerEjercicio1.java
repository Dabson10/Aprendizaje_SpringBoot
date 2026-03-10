package com.github.Dabson10.Ejercicios2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerEjercicio1 {

    @GetMapping("/promedio")
    public String mensaje(){
        return "Ingrese la calificación de sus 3 materias.";
    }

    @GetMapping("/promedios")
    @ResponseBody
    ResponseEntity<int[]> devolerDatos(
            @RequestParam int cali1,
            @RequestParam int cali2,
            @RequestParam int cali3
    ){
        int lista[] = new int[]{cali1, cali2, cali3};
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

}
