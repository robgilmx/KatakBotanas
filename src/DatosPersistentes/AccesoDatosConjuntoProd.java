/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;

import Negocio.Entidades.ConjuntoProductos;
import Negocio.Entidades.Enums.EstadoConjuntoProd;
import Negocio.Entidades.Reporte;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author DEMON
 */
public class AccesoDatosConjuntoProd extends AccesoDatos<ConjuntoProductos>{
   
    public List<ConjuntoProductos> getPorEstado(EstadoConjuntoProd inputEstado) {
        String NOMBRE_COLUMNA = "estado";
        List<ConjuntoProductos> conjuntoProductosExistente = null;
        
        try {
            iniciarSesion();
            String SentenciaBusqueda = "SELECT * FROM conjuntos WHERE " + NOMBRE_COLUMNA + " REGEXP"
                    + "'^" + inputEstado.getEstado()+ "'";
            Query query = sesion.createSQLQuery(SentenciaBusqueda).addEntity(getTipoClase());
            conjuntoProductosExistente = query.list();
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return conjuntoProductosExistente;
    }
    
    public List<ConjuntoProductos> getPorNombreProd(String inputNombreProducto) {
        String NOMBRE_COLUMNA = "nombre_producto";
        List<ConjuntoProductos> conjuntoProductosExistente = null;
        
        try {
            iniciarSesion();
            String searchSentence = "SELECT * FROM conjuntos WHERE " + NOMBRE_COLUMNA + " REGEXP"
                    + "'^" + inputNombreProducto+ "'";
            Query query = sesion.createSQLQuery(searchSentence).addEntity(getTipoClase());
            conjuntoProductosExistente = query.list();
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return conjuntoProductosExistente;
    }

    @Override
    protected Class getTipoClase() {
        return ConjuntoProductos.class;
    }
}
