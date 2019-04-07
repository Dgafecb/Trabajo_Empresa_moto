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
            panelRegistrosTrabajadores.btnTrabajadoresAgregar.addActionListener(this);
        }
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadoresAgregar) { // boton Agregar del Panel trabajadores
            Modelo_Trabajadores modelo_trabajadores = new Modelo_Trabajadores();
            modelo_trabajadores.setDni(this.panelRegistrosTrabajadores.txfTrabajadoresDNI.getText());
            if(this.panelRegistrosTrabajadores.txfTrabajadoresDNI.getText().length()==8){
                modelo_trabajadores.setDni(this.panelRegistrosTrabajadores.txfTrabajadoresDNI.getText());
            }
            else{
                // Panel para el mensaje que la longitud del dni no es correcta
                System.out.println("Longitud del dni incorrecta");
            }

            modelo_trabajadores.setNombre(this.panelRegistrosTrabajadores.txfTrabajadoresNombre.getText());
            modelo_trabajadores.setApellido(this.panelRegistrosTrabajadores.txfTrabajadoresApellidos.getText());
            if (this.panelRegistrosTrabajadores.txfTrabajadoresPassword.getText().compareTo(this.panelRegistrosTrabajadores.txfTrabajadoresValidatePassword.getText()) == 0 && this.panelRegistrosTrabajadores.txfTrabajadoresPassword.getText().length() > 5) {
                modelo_trabajadores.setPassword(this.panelRegistrosTrabajadores.txfTrabajadoresPassword.getText());

            } else {
                // Crea un panel que avise que la "password" no coincide o es muy corta
                System.out.println("La contrasenha no coincide o la longitud es muy corta");
            }
            if(this.panelRegistrosTrabajadores.cbTrabajadoresPrivilegio.getSelectedItem().toString().compareTo("Admin")==0){
                modelo_trabajadores.setPrivilege(2);
            }
            else{
                modelo_trabajadores.setPrivilege(0);
            }
            try {
                if (Float.valueOf(this.panelRegistrosTrabajadores.txfTrabajadoresSueldo.getText()) < 930.00) {
                    modelo_trabajadores.setSueldo(930.00f);
                } else {
                    modelo_trabajadores.setSueldo(Float.valueOf(this.panelRegistrosTrabajadores.txfTrabajadoresSueldo.getText()));
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
