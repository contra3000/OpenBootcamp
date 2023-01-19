package com.proyecto.entities;

//POJO: Plain-old Java Object
public class Usuario {

    public String nombreUsuario;
    public String nombre;
    public String apellido;
    public String email;
    public int nivelAcceso;

    @Override
    public String toString() {
        return "Nombre de usuario: " + nombreUsuario + '\'' +
                "Nombre: " + nombre + '\'' +
                "Apellido: " + apellido + '\'' +
                "Email: " + email + '\'' +
                "NivelAcceso: " + nivelAcceso;
    }
}
