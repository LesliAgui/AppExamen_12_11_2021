package com.example.ExamenSpring.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
public class Cliente {

    private String dni;
    private String nombre;
    private String domicilio;
    private List<Prestamo> prestamos;


    public Cliente(String nombre, String dni, String domicilio) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
    }

    public void addPrestamo(Prestamo p)
    {
        prestamos.add(p);
    }
}
