package com.mycompany.proyectofinal.login.Login;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;
    private String tipoUsuario; // elegi entre bibliotecario y socio

    
    public Usuario(String nombreUsuario, String contrasena, String tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.tipoUsuario = tipoUsuario;
    }

    
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

