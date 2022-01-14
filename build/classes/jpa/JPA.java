package jpa;

import controlador.UsuarioControlador;
import entidades.Usuarios;
import java.util.List;

/**
 *
 * @author jaime
 */
public class JPA {
    public static void main(String[] args) {
        UsuarioControlador us = new UsuarioControlador();
        Usuarios usr = new Usuarios(3, "Asis Machuca", "a18100159@gmail.com", "kawabonga");
        
        //us.create(usr);
        //us.update(usr);
        us.delete(usr);
        
        List<Usuarios> user = us.readAll();
 
         for (Usuarios u: user){
            System.out.println(
                                "\n----------------------------------------\n" +
                                "El ID es: " + u.getId()
                                + "\nCorreo: " + u.getCorreo() 
                                + "\nUser name: " + u.getNombre()
                                + "\nPassword: " + u.getContrasena()
                                );
        }    
    }
    
}
