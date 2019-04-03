/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Consultas_Trabajadores;
import modelo.Modelo_Trabajadores;
import vista.Panel_Trabajadores;
import vista.Ventana_Login;
import vista.Ventana_Trabajador;

/**
 *
 * @author Dgafecb
 */
public class Controlador_trabajador implements ActionListener {
    private Ventana_Trabajador view_trabajador;
    private Modelo_Trabajadores model_user;
    private Ventana_Login view_login;
    private Consultas_Trabajadores consultas_login;
    private Controlador_login ctrl_login;
    
    
    public Controlador_trabajador(Ventana_Trabajador view_trabajador,  Modelo_Trabajadores model_user) {// Falta instanciar las demas variables a usar
        this.view_trabajador = view_trabajador;
        this.model_user = model_user;
        this.callComp();
    }


    private void callComp() { 
        
        view_trabajador.MenuTrabajador.btnCerrarSesion.addActionListener(this);

    }

//    public void init() {
//        view_trabajador.setTitle("Administrador");
//    }

    @Override
    public void actionPerformed(ActionEvent e) { 
//        if (e.getSource() == view_admin.MenuAdmin.btnTrabajadores) {
//            panel_tr = new Panel_Trabajadores();
//            view_admin.administrarPanel(view_admin.jsContent, panel_tr);
//        }

        if(e.getSource() == view_trabajador.MenuTrabajador.btnCerrarSesion){ // Reinstancia la ventana de login, permitiendo otro inicio de sesion
            view_trabajador.setVisible(false);
            view_trabajador.dispose();
            view_login = new Ventana_Login();
            consultas_login = new Consultas_Trabajadores();
            Modelo_Trabajadores new_user = new Modelo_Trabajadores();
            view_login.setVisible(true);
            ctrl_login = new Controlador_login(view_login, new_user,consultas_login );            
        
        }

    }
}
