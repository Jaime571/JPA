package conexion;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexion {
    
    private static Conexion instancia = new Conexion ();

   
    private EntityManagerFactory fabrica;
    
    private Conexion (){
        
        fabrica = Persistence.createEntityManagerFactory("JPAPU");
        
    }
     public static Conexion getInstancia() {
        return instancia;
    }

    public EntityManagerFactory getFabrica() {
        return fabrica;
    }
}