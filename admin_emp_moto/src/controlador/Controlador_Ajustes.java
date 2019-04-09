/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Panel_Ajustes;
import vista.Ventana_Admin;

/**
 *
 * @author Dgafecb
 */
public class Controlador_Ajustes implements ActionListener {
    Controlador_admin controladorAdmin;
    Ventana_Admin ventanaAdmin;
    Panel_Ajustes panelAjustes;
    public Controlador_Ajustes(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin) {
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();
    }
    private void iniciarComponentes() {
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelAjustes = controladorAdmin.getPanelAjustes();
        // Iniciamos los txtField con los valores iniciales
    }

    private void llamarComponentes() {
        this.panelAjustes.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.panelAjustes.btnGuardar){
            // guardar
        
        
        }
    }
}
