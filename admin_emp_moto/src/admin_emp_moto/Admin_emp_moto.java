/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_emp_moto;

import controlador.Controlador_log;
import modelo.Modelo_log;
import vista.Vista_log;

/**
 *
 * @author Usuario
 */
public class Admin_emp_moto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo_log mod = new Modelo_log();
        Vista_log view = new Vista_log();
        Controlador_log ctrl = new Controlador_log(view,mod);
        ctrl.iniciar();
        view.setVisible(true);
             
        
        
    }
    
}
