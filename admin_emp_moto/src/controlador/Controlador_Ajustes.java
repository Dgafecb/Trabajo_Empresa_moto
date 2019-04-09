/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import static controlador.Controlador_login.lista_ajustes;
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
        this.panelAjustes.jTextField1.setText((String) lista_ajustes.get(1));
        this.panelAjustes.jTextField2.setText((String) lista_ajustes.get(4));
        this.panelAjustes.jTextField3.setText((String) lista_ajustes.get(3));
        this.panelAjustes.jTextField4.setText((String) lista_ajustes.get(5));
        this.panelAjustes.jTextField5.setText((String) lista_ajustes.get(16));
        this.panelAjustes.jTextField6.setText((String) lista_ajustes.get(8));
        this.panelAjustes.jTextField7.setText((String) lista_ajustes.get(7));
        this.panelAjustes.jTextField8.setText((String) lista_ajustes.get(6));
        this.panelAjustes.jTextField9.setText((String) lista_ajustes.get(9));
        this.panelAjustes.jTextField10.setText((String) lista_ajustes.get(15));
        this.panelAjustes.jTextField11.setText((String) lista_ajustes.get(13));
        this.panelAjustes.jTextField12.setText((String) lista_ajustes.get(14));

    }

    private void llamarComponentes() {
        this.panelAjustes.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.panelAjustes.btnGuardar) {
            // guardar

        }
    }
}