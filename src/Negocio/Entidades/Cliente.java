/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;
   
/**
 *
 * @author DEMON
 */
public class Cliente {
    private int id;
    private String nombre;
    private String telefono;
    private String celular;
    private String direccion;

    public Cliente(){
        
    }
    
    public Cliente(String nombre,
             String telefono,
             String direccion
    )  {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public Cliente(String nombre,
             String telefono,
             String celular,
             String direccion
    )  {
        this.nombre = nombre;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
