/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosConjuntoProd;
import Negocio.Entidades.ConjuntoProductos;

/**
 *
 * @author DEMON
 */
class AdminConjuntoProd {
    AccesoDatosConjuntoProd accesoDatosConjuntoProd;
    
    public void crearConjuntoProd(ConjuntoProductos conjuntoProductos){
        accesoDatosConjuntoProd.insertar(conjuntoProductos);
    }
    
    public void editarConjuntoProd(ConjuntoProductos conjuntoProductos){
        accesoDatosConjuntoProd.modificar(conjuntoProductos);
    }
     
    public void borrarConjuntoProd(ConjuntoProductos conjuntoProductos){
        accesoDatosConjuntoProd.borrar(conjuntoProductos);
    }
    
}
