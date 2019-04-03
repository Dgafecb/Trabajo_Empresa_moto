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
public class Modelo_Inventario {

    public int ID;
    private int ID_Prod;
    private String nombre_producto;
    private int cantidad;
    private int limite_advertencia; // luego veo como cambiar las consultas para considerar el caso de insertar una fila con el atributo limiteAdvertencia = null

    public Modelo_Inventario() {
        this.limite_advertencia = 0;
    }

    public int getID() {
        return ID_Prod;
    }

    public void setID(int ID_Prod) {
        this.ID_Prod = ID_Prod;
    }

    public int getIDProd() {
        return ID_Prod;
    }

    public void setIDProd(int ID_Prod) {
        this.ID_Prod = ID_Prod;
    }

    public String getNombreProducto() {
        return nombre_producto;
    }

    public void setNombreProducto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getLimiteAdvertencia() {
        return limite_advertencia;
    }

    public void setLimiteAdvertencia(int limiteAdvertencia) {
        this.limite_advertencia = limiteAdvertencia;
    }

}
