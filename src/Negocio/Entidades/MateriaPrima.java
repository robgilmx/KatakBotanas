/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;

import Negocio.Entidades.Enums.UnidadMedida;

/**
 *
 * @author DEMON
 */
public class MateriaPrima {
    private int id;
    private String nombre;
    private UnidadMedida unidMed;
    
    public MateriaPrima(
            String nombre, 
            UnidadMedida unidMed
    )  {
        this.nombre = nombre;
        this.unidMed = unidMed;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public UnidadMedida getUnidMed() {
        return unidMed;
    }

    public void setUnidMed(UnidadMedida unidMed) {
        this.unidMed = unidMed;
    }

}
