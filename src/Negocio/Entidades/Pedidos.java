/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Mario
 */
/*
Esta clase tiene los datos de qjue es lo que debe contener un pedido
Se usara en la administracion de pedidos y de esta manera aparecera en la base de datos
*/

public abstract class Pedidos {
    private int id;
    private String nombreCliente;
    private String telefonoCliente;
    private String direccionCliente;
    private Date fechaDeCreacion;
    private Date fechaDePedido;
    private List<CantidadProd> listadoDeProductos;

    
    //Constructor
    
    public Pedidos(int id, 
            String nombreCliente, 
            String telefonoCliente, 
            String direccionCliente, 
            Date fechaDeCreacion, 
            Date fechaDePedido, 
            List<CantidadProd> listadoDeProductos) {
        
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.direccionCliente = direccionCliente;
        this.fechaDeCreacion = fechaDeCreacion;
        this.fechaDePedido = fechaDePedido;
        this.listadoDeProductos = listadoDeProductos;
    }
    
    //Getters

    public int getId() {
        return id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public Date getFechaDePedido() {
        return fechaDePedido;
    }

    public List<CantidadProd> getListadoDeProductos() {
        return listadoDeProductos;
    }
    
    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public void setFechaDePedido(Date fechaDePedido) {
        this.fechaDePedido = fechaDePedido;
    }

    public void setListadoDeProductos(List<CantidadProd> listadoDeProductos) {
        this.listadoDeProductos = listadoDeProductos;
    }
    
    
    
}
