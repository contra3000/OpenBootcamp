package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // CONCEPTO 1: obtener beans de Spring

        // Cargar un BEAN dentro de otro BEAN
        UserService usuario = (UserService) context.getBean("userService");
        System.out.println(usuario.notifications.imprimirSaludo("Romeo"));
    }
}
