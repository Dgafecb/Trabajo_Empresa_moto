package controlador;

import static controlador.Controlador_login.lista_clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import modelo.Linked_List;
import modelo.Linked_List.ResultadoDNIClientes;
import modelo.Modelo_Clientes;
import vista.Emergente_Aviso;
import vista.Panel_Registros_Clientes;
import vista.Ventana_Admin;

public class Controlador_Registros_Clientes implements ActionListener {

    private Linked_List<Modelo_Clientes> clientes;
    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Registros_Clientes panelClientes;

    public Controlador_Registros_Clientes(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin, Panel_Registros_Clientes panelClientes) {
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
        this.panelClientes = panelClientes;
        this.iniciarComponentes();
        this.llamarComponentes();
    }

    public Panel_Registros_Clientes getPanelClientes() {
        return panelClientes;
    }

    public void setPanelClientes(Panel_Registros_Clientes panelClientes) {
        this.panelClientes = panelClientes;
    }

    private void iniciarComponentes() {
        this.ventanaAdmin = this.controladorAdmin.getVentanaAdmin();
        clientes = lista_clientes;

    }

    private void llamarComponentes() {

        this.llenarListaClientes();
        this.panelClientes.btnClienteBuscar.addActionListener(this);
        this.panelClientes.jButton10.addActionListener(this);
        this.panelClientes.jButton9.addActionListener(this);
        this.panelClientes.jButton11.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.panelClientes.btnClienteBuscar) {// boton buscar
            String dni = this.panelClientes.txfBuscar.getText();
            ResultadoDNIClientes resultado = clientes.findClientes(clientes, dni);
            if (resultado.isFunciona()) {
                final DefaultListModel model = new DefaultListModel();
                for (int i = 0; i < resultado.getTemp().size(); i++) {
                    model.addElement(clientes.get((Integer)resultado.getTemp().pop()));
                }
                this.panelClientes.lClienteLista.setModel(model);

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontró el DNI");
                mensaje.setVisible(true);
            }
        }
        if (ae.getSource() == this.panelClientes.jButton9) {//boton agregar
            Modelo_Clientes temp_model = this.leerDatosClientes();
        }
        if (ae.getSource() == this.panelClientes.jButton10) {// boton modificar

        }
        if (ae.getSource() == this.panelClientes.jButton11) {// boton eliminar

        }
    }
    private Modelo_Clientes leerDatosClientes(){
        Modelo_Clientes temp_model = new Modelo_Clientes();
        
        
        
        
        
        
        return temp_model;
    }   
    private void llenarListaClientes() {
        final DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < clientes.size(); i++) {
            model.addElement(clientes.get(i));
        }
        this.panelClientes.lClienteLista.setModel(model);
    }
}
