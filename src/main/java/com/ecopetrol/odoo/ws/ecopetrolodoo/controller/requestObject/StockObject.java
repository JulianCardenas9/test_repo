package com.ecopetrol.odoo.ws.ecopetrolodoo.controller.requestObject;

public class StockObject {

    String nombre;
    String tipo;
    String cantidad;
    String origen;

    public StockObject(String nombre, String tipo, String cantidad, String origen) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
