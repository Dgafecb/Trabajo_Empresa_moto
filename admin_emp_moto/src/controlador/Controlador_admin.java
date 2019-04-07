package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import modelo.Consultas_Trabajadores;
import modelo.Consultas_Inventario;
import modelo.Consultas_Trabajadores_meta;
import modelo.Modelo_Inventario;
import modelo.Modelo_Trabajadores_meta;
import modelo.Modelo_Trabajadores;
import vista.Panel_Registros;
import vista.Panel_Ventas;
import vista.Ventana_Admin;
import vista.Ventana_Login;


public class Controlador_admin implements ActionListener {
    /*--------------------VENTANAS---------------------------*/
    private Ventana_Admin ventanaAdmin;
    
    /*---------------------PANELES---------------------------*/
    private Panel_Registros panelRegistros;
    private Panel_Ventas panelVentas;    
    
    /*---------------------MODELOS---------------------------*/
    private Modelo_Trabajadores model_user;
    
    /*--------------------CONSULTAS--------------------------*/
    private Consultas_Trabajadores consultasTrabajadores;
    
    /*-------------------CONTROLADORES-----------------------*/
    private Controlador_Registros controladorRegistros;
    
    /*---------------------VARIABLES-------------------------*/
    
    public LinkedList<Modelo_Trabajadores> listaTrabajadores;
    
    public Controlador_admin(Ventana_Admin view_admin,  Modelo_Trabajadores model_user) {
        this.ventanaAdmin = view_admin;
        this.model_user = model_user;
        this.llamarComponentes();
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

    }

    private void limpiarSpContent(){
        panelVentas=null;
        panelRegistros=null;
    }
    private void cerrarSesion(){
        ventanaAdmin.setVisible(false);
        ventanaAdmin.dispose();
        
        Ventana_Login view_login = new Ventana_Login();
        Modelo_Trabajadores trabajador = new Modelo_Trabajadores();
        
        consultasTrabajadores = new Consultas_Trabajadores();
        view_login.setVisible(true);
        Controlador_login controlador_login = new Controlador_login(view_login, trabajador,consultasTrabajadores ); 
    }

    @Override
    public void actionPerformed(ActionEvent e) { 
        if(e.getSource() == ventanaAdmin.menuAdmin.btnVentas){
            limpiarSpContent();
            panelVentas = new Panel_Ventas();
            ventanaAdmin.administrarPanel(ventanaAdmin.spContent,panelVentas );
        }else if (e.getSource() == ventanaAdmin.menuAdmin.btnRegistros) {
            limpiarSpContent();
            panelRegistros = new Panel_Registros();
            controladorRegistros = new Controlador_Registros(this);
            ventanaAdmin.administrarPanel(ventanaAdmin.spContent,panelRegistros );
        }else if(e.getSource() == ventanaAdmin.menuAdmin.btnCerrarSesion){ 
            cerrarSesion();
        }

    }
    
    

}
