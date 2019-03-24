package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo_user;
import modelo.Modelo_Consultas_Login;
import vista.Vista_login;


public class Controlador_login implements ActionListener {

    private Vista_login view;
    private Modelo_user model;
    private Modelo_Consultas_Login consultas;
            
    
    public Controlador_login(Vista_login view, Modelo_user model, Modelo_Consultas_Login consultas){
        this.view = view;
        this.model = model;
        this.consultas = consultas;
        this.callComp();
    }
    
    private void callComp(){
        this.view.btnIngresar.addActionListener(this);
    }
    
    public void init(){
        view.setTitle("Login");
        view.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== view.btnIngresar){
        model.setEmail(view.txtUsuario.getText());
        if(consultas.read(model)== true){
            System.out.println("Usuario existe");
            if(view.txtContr.getText().equals(model.getPassword())){
                System.out.println("Contraseña Correcta");
                if(model.getPrivilege()==2){
                    System.out.println("Admin");
                }else if(model.getPrivilege()==1){
                    System.out.println("Recepcionista");
                }else if(model.getPrivilege()==0){
                    System.out.println("Trabajador");
                }
            }else{
                System.out.println("Contraseña Incorrecta");
            }
        }else{
            System.out.println("Usuario no existe");
            }
    
        }
    }
    
}
