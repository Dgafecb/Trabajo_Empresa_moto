package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import javax.swing.SwingWorker;

import modelo.Modelo_Trabajadores;
import modelo.Consultas_Trabajadores;
import vista.Panel_Login;
import vista.Ventana_Admin;
import vista.Ventana_Login;
import vista.Ventana_Trabajador;

public class Controlador_login implements ActionListener, KeyListener {

    private Ventana_Login view;
    private Modelo_Trabajadores model;
    private Consultas_Trabajadores consultas;
    private Ventana_Admin view_admin;
    private Ventana_Trabajador viewTrabajador;
    private Controlador_admin controlador_admin;
    private Ventana_Trabajador view_trabajador;
    private Controlador_trabajador ctrl_trabajador;
    
    
    public LinkedList<Modelo_Trabajadores> lista_trabajadores;

    
    public Controlador_login(Ventana_Login view, Modelo_Trabajadores model, Consultas_Trabajadores consultas) {
        this.view = view;
        this.model = model;
        this.consultas = consultas;
        this.callComp();

    }

    private void callComp() {
        this.view.panelLogin.btnIngresar.addActionListener(this);
        this.view.panelLogin.txtContr.addKeyListener(this);
        this.view.panelLogin.txtUsuario.addKeyListener(this);
    }


    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            this.view.panelLogin.btnIngresar.doClick();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.panelLogin.btnIngresar) {
            SwingWorker sw = new SwingWorker() {
        @Override
        protected Object doInBackground() throws Exception {
            view.panelLogin.pbLogin.setIndeterminate(true);
            accionBtnIngresar(); // llama al metodo para hacer la verificacion de privilegios
            return null;
        }

        @Override
        public void done(){
            view.panelLogin.pbLogin.setIndeterminate(false);
            view.panelLogin.pbLogin.setValue(0); // 100%
        }
    };
     sw.execute();
            
            
            
            
            
        }
    }

    public void accionBtnIngresar() {
        int privilege;
        String user;
        model.setDni(view.panelLogin.txtUsuario.getText());
        model.setPassword(view.panelLogin.txtContr.getText());
        privilege = this.verificacion(model, view.panelLogin.txtContr.getText());
        if (privilege == 2) {
            message("Bienvenido Admin");
            Consultas_Trabajadores consultas = new Consultas_Trabajadores();
            lista_trabajadores = consultas.readAll();
            view.setVisible(false);
            view.dispose();
            view_admin = new Ventana_Admin();
            controlador_admin = new Controlador_admin(view_admin, model);
            view_admin.setVisible(true);
        } else if (privilege == 1) {
            message("Bienvenido Recepcionista");
            view.setVisible(false);
            view.dispose();
            view_trabajador = new Ventana_Trabajador();
            ctrl_trabajador = new Controlador_trabajador(view_trabajador,model);
            view_trabajador.setVisible(true);
        } else if (privilege == 0) {
            message("Bienvenido Trabajador");
            view.setVisible(false);
            view.dispose();
            view_trabajador = new Ventana_Trabajador();
            ctrl_trabajador = new Controlador_trabajador(view_trabajador,model);
            view_trabajador.setVisible(true);
        }
    }

    public void mostrarVentanaTrabajador() {
        view.setVisible(false);
        view.dispose();
        viewTrabajador = new Ventana_Trabajador();

    }

    private int verificacion(Modelo_Trabajadores model, String password) {
        if (model != null) {
            if (consultas.read(model)) {
                message("Usuario existe");
                if (password.equals(model.getPassword())) {
                    message("Contraseña Correcta");
                    return model.getPrivilege();
                } else {
                    message("Contraseña Incorrecta");
                    return -3;
                }
            } else {
                message("Usuario no existe");
                return -2;
            }
        } else {
            return -1;
        }
    }

    private void message(String msg) {
        System.out.println("- " + msg);
    }

    // Metodos abstractos obligatorios
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
        
    }
}
