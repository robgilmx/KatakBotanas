/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DEMON
 * 
 * @param <Entidad>
 */

public abstract class AccesoDatos<Entidad> {
    protected Session sesion;
    protected Transaction transaccion;
    
    protected void iniciarSesion() throws HibernateException {
        sesion = GeneradorSesiones.getSesion();
        transaccion = sesion.beginTransaction();
    }
    
    protected void terminarSesion() {
        sesion.close();
    }
    
    protected void handleHibernateException(
            HibernateException excepcionHibernate
    ) throws HibernateException {
        transaccion.rollback();
        throw new HibernateException("No se pudo realizar la transaccion");
    }
    
    protected abstract Class getTipoClase();
    
    public void insertar(Entidad entidad) {
        try {
            iniciarSesion();
            sesion.save(entidad);
            transaccion.commit();
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
    }
    
    public void modificar(Entidad entidad) {
        try {
            iniciarSesion();
            sesion.update(entidad);
            transaccion.commit();
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
    }
    
    public void borrar(Entidad entidad) {
        try {
            iniciarSesion();
            sesion.delete(entidad);
            transaccion.commit();
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
    }
    
    public Entidad getPorID(int id) {
        Entidad registroExistente = null;
       
        try {
            iniciarSesion();
            registroExistente = (Entidad) sesion.get(getTipoClase(), id);
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return registroExistente;
    }
    
    public List<Entidad> getLista() {
        List<Entidad> registrosExistentes = null;
        
        try {
            iniciarSesion();
            Criteria criterio = sesion.createCriteria(getTipoClase());
            registrosExistentes = criterio.list();
        } finally {
            terminarSesion();
        }
        
        return registrosExistentes;
    }
}
