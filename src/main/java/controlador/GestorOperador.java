/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.OperadorMesaAyuda;
import modelo.Tecnico;
import org.hibernate.Query;
import org.hibernate.Transaction;
import persistencia.ConfigHibernate;

/**
 *
 * @author gonza
 */
public class GestorOperador extends Gestor{
    
    public GestorOperador(){
        sesion = ConfigHibernate.openSession();
    }
        public OperadorMesaAyuda listarTecnicoPorApellido(String apellido) throws Exception {

        Query consulta = sesion.createQuery("SELECT operador FROM OperadorMesaAyuda operador WHERE operador.apellido = :apellido");
        consulta.setParameter("apellido", apellido);
        
            List<OperadorMesaAyuda> lista;
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
           public void modificarOperador(OperadorMesaAyuda operador ) throws Exception { // para guardar cualquier cosa

        boolean guardar = false;
        Transaction tx = null;
        try {
            if (!sesion.getTransaction().isActive()) { 
                tx = sesion.beginTransaction(); //
                guardar = true;
            }
            sesion.merge(operador);
          
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
