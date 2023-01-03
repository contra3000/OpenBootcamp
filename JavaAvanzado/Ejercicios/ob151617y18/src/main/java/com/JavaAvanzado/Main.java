package com.JavaAvanzado;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1L, "Juan", 15, 58.9);
        Usuario usuario2 = new Usuario(2L, "Pedro", 18, 79.3);
        Usuario usuario3 = new Usuario(3L, "Matias", 19, 75.2);
        Usuario usuario4 = new Usuario(4L, "Esteban", 13, 58.2);
        Usuario usuario5 = new Usuario(5L, "Alfonso", 14, 60.3);
        Usuario usuario6 = new Usuario(6L, "Martin", 21, 61.29);

        Usuarios usuarios = new Usuarios();

        usuarios.saveUsuarios(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6);

        try{
            System.out.println(usuarios.findUsuarioById(2L).getIMC(1.73));
            System.out.println(usuarios.findUsuarioById(1L).getIMC(0.00));
            System.out.println(usuarios.findUsuarioById(9L));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        usuarios.deleteUsuarioById(3L);

        try{
            usuarios.findUsuarioById(3L);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
