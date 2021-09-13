package com.example.Ejercicio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Persona {



    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }


    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Integer getEdad() {
        return edad;
    }

   //
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    private String nombre,localidad;
    private Integer edad;
}
