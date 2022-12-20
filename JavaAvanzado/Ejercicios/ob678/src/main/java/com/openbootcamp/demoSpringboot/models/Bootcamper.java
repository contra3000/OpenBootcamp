package com.openbootcamp.demoSpringboot.models;

public class Bootcamper {
    private String nombre;
    private double valor;

    public Bootcamper(){}

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Bootcamper(String nombre){
        this.nombre = nombre;
        this.valor = Math.random();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
