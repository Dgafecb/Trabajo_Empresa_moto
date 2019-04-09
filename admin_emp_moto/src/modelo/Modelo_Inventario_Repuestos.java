/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Dgafecb
 */
public class Modelo_Inventario_Repuestos {

    private int id;
    private String nombre_prod;
    private String marca;
    private String modelo;
    private int cantidad;
    private float precio;
    private int limite_advertencia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getLimite_advertencia() {
        return limite_advertencia;
    }

    public void setLimite_advertencia(int limite_advertencia) {
        this.limite_advertencia = limite_advertencia;
    }
}
