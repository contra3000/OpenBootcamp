package com.openbootcamp.demoSpringboot.config;


import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        this.packages("com.openbootcamp.demoSpringboot.controllers");
    }
}
