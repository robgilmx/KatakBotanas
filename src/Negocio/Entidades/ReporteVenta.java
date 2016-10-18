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
public class ReporteVenta extends Reporte {
    Cliente cliente;
    
    public ReporteVenta(
            Cliente cliente, 
            List<CantidadProd> productosVendidos, 
            Date fehaCreacion
    ) {
        this.cliente = cliente;
        this.nombreComprador = cliente.getNombre();
        this.productosVendidos = productosVendidos;
        this.fechaCreacion = fehaCreacion;
        this.tipo = TipoReporte.VENTA;
    }
    
}
