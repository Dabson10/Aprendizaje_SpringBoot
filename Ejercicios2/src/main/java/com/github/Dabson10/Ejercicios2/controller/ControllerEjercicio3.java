package com.github.Dabson10.Ejercicios2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerEjercicio3 {

    @GetMapping("/figura")
    public String info(){
        return "Ingrese la base y la altura de esta forma '5'/'10'";
    }

    @GetMapping("/figura/{base}/{altura}")
    public String resultado(
            @PathVariable double base,
            @PathVariable double altura
    ){
        return "El resultado es: " + ((base * altura) / 2);
    }
}
