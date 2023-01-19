package com.proyecto.services;

import com.proyecto.entities.Usuario;
import com.proyecto.repositories.UsuariosDB;
import com.proyecto.repositories.UsuariosDBMemoria;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuariosService {
    UsuariosDB usuariosDB = new UsuariosDBMemoria();

    public UsuariosService(UsuariosDB usuariosDB){
        this.usuariosDB = usuariosDB;
    }

    private UsuariosService(){}

    public ArrayList<Usuario> listarUsuarios(){
        return usuariosDB.obtener();
    }

    public void crearUsuario(Usuario usuario){
        if (usuariosDB.buscar(usuario)!=null){
            return;
        }
        usuariosDB.insertar(usuario);
    }

    public void borrarUsuario(String username){
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = username;

        usuariosDB.borrar(usuario);
    }


    public Usuario obtenerUsuario(String nombreUsuario) {
        Usuario usuario = new Usuario();
        usuario.nombreUsuario = nombreUsuario;
        return usuariosDB.buscar(usuario);
    }
}
