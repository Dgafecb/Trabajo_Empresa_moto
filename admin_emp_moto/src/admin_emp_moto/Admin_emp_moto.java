package admin_emp_moto;

import controlador.Controlador_admin;
import controlador.Controlador_login;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import modelo.Modelo_Consultas_Login;
import modelo.Modelo_Consultas_inventario;
import modelo.Modelo_Consultas_trabajadores;
import modelo.Modelo_inventario;
import modelo.Modelo_log;
import modelo.Modelo_trabajadores;
import modelo.Modelo_user;
import vista.Vista_Ventana_Admin;
import vista.Vista_Ventana_Login;

public class Admin_emp_moto {

    public static void main(String[] args) {

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Modelo_user user = new Modelo_user();
        Modelo_Consultas_Login consultas = new Modelo_Consultas_Login();
        Vista_Ventana_Login view = new Vista_Ventana_Login();
        Controlador_login ctrl = new Controlador_login(view, user, consultas);

        /*Vista_Ventana_Admin view_admin = new Vista_Ventana_Admin(); // tendria que eliminar esto
        Modelo_trabajadores model_tr = new Modelo_trabajadores();
        Modelo_Consultas_trabajadores consultas_tr = new Modelo_Consultas_trabajadores();
        Modelo_inventario model_inventario = new Modelo_inventario();
        Modelo_Consultas_inventario consultas_inventario = new Modelo_Consultas_inventario();
        Modelo_Consultas_Login consultas_login = new Modelo_Consultas_Login();
        Modelo_user model_user = new Modelo_user();
        Controlador_admin ctrl_admin = new Controlador_admin(view_admin, model_tr,
                consultas_tr, model_inventario, consultas_inventario, consultas_login,
                model_user);*/
        view.setVisible(true);

    }

}
