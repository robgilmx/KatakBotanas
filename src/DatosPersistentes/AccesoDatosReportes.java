/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;


import Negocio.Entidades.Enums.TipoReporte;
import Negocio.Entidades.Reporte;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

/**
 *
 * @author DEMON
 */
public class AccesoDatosReportes extends AccesoDatos<Reporte>{
    
    public List<Reporte> getPorFechaCreacion(Date fechaCreacion) {
        String NOMBRE_COLUMNA = "fecha_creacion";
        List<Reporte> reporteExistente = null;
        
        try {
            iniciarSesion();
            Criteria criterio = sesion.createCriteria(getTipoClase());
            SimpleExpression restriccion = Restrictions.eq(NOMBRE_COLUMNA, fechaCreacion);
            reporteExistente = criterio.add(restriccion).list();
            System.out.println(reporteExistente.size());
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return reporteExistente;
    }
    
    public List<Reporte> getPorFechaPedido(Date fechaPedido) {
        String NOMBRE_COLUMNA = "fecha_pedido";
        List<Reporte> reporteExistente = null;
        
        try {
            iniciarSesion();
            Criteria criterio = sesion.createCriteria(getTipoClase());
            SimpleExpression restriccion = Restrictions.eq(NOMBRE_COLUMNA, fechaPedido);
            reporteExistente = criterio.add(restriccion).list();
            System.out.println(reporteExistente.size());
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return reporteExistente;
    }
    
    public List<Reporte> getPorTipo(TipoReporte inputTipo) {
        String NOMBRE_COLUMNA = "tipo";
        List<Reporte> reporteExistente = null;
        
        try {
            iniciarSesion();
            String SentenciaBusqueda = "SELECT * FROM clientes WHERE " + NOMBRE_COLUMNA + " REGEXP"
                    + "'^" + inputTipo.getTipo() + "'";
            Query query = sesion.createSQLQuery(SentenciaBusqueda).addEntity(getTipoClase());
            reporteExistente = query.list();
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return reporteExistente;
    }
    
    @Override
    protected Class getTipoClase() {
        return Reporte.class;
    }
}
