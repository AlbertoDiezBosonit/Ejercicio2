package com.example.Ejercicio1;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.InetSocketAddress;
import java.util.List;

@RestController
public class Controlador1 {
/*
    @GetMapping
    public String hola(){
        return "hola";
    }
    */

/*
    @PostMapping ("controlador1")
    public String getHeader(@RequestBody String nombre){
      //  nombre="aa";
        return "hola23 ";
    }
*/
    @GetMapping("controlador1")
    public Persona getBaseUrl(@RequestHeader HttpHeaders headers){
        Persona persona=new Persona();
        try {
            persona.setNombre(leeCabecera("nombre", headers));
            persona.setEdad(Integer.parseInt(leeCabecera("edad", headers)));
            persona.setLocalidad(leeCabecera("localidad", headers));
            return persona;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    private String leeCabecera(String nombreCabecera,HttpHeaders cabeceras){
        List lista=cabeceras.get(nombreCabecera);
        if(lista!=null)
            if(lista.size()>0)
                return lista.get(0).toString();
        return null;
    }

}
