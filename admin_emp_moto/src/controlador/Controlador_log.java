/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo_log;
import vista.Vista_login;

/**
 *
 * @author Usuario
 */
public class Controlador_log implements ActionListener {

    private Vista_login view;
    private Modelo_log model;
            
    
    public Controlador_log(Vista_login view, Modelo_log model){
        this.view = view;
        this.model = model;
        this.view.btnIngresar.addActionListener(this);
        this.view.btnSalir.addActionListener(this);
    }
    public void iniciar(){
        view.setTitle("Login");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==view.btnIngresar){
        model.setLogUsuario(view.txtUsuario.getText());
        model.setLogContr(view.txtContr.getText());
        model.CheckAdmin();
        }
        if(e.getSource()== view.btnSalir){
            System.exit(0);
        }
    
    }   
       
    
}
