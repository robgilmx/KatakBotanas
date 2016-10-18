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
    protected int id;
    protected TipoReporte tipo;
    protected String nombreComprador;
    protected Date fechaCreacion;
    protected List<CantidadProd> productosVendidos;
    protected Date fechaPedido;


    

  

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

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreCliente) {
        this.nombreComprador = nombreCliente;
    }

    public List<CantidadProd> getProdVendidos() {
        return productosVendidos;
    }

    public void setProdVendidos(List<CantidadProd> productosVendidos) {
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
