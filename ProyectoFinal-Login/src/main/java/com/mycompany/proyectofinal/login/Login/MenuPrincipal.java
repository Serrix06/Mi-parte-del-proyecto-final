package com.mycompany.proyectofinal.login.Login;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class MenuPrincipal {

    public static void main(String[] args) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("admin", "1234", "bibliotecario"));
        listaUsuarios.add(new Usuario("socio1", "abcd", "socio"));

        Login login = new Login();
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
        String contrasena = JOptionPane.showInputDialog("Ingrese su contraseña:");
        Usuario usuarioLogueado = login.loguearse(nombreUsuario, contrasena, listaUsuarios);

        if (usuarioLogueado != null) {
            // continuar con las funcionalidades segun el tipo de usuario
            if ("bibliotecario".equals(usuarioLogueado.getTipoUsuario())) {
                // acciones especificas del bibliotecario
            } else if ("socio".equals(usuarioLogueado.getTipoUsuario())) {
                // acciones especificas del socio
            }
        }
    }
}

