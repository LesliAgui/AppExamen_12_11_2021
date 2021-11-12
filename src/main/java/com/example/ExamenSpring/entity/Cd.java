package com.example.ExamenSpring.entity;

public class Cd extends ItemPrestamo {

    public Cd(int codigo, String nombre){
        super(codigo,nombre);
    }

    @Override
    public void getDiasDevolucion() {

    }
}
