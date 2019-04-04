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
public class Modelo_Clientes {
    private int id;
    private String nombre_apellido;
    private String nombre_apellido_2;
    private String dni;
    private String dni_2;
    private String correo;
    private String direccion;
    private String telefono;
    private String ciudad;
    private String pais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public String getNombre_apellido_2() {
        return nombre_apellido_2;
    }

    public void setNombre_apellido_2(String nombre_apellido_2) {
        this.nombre_apellido_2 = nombre_apellido_2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDni_2() {
        return dni_2;
    }

    public void setDni_2(String dni_2) {
        this.dni_2 = dni_2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
        
    
}
