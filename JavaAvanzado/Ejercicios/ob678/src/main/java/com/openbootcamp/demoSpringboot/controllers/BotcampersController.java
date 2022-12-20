package com.openbootcamp.demoSpringboot.controllers;

import com.openbootcamp.demoSpringboot.models.Bootcamper;
import com.openbootcamp.demoSpringboot.services.BootcamperService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BotcampersController {
    private final BootcamperService bootcamperService;

    public BotcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("uno"));
        this.bootcamperService.add(new Bootcamper("dos"));
        this.bootcamperService.add(new Bootcamper("tres"));
        this.bootcamperService.add(new Bootcamper("cuatro"));
        this.bootcamperService.add(new Bootcamper("cinco"));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos(){
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("nombre") String nombre){
        return bootcamperService.get(nombre);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper){
        bootcamperService.add(bootcamper);

        return Response.created(URI.create("/bootcampers/" + bootcamper.getNombre())).build();
    }
}
