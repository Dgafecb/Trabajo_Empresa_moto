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
import vista.Vista_Ventana_Admin;

/**
 *
 * @author Dgafecb
 */
public class Controlador_admin implements ActionListener {
    
    private Vista_Ventana_Admin view;
    private Modelo_trabajadores model_tr;
    private Modelo_Consultas_trabajadores consultas_tr;
    private Modelo_inventario model_inventario;
    private Modelo_Consultas_inventario consultas_inventario;
    private Modelo_Consultas_Login consultas_login;
    private Modelo_user model_user;

    public Controlador_admin(Vista_Ventana_Admin view, Modelo_trabajadores model_tr, 
            Modelo_Consultas_trabajadores consultas_tr, Modelo_inventario model_inventario, 
            Modelo_Consultas_inventario consultas_inventario, Modelo_Consultas_Login consultas_login,
            Modelo_user model_user) {
        this.view = view;
        this.model_tr = model_tr;
        this.consultas_tr = consultas_tr;
        this.model_inventario = model_inventario;
        this.consultas_inventario = consultas_inventario;
        this.consultas_login = consultas_login;
        this.model_user = model_user;
        this.callComp();
    }
   

    private void callComp() { // Falta agregar los Action Listeners  a los botones
        
    
    }

    public void init() {
        
        view.setTitle("Administrador");
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) { // falta nombre de los botones
        //if(e.getSource()== "Nombre del boton"){  }
        
    }
   
    
}
