package com.github.Dabson10.PracticasGETPOST.controller;

import com.github.Dabson10.PracticasGETPOST.entidades.Platillo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * a. El restaurante desea una aplicación que permita que los clientes sean capaces
 * consultar los datos de los platos del menú a partir de proporcionar el
 * número de plato. Para ello, se necesita el desarrollo de una API que a partir
 * de la recepción del núm. de plato en una solicitud GET, devuelva el plato
 * correspondiente con todos sus datos.
 */
@RestController
public class RestauranteController {
    Map<Integer, Platillo> platillos = new LinkedHashMap<>(Map.of(
            1, new Platillo(1, "Sopa Azteca", "Entrada", 85.0),
            2, new Platillo(2,"Orden de pastor","Plato Fuerte", 60.5),
            3, new Platillo()
    ));
    public String obtenerDatos(Map<Integer, Platillo> platillos){
        StringBuilder cadenaPlatillos = new StringBuilder((platillos.isEmpty()) ? "No hay platillos" : "");

        for(Map.Entry<Integer, Platillo> list : platillos.entrySet()){
            cadenaPlatillos.append(String.valueOf(list.getValue().datosBasicos()).concat("<br>"));
        }
        return cadenaPlatillos.toString();
    }

    @GetMapping("/menu")
    public String mostrarMenu(){
        return """
                <h3>Menu</h3><br>
                Seleccione el platillo que buscar: <br> <hr> <br>
                """ + obtenerDatos(platillos);
    }

    @GetMapping("/menu/{ID}")
    ResponseEntity<String> obtenerPlatillo(@PathVariable int ID){
        Platillo plat = platillos.get(ID);
        if(plat == null){
            return new ResponseEntity<>("Ingrese un platillo existente.", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>("Se encontró el platillo: " + plat.mostrarDatos(), HttpStatus.OK);
    }
    /**
     *La version pasada muestra un mensaje, ya que como tal regresa un valor tipo:
     * {@code ResponseEntity<String>}, para este caso mandamos un <?> para que
     * asi se mande el objeto de la clase Platillo, ya que recibirá cualquier tipo
     * de objeto y una cadena es String el cual también es una clase. <br>
     * Esta es la salida de este metodo <br>
     * {
     *     "id": 1,
     *     "nombre": "Sopa Azteca",
     *     "categoria": "Entrada",
     *     "precio": 85.0
     * }
     */
    @GetMapping("/menuObj/{ID}")
    @ResponseBody
    ResponseEntity<?> obtenerPlatilloObj(@PathVariable int ID){
        Platillo plat = platillos.get(ID);
        if(plat == null){
            return new ResponseEntity<>("Ingrese un platillo existente.", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(plat, HttpStatus.OK);
    }
}
