package com.mycompany.proyectofinal.login.Login;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String tipoUsuario; // "bibliotecario" o "socio"

    // Constructor
    public Usuario(String nombreUsuario, String contrasena, String tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
    }

    // Getters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}

