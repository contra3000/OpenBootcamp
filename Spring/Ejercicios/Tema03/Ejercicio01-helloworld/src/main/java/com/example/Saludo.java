package com.example;

public class Saludo {

    public Saludo(){
        System.out.println("Saludo's constructor");
    }

    public String imprimirSaludo(String name){
        return "Hola " + name;
    }
}
