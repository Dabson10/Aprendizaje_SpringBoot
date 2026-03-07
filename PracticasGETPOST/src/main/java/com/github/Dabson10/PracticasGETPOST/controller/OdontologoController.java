package com.github.Dabson10.PracticasGETPOST.controller;

import com.github.Dabson10.PracticasGETPOST.entidades.Paciente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class OdontologoController {
    Map<Integer, Paciente> pacientes = new LinkedHashMap<>(
            Map.of(
                    1,new Paciente(1, "PAC_0001","Juan David", "Almaraz Gonzalez", LocalDate.of(2004,4,26)),
                    2, new Paciente(2, "PAC_0002", "Maria Belen", "Rodriguez Sosa", LocalDate.of(2010, 8, 15)),
                    3, new Paciente(3, "PAC_0003", "Lucas Samuel", "Perez Gomez", LocalDate.of(2021, 1, 10)),
                    4, new Paciente(4, "PAC_0004", "Sofia Elena", "Lopez Ruiz", LocalDate.of(1995, 12, 5)),
                    5, new Paciente(5, "PAC_0005", "Diego Armando", "Torres Vela", LocalDate.of(2015, 3, 22)),
                    6, new Paciente(6, "PAC_0006", "Ana Victoria", "Mejia Castro", LocalDate.of(1988, 7, 30)),
                    7, new Paciente(7, "PAC_0007", "Mateo Nicolas", "Duarte Leon", LocalDate.of(2023, 11, 12)),
                    8, new Paciente(8, "PAC_0008", "Valeria Ines", "Guzman Franco", LocalDate.of(2008, 5, 18)),
                    9, new Paciente(9, "PAC_0009", "Sebastian", "Rivas Plata", LocalDate.of(1975, 9, 14)),
                    10, new Paciente(10, "PAC_0010", "Ximena Paulette", "Ortega Gil", LocalDate.of(2019, 2, 28))
            )
    );
    public String listaPac(Map<Integer, Paciente> pacientes){
        StringBuilder mensaje = new StringBuilder((pacientes.isEmpty()) ? "Sin usuarios" : "");
        for(Map.Entry<Integer, Paciente> lista : pacientes.entrySet()){
            mensaje.append(lista.getValue().mostrarPacientes());
        }
        return mensaje.toString();
    }

    @GetMapping("/pacientes")
    public String obtenerPacientes(){
        return listaPac(pacientes);
    }

    @GetMapping("/pacientesObj")
    @ResponseBody
    ResponseEntity<?>obtenerPacientesObj(){
        return new ResponseEntity<>(pacientes, HttpStatus.OK);
    }

    //Pacientes menores de edad

    public String menoresEdad(Map<Integer, Paciente> pacientes){
        StringBuilder mensaje = new StringBuilder((pacientes.isEmpty()) ? "Sin usuarios" : "");
        for(Map.Entry<Integer, Paciente> lista : pacientes.entrySet()){
            if(lista.getValue().getEdad() < 18) {
                mensaje.append(lista.getValue().mostrarPacientes());
            }
        }
        return mensaje.toString();
    }

    @GetMapping("/pacientesMenores")
    public String pacientesMenores(){
        return menoresEdad(pacientes);
    }


    public Map<Integer, Paciente> guardarMenores(){
        Map<Integer, Paciente> menoresEdad = new LinkedHashMap<>();
        for(Map.Entry<Integer, Paciente> lista : pacientes.entrySet()){
            if(lista.getValue().getEdad() < 18){
                menoresEdad.put(lista.getKey(), lista.getValue());
            }
        }
        return menoresEdad;
    }

    @GetMapping("/pacientesMenoresObj")
    @ResponseBody
    ResponseEntity<?> pacientesMenoresEdad(){
        return new ResponseEntity<>(guardarMenores(), HttpStatus.OK);
    }
}
