package controlador;

import static controlador.Controlador_login.lista_ajustes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import modelo.Cadenas;
import modelo.Consultas_Ajustes;
import modelo.CustomListModel_Ajustes;
import modelo.CustomRendererAjustes;
import modelo.Linked_List;
import modelo.Modelo_Ajustes;
import vista.Emergente_Ajustes;
import vista.Emergente_Aviso;
import vista.Panel_Ajustes;
import vista.Ventana_Admin;

/**
 *
 * @author Dgafecb
 */
public class Controlador_Ajustes implements ActionListener,MouseListener {

    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Ajustes panelAjustes;
    private LinkedList<Modelo_Ajustes> ajustes;
    private JList list = new JList();
    private Modelo_Ajustes selectedItem;

    public Controlador_Ajustes(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin) {
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
        
        this.iniciarComponentes();
        this.llamarComponentes();
        fillList(lista_ajustes);
    }

    private void iniciarComponentes() {
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelAjustes = controladorAdmin.getPanelAjustes();
        initComponentes();

    }
    

    private void initComponentes() {
        /*this.panelAjustes.txfEmpresaNombre.setText(ajustes.get(0).getValor());
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
        this.panelAjustes.txaComentario.setText((String) ajustes.get(15).getValor());*/
        
    }

    private void llamarComponentes() {
        list.addMouseListener(this);
    }
    
    private void fillList(Linked_List<Modelo_Ajustes> ajustes){
        CustomListModel_Ajustes model = new CustomListModel_Ajustes();
        if(ajustes!=null){
            model.addElement((Modelo_Ajustes) ajustes.get(0));//EMPRESA
            model.addElement((Modelo_Ajustes) ajustes.get(3));//RUC
            model.addElement((Modelo_Ajustes) ajustes.get(2));//TELEFONO
            model.addElement((Modelo_Ajustes) ajustes.get(4));//LOCALIDAD
            model.addElement((Modelo_Ajustes) ajustes.get(15));//COMENTARIO
            
            model.addElement((Modelo_Ajustes) ajustes.get(5));//VENTA AL POR MAYOR
            model.addElement((Modelo_Ajustes) ajustes.get(6));//VENTA NORMAL
            model.addElement((Modelo_Ajustes) ajustes.get(7));//VENTA CREDITO
            model.addElement((Modelo_Ajustes) ajustes.get(8));//IGV
            model.addElement((Modelo_Ajustes) ajustes.get(14));//DESCUENTO LIMITE
            
            model.addElement((Modelo_Ajustes) ajustes.get(12));//HORA DE ENTRADA
            model.addElement((Modelo_Ajustes) ajustes.get(13));//HORA LIMITE
            
        }
        list.setModel(model);
        //CONFIGURAR LIST
        list.setBackground(Cadenas.COLOR_DEFAULT_WHITE);
        list.setSelectionBackground(Cadenas.COLOR_DEFAULT_BLACK_LIGHT);
        list.setCellRenderer(new CustomRendererAjustes());
        panelAjustes.jScrollPane2.setViewportView(list);
    }
    
    private void mensaje(String msg) {
        if (ventanaAdmin != null) {
            Emergente_Aviso mensajes = new Emergente_Aviso(ventanaAdmin, true, msg);
            mensajes.setVisible(true);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       if(me.getSource()== list){
            if (me.getClickCount() == 2){
                CustomListModel_Ajustes modelo = (CustomListModel_Ajustes) list.getModel();
                int seleccion = list.getSelectedIndex();
                if(seleccion !=-1){
                    try {
                        selectedItem = (Modelo_Ajustes) modelo.getAjustes(seleccion);
                        Emergente_Ajustes panelEmergente =new Emergente_Ajustes(ventanaAdmin,true,selectedItem);
                        panelEmergente.setVisible(true);
                        if(!selectedItem.getValor().equals(panelEmergente.cambio)){
                            if(panelEmergente.cambio!=null){
                                if(panelEmergente.cambio.length()!=0){
                                selectedItem.setValor(panelEmergente.cambio);
                                Thread hilo = new Thread() {
                                @Override
                                public void run() {
                                    Consultas_Ajustes consulta = new Consultas_Ajustes();
                                    if(consulta.update(selectedItem)){
                                        mensaje("SE REALIZO CAMBIO CORRECTAMENTE");
                                    }else{
                                        mensaje("NO SE REALIZO CAMBIO");
                                    }
                                    return;
                                    }
                                };
                                hilo.start();
                                }
                            }
                            }
                    } catch (Exception ex) {
                            Logger.getLogger(Controlador_Ajustes.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    
            } 
        } 
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
       
    }

}