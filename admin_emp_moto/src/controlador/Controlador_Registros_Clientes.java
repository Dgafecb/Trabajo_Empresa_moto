package controlador;

import static controlador.Controlador_login.lista_clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
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

        this.llenarTabla();
        this.panelClientes.btnClienteBuscar.addActionListener(this);
        this.panelClientes.jButton10.addActionListener(this);
        this.panelClientes.jButton9.addActionListener(this);
        this.panelClientes.jButton11.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.panelClientes.btnClienteBuscar) {// boton buscar
            String dni_leido = this.panelClientes.txfBuscar.getText();
            ResultadoDNIClientes resultado = clientes.findClientes(clientes, dni_leido);
            if (resultado.isFunciona()) {
                DefaultTableModel model = new DefaultTableModel(new String[]{"DNI", "Nombres y Apellidos", "DNI", "Nombres y Apellidos"}, 0);
                for (int i = 0; i < resultado.getTemp().size(); i++) {

                    String dni = ((Modelo_Clientes) clientes.get(i)).getDni();
                    String nombres_apellido = ((Modelo_Clientes) clientes.get(i)).getNombre_apellido();
                    String dni_2 = ((Modelo_Clientes) clientes.get(i)).getDni_2();
                    String nombres_apellido_2 = ((Modelo_Clientes) clientes.get(i)).getNombre_apellido_2();
                    model.addRow(new Object[]{dni, nombres_apellido, dni_2, nombres_apellido_2});

                }
                this.panelClientes.jTable1.setModel(model);

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el DNI");
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

    private void llenarTabla() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"DNI", "Nombres y Apellidos", "DNI", "Nombres y Apellidos"}, 0);
        for (int i = 0; i < clientes.size(); i++) {
            String dni = ((Modelo_Clientes) clientes.get(i)).getDni();
            String nombres_apellido = ((Modelo_Clientes) clientes.get(i)).getNombre_apellido();
            String dni_2 = ((Modelo_Clientes) clientes.get(i)).getDni_2();
            String nombres_apellido_2 = ((Modelo_Clientes) clientes.get(i)).getNombre_apellido_2();
            model.addRow(new Object[]{dni, nombres_apellido, dni_2, nombres_apellido_2});
        }
        this.panelClientes.jTable1.setModel(model);

    }

    private Modelo_Clientes leerDatosClientes() {
        Modelo_Clientes temp_model = new Modelo_Clientes();

        return temp_model;
    }

}
