package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Panel_Registros;
import vista.Panel_Registros_Asistencia;
import vista.Ventana_Admin;



public class Controlador_Registros implements ActionListener{
    
    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Registros panelRegistros;
    private Panel_Registros_Asistencia panelRegistrosAsistencia;
    
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
        panelRegistros.subBtnAsistencia.addActionListener(this);
    }
    
    private void limpiarSpContenido(){
        panelRegistrosAsistencia = null;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== panelRegistros.subBtnAsistencia){
            limpiarSpContenido();
            panelRegistrosAsistencia = new Panel_Registros_Asistencia();
            panelRegistros.administrarPanel(panelRegistros.spContenidoRegistros,panelRegistrosAsistencia);
        }
    }
}
