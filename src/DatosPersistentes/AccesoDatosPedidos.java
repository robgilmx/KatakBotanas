/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;
import Negocio.Entidades.Pedidos;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

/**
 *
 * @author Mario
 */
public class AccesoDatosPedidos extends AccesoDatos<Pedidos>{
    
public List<Pedidos> getPorFechaCreacion(Date fechaCreacion) {
        String NOMBRE_COLUMNA = "fecha_creacion";
        List<Pedidos> pedidoExistente = null;
        
        try {
            iniciarSesion();
            Criteria criterio = sesion.createCriteria(getTipoClase());
            SimpleExpression restriccion = Restrictions.eq(NOMBRE_COLUMNA, fechaCreacion);
            pedidoExistente = criterio.add(restriccion).list();
            System.out.println(pedidoExistente.size());
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return pedidoExistente;
    }
    
    public List<Pedidos> getPorFechaPedido(Date fechaPedido) {
        String NOMBRE_COLUMNA = "fecha_pedido";
        List<Pedidos> pedidoExistente = null;
        
        try {
            iniciarSesion();
            Criteria criterio = sesion.createCriteria(getTipoClase());
            SimpleExpression restriccion = Restrictions.eq(NOMBRE_COLUMNA, fechaPedido);
            pedidoExistente = criterio.add(restriccion).list();
            System.out.println(pedidoExistente.size());
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return pedidoExistente;
    }
    

    @Override
    protected Class getTipoClase() {
        return Pedidos.class; }
    

    
}
