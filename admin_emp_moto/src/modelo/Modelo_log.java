/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Modelo_log {
    private String logUsuario;
    private String logContr;
    private int checkAdmin=0; // Valor que cambiara si es que es o no admin, default 0, si es admin cambia a 1
    private String defaultContr="admin";
    public String getLogUsuario() {
        return logUsuario;
    }

    public void setLogUsuario(String logUsuario) {
        this.logUsuario = logUsuario;
    }

    public String getLogContr() {
        return logContr;
    }

    public void setLogContr(String logContr) {
        this.logContr = logContr;
    }
    public void setCheckAdmin(){
        checkAdmin=1;
    }
    public void CheckAdmin(){ // Cambia el valor de checkAdmin a 1 si es que el usuario y contrase;;a coinciden con el de administrador
        if(logUsuario.compareTo("admin")==0 && logContr.compareTo(defaultContr)==0){
            setCheckAdmin();
        }
    }
     
    
    
}
