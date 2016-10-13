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
public enum TipoReporte {
    PEDIDO("pedido"),
    VENTA("venta");
    
    private final String tipo;

    private TipoReporte(
            String tipo
    ) {
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
     public static TipoReporte setFromString(String text) {
        if (text != null) {
            for (TipoReporte value : TipoReporte.values()) {
                if (text.equalsIgnoreCase(value.tipo)) {
                    return value;
                }
            }
        }
        return null;
    }
    
}
