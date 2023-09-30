package com.mycompany._proyecto_login.logica;

import com.mycompany._proyecto_login.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    ControladoraPersistencia cp = new ControladoraPersistencia();
    String mensaje = "";

    public String validarUsuario(String user, String pass) {
        List<User> listaUsuarios = cp.traerUsuarios();
        for(User u : listaUsuarios) {
            if(u.getUser().equals(user) && u.getPassword().equals(pass)) {
                mensaje = "Usuario y contraseña correctos";
                break;
            }  else {
                mensaje = "Credenciales incorrectas";
               
            }
        }
        return mensaje;
    }
    
    
    
}
