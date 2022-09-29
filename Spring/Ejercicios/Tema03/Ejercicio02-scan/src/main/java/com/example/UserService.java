package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    //1. Atributos
    NotificationService notifications;

    //2. Constructores
    public UserService(NotificationService notifications){
        System.out.println("UserService's constructor");
        this.notifications = notifications;
    }

    //3. Metodos
}
