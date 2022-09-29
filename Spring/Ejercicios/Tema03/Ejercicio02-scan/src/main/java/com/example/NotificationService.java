package com.example;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){
        System.out.println("NotificationService's constructor");
    }

    public String imprimirSaludo(String name){
        return "Hola " + name;
    }
}
