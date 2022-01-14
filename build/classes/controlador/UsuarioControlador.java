package controlador;

import conexion.Conexion;
import entidades.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author jaime
 */
public class UsuarioControlador {
    
    public void create (Usuarios u){
           
           //Inicia la transacción
           EntityManager en = entityManager(); 
           
           try {
                en.getTransaction().begin();
                //Equivalente de Create
                en.persist(u);              
                //Inserta la transacción
                en.getTransaction().commit();
           }
           catch (Exception e){
                en.getTransaction().rollback();
           }
          
       }
       
    public void update (Usuarios u){
           
           //Inicia la transacción
           EntityManager en = entityManager(); 
           
           try {
                en.getTransaction().begin();
                //Equivalente de Update
                en.merge(u);              
                //Inserta la transacción
                en.getTransaction().commit();
           }
           catch (Exception e){
                en.getTransaction().rollback();
           }
          
       }
    
    public void delete (Usuarios u){
           
           //Inicia la transacción
           EntityManager en = entityManager(); 
           
           try {
                en.getTransaction().begin();
                //Equivalente de Create
                en.remove(en.merge(u));              
                //Inserta la transacción
                en.getTransaction().commit();
           }
           catch (Exception e){
                en.getTransaction().rollback();
           }
          
       }
    
    public List<Usuarios> readAll (){
        
        Query q = entityManager().createQuery("SELECT u FROM Usuarios u");
        
        return q.getResultList();
    }
            
    private EntityManager entityManager (){
        return Conexion.getInstancia().getFabrica().createEntityManager();
    }
    
}
