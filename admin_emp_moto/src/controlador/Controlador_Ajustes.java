package controlador;

import static controlador.Controlador_login.lista_ajustes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import modelo.Consultas_Ajustes;
import modelo.Modelo_Ajustes;
import vista.Emergente_Aviso;
import vista.Panel_Ajustes;
import vista.Ventana_Admin;

/**
 *
 * @author Dgafecb
 */
public class Controlador_Ajustes implements ActionListener {

    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Ajustes panelAjustes;
    private LinkedList<Modelo_Ajustes> ajustes;

    public Controlador_Ajustes(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin) {
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();
    }

    private void iniciarComponentes() {
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelAjustes = controladorAdmin.getPanelAjustes();
        // Iniciamos los txtField con los valores iniciales
        ajustes = lista_ajustes;
        initComponentes();

    }
    

    private void initComponentes() {
        this.panelAjustes.txfEmpresaNombre.setText(ajustes.get(0).getValor());
        this.panelAjustes.txfTelefono.setText((String) ajustes.get(2).getValor());
        this.panelAjustes.txfRuc.setText(ajustes.get(3).getValor());
        this.panelAjustes.txfLocalidad.setText((String) ajustes.get(4).getValor());
        this.panelAjustes.txfVentaMayor.setText((String) ajustes.get(5).getValor());
        this.panelAjustes.txfVentaEfectivo.setText((String) ajustes.get(6).getValor());
        this.panelAjustes.txfVentaCredito.setText((String) ajustes.get(7).getValor());
        this.panelAjustes.txfIGV.setText((String) ajustes.get(8).getValor());
        this.panelAjustes.txfCambioMoneda.setText((String) ajustes.get(10).getValor());
        this.panelAjustes.txfComision.setText((String) ajustes.get(11).getValor());
        this.panelAjustes.txfHoraEntrada.setText((String) ajustes.get(12).getValor());
        this.panelAjustes.txfTolerancia.setText((String) ajustes.get(13).getValor());
        this.panelAjustes.txfLimiteDescuento.setText((String) ajustes.get(14).getValor());
        this.panelAjustes.txaComentario.setText((String) ajustes.get(15).getValor());
        
    }

    private void llamarComponentes() {
        this.panelAjustes.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.panelAjustes.btnGuardar) {
            this.guardarDatos();

        }
    }

    private void guardarDatos() {
        Thread hilo = new Thread() {
            @Override
            public void run() {
                int cambios = 0;
                Consultas_Ajustes consultasAjustes = new Consultas_Ajustes();
                Modelo_Ajustes misAjustes = new Modelo_Ajustes();

                if (ajustes.get(0).getValor().equals(panelAjustes.txfEmpresaNombre.getText()) != true) {
                    misAjustes.setId(1);
                    misAjustes.setDato("nombre_empresa");//Aumentar tamaño string en la base de datos
                    misAjustes.setValor(panelAjustes.txfEmpresaNombre.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }

                if (ajustes.get(2).getValor().equals(panelAjustes.txfTelefono.getText()) != true) {
                    misAjustes.setId(3);
                    misAjustes.setDato("telefono");
                    misAjustes.setValor(panelAjustes.txfTelefono.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }

                if (ajustes.get(3).getValor().equals(panelAjustes.txfRuc.getText()) != true) {
                    misAjustes.setId(4);
                    misAjustes.setDato("ruc");
                    misAjustes.setValor(panelAjustes.txfRuc.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }

                if (ajustes.get(4).getValor().equals(panelAjustes.txfLocalidad.getText()) != true) {
                    misAjustes.setId(5);
                    misAjustes.setDato("localidad");
                    misAjustes.setValor(panelAjustes.txfLocalidad.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }
                if (ajustes.get(5).getValor().equals(panelAjustes.txfVentaMayor.getText()) != true) {
                    misAjustes.setId(6);
                    misAjustes.setDato("util_mayor");
                    misAjustes.setValor(panelAjustes.txfVentaMayor.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }
                if (ajustes.get(6).getValor().equals(panelAjustes.txfVentaEfectivo.getText()) != true) {
                    misAjustes.setId(7);
                    misAjustes.setDato("util_venta");
                    misAjustes.setValor(panelAjustes.txfVentaEfectivo.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }
                if (ajustes.get(7).getValor().equals(panelAjustes.txfVentaCredito.getText()) != true) {
                    misAjustes.setId(8);
                    misAjustes.setDato("util_credito");
                    misAjustes.setValor(panelAjustes.txfVentaCredito.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }
                if (ajustes.get(8).getValor().equals(panelAjustes.txfIGV.getText()) != true) {
                    misAjustes.setId(9);
                    misAjustes.setDato("igv");
                    misAjustes.setValor(panelAjustes.txfIGV.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }
                if (ajustes.get(11).getValor().equals(panelAjustes.txfComision.getText()) != true) {
                    misAjustes.setId(12);
                    misAjustes.setDato("comision");
                    misAjustes.setValor(panelAjustes.txfComision.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }
                if (ajustes.get(12).getValor().equals(panelAjustes.txfHoraEntrada.getText()) != true) {
                    misAjustes.setId(13);
                    misAjustes.setDato("hora_entrada");
                    misAjustes.setValor(panelAjustes.txfHoraEntrada.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }
                if (ajustes.get(13).getValor().equals(panelAjustes.txfTolerancia.getText()) != true) {
                    misAjustes.setId(14);
                    misAjustes.setDato("tolerancia");
                    misAjustes.setValor(panelAjustes.txfTolerancia.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }
                if (ajustes.get(14).getValor().equals(panelAjustes.txfLimiteDescuento.getText()) != true) {
                    misAjustes.setId(15);
                    misAjustes.setDato("dscto_maximo");
                    misAjustes.setValor(panelAjustes.txfLimiteDescuento.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }
                if (ajustes.get(15).getValor().equals(panelAjustes.txaComentario.getText()) != true) {
                    misAjustes.setId(16);
                    misAjustes.setDato("comentario");
                    misAjustes.setValor(panelAjustes.txaComentario.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }
                if(ajustes.get(9).getValor().equals(panelAjustes.jComboBox1.getSelectedItem())!= true){
                    misAjustes.setId(10);
                    misAjustes.setDato("simbolo_moneda");
                    misAjustes.setValor(panelAjustes.jComboBox1.getSelectedItem().toString());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                }
                if(ajustes.get(10).getValor().equals(panelAjustes.txfCambioMoneda.getText())!=true){
                    misAjustes.setId(11);
                    misAjustes.setDato("moneda");
                    misAjustes.setValor(panelAjustes.txfCambioMoneda.getText());
                    consultasAjustes.update(misAjustes);
                    cambios++;
                    
                }

                if (cambios != 0) {
                    lista_ajustes = consultasAjustes.readAll();
                    ajustes = lista_ajustes;
                    initComponentes();
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Los cambios se realizaron con exito");
                    mensaje.setVisible(true);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Usted no realizo cambios");
                    mensaje.setVisible(true);
                }

                return;
            }
        };
        hilo.start();
    }
}