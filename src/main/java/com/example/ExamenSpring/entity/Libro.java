package com.example.ExamenSpring.entity;

public class Libro extends ItemPrestamo{

    public Libro(int codigo, String nombre){
        super( 100, "Hola");
    }

    @Override
    public void getDiasDevolucion() {

    }
}
