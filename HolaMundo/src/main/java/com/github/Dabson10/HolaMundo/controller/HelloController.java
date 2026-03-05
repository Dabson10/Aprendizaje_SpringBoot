package com.github.Dabson10.HolaMundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

///  Para definir correctamente una clase controladora debemos agregar
/// la siguiente anotation
@RestController
public class HelloController {

    @GetMapping("/'")
    public String bienvenida(){
        return "Aprendizaje de Spring boot";
    }
    /// Para ubicar como principal alguna funcionalidad
    /// entre parentesis agregar esto("/"), como una definición basico
    @GetMapping("/hello/{nombre}")
    public String sayHello(@PathVariable String nombre){
        return "Hola " + nombre + ", Como estas?";
    }


    /// Si queremos pasar variables en la URL debemos de agregarlas después de una diagonal
    /// encerrada entre corchetes y separándolas por diagonales
    /**
     * Para obtener los datos del usuario usando @RequestParam, no debemos agregar ninguna dirección extra
     * en el {@code @GetMapping}, debemos agregarlo manualmente en la URl de esta manera...<br>
     * {@code http://localhost:8080/bye1?nombre=David&edad=21&profesion=Sistemas Computacionales} <br>
     * Pero obviamente agregaremos en la funcion mapeada los parámetros usando @RequestParam
     */
    @GetMapping("/bye1")
    public String sayBye1(@RequestParam String nombre,
                         @RequestParam int edad,
                         @RequestParam String profesion){
        return "Adios " + nombre + ", con la edad de: " + edad + " y la profesión:" + profesion;
    }

    /**
     * Al usar @PathVariable, una de las coass fundamentales es agregar en
     * la ruta del @GetMapping el nombre de las variables, la unica diferencia es que en
     * la URL se debe de escribir de este modo..... <br>
     * {@code http://localhost:8080/bye2/David/21/Sistemas Computacionales}
     */
    @GetMapping("/bye2/{nombre}/{edad}/{profesion}")
    public String sayBye2(@PathVariable String nombre,
                          @PathVariable int edad,
                          @PathVariable String profesion){
        return "Adios " + nombre + ", con la edad de: " + edad + " y la profesión: " + profesion;
    }
}
