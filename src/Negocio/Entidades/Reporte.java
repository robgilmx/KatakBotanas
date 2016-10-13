/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author DEMON
 */
public class Reporte {
    private final String PEDIDO = "pedido";
    private final String VENTA = "venta";
    private int id;
    private String tipo;
    private String nombreCliente;
    private Date fechaRegistro;
    private List<Producto> productosVendidos;
    private Date fechaPedido;
    
    public Reporte(
            String nombreCliente, 
            Date fechaRegistro, 
            List<Producto> productosVendidos, 
            Date fechaPedido
    ) {
        this.nombreCliente = nombreCliente;
        this.fechaRegistro = fechaRegistro;
        this.productosVendidos = productosVendidos;
        this.fechaPedido = fechaPedido;
        this.tipo = PEDIDO;
    }

    public Reporte(
            Cliente cliente, 
            List<Producto> productosVendidos, 
            Date fechaRegistro
    ) {
        this.nombreCliente = cliente.getNombre();
        this.productosVendidos = productosVendidos;
        this.fechaRegistro = fechaRegistro;
        this.tipo = VENTA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<Producto> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(List<Producto> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    
    
}
