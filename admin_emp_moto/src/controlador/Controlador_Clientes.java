package controlador;

import static controlador.Controlador_login.lista_clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import vista.Panel_Registros_Clientes;
import vista.Ventana_Admin;

public class Controlador_Clientes implements ActionListener {

    private LinkedList clientes;
    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Registros_Clientes panelClientes;

    public Controlador_Clientes(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin, Panel_Registros_Clientes panelClientes) {
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
        this.panelClientes.btnClienteBuscar.addActionListener(this);
        this.llenarListaClientes();
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.panelClientes.btnClienteBuscar){
            System.out.println("Buscar");
        }
    }
    private void llenarListaClientes(){
        final DefaultListModel model = new DefaultListModel();
        for(int i = 0;i<clientes.size();i++){
            model.addElement(clientes.get(i));
        }
      
        this.panelClientes.lClienteLista.setModel(model);
    }
}