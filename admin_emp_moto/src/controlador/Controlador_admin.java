/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo_Consultas_Login;
import modelo.Modelo_Consultas_inventario;
import modelo.Modelo_Consultas_trabajadores;
import modelo.Modelo_inventario;
import modelo.Modelo_trabajadores;
import modelo.Modelo_user;
import vista.Vista_Panel_Trabajadores;
import vista.Vista_Ventana_Admin;
import vista.Vista_Ventana_Login;

/**
 *
 * @author Dgafecb
 */
public class Controlador_admin implements ActionListener {
    private Vista_Ventana_Login view_login;
    private Vista_Ventana_Admin view_admin;
    private Modelo_trabajadores model_tr;
    private Modelo_Consultas_trabajadores consultas_tr;
    private Modelo_inventario model_inventario;
    private Modelo_Consultas_inventario consultas_inventario;
    private Modelo_Consultas_Login consultas_login;
    private Modelo_user model_user;
    private Vista_Panel_Trabajadores panel_tr;
    private Controlador_login ctrl_login;
    

    public Controlador_admin(Vista_Ventana_Admin view_admin,  Modelo_user model_user) {// Falta instanciar las demas variables a usar
        this.view_admin = view_admin;
        
        this.model_user = model_user;
        this.callComp();
    }

    Controlador_admin(Vista_Ventana_Admin viewAdmin, String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void callComp() { // Falta agregar los Action Listeners  a los botones
        view_admin.userSlider.btnTrabajadores.addActionListener(this);
        view_admin.userSlider.btnSalir.addActionListener(this);

    }

    public void init() {

        view_admin.setTitle("Administrador");

    }

    @Override
    public void actionPerformed(ActionEvent e) { // falta nombre de los botones abra panel trabajadores y el panel abre vista panel trabajadores
        if (e.getSource() == view_admin.userSlider.btnTrabajadores) {
            panel_tr = new Vista_Panel_Trabajadores();
            view_admin.administrarPanel(view_admin.jsContent, panel_tr);
            

        }
        if(e.getSource() == view_admin.userSlider.btnSalir){ // Reinstancia la ventana de login, permitiendo otro inicio de sesion
            view_admin.setVisible(false);
            view_admin.dispose();
            view_login = new Vista_Ventana_Login();
            consultas_login = new Modelo_Consultas_Login();
            Modelo_user new_user = new Modelo_user();
            view_login.setVisible(true);
            ctrl_login = new Controlador_login(view_login, new_user,consultas_login );            
        
        }

    }

}
