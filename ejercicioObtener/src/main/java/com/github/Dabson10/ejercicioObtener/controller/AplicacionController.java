package com.github.Dabson10.ejercicioObtener.controller;

import com.github.Dabson10.ejercicioObtener.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AplicacionController {


    /**
     * Para realizar un envio de datos en un metodo POST usaremos la annotation de
     * {@code @PostMapping("/url")} dentro de los parentesis agregamos la ruta del metodo.
     * Solamente que como no se puede realizar la parte de POST ya que al solicitar
     * una pagina web o URL se utiliza el metodo POST por default por lo que utilizaremos
     * aplicaciones extra para probar la API {@code Postman}
     */

    @PostMapping("/cliente")
    public void crearCliente(
            @RequestBody Cliente cli
    ){
        System.out.println("Cliente creado");
        System.out.println("Nombre: " + cli.getNombre() +
                "\nApellido: "  + cli.getApellido() +
                "\nid: " + cli.getId());
    }
    /**
     * Ahora para realizar el proceso de mandar un dato a la api con
     * esa URL en específico, entraremos a {@code Postman}
     * y crearemos un bloque nuevo espeificando que usaremos {@code HTTP}, <br>
     * aparecera un panel en donde encotraremos los metodos de HTTP para ello usaremos el
     * metodo POST, y agregamos la ruta de la funcion para agregar nuevos usarios que es...
     * {@code http:8080/cliente}, ahora como la funcion nos solicita un objeto
     * de tipo Cliente o en este caso un {@code JSON} seleccionaremos en postman
     * {@code Body} el cual si no olvidamos que una {@code petición} o {@code request}
     * tiene un cuerpo y cabecera, el body es el que tendra los datos que enviara al
     * servidor para ser procesado, ahi agregamos el JSON de esta manera
     * {
     *     "id" : 1,
     *     "nombre" : "Juan David",
     *     "apellido" : "Almaraz Gonzalez"
     * }
     * <br>
     * y al enviar la peticion tendria que aparecer algo asi en la consola del IDE <br>
     * Cliente creado
     * Nombre: Juan David
     * Apellido: Almaraz Gonzalez
     * id: 1
     * <br>
     * Ahora gracias a postman podemos ver el cuerpo de la peticion el cual queda de
     * esta forma... <br>
     * postman request POST 'localhost:8080/cliente' \
     *   --header 'Content-Type: application/json' \
     *   --body '{
     *     "id" : 1,
     *     "nombre" : "Juan David",
     *     "apellido" : "Almaraz Gonzalez"
     * }'
     */


}