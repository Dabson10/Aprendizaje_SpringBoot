package com.github.Dabson10.ejercicioIntegrador.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegradorController {
    @GetMapping("/convertir/{galones}")
    public String galonesALitros(@PathVariable double galones){
        double litros = 3.78541 * galones;

        return "La cantidad de litros equivalente a: " + galones + " galones \n" +
                "Son: " + litros + " litros.";
    }
}
