package admin_emp_moto;

import controlador.Controlador_login;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import modelo.Consultas_Trabajadores;
import modelo.Consultas_Trabajadores_meta;
import modelo.Modelo_Trabajadores_meta;
import vista.Emergente_Panel_Clientes;
import modelo.Modelo_Trabajadores;

import vista.Ventana_Login;

public class Admin_emp_moto {

    public static void main(String[] args) {

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Modelo_Trabajadores user = new Modelo_Trabajadores();
        Consultas_Trabajadores consultas = new Consultas_Trabajadores();
        Ventana_Login view = new Ventana_Login();
        Controlador_login ctrl = new Controlador_login(view, user, consultas);
        
        Emergente_Panel_Clientes panel = new Emergente_Panel_Clientes(view,true); 
        panel.setVisible(true);
        
        
        view.setVisible(true);
        
    }

}
