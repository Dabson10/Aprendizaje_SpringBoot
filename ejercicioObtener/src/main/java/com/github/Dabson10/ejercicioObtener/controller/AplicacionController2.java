package com.github.Dabson10.ejercicioObtener.controller;

import com.github.Dabson10.ejercicioObtener.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class AplicacionController2 {

    /**
     * La siguiente función es del tipo GET {@code @GetMapping}, en donde mandamos una lista
     * del tipo cliente y se retorna al URL, pero al usar {@code @ResponseBody} hacemos que
     * no se muestre en la pagina en bruto, por lo que ahora se mostrara en formato JSON
     * en el cuerpo de la petición para que asi sea mas facíl manejarlo en el FrontEnd.
     */
    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){
        List<Cliente> listClientes = new ArrayList<>();
        listClientes.add(new Cliente(1L, "Zlatan", "Ibrahimovich"));
        listClientes.add(new Cliente(2L, "Cristiano", "Ronaldo"));
        listClientes.add(new Cliente(3L, "Leonel", "Messi"));
        return listClientes;
    }

    /**
     *En la siguiente función del tipo GET {@code @GetMapping} usamos una URL para usar
     * {@code ResponseEntity<T>}, esta función es realmente interesante ya que con esta podemos
     * manejar el flujo de respuestas ya que puedes mostrar ciertos codigos de estado dependiendo de
     * lo que se busque hacer.
     * Muestra en la pagina web
     */
    @GetMapping("/pruebaresponse")
    ResponseEntity<String> traerRespuesta(){
        return new ResponseEntity<>("Esta es una prueba de response ", HttpStatus.TEMPORARY_REDIRECT);
    }

    @GetMapping("/correo/{correo}")
    ResponseEntity<String> validarCorreo (@PathVariable String correo){
        if(correo.contains("@")&& correo.endsWith(".com")){
            return new ResponseEntity<>("Correo escrito correctamente: " + correo, HttpStatus.OK);
        }
        return new ResponseEntity<>("Correo escrito incorrectamente.", HttpStatus.NOT_FOUND);
    }


}
