/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static controlador.Controlador_login.lista_repuestos;
import static controlador.Controlador_login.lista_vehiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Linked_List;
import modelo.Modelo_Inventario_Repuestos;
import modelo.Modelo_Inventario_Vehiculos;
import vista.Panel_Inventario;
import vista.Ventana_Admin;

/**
 *
 * @author Dgafecb
 */
public class Controlador_Almacen implements ActionListener {

    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Inventario panelInventario;
    private Linked_List<Modelo_Inventario_Vehiculos> vehiculos;
    private Linked_List<Modelo_Inventario_Repuestos> repuestos;
    
    public Controlador_Almacen(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin){
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();
    }
    private void iniciarComponentes(){
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelInventario = controladorAdmin.getPanelInventario();
        vehiculos = lista_vehiculos;
        repuestos = lista_repuestos;
    }
    private void llamarComponentes(){
        this.panelInventario.btnAgregar.addActionListener(this);
        this.llenarTablaAlmacen();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.panelInventario.btnAgregar){
            System.out.println("Boton agregar");
        }
    }
    private void llenarTablaAlmacen(){
    
    
    }
}