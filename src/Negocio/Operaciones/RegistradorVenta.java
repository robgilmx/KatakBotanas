/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosReportes;
import DatosPersistentes.AccesoDatosProd;
import Negocio.Entidades.Cliente;
import Negocio.Entidades.Producto;
import java.util.List;

/**
 *
 * @author DEMON
 */
public class RegistradorVenta {
    private List<Cliente> ListaClientes; 
    private List<Producto> ListaProductos;
    private AdminProd adminProd;
    private AdminClientes adminClientes;
    

    public RegistradorVenta() {

    }
    
    private List<Producto> getListaProd(){
        return adminProd.getListaProd();
    }
    
    
    
}
