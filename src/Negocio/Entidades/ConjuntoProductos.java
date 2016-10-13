/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;

import Negocio.Entidades.Enums.EstadoConjuntoProd;

/**
 *
 * @author DEMON
 */
public class ConjuntoProductos {
    private int id;
    private Producto producto;
    private int cantidad;
    private EstadoConjuntoProd estado;

    public ConjuntoProductos(
            Producto producto,
            EstadoConjuntoProd estado,
            int cantidad
    )  {
        this.producto = producto;
        this.estado = estado;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public EstadoConjuntoProd getEstado() {
        return estado;
    }

    public void setEstado(EstadoConjuntoProd estado) {
        this.estado = estado;
    }
    
    
}
