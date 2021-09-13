package com.example.Ejercicio1;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controlador2 {
    @GetMapping("controlador2")
    public Persona getBaseUrl(@RequestHeader HttpHeaders headers) {
        Persona retorno = new Controlador1().getBaseUrl(headers);
        retorno.setEdad(retorno.getEdad()*2);
        return retorno;
    }
}
