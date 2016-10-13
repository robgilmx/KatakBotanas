/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;

import Negocio.Entidades.Enums.TipoReporte;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author DEMON
 */
public class Reporte {
    private int id;
    private TipoReporte tipo;
    private String nombreCliente;
    private Date fechaCreacion;
    private List<ConjuntoProductos> productosVendidos;
    private Date fechaPedido;
    
    public Reporte(
            String nombreCliente, 
            Date fechaCreacion, 
            List<ConjuntoProductos> productosVendidos, 
            Date fechaPedido
    ) {
        this.nombreCliente = nombreCliente;
        this.fechaCreacion = fechaCreacion;
        this.productosVendidos = productosVendidos;
        this.fechaPedido = fechaPedido;
        this.tipo = TipoReporte.PEDIDO;
    }

    public Reporte(
            Cliente cliente, 
            List<ConjuntoProductos> productosVendidos, 
            Date fehaCreacion
    ) {
        this.nombreCliente = cliente.getNombre();
        this.productosVendidos = productosVendidos;
        this.fechaCreacion = fehaCreacion;
        this.tipo = TipoReporte.VENTA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo.getTipo();
    }

    public void setTipo(TipoReporte tipo) {
        this.tipo = tipo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<ConjuntoProductos> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(List<ConjuntoProductos> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    
}
