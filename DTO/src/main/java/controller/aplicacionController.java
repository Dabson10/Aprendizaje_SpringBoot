package controller;

import entity.Entidades.Inquilino;
import entity.Entidades.Propiedad;
import DTOs.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {
    @GetMapping("/propiedad/{ID}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad(@PathVariable Long ID){
        Propiedad prop = new Propiedad(123145L, "Casa",
                "308 Casuarinas", 200.0, 45.000);

        Inquilino inqui = new Inquilino(1L, "123456789",
                "Juan David", "Almaraz Gonzalez",
                "Sistemas ");
        PropiedadDTO propD = new PropiedadDTO();
        propD.setId_propiedad(prop.getId_propiedad());
        propD.setTipo_propiedad(prop.getTipo_propiedad());
        propD.setDireccion(prop.getDireccion());
        propD.setValor_alquiler(prop.getValor_alquiler());
        propD.setNombre(inqui.getNombre());
        propD.setApellido(inqui.getApellido());
        return propD;
    }
}
