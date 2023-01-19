package com.proyecto.repositories;

import com.proyecto.entities.Usuario;
import org.apache.tomcat.util.digester.ArrayStack;

import java.util.ArrayList;

public class UsuariosDBMemoria extends UsuariosDB {

    ArrayList<Usuario> usuarios = new ArrayStack<>();

    @Override
    public ArrayList<Usuario> obtener() {
        return usuarios;
    }

    @Override
    public Usuario buscar(Usuario usuario) {
        for (Usuario usuarioActual: usuarios){
            if(usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)){
                return usuarioActual;
            }
        }
        return null;
    }

    @Override
    public void insertar(Usuario usuario) {
        for (Usuario usuarioActual: usuarios){
            if(usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)){
                return;
            }
        }
        usuarios.add(usuario);
        incrementarInserciones();
    }

    @Override
    public void borrar(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)){
                usuarios.remove(usuario);
            }
        }
        incrementarEliminaciones();
    }
}
