package controlador;

import static controlador.Controlador_login.lista_trabajadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Consultas_Trabajadores;

import modelo.Consultas_Trabajadores_meta;

import modelo.Modelo_Trabajadores_meta;
import modelo.Modelo_Trabajadores;
import vista.Emergente_Actualizaciones;
import vista.Emergente_Aviso;
import vista.Panel_Ajustes;
import vista.Panel_Inventario;
import vista.Panel_Registros;

import vista.Panel_Ventas;
import vista.Ventana_Admin;
import vista.Ventana_Login;

public class Controlador_admin implements ActionListener {

    /*--------------------VENTANAS---------------------------*/
    private Ventana_Admin ventanaAdmin;

    /*---------------------PANELES---------------------------*/
    public Panel_Registros panelRegistros;
    public Panel_Ventas panelVentas;
    public Panel_Inventario panelInventario;
    public Panel_Ajustes panelAjustes;

    /*---------------------MODELOS---------------------------*/
    private Modelo_Trabajadores model_user;

    /*--------------------CONSULTAS--------------------------*/
    private Consultas_Trabajadores consultasTrabajadores;

    /*-------------------CONTROLADORES-----------------------*/
    private Controlador_Registros controladorRegistros;
    private Controlador_Ajustes controladorAjustes;
    private Controlador_Almacen controladorAlmacen;
    private Controlador_Ventas controladorVentas;

    /*---------------------VARIABLES-------------------------*/
    public LinkedList<Modelo_Trabajadores> listaTrabajadores;

    public Controlador_admin(Ventana_Admin view_admin, Modelo_Trabajadores model_user) {
        this.ventanaAdmin = view_admin;
        this.model_user = model_user;
        this.llamarComponentes();
        //temporal
        ventanaAdmin.menuAdmin.btnEstadisticas.setVisible(false);
        limpiarSpContent();
        panelInventario = new Panel_Inventario();
        controladorAlmacen = new Controlador_Almacen(this,this.ventanaAdmin);
        ventanaAdmin.administrarPanel(ventanaAdmin.spContent, panelInventario);
    }

    public Panel_Inventario getPanelInventario() {
        return panelInventario;
    }

    public void setPanelInventario(Panel_Inventario panelInventario) {
        this.panelInventario = panelInventario;
    }

    public Panel_Ajustes getPanelAjustes() {
        return panelAjustes;
    }

    public void setPanelAjustes(Panel_Ajustes panelAjustes) {
        this.panelAjustes = panelAjustes;
    }

    public Ventana_Admin getVentanaAdmin() {
        return ventanaAdmin;
    }

    public Modelo_Trabajadores getModel_user() {
        return model_user;
    }

    public Consultas_Trabajadores getConsultasTrabajadores() {
        return consultasTrabajadores;
    }

    public Panel_Registros getPanelRegistros() {
        return panelRegistros;
    }

    public Panel_Ventas getPanelVentas() {
        return panelVentas;
    }

    public Controlador_Registros getControladorRegistros() {
        return controladorRegistros;
    }

    private void llamarComponentes() {
        ventanaAdmin.menuAdmin.btnRegistros.addActionListener(this);
        ventanaAdmin.menuAdmin.btnCerrarSesion.addActionListener(this);
        ventanaAdmin.menuAdmin.btnVentas.addActionListener(this);
        ventanaAdmin.menuAdmin.btnAlmacen.addActionListener(this);
        ventanaAdmin.menuAdmin.btnAjustes.addActionListener(this);
        ventanaAdmin.menuNotificaciones.btnActualizacion.addActionListener(this);
        ventanaAdmin.menuNotificaciones.btnConexion.addActionListener(this);
        //Agrega el nombre y apellido a la esquina superior derecha
        String nombre_apellido = ((Modelo_Trabajadores) lista_trabajadores.get(lista_trabajadores.findTrabajador(lista_trabajadores, this.model_user.getDni()))).getNombre();
        nombre_apellido = nombre_apellido + " " + ((Modelo_Trabajadores) lista_trabajadores.get(lista_trabajadores.findTrabajador(lista_trabajadores, this.model_user.getDni()))).getApellido();
        ventanaAdmin.menuNotificaciones.perfil_Usuario1.lblEditUser.setText(nombre_apellido);
    }

    private void limpiarSpContent() {
        this.panelVentas = null;
        this.panelRegistros = null;
        this.panelInventario = null;
        this.panelAjustes = null;

    }

    private void cerrarSesion() {
        ventanaAdmin.setVisible(false);
        ventanaAdmin.dispose();

        Ventana_Login view_login = new Ventana_Login();
        Modelo_Trabajadores trabajador = new Modelo_Trabajadores();

        consultasTrabajadores = new Consultas_Trabajadores();
        view_login.setVisible(true);
        Controlador_login controlador_login = new Controlador_login(view_login, trabajador, consultasTrabajadores);
    }
    
    public boolean isInternetAvailable() {
        boolean conexion = false;
        String dirWeb = "www.google.com";
        int puerto = 80;
        Socket s;
        try {
            s = new Socket(dirWeb, puerto);
            if(s.isConnected()){
                conexion = true;
            }
        } catch (IOException ex) {
            conexion = false;
        }
        return conexion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaAdmin.menuAdmin.btnVentas) {
            limpiarSpContent();
            panelVentas = new Panel_Ventas();
            controladorVentas = new Controlador_Ventas(this, this.ventanaAdmin);
            ventanaAdmin.administrarPanel(ventanaAdmin.spContent, panelVentas);
            
        }else if (e.getSource() == ventanaAdmin.menuAdmin.btnRegistros) {
            limpiarSpContent();
            panelRegistros = new Panel_Registros();
            controladorRegistros = new Controlador_Registros(this, this.ventanaAdmin);
            ventanaAdmin.administrarPanel(this.ventanaAdmin.spContent, controladorRegistros.getPanelRegistros());
        }else if (e.getSource() == ventanaAdmin.menuAdmin.btnAlmacen) {
            limpiarSpContent();
            panelInventario = new Panel_Inventario();
            controladorAlmacen = new Controlador_Almacen(this,this.ventanaAdmin);
            ventanaAdmin.administrarPanel(ventanaAdmin.spContent, panelInventario);

        }else if (e.getSource() == ventanaAdmin.menuAdmin.btnCerrarSesion) {
            cerrarSesion();
        }else if (e.getSource() == ventanaAdmin.menuAdmin.btnAjustes) {
            limpiarSpContent();
            panelAjustes = new Panel_Ajustes();
            controladorAjustes = new Controlador_Ajustes(this, this.ventanaAdmin);
            ventanaAdmin.administrarPanel(ventanaAdmin.spContent, panelAjustes);
        }else if(e.getSource() == ventanaAdmin.menuNotificaciones.btnActualizacion ){
            try {
                Emergente_Actualizaciones actualizacion = new Emergente_Actualizaciones(ventanaAdmin,true);
                actualizacion.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Controlador_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(e.getSource() == ventanaAdmin.menuNotificaciones.btnConexion){
                if(isInternetAvailable()){
                    mensaje("USTED TIENE CONEXION");
                }else{
                    mensaje("USTED NO DISPONE DE CONEXION");
                }
        }

    }
    
    private void mensaje(String msg) {
        if (ventanaAdmin != null) {
            Emergente_Aviso mensajes = new Emergente_Aviso(ventanaAdmin, true, msg);
            mensajes.setVisible(true);
        }/* else if (ventanaT != null) {
            Emergente_Aviso mensajes = new Emergente_Aviso(ventanaT, true, msg);
            mensajes.setVisible(true);
        }*/

    }

}