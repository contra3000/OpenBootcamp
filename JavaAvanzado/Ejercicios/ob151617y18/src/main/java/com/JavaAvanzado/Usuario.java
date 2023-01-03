package com.JavaAvanzado;

public class Usuario {

    private Long id;

    private String name;

    private int edad;

    private double peso;


    private Usuario(){}

    public Usuario(Long id, String name, int edad, double peso) {
        this.id = id;
        this.name = name;
        this.edad = edad;
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double peso) {
        this.peso = peso;
    }

    public int getIMC(double altura) throws ArithmeticException{
        if (altura > 0){
            return (int) (peso / (altura * altura));
        }
        throw new ArithmeticException("La altura debe ser mayor a 0");
    }
}
