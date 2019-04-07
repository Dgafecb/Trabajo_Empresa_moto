package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import modelo.Consultas_Trabajadores;
import modelo.Modelo_Trabajadores;
import vista.Panel_Registros;
import vista.Panel_Registros_Trabajadores;
import vista.Ventana_Admin;

public class Controlador_Registros implements ActionListener {

    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Registros panelRegistros;
    private Panel_Registros_Trabajadores panelRegistrosTrabajadores;
    private Consultas_Trabajadores consultasTrabajadores;

    public Controlador_Registros(Controlador_admin controladorAdmin) {
        this.controladorAdmin = controladorAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();
    }

    private void iniciarComponentes() {
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelRegistros = controladorAdmin.getPanelRegistros();
    }

    private void llamarComponentes() {
        panelRegistros.subBtnTrabajadores.addActionListener(this);
    }

    private void limpiarSpContenido() {
        panelRegistrosTrabajadores = null;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == panelRegistros.subBtnTrabajadores) {
            limpiarSpContenido();
            panelRegistrosTrabajadores = new Panel_Registros_Trabajadores();
            panelRegistros.administrarPanel(panelRegistros.spContenidoRegistros, panelRegistrosTrabajadores);
            panelRegistrosTrabajadores.jButton5.addActionListener(this);
        }
        if (ae.getSource() == this.panelRegistrosTrabajadores.jButton5) { // boton Agregar del Panel trabajadores
            Modelo_Trabajadores modelo_trabajadores = new Modelo_Trabajadores();
            modelo_trabajadores.setDni(this.panelRegistrosTrabajadores.jTextField5.getText());
            if(this.panelRegistrosTrabajadores.jTextField5.getText().length()==8){
                modelo_trabajadores.setDni(this.panelRegistrosTrabajadores.jTextField5.getText());
            }
            else{
                // Panel para el mensaje que la longitud del dni no es correcta
                System.out.println("Longitud del dni incorrecta");
            }

            modelo_trabajadores.setNombre(this.panelRegistrosTrabajadores.jTextField8.getText());
            modelo_trabajadores.setApellido(this.panelRegistrosTrabajadores.jTextField9.getText());
            if (this.panelRegistrosTrabajadores.jTextField6.getText().compareTo(this.panelRegistrosTrabajadores.jTextField7.getText()) == 0 && this.panelRegistrosTrabajadores.jTextField6.getText().length() > 5) {
                modelo_trabajadores.setPassword(this.panelRegistrosTrabajadores.jTextField6.getText());

            } else {
                // Crea un panel que avise que la "password" no coincide o es muy corta
                System.out.println("La contrasenha no coincide o la longitud es muy corta");
            }
            if(this.panelRegistrosTrabajadores.jComboBox1.getSelectedItem().toString().compareTo("Admin")==0){
                modelo_trabajadores.setPrivilege(2);
            }
            else{
                modelo_trabajadores.setPrivilege(0);
            }
            try {
                if (Float.valueOf(this.panelRegistrosTrabajadores.jTextField10.getText()) < 930.00) {
                    modelo_trabajadores.setSueldo(930.00f);
                } else {
                    modelo_trabajadores.setSueldo(Float.valueOf(this.panelRegistrosTrabajadores.jTextField10.getText()));
                }
            } catch (NumberFormatException e) {
                System.out.println(" " + e.getMessage());
            }
            modelo_trabajadores.setFecha_creacion("06/04/19");
            String time_date = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());//ddMMyyyy_HHmmss cambiar a este string para mas informacion
            modelo_trabajadores.setFecha_creacion(time_date);
            consultasTrabajadores  = new Consultas_Trabajadores();
            if (consultasTrabajadores.create(modelo_trabajadores) == true) {
                System.out.println("Se agrego al trabajador");
            }
            
        }
    }
}
