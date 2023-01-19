package com.proyecto.controllers;

import com.proyecto.entities.Usuario;
import com.proyecto.services.UsuariosService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class UsuariosController {

    private final UsuariosService usuariosService;

    public UsuariosController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GET
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listarTodos(){
        return usuariosService.listarUsuarios();
    }

    @GET
    @Path("/usuarios/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public Usuario listarUno(@PathParam("username") String username){
        return usuariosService.obtenerUsuario(username);
    }

    @POST
    @Path("/usuarios")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crearUsuario(Usuario usuario){
        usuariosService.crearUsuario(usuario);

        return Response.created(URI.create("/usuarios/" + usuario.nombreUsuario)).build();
    }

    @DELETE
    @Path("/usuarios/{username}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response borrarUsuario(@PathParam("username") String username){
        usuariosService.borrarUsuario(username);
        return Response.ok().build();
    }
}
