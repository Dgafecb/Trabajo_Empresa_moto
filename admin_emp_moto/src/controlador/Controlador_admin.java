/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Consultas_Trabajadores;
import modelo.Consultas_Inventario;
import modelo.Consultas_Trabajadores_meta;
import modelo.Modelo_Inventario;
import modelo.Modelo_Trabajadores_meta;
import modelo.Modelo_Trabajadores;
import vista.Panel_Trabajadores;
import vista.Ventana_Admin;
import vista.Ventana_Login;

/**
 *
 * @author Dgafecb
 */
public class Controlador_admin implements ActionListener {
    private Ventana_Login view_login;
    private Ventana_Admin view_admin;
    private Modelo_Trabajadores_meta model_tr;
    private Consultas_Trabajadores_meta consultas_tr;
    private Modelo_Inventario model_inventario;
    private Consultas_Inventario consultas_inventario;
    private Consultas_Trabajadores consultas_login;
    private Modelo_Trabajadores model_user;
    private Panel_Trabajadores panel_tr;
    private Controlador_login ctrl_login;
    

    public Controlador_admin(Ventana_Admin view_admin,  Modelo_Trabajadores model_user) {// Falta instanciar las demas variables a usar
        this.view_admin = view_admin;
        this.model_user = model_user;
        this.callComp();
    }
//
//    Controlador_admin(Ventana_Admin viewAdmin, String user) {
//       
//    }

    private void callComp() { 
        view_admin.menuAdmin.btnRegistros.addActionListener(this);
        view_admin.menuAdmin.btnCerrarSesion.addActionListener(this);

    }

    public void init() {

        view_admin.setTitle("Administrador");

    }

    @Override
    public void actionPerformed(ActionEvent e) { 
        if (e.getSource() == view_admin.menuAdmin.btnRegistros) {
            

        }
        if(e.getSource() == view_admin.menuAdmin.btnCerrarSesion){ // Reinstancia la ventana de login, permitiendo otro inicio de sesion
            view_admin.setVisible(false);
            view_admin.dispose();
            view_login = new Ventana_Login();
            consultas_login = new Consultas_Trabajadores();
            Modelo_Trabajadores new_user = new Modelo_Trabajadores();
            view_login.setVisible(true);
            ctrl_login = new Controlador_login(view_login, new_user,consultas_login );            
        
        }

    }

}
