package admin_emp_moto;

import controlador.Controlador_log;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import modelo.Modelo_log;
import vista.Vista_log;

public class Admin_emp_moto {


    public static void main(String[] args) {
        
        try{
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        //UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());
        }catch (Exception e){
        e.printStackTrace();
        }
        
        Modelo_log mod = new Modelo_log();
        Vista_log view = new Vista_log();
        Controlador_log ctrl = new Controlador_log(view,mod);
        ctrl.iniciar();
        view.setVisible(true);
             
        
        
    }
    
}
