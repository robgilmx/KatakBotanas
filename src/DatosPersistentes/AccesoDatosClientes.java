/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersistentes;

import Negocio.Entidades.Cliente;
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
public class AccesoDatosClientes extends AccesoDatos<Cliente>  {

    public List<Cliente> getPorNombre(String inputNombre) {
        String NOMBRE_COLUMNA = "nombre";
        List<Cliente> clienteExistente = null;
        
        try {
            iniciarSesion();
            String searchSentence = "SELECT * FROM clientes WHERE " + NOMBRE_COLUMNA + " REGEXP"
                    + "'^" + inputNombre + "'";
            Query query = sesion.createSQLQuery(searchSentence).addEntity(getTipoClase());
            clienteExistente = query.list();
        } catch (HibernateException exception) {
            handleHibernateException(exception);
            throw exception;
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
