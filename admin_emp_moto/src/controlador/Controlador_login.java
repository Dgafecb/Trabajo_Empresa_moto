package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo_user;
import modelo.Modelo_Consultas_Login;
import vista.Vista_Ventana_Admin;
import vista.Vista_Ventana_Login;


public class Controlador_login implements ActionListener {

    private Vista_Ventana_Login view;
    private Modelo_user model;
    private Modelo_Consultas_Login consultas;
    private Vista_Ventana_Admin viewAdmin;
            
    
    public Controlador_login(Vista_Ventana_Login view, Modelo_user model, Modelo_Consultas_Login consultas){
        this.view = view;
        this.model = model;
        this.consultas = consultas;
        this.callComp();
    }
    
    private void callComp(){
        this.view.panel.btnIngresar.addActionListener(this);
    }
    
    public void init(){
        view.setTitle("Login");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== view.panel.btnIngresar){
        int privilege;
        String user;
        model.setEmail(view.panel.txtUsuario.getText());
        privilege = this.verificacion(model,view.panel.txtContr.getText());
        if(privilege==2){
            message("Bienvenido Admin");
            view.setVisible(false);
            view.dispose();
            viewAdmin = new Vista_Ventana_Admin(); 
        }else if(privilege==1){
            message("Bienvenido Recpecionista");
        }else if(privilege==0){
            message("Bienvenido Trabajador");
            }
        }
    }
    
    private int verificacion(Modelo_user model,String password){
        if(model!=null){
            if(consultas.read(model)){
                message("Usuario existe");
                if(password.equals(model.getPassword())){
                    message("Contraseña Correcta");
                    return model.getPrivilege();
                }else{
                    message("Contraseña Incorrecta");
                    return -3;
                }
            }else{
                message("Usuario no existe");
                return -2;
            }
        }else{
            return -1;
        }    
    }
    private void message(String msg){
        System.out.println("- " + msg);
    }
}
