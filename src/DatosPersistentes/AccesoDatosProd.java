/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;

import Negocio.Entidades.Producto;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;



/**
 *
 * @author DEMON
 */
public class AccesoDatosProd extends AccesoDatos<Producto>{
     
    public List<Producto> getPorNombre(String inputNombre) {
        String NOMBRE_COLUMNA = "nombre";
        List<Producto> productoExistente = null;
        
        try {
            iniciarSesion();
            String SentenciaBusqueda = "SELECT * FROM productos WHERE " + NOMBRE_COLUMNA + " REGEXP"
                    + "'^" + inputNombre + "'";
            Query query = sesion.createSQLQuery(SentenciaBusqueda).addEntity(getTipoClase());
            productoExistente = query.list();
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return productoExistente;
    }
    
    @Override
    protected Class getTipoClase() {
        return Producto.class;
    }
}
