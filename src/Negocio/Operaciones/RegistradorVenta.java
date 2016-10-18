/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import Negocio.Entidades.Cliente;
import Negocio.Entidades.CantidadProd;
import Negocio.Entidades.Enums.EstadoCantidadProd;
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
    private List<CantidadProd> ListaConjuntoProductos;
    private AdminProd adminProd;
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
    
    public void AgregarCantidadProd(int cantidad, Producto producto){
        CantidadProd nuevoConjuntoProductos = new CantidadProd(producto, EstadoCantidadProd.VENDIDO, cantidad);
        
    }
    
    public void EditarCantProd(CantidadProd conjuntoProductos){
        //adminConjuntoProd.editarConjuntoProd(conjuntoProductos);
    }
    
    public void EliminarConjuntoProd(CantidadProd conjuntoProductos){
        //adminConjuntoProd.editarConjuntoProd(conjuntoProductos);
    }
    
}
