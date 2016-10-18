/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;

import Negocio.Entidades.Enums.TipoReporte;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DEMON
 */
public class ReportePedido extends Reporte{
    private Date fechaPedido;
    
    
    public ReportePedido(
            String nombreComprador, 
            Date fechaCreacion, 
            List<CantidadProd> productosVendidos, 
            Date fechaPedido
    ) {
        this.nombreComprador = nombreComprador;
        this.fechaCreacion = fechaCreacion;
        this.productosVendidos = productosVendidos;
        this.fechaPedido = fechaPedido;
        this.tipo = TipoReporte.PEDIDO;
    }
    
    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
}
