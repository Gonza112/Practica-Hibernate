package controlador;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.DatosContacto;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import persistencia.ConfigHibernate;

public class Gestor {

    protected String message = null;
    protected int firstResult;
    protected int maxResult = 50;
    protected long totalResult;
    protected int activePage;
    protected String order = "asc";
    private static ConfigHibernate configHibernate;
    protected List<String> packages;
    protected List<Class> clases;
    protected Session sesion;

    public Gestor() {
        configHibernate = new ConfigHibernate();
    }


    public ConfigHibernate getHu() {
        if (configHibernate != null) {
            return configHibernate;
        } else {
            configHibernate = new ConfigHibernate();
            return configHibernate;
        }
    }

    public static void setHu(ConfigHibernate configHibernate) {
        Gestor.configHibernate = configHibernate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage(String message, boolean error) {
        if (error) {
            this.setMessage("DGE: " + message);
        }
    }

    public void setFirstResult(int firstResult) {
        this.firstResult = firstResult;
    }

    public int getFirstResultActive() {
        return this.maxResult * (this.activePage - 1);
    }

    public int getMaxResult() {
        return maxResult;
    }

    public void setMaxResult(int maxResult) {
        this.maxResult = maxResult;
    }

    public long getTotalResult() {
        return totalResult;
    }

    public void setTotalResult(long totalResult) {
        this.totalResult = totalResult;
    }

    public int getTotalPages() {
        return Math.round((float) (this.totalResult + 0.1) / (float) this.maxResult);
    }

    public int getActivePage() {
        return activePage;
    }

    public void setActivePage(int activePage) {
        this.activePage = activePage;
    }

    public void setAscOrder() {
        this.order = "asc";
    }

    public void setDescOrder() {
        this.order = "desc";
    }

    public Session getSesion() {
        return sesion;
    }

    public void setSesion(Session sesion) {
        this.sesion = sesion;
    }
}
