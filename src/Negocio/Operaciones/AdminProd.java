/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosProd;
import Negocio.Entidades.Producto;
import java.util.List;
/**
 *
 * @author DEMON
 */
public class AdminProd {
    private static AccesoDatosProd accesoDatosProd;
    
    public void AgregarProd(Producto prod){
        accesoDatosProd.insertar(prod);
    }
    
    public void EditarProd(Producto prod){
        accesoDatosProd.modificar(prod);
    }
    
    public void BorrarProd(Producto prod){
        accesoDatosProd.borrar(prod);
    }
    
    public List<Producto> getListaProdPorNombre(String nombreProd) {
        return accesoDatosProd.getPorNombre(nombreProd);
    }
    
    public List<Producto> getListaProd() {
        return accesoDatosProd.getLista();
    }
}
