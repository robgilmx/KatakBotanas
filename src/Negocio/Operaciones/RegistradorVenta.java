/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import Negocio.Entidades.Cliente;
import Negocio.Entidades.ConjuntoProductos;
import Negocio.Entidades.Enums.EstadoConjuntoProd;
import Negocio.Entidades.Producto;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DEMON
 */
public class RegistradorVenta {
    private List<Cliente> ListaClientes; 
    private List<Producto> ListaProductos;
    private List<ConjuntoProductos> ListaConjuntoProductos;
    private AdminProd adminProd;
    private AdminConjuntoProd adminConjuntoProd; 
    private AdminClientes adminClientes;
    private Date fechaActual;
    
    

    public RegistradorVenta() {
        fechaActual = Date.from(Instant.now());
        ListaProductos = getListaProd();
        ListaClientes = getListaClientes();
    }
    
    public List<Producto> getListaProd(){
        return adminProd.getListaProd();
    }
    
    public List<Cliente> getListaClientes(){
        return adminClientes.getListaClientes();
    }
    
    public void CrearConjuntoProd(int cantidad, Producto producto){
        ConjuntoProductos conjuntoProductos = new ConjuntoProductos(producto, EstadoConjuntoProd.VENDIDO, cantidad);
        adminConjuntoProd.crearConjuntoProd(conjuntoProductos);
    }
    
    public void EditarConjuntoProd(ConjuntoProductos conjuntoProductos){
        adminConjuntoProd.editarConjuntoProd(conjuntoProductos);
    }
    
    public void EliminarConjuntoProd(ConjuntoProductos conjuntoProductos){
        adminConjuntoProd.editarConjuntoProd(conjuntoProductos);
    }
    
}
