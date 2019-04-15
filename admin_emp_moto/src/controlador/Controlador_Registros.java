package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Consultas_Trabajadores;
import vista.Panel_Registros;
import vista.Panel_Registros_Clientes;
import vista.Panel_Registros_Trabajadores;
import vista.Panel_Registros_Ventas;
import vista.Ventana_Admin;

public class Controlador_Registros implements ActionListener {

    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    /*------------------PANELES----------------------------*/
    private Panel_Registros panelRegistros;
    private Panel_Registros_Trabajadores panelRegistrosTrabajadores;
    private Panel_Registros_Clientes panelRegistrosClientes;
    private Panel_Registros_Ventas panelRegistrosVentas;
    
    /*------------------CONSULTAS--------------------------*/
    private Consultas_Trabajadores consultasTrabajadores;

    public Controlador_Registros(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin) {
        this.controladorAdmin = controladorAdmin;

        this.ventanaAdmin = ventanaAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();
    }

    public Panel_Registros getPanelRegistros() {
        return panelRegistros;
    }

    public void setPanelRegistros(Panel_Registros panelRegistros) {
        this.panelRegistros = panelRegistros;
    }

    private void iniciarComponentes() {
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelRegistros = controladorAdmin.getPanelRegistros();
        limpiarSpContenido();
        panelRegistrosClientes = new Panel_Registros_Clientes();
        Controlador_Registros_Clientes ctrl_clientes = new Controlador_Registros_Clientes(this.controladorAdmin, this.ventanaAdmin, this.panelRegistrosClientes);
        panelRegistros.administrarPanel(panelRegistros.spContenidoRegistros, ctrl_clientes.getPanelClientes());

    }

    private void llamarComponentes() {
        this.panelRegistros.subBtnTrabajadores.addActionListener(this);
        this.panelRegistros.subBtnClientes.addActionListener(this);
        this.panelRegistros.subBtnVentas.addActionListener(this);

    }

    private void limpiarSpContenido() {
        this.panelRegistrosTrabajadores = null;
        this.panelRegistrosClientes = null;
        this.panelRegistrosVentas = null;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == panelRegistros.subBtnClientes) {
            limpiarSpContenido();
            panelRegistrosClientes = new Panel_Registros_Clientes();
            Controlador_Registros_Clientes ctrl_clientes = new Controlador_Registros_Clientes(this.controladorAdmin, this.ventanaAdmin, this.panelRegistrosClientes);
            panelRegistros.administrarPanel(panelRegistros.spContenidoRegistros, ctrl_clientes.getPanelClientes());

        } else if (ae.getSource() == panelRegistros.subBtnTrabajadores) {
            limpiarSpContenido();
            panelRegistrosTrabajadores = new Panel_Registros_Trabajadores();
            Controlador_Registros_Trabajadores ctrl_Reg_Trabajadores = new Controlador_Registros_Trabajadores(this.controladorAdmin, this.ventanaAdmin, this.panelRegistrosTrabajadores);
            panelRegistros.administrarPanel(panelRegistros.spContenidoRegistros, panelRegistrosTrabajadores);
        }else if(ae.getSource() == panelRegistros.subBtnVentas){
            limpiarSpContenido();
            panelRegistrosVentas = new Panel_Registros_Ventas();
            panelRegistros.administrarPanel(panelRegistros.spContenidoRegistros, panelRegistrosVentas);
        }
    }
}