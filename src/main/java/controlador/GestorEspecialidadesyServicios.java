/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.Especialidad;
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
       public Especialidad getEspecialidadXNombre(String denominacion){
        try {
        
            Query consulta = sesion.createQuery("FROM Especialidad WHERE denominacion = :denominacion");
            consulta.setParameter("denominacion", denominacion);

            Especialidad especialidad = (Especialidad) consulta.uniqueResult();
            return especialidad;
            
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
        
      }  
       public Especialidad getEspecialidadXId(Long idEspecialidad){
        try {
        
            Query consulta = sesion.createQuery("FROM Especialidad WHERE id = :idEspecialidad");
            consulta.setParameter("idEspecialidad", idEspecialidad);

            Especialidad especialidad = (Especialidad) consulta.uniqueResult();
            return especialidad;
            
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}