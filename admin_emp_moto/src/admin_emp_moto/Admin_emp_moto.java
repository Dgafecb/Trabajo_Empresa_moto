package admin_emp_moto;

import controlador.Controlador_login;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import modelo.Consultas_Trabajadores;
import modelo.Consultas_Trabajadores_meta;
import modelo.Modelo_Trabajadores_meta;
import vista.Emergente_Panel_RClientes;
import modelo.Modelo_Trabajadores;
import vista.Emergente_Actualizaciones;
import vista.Emergente_Panel_RVentas;

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
        
        
        view.setVisible(true);

        
    }

}
