package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Panel_Registros;
import vista.Panel_Registros_Trabajadores;
import vista.Ventana_Admin;



public class Controlador_Registros implements ActionListener{
    
    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Registros panelRegistros;
    private Panel_Registros_Trabajadores panelRegistrosTrabajadores;
    
    public Controlador_Registros(Controlador_admin controladorAdmin){
        this.controladorAdmin = controladorAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();
    }

    private void iniciarComponentes(){
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelRegistros = controladorAdmin.getPanelRegistros();
    }
    
    private void llamarComponentes() { 
        panelRegistros.subBtnTrabajadores.addActionListener(this);
    }
    
    private void limpiarSpContenido(){
        panelRegistrosTrabajadores = null;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== panelRegistros.subBtnTrabajadores){
            limpiarSpContenido();
            panelRegistrosTrabajadores = new Panel_Registros_Trabajadores();
            panelRegistros.administrarPanel(panelRegistros.spContenidoRegistros,panelRegistrosTrabajadores);
        }
    }
}
