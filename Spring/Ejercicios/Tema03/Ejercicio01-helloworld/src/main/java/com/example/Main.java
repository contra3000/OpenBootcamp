package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //CONCEPTO 1: obtener beans de Spring
        // Recibir un objeto de Spring
        Saludo saludador = (Saludo) context.getBean("saludador");
        String saludo = saludador.imprimirSaludo("Juan");
        System.out.println(saludo);

        String saludo2 = saludador.imprimirSaludo("Ines");
        System.out.println(saludo2);

    }
}
