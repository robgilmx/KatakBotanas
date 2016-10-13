/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;

import Negocio.Entidades.Cliente;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;

/**
 *
 * @author DEMON
 */
public class AccesoDatosClientes extends AccesoDatos<Object>  {

    public List<Cliente> getPorNombre(String nombre) {
        String COLUMN_NAME = "nombre";
        List<Cliente> clienteExistente = null;
        
        try {
            iniciarSesion();
            Criteria criterio = sesion.createCriteria(getTipoClase());
            SimpleExpression restriccion = Restrictions.eq(COLUMN_NAME, nombre);
            clienteExistente = criterio.add(restriccion).list();
            System.out.println(clienteExistente.size());
        } catch (HibernateException excepcion) {
            handleHibernateException(excepcion);
            throw excepcion;
        } finally {
            terminarSesion();
        }
        
        return clienteExistente;
    }
    
    @Override
    protected Class getTipoClase() {
        return Cliente.class;
    }
    
}
