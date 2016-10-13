/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosClientes;
import Negocio.Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bernardo Espinoza
 */
public class AdminClientes {
    private AccesoDatosClientes datosClientes;
    
    public AdminClientes(){
        
    }
    
    public void agregarCliente(Cliente cliente){
        datosClientes.insertar(cliente);
    }
    
    public void editarCliente(Cliente cliente){
        datosClientes.modificar(cliente);
    }
    
    public void eliminarCliente(Cliente cliente){
        datosClientes.borrar(cliente);
    }
    
    public List<Cliente> getListaClientes(){
        return datosClientes.getLista();
    }
    
    public List<Cliente> getListaClientesPorNombre(String nombre){
        return datosClientes.getPorNombre(nombre);
    }
    
    
}
