package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import javax.swing.SwingWorker;
import modelo.Consultas_Ajustes;
import modelo.Consultas_Asistencia;
import modelo.Consultas_Clientes;
import modelo.Consultas_Inventario_Repuestos;
import modelo.Consultas_Inventario_Vehiculos;
import modelo.Consultas_Marca;

import modelo.Modelo_Trabajadores;
import modelo.Consultas_Trabajadores;
import modelo.Linked_List;
import modelo.Modelo_Ajustes;
import modelo.Modelo_Asistencia;
import modelo.Modelo_Clientes;
import modelo.Modelo_Inventario_Repuestos;
import modelo.Modelo_Inventario_Vehiculos;
import modelo.Modelo_Marcas;
import vista.Mensaje_Emergente;
import vista.Panel_Login;
import vista.Ventana_Admin;
import vista.Ventana_Login;
import vista.Ventana_Trabajador;

public class Controlador_login implements ActionListener, KeyListener {

    public static Linked_List<Modelo_Trabajadores> lista_trabajadores;
    public static Linked_List<Modelo_Asistencia> lista_asistencia;
    public static Linked_List<Modelo_Marcas> lista_marcas;
    public static Linked_List<Modelo_Inventario_Vehiculos> lista_vehiculos;
    public static Linked_List<Modelo_Inventario_Repuestos> lista_repuestos;
    public static Linked_List<Modelo_Ajustes> lista_ajustes;
    public static LinkedList<Modelo_Clientes> lista_clientes;
    private Ventana_Login view;
    private Modelo_Trabajadores model;
    private Consultas_Trabajadores consultas;
    private Ventana_Admin view_admin;
    private Ventana_Trabajador viewTrabajador;
    private Controlador_Admin controlador_admin;
    private Ventana_Trabajador view_trabajador;
    private Controlador_trabajador ctrl_trabajador;

    public Controlador_login(Ventana_Login view, Modelo_Trabajadores model, Consultas_Trabajadores consultas) {
        this.view = view;
        this.model = model;
        this.consultas = consultas;
        this.callComp();

    }

    private void callComp() {
        this.view.panelLogin.btnAcceder.addActionListener(this);
        this.view.panelLogin.txtContr.addKeyListener(this);
        this.view.panelLogin.txtUsuario.addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            this.view.panelLogin.btnAcceder.doClick();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.panelLogin.btnAcceder) {
            SwingWorker sw = new SwingWorker() {
                @Override
                protected Object doInBackground() throws Exception {
                    view.panelLogin.pbLogin.setIndeterminate(true);
                    accionBtnIngresar();
                    return null;
                }

                @Override
                public void done() {
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
            Thread hilo = new Thread() {
                    @Override
                    public void run() {
                    Consultas_Trabajadores consultas_trabajadores = new Consultas_Trabajadores();
                    lista_trabajadores = consultas_trabajadores.readAll();
                    Consultas_Asistencia consultas_asistencia = new Consultas_Asistencia();
                    lista_asistencia = consultas_asistencia.readAll();
                    Consultas_Marca consultas_marca = new Consultas_Marca();
                    lista_marcas = consultas_marca.readAll();
                    Consultas_Inventario_Vehiculos consultas_vehiculos = new Consultas_Inventario_Vehiculos();
                    lista_vehiculos = consultas_vehiculos.readAll();
                        return;} 
                };
                hilo.start();
                
            Consultas_Clientes consultas_clientes = new Consultas_Clientes();
            lista_clientes = consultas_clientes.readAll();
            
            Consultas_Inventario_Repuestos consultas_repuestos = new Consultas_Inventario_Repuestos();
            lista_repuestos = consultas_repuestos.readAll();
            Consultas_Ajustes consultas_ajustes = new Consultas_Ajustes();
            lista_ajustes = consultas_ajustes.readAll();
                   
            
            view.setVisible(false);
            view.dispose();
            view_admin = new Ventana_Admin();
            controlador_admin = new Controlador_Admin(view_admin, model);
            view_admin.setVisible(true);
        } else if (privilege == 0) {
            Consultas_Trabajadores consultas_trabajadores = new Consultas_Trabajadores();
            lista_trabajadores = consultas_trabajadores.readAll();
            message("Bienvenido Trabajador");
            view.setVisible(false);
            view.dispose();
            view_trabajador = new Ventana_Trabajador();
            ctrl_trabajador = new Controlador_trabajador(view_trabajador, model);
            view_trabajador.setVisible(true);
        }
    }

    public void mostrarVentanaTrabajador() {
        view.setVisible(false);
        view.dispose();
        viewTrabajador = new Ventana_Trabajador();

    }

    private int verificacion(Modelo_Trabajadores model, String password) {
        if (model.getDni().equals("")!=true && model.getPassword().equals("")!=true) {
            System.out.println(model.getPassword());
            if (consultas.read(model)) {
                message("Usuario existe");
                if (password.equals(model.getPassword())) {
                    message("Contraseña Correcta");
                    return model.getPrivilege();
                } else {
                    Mensaje_Emergente mensaje = new Mensaje_Emergente(view, true, "Contraseña incorrecta");
                    mensaje.setVisible(true);
                    return -1;
                }
            } else {
                Mensaje_Emergente mensaje = new Mensaje_Emergente(view, true, "Usuario no existe");
                mensaje.setVisible(true);
                return -1;
            }
        } else {
            Mensaje_Emergente mensaje = new Mensaje_Emergente(view, true, "Ingresar datos validos");
            mensaje.setVisible(true);
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
