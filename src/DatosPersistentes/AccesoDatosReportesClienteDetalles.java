/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;


import Negocio.Entidades.Enums.TipoReporte;
import Negocio.Entidades.Reporte;
import Negocio.Entidades.CantidadProd;
import Negocio.Entidades.Enums.EstadoCantidadProd;
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
public class AccesoDatosReportesClienteDetalles extends AccesoDatos<CantidadProd>{
    
   
    
    public List<CantidadProd> getCantidadPorEstado(EstadoCantidadProd inputEstado) {
        String NOMBRE_COLUMNA = "estado";
        List<CantidadProd> cantidadProductosExistente = null;
        
        try {
            iniciarSesion();
            String SentenciaBusqueda = "SELECT * FROM conjuntos WHERE " + NOMBRE_COLUMNA + " REGEXP"
                    + "'^" + inputEstado.getEstado()+ "'";
            Query query = sesion.createSQLQuery(SentenciaBusqueda).addEntity(getTipoClase());
            cantidadProductosExistente = query.list();
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return cantidadProductosExistente;
    }
    
    public List<CantidadProd> getCantidadPorNombreProd(String inputNombreProducto) {
        String NOMBRE_COLUMNA = "nombre_producto";
        List<CantidadProd> cantidadProductosExistente = null;
        
        try {
            iniciarSesion();
            String searchSentence = "SELECT * FROM conjuntos WHERE " + NOMBRE_COLUMNA + " REGEXP"
                    + "'^" + inputNombreProducto+ "'";
            Query query = sesion.createSQLQuery(searchSentence).addEntity(getTipoClase());
            cantidadProductosExistente = query.list();
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return cantidadProductosExistente;
    }
    
    
    @Override
    public CantidadProd getPorID(int id) {
        CantidadProd registroCantidadProdExistente = null;
       
        try {
            iniciarSesion();
            registroCantidadProdExistente = (CantidadProd) sesion.get(getTipoClase(), id);
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return registroCantidadProdExistente;
    }
    
        
    @Override
    protected Class getTipoClase() {
        return Reporte.class;
    }
}
