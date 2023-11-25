/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.DatosContacto;
import org.hibernate.Query;
import org.hibernate.Transaction;
import persistencia.ConfigHibernate;

/**
 *
 * @author Docente
 */
public class GestorCliente extends Gestor {
    
    
    public GestorCliente() {
        sesion = ConfigHibernate.openSession();
                 

    }
  
        public Cliente getClienteXCuit(long cuit) throws Exception {
        try {
        Query consulta = sesion.createQuery ("SELECT cliente FROM Cliente cliente  WHERE cliente.cuit = :cuit");
        consulta.setParameter("cuit", cuit);
        
           List<Object> lista;
           Cliente cliente = (Cliente) consulta.uniqueResult();
           return cliente;
        
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
    }
        public void guardarCliente(Cliente cliente) throws Exception { // para guardar cualquier cosa

        boolean guardar = false;
        Transaction tx = null;
        try {
            if (!sesion.getTransaction().isActive()) { 
                tx = sesion.beginTransaction(); //
                guardar = true;
            }
            sesion.saveOrUpdate(cliente);
            if (guardar) {
                tx.commit();
               JOptionPane.showMessageDialog(null, "Guardado");
            }
        } catch (Exception e) {
            if (guardar) {
                tx.rollback(); // regresa atras en los cambios para evitar errores
            }
            throw new Exception(e.getMessage());
        }
    }

        public Cliente listarCuitCliente(long cuit) throws Exception {

        Query consulta = sesion.createQuery("SELECT cliente FROM Cliente cliente WHERE cliente.cuit = :cuit");
        consulta.setParameter("cuit", cuit);
        
        try{
             Cliente cliente = (Cliente) consulta.uniqueResult();
            return cliente;
            
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
    }
      public void modificarCliente(Cliente cliente ) throws Exception { // para guardar cualquier cosa

        boolean guardar = false;
        Transaction tx = null;
        try {
            if (!sesion.getTransaction().isActive()) { 
                tx = sesion.beginTransaction(); //
                guardar = true;
            }
            sesion.merge(cliente);
          
            if (guardar) {
                tx.commit();
               JOptionPane.showMessageDialog(null, "Guardado");
            }
        } catch (Exception e) {
            if (guardar) {
                tx.rollback(); // regresa atras en los cambios para evitar errores
            }
            throw new Exception(e.getMessage());
        }
    }
 
}
