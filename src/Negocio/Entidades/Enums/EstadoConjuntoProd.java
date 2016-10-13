/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades.Enums;

/**
 *
 * @author DEMON
 */
public enum EstadoConjuntoProd {
    VENDIDO("Vendido"),
    EN_INVENTARIO("En inventario");
    
    private final String estado;

    private EstadoConjuntoProd(
            String estado
    ) {
        this.estado = estado;
    }
    
    public String getEstado() {
        return estado;
    }
    
 
}
