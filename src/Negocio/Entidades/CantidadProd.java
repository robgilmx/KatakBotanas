/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;

import Negocio.Entidades.Enums.EstadoCantidadProd;

/**
 *
 * @author DEMON
 */
public class CantidadProd {
    private int id;
    private Producto prod;
    private int cantidad;
    private EstadoCantidadProd estado;

    public CantidadProd(
            Producto prod,
            EstadoCantidadProd estado,
            int cantidad
    )  {
        this.prod = prod;
        this.estado = estado;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProd() {
        return prod;
    }

    public void setProd(Producto prod) {
        this.prod = prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public EstadoCantidadProd getEstado() {
        return estado;
    }

    public void setEstado(EstadoCantidadProd estado) {
        this.estado = estado;
    }
    
    
}
