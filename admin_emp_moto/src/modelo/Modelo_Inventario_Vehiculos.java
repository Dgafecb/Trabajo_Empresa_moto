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
public class Modelo_Inventario_Vehiculos {
    int id;
    String nombre_prod;
    String tipo_vehiculo;
    String marca;
    String modelo;
    String color;
    String motor;
    String chasis;
    String anho_fab;
    String anhos_garantia;
    String cantidad;
    float precio;
    int limite_advertencia;

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

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getAnho_fab() {
        return anho_fab;
    }

    public void setAnho_fab(String anho_fab) {
        this.anho_fab = anho_fab;
    }

    public String getAnhos_garantia() {
        return anhos_garantia;
    }

    public void setAnhos_garantia(String anhos_garantia) {
        this.anhos_garantia = anhos_garantia;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
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
