/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosReportesClienteDetalles;
import DatosPersistentes.AccesoDatosReportesClienteMaestro;
import Negocio.Entidades.CantidadProd;
import Negocio.Entidades.Reporte;
import Negocio.Entidades.ReporteCliente;
import java.util.List;
/**
 *
 * @author DEMON
 */
class AdminReportesCliente {
        private AccesoDatosReportesClienteMaestro accesoDatosRepClienteM;
        private AccesoDatosReportesClienteDetalles accesoDatosRepClienteD;
    
    public void AgregarCantidadProd(CantidadProd cantidadProd){
        accesoDatosRepClienteD.insertar(cantidadProd);
    }
    
    public void EditarCantidadProd(CantidadProd cantidadProd){
        accesoDatosRepClienteD.modificar(cantidadProd);
    }
    
    public void BorrarCantidadProd(CantidadProd cantidadProd){
        accesoDatosRepClienteD.borrar(cantidadProd);
    }
    // TBI
    //public List<CantidadProd> getListaCantidadProdPorIDReporte(ReporteCliente reportecliente) {
       // return accesoDatosRepClienteD.getCantidadProdPorNombreCliente( 
       //         reportecliente.getNombreComprador()
       // );
    //}
    
    public List<Reporte> getListaReportes() {
        return accesoDatosRepClienteM.getLista();
    }
}
