/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosPedidos;
import Negocio.Entidades.Pedidos;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mario
 */
public class AdminPedidos {
    
    private static AccesoDatosPedidos accesoDatosPedidos;

    public void AgregarPedido(Pedidos pedido){
        accesoDatosPedidos.insertar(pedido);
    }
    
    public void EditarPedido(Pedidos pedido){
        accesoDatosPedidos.modificar(pedido);
    }
    
    public void BorrarPedido(Pedidos pedido){
        accesoDatosPedidos.borrar(pedido);
    }
    
    public List<Pedidos> getListaPedidoPorFechaDeCreacion(Date FechaCreacion) {
        return accesoDatosPedidos.getPorFechaCreacion(FechaCreacion);
    }
    
     public List<Pedidos> getListaPedidoPorFechaDePedido(Date FechaPedido) {
        return accesoDatosPedidos.getPorFechaPedido(FechaPedido);
    }
    
    }
    
    

