package com.mycompany.proyectofinal.login.Login;

import java.util.List;
import javax.swing.JOptionPane;

public class Login {

    // mtodo para iniciar sesión
    public Usuario loguearse(String nombreUsuario, String contrasena, List<Usuario> listaUsuarios) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "¡Bienvenido, " + usuario.getNombreUsuario() + "!");
                return usuario;
            }
        }
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
        return null;
    }
}


