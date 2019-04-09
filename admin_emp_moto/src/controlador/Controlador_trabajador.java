package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Consultas_Trabajadores;
import modelo.Modelo_Trabajadores;
import vista.Ventana_Login;
import vista.Ventana_Trabajador;


public class Controlador_trabajador implements ActionListener {
    private Ventana_Trabajador ventanaTrabajador;
    private Modelo_Trabajadores model_user;
    private Ventana_Login view_login;
    private Consultas_Trabajadores consultas_login;
    private Controlador_login ctrl_login;
    
    
    public Controlador_trabajador(Ventana_Trabajador ventanaTrabajador,  Modelo_Trabajadores model_user) {// Falta instanciar las demas variables a usar
        this.ventanaTrabajador = ventanaTrabajador;
        this.model_user = model_user;
        this.llamarComp();
    }


    private void llamarComp() { 
        
        ventanaTrabajador.menuTrabajador.btnCerrarSesion.addActionListener(this);

    }



    @Override
    public void actionPerformed(ActionEvent e) { 


        if(e.getSource() == ventanaTrabajador.menuTrabajador.btnCerrarSesion){ // Reinstancia la ventana de login, permitiendo otro inicio de sesion
            ventanaTrabajador.setVisible(false);
            ventanaTrabajador.dispose();
            view_login = new Ventana_Login();
            consultas_login = new Consultas_Trabajadores();
            Modelo_Trabajadores new_user = new Modelo_Trabajadores();
            view_login.setVisible(true);
            ctrl_login = new Controlador_login(view_login, new_user,consultas_login );            
        
        }

    }
}
