package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.SwingWorker;
import modelo.Consultas_Ajustes;
import modelo.Consultas_Asistencia;
import modelo.Consultas_Clientes;
import modelo.Consultas_Inventario_Repuestos;
import modelo.Consultas_Inventario_Vehiculos;
import modelo.Consultas_Marca;

import modelo.Modelo_Trabajadores;
import modelo.Consultas_Trabajadores;
import modelo.Consultas_Ventas;
import modelo.Linked_List;
import modelo.Modelo_Ajustes;
import modelo.Modelo_Asistencia;
import modelo.Modelo_Clientes;
import modelo.Modelo_Inventario_Repuestos;
import modelo.Modelo_Almacen;
import modelo.Modelo_Marcas;
import modelo.Modelo_Ventas;
import vista.Emergente_Aviso;
import vista.Panel_Login;
import vista.Ventana_Admin;
import vista.Ventana_Login;
import vista.Ventana_Trabajador;

public class Controlador_login implements ActionListener, KeyListener {

    public static Linked_List<Modelo_Trabajadores> lista_trabajadores;
    public static Linked_List<Modelo_Asistencia> lista_asistencia;
    public static Linked_List<Modelo_Marcas> lista_marcas;
    public static Linked_List<Modelo_Almacen> lista_vehiculos;
    public static Linked_List<Modelo_Inventario_Repuestos> lista_repuestos;
    public static Linked_List<Modelo_Ajustes> lista_ajustes;
    public static Linked_List<Modelo_Clientes> lista_clientes;
    public static Linked_List<Modelo_Ventas> lista_ventas;
    private Ventana_Login view;
    private Modelo_Trabajadores model;
    private Consultas_Trabajadores consultas;
    private Ventana_Admin view_admin;
    private Ventana_Trabajador viewTrabajador;
    private Controlador_admin controlador_admin;
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
            Thread hilo1 = new Thread() {
                @Override
                public void run() {
                    try {
                        view.panelLogin.btnAcceder.setVisible(false);
                        view.panelLogin.loading.setVisible(true);
                        accionBtnIngresar();              
                        view.panelLogin.btnAcceder.setVisible(true);
                        view.panelLogin.loading.setVisible(false);
                        return;
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Controlador_login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            };
            hilo1.start();

        }
    }

    public void accionBtnIngresar() throws InterruptedException {
        int privilege;
        String user;
        model.setDni(view.panelLogin.txtUsuario.getText());
        model.setPassword(view.panelLogin.txtContr.getText());
        privilege = this.verificacion(model, view.panelLogin.txtContr.getText());
        if (privilege == 2) { //ADMIN

            Thread hilo1 = new Thread() {
                @Override
                public void run() {
                    Consultas_Trabajadores consultas_trabajadores = new Consultas_Trabajadores();
                    lista_trabajadores = consultas_trabajadores.readAll();
                    Consultas_Asistencia consultas_asistencia = new Consultas_Asistencia();
                    lista_asistencia = consultas_asistencia.readAll();
                    Consultas_Ventas consultas_ventas = new Consultas_Ventas();
                    lista_ventas = consultas_ventas.readAll();
                    return;
                }
            };
            hilo1.start();
            
            Thread hilo2 = new Thread() {
                @Override
                public void run() {
                    Consultas_Clientes consultas_clientes = new Consultas_Clientes();
                    lista_clientes = consultas_clientes.readAll();
                    Consultas_Inventario_Vehiculos consultas_vehiculos = new Consultas_Inventario_Vehiculos();
                    lista_vehiculos = consultas_vehiculos.readAll();
                    Consultas_Ajustes consultas_ajustes = new Consultas_Ajustes();
                    lista_ajustes = consultas_ajustes.readAll();
                return;
                }
            };
            hilo2.start();
            Thread.sleep(3500);
            view.setVisible(false);
            view.dispose();
            view_admin = new Ventana_Admin();
            controlador_admin = new Controlador_admin(view_admin, model);
            view_admin.setVisible(true);
        } else if (privilege == 0) {
            //TRABAJADOR
            Thread hilo1 = new Thread() {
                @Override
                public void run() {
                    Consultas_Trabajadores consultas_trabajadores = new Consultas_Trabajadores();
                    lista_trabajadores = consultas_trabajadores.readAll();
                    Consultas_Asistencia consultas_asistencia = new Consultas_Asistencia();
                    lista_asistencia = consultas_asistencia.readAll();
                    Consultas_Ventas consultas_ventas = new Consultas_Ventas();
                    lista_ventas = consultas_ventas.readAll();
                    return;
                }
            };
            hilo1.start();
            
            Thread hilo2 = new Thread() {
                @Override
                public void run() {
                    Consultas_Clientes consultas_clientes = new Consultas_Clientes();
                    lista_clientes = consultas_clientes.readAll();
                    Consultas_Inventario_Vehiculos consultas_vehiculos = new Consultas_Inventario_Vehiculos();
                    lista_vehiculos = consultas_vehiculos.readAll();
                    Consultas_Ajustes consultas_ajustes = new Consultas_Ajustes();
                    lista_ajustes = consultas_ajustes.readAll();
                return;
                }
            };
            hilo2.start();
            Thread.sleep(3000);
            view.setVisible(false);
            view.dispose();
            view_trabajador = new Ventana_Trabajador();
            ctrl_trabajador = new Controlador_trabajador(view_trabajador, model);
            view_trabajador.setVisible(true);
        }else if(privilege == -1){
            message("ACCESO DENEGADO");
        }else if(privilege == -2){
            message("DATOS INVALIDOS");
        }
    }

    public void mostrarVentanaTrabajador() {
        view.setVisible(false);
        view.dispose();
        viewTrabajador = new Ventana_Trabajador();

    }

    private int verificacion(Modelo_Trabajadores model, String password) {
        if (model.getDni().equals("") != true && model.getPassword().equals("") != true) {
            if (consultas.read(model)) {
                //USUARIO EXISTE
                if (password.equals(model.getPassword())) {
                    //CONTRASEÑA CORRECTA
                    return model.getPrivilege();
                } else {
                    //CONTRASEÑA INCORRECTA
                    return -1;
                }
            } else {
                //USUARIO NO EXISTE
                return -1;
            }
        } else {
            //DATOS INVALIDOS
            return -2;
        }
    }

    private void message(String msg) {
        Emergente_Aviso mensaje = new Emergente_Aviso(view, true, msg);
        mensaje.setVisible(true);
    }

    // Metodos abstractos obligatorios
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
