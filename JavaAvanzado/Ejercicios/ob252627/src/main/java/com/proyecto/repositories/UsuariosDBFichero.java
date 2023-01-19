package com.proyecto.repositories;

import com.proyecto.entities.Usuario;
import org.apache.tomcat.util.digester.ArrayStack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuariosDBFichero extends UsuariosDB{
    public String ficheroDatos = "usuarios.txt";

    @Override
    public ArrayList<Usuario> obtener() {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try{
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while(scanner.hasNext()){
                String usuarioActual = scanner.next();
                String[] partes = usuarioActual.split(",");

                Usuario usuario = new Usuario();
                usuario.nombreUsuario = partes[0];
                usuario.nombre = partes[1];
                usuario.apellido = partes[2];
                usuario.email = partes[3];
                usuario.nivelAcceso = Integer.parseInt(partes[4]);

                usuarios.add(usuario);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return usuarios;
    }

    @Override
    public Usuario buscar(Usuario usuario) {

        ArrayList<Usuario> usuarios = obtener();

        for (Usuario usuarioActual: usuarios){
            if(usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)){
                return usuarioActual;
            }
        }
        return null;
    }

    @Override
    public void insertar(Usuario usuario) {
        ArrayList<Usuario> usuarios = obtener();

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
        ArrayList<Usuario> usuarios = obtener();

        for (Usuario usuarioActual: usuarios){
            if(usuarioActual.nombreUsuario.equalsIgnoreCase(usuario.nombreUsuario)){
                usuarios.remove(usuarioActual);
            }
        }
    }
}
