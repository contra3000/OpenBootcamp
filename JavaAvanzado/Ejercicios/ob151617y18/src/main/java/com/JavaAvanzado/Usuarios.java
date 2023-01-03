package com.JavaAvanzado;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Usuarios {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void saveUsuarios(Usuario ...usuarios){
        this.usuarios.addAll(Arrays.asList(usuarios));
    }

    public Usuario findUsuarioById(Long id) throws Exception {
        if (usuarios.size()<id.intValue()){
            throw new ArrayIndexOutOfBoundsException("No hay tantos usuarios");
        }
        for(Usuario usuario: usuarios){
            if (usuario.getId() == id){
                return usuario;
            }
        } throw new FileNotFoundException("Usuario no encontrado con id: " + id);
    }

    public void deleteUsuarioById(Long id){
        usuarios.removeIf(usuario -> usuario.getId() == id);
    }
}
