
package controlador;

import static controlador.Controlador_login.lista_ajustes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import modelo.Consultas_Ajustes;
import modelo.Modelo_Ajustes;
import vista.Mensaje_Emergente;
import vista.Panel_Ajustes;
import vista.Ventana_Admin;

/**
 *
 * @author Dgafecb
 */
public class Controlador_Ajustes implements ActionListener {

    private Controlador_Admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Ajustes panelAjustes;
    private LinkedList<Modelo_Ajustes> ajustes;
    

    public Controlador_Ajustes(Controlador_Admin controladorAdmin, Ventana_Admin ventanaAdmin) {
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
    
    private void initComponentes(){
        this.panelAjustes.txfEmpresaNombre.setText(ajustes.get(0).getValor());
        this.panelAjustes.txfTelefono.setText((String) ajustes.get(2).getValor());
        this.panelAjustes.txfRuc.setText(ajustes.get(3).getValor());   
        this.panelAjustes.txfLocalidad.setText((String) ajustes.get(4).getValor());
        this.panelAjustes.txfVentaMayor.setText((String) ajustes.get(5).getValor());
        this.panelAjustes.txfVentaEfectivo.setText((String) ajustes.get(6).getValor());
        this.panelAjustes.txfVentaCredito.setText((String) ajustes.get(7).getValor());
        this.panelAjustes.txfIGV.setText((String) ajustes.get(8).getValor());
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
    
    private void guardarDatos(){
        Thread hilo = new Thread() {
                    @Override
                    public void run() {  
                    int cambios=0;
                    Consultas_Ajustes consultasAjustes = new Consultas_Ajustes();
                    Modelo_Ajustes misAjustes =  new Modelo_Ajustes();
                    
                    if(ajustes.get(0).getValor().equals(panelAjustes.txfEmpresaNombre.getText())!=true){                      
                        misAjustes.setId(1);
                        misAjustes.setDato("nombre_empresa");//Aumentar tamaño string en la base de datos
                        misAjustes.setValor(panelAjustes.txfEmpresaNombre.getText());
                        consultasAjustes.update(misAjustes);
                        cambios++;
                    }
                    
                    if(ajustes.get(2).getValor().equals(panelAjustes.txfTelefono.getText())!=true){                      
                        misAjustes.setId(3);
                        misAjustes.setDato("telefono");
                        misAjustes.setValor(panelAjustes.txfTelefono.getText());
                        consultasAjustes.update(misAjustes);
                        cambios++;
                    }
                    
                    if(ajustes.get(3).getValor().equals(panelAjustes.txfRuc.getText())!=true){                      
                        misAjustes.setId(4);
                        misAjustes.setDato("ruc");
                        misAjustes.setValor(panelAjustes.txfRuc.getText());
                        consultasAjustes.update(misAjustes);
                        cambios++;
                    }
                    
                    if(ajustes.get(4).getValor().equals(panelAjustes.txfLocalidad.getText())!=true){                      
                        misAjustes.setId(5);
                        misAjustes.setDato("localidad");
                        misAjustes.setValor(panelAjustes.txfLocalidad.getText());
                        consultasAjustes.update(misAjustes);
                        cambios++;
                    }
                    if(ajustes.get(5).getValor().equals(panelAjustes.txfVentaMayor.getText())!=true){                      
                        misAjustes.setId(6);
                        misAjustes.setDato("util_mayor");
                        misAjustes.setValor(panelAjustes.txfVentaMayor.getText());
                        consultasAjustes.update(misAjustes);
                        cambios++;
                    }
                    
                    
                    if(cambios != 0 ){
                        lista_ajustes  = consultasAjustes.readAll();
                        ajustes = lista_ajustes;
                        initComponentes();  
                        Mensaje_Emergente mensaje = new Mensaje_Emergente(ventanaAdmin,true,"Los cambios se realizaron con exito") ;
                        mensaje.setVisible(true);
                    }else {
                        Mensaje_Emergente mensaje = new Mensaje_Emergente(ventanaAdmin,true,"Usted no realizo cambios") ;
                        mensaje.setVisible(true);
                    }
                    
                    
                    
                    return;} 
                };
                hilo.start();
    }
}