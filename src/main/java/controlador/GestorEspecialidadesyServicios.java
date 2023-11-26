/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.Servicio;
import org.hibernate.Query;
import org.hibernate.Transaction;
import persistencia.ConfigHibernate;

/**
 *
 * @author gonza
 */
    public class GestorEspecialidadesyServicios extends Gestor {
    
       public GestorEspecialidadesyServicios(){
        sesion = ConfigHibernate.openSession();
                 
    }
   public Servicio ListaPorIdServicio(Long idServicio){
        try {
        
            Query consulta = sesion.createQuery("FROM Servicio WHERE id = :idServicio");
            consulta.setParameter("idEspecialidad", idServicio);

            Servicio servicio = (Servicio) consulta.uniqueResult();
            return servicio;
            
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
    }
}