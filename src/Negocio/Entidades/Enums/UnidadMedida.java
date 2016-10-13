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
public enum UnidadMedida {
    UNIDADES("unidades"),
    G("gramos"),
    KG("kilogramos");
    
    private final String nombre;

    private UnidadMedida(
            String nombre
    ) {
        this.nombre = nombre;
    }
    
    public String getNombreUnidadMedida() {
        return nombre;
    }
    
    
}
