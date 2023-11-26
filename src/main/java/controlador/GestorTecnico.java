/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Tecnico;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import persistencia.ConfigHibernate;

/**
 *
 * @author gonza
 */
public class GestorTecnico extends Gestor {
    
        public GestorTecnico() {
        sesion = ConfigHibernate.openSession();
    }
       public void guardarTecnico(Object o) throws Exception { // para guardar cualquier cosa

        boolean guardar = false;
        Transaction tx = null;
        try {
            if (!sesion.getTransaction().isActive()) { 
                tx = sesion.beginTransaction(); //
                guardar = true;
            }
            sesion.saveOrUpdate(o);
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
    public Tecnico listarTecnicoPorApellido(String apellido) throws Exception {

        Query consulta = sesion.createQuery("SELECT tecnico FROM Tecnico tecnico WHERE tecnico.apellido = :apellido");
        consulta.setParameter("apellido", apellido);
        
            List<Tecnico> lista;
        try {
            lista = consulta.list();
            if (lista.size() == 1) {
                return lista.iterator().next();
            } else if (lista.size() == 0) {
                return null;
            } else {
                throw new Exception();
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }
     public List listarTecnico() throws Exception {

        Query consulta = sesion.createQuery("SELECT tecnico FROM Tecnico tecnico");
        List<Tecnico> lista;
        try {
            lista = consulta.list();
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new Exception();
        }
        if (lista == null) {
            throw new Exception();
        }
        return lista;
    }
       public void modificarTecnico(Tecnico tecnico ) throws Exception { // para guardar cualquier cosa

        boolean guardar = false;
        Transaction tx = null;
        try {
            if (!sesion.getTransaction().isActive()) { 
                tx = sesion.beginTransaction(); //
                guardar = true;
            }
            sesion.merge(tecnico);
          
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
