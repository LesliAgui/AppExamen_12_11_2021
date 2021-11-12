package com.example.ExamenSpring.entity;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Prestamo {
    private String fecha;
    private String estado;
    private Date fechaDevolucion;

    //Una variable de tipo ItemPrestamso
    private ItemPrestamo item;


    //Constructor
    public Prestamo(String fecha, Date fechaDevolucion, ItemPrestamo item) {
        this.fecha = fecha;
        this.fechaDevolucion = fechaDevolucion;
        this.item = item;
    }
}
