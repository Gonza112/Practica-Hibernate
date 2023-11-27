/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.Especialidad;
import modelo.Tecnico;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import persistencia.ConfigHibernate;

/**
 *
 * @author gonza
 */
public class GestorGenerico extends Gestor {
    
    
    public GestorGenerico(){
        sesion = ConfigHibernate.openSession();
    }
    
    
    
    
     public void guardar(Object o) throws Exception { // para guardar cualquier cosa

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
   
    public void guardarLista(List objetos) throws Exception {

        boolean guardar = false;
        Transaction tx = null;
        try {
            if (!sesion.getTransaction().isActive()) {
                tx = sesion.beginTransaction();
                guardar = true;
            }
            for (Object o : objetos) {
                guardar(o);
            }
            if (guardar) {
                tx.commit();
            }
        } catch (Exception e) {
            if (guardar) {
                tx.rollback();
            }
            throw new Exception(e.getMessage());
        }
    }

    public Object buscarPorId(Class clase, Long id) {

        Query consulta = sesion.createQuery("from " + clase.getSimpleName() + " a where a.id =" + id.toString());
        List<Object> lista;
        try {
            lista = consulta.list();
            if (lista.size() < 1) {
                return null;
            }
            if (lista.size() > 1) {
                return null;
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
        Object[] x = lista.toArray();
        return x[0];
    }

    public List<Object> buscarPorAtributo(Session session, Class clase,
            String nombreAtributo, Object valorAtributo)
            throws Exception {

        Query consulta = session.createQuery("from " + clase.getSimpleName() + " entidad where entidad." + nombreAtributo + " =:valor");
        consulta.setParameter("valor", valorAtributo);
        List<Object> lista;
        try {
            lista = consulta.list();
            return lista;
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new Exception(e.getMessage());
        }
    }

    public Object buscarObjetoPorAtributo(Session session, Class clase,
            String nombreAtributo, Object valorAtributo)
            throws Exception {
        Query consulta = session.createQuery("from " + clase.getSimpleName() + " entidad where entidad." + nombreAtributo + " =:valor");
        consulta.setParameter("valor", valorAtributo);
        List<Object> lista;
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
  public List buscarPorAtributo1(Class clase, String nombreAtributo, Object valorAtributo) {

        Query consulta = sesion.createQuery("from " + clase.getSimpleName() + " entidad where entidad." + nombreAtributo + " =:valor");
        consulta.setParameter("valor", valorAtributo);
        List<Object> lista;
        try {
            lista = consulta.list();
            return lista;
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
    }
    public List buscarPorAtributo(Class clase, Object valorAtributo) {

        Query consulta = sesion.createQuery("from " + clase.getSimpleName() + " entidad where entidad." + " = :valor");
        consulta.setParameter("valor", valorAtributo);
        List<Object> lista;
        try {
            lista = consulta.list();
            return lista;
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Object buscarObjetoPorAtributo(Class clase, String nombreAtributo, Object valorAtributo) {
        Query consulta = sesion.createQuery("from " + clase.getSimpleName() + " entidad where entidad." + nombreAtributo + " =:valor");
        consulta.setParameter("valor", valorAtributo);
        List<Object> lista;
        try {
            lista = consulta.list();
            if (lista.size() > 0) {
                return lista.get(0);
            } else {
                return null;
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List listar(Session session, Class clase)
            throws Exception {

        Query consulta = session.createQuery("from " + clase.getSimpleName() + " a");
        List<Object> lista;
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

    public List listar(Class clase) throws Exception {

        Query consulta = sesion.createQuery("from " + clase.getSimpleName() + " a");
        List<Object> lista;
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

    public void eliminar(Object o) throws Exception {
        boolean eliminar = false;
        Transaction tx = null;
        try {
            if (!sesion.getTransaction().isActive()) {
                tx = sesion.beginTransaction();
                eliminar = true;
            }
            sesion.delete(o);
            if (eliminar) {
                tx.commit();
            }
            JOptionPane.showMessageDialog(null, "Eliminado.");
        } catch (Exception e) {
            if (eliminar) {
                tx.rollback();
            }
            throw new Exception(e.getMessage());
        }
    }
          public Tecnico BuscarXLegajo(int legajo) throws Exception {

        Query consulta = sesion.createQuery("SELECT tecnico FROM Tecnico tecnico WHERE tecnico.legajo = :legajo");
        consulta.setParameter("legajo", legajo);
        
        try{
             Tecnico tecnico = (Tecnico) consulta.uniqueResult();
            return tecnico;
            
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

}
