/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;

import Negocio.Entidades.ConjuntoProductos;
import Negocio.Entidades.Enums.EstadoConjuntoProductos;
import Negocio.Entidades.Reporte;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author DEMON
 */
public class AccessoDatosConjuntoProductos extends AccesoDatos<ConjuntoProductos>{
   
    public List<Reporte> getPorEstado(EstadoConjuntoProductos inputEstado) {
        String NOMBRE_COLUMNA = "estado";
        List<Reporte> reporteExistente = null;
        
        try {
            iniciarSesion();
            String searchSentence = "SELECT * FROM conjuntos WHERE " + NOMBRE_COLUMNA + " REGEXP"
                    + "'^" + inputEstado.getEstado()+ "'";
            Query query = sesion.createSQLQuery(searchSentence).addEntity(getTipoClase());
            reporteExistente = query.list();
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return reporteExistente;
    }
}
