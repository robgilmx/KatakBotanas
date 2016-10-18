/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosReportesVentaDetalles;
import DatosPersistentes.AccesoDatosReportesVentaMaestro;
import Negocio.Entidades.CantidadProd;
import Negocio.Entidades.Reporte;
import Negocio.Entidades.ReporteVenta;
import java.util.List;
/**
 *
 * @author DEMON
 */
class AdminReportesVenta {
        private AccesoDatosReportesVentaMaestro accesoDatosRepVentaM;
        private AccesoDatosReportesVentaDetalles accesoDatosRepVentaD;
    
    public void AgregarCantidadProd(CantidadProd cantidadProd){
        accesoDatosRepVentaD.insertar(cantidadProd);
    }
    
    public void EditarCantidadProd(CantidadProd cantidadProd){
        accesoDatosRepVentaD.modificar(cantidadProd);
    }
    
    public void BorrarCantidadProd(CantidadProd cantidadProd){
        accesoDatosRepVentaD.borrar(cantidadProd);
    }
    // TBI
    //public List<CantidadProd> getListaCantidadProdPorIDReporte(ReporteCliente reportecliente) {
       // return accesoDatosRepClienteD.getCantidadProdPorNombreCliente( 
       //         reportecliente.getNombreComprador()
       // );
    //}
    
    public List<Reporte> getListaReportes() {
        return accesoDatosRepVentaM.getLista();
    }
}
