package com.proyecto.config;

import org.glassfish.jersey.server.ResourceConfig;

public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        this.packages("com.proyecto.controllers");
    }
}
