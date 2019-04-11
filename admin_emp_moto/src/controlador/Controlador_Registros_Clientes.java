package controlador;

import static controlador.Controlador_login.lista_clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import modelo.Consultas_Clientes;
import modelo.Linked_List;
import modelo.Linked_List.ResultadoClientes;
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
            ResultadoClientes resultado = clientes.findClientes(clientes, dni_leido);
            if (resultado.isFunciona()) {
                DefaultTableModel model = new DefaultTableModel(new String[]{"DNI", "Nombres y Apellidos", "DNI", "Nombres y Apellidos", "Correo", "Direccion", "Ciudad", "Pais"}, 0);
                for (int i = 0; i < resultado.getTemp().size(); i++) {

                    String dni = ((Modelo_Clientes) clientes.get(i)).getDni();
                    String nombres_apellido = ((Modelo_Clientes) clientes.get(i)).getNombre_apellido();
                    String dni_2 = ((Modelo_Clientes) clientes.get(i)).getDni_2();
                    String nombres_apellido_2 = ((Modelo_Clientes) clientes.get(i)).getNombre_apellido_2();
                    String correo = ((Modelo_Clientes) clientes.get(i)).getCorreo();
                    String direccion = ((Modelo_Clientes) clientes.get(i)).getDireccion();
                    String ciudad = ((Modelo_Clientes) clientes.get(i)).getCiudad();
                    String pais = ((Modelo_Clientes) clientes.get(i)).getPais();

                    model.addRow(new Object[]{dni, nombres_apellido, dni_2, nombres_apellido_2,correo,direccion,ciudad,pais});

                }
                this.panelClientes.jTable1.setModel(model);
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Se agrego al registro");
                mensaje.setVisible(true);

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el DNI");
                mensaje.setVisible(true);
            }
        }
        if (ae.getSource() == this.panelClientes.jButton9) {//boton agregar
            Modelo_Clientes temp_model = this.leerDatosClientes();
            Consultas_Clientes consultas = new Consultas_Clientes();

            if (consultas.create(temp_model)) {
                lista_clientes.add(temp_model);
                llenarTabla();
            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se agrego al trabajador");
                mensaje.setVisible(true);

            }
        }
        if (ae.getSource() == this.panelClientes.jButton10) {// boton modificar
            if (this.panelClientes.jTable1.getSelectionModel().isSelectionEmpty() == false) {
                Modelo_Clientes temp_model = this.leerDatosClientes();
                Consultas_Clientes consultas = new Consultas_Clientes();
                String temp_dni = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 0);
                int index = (lista_clientes.findClientes(lista_clientes, temp_dni).getTemp()).peek();
                temp_model.setId(((Modelo_Clientes) lista_clientes.get(index)).getId());
                if (consultas.update(temp_model)) {
                    lista_clientes.remove(index);
                    lista_clientes.add(index, temp_model);
                    llenarTabla();
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Se actualizo el registro");
                    mensaje.setVisible(true);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo actualizar el registro");
                    mensaje.setVisible(true);
                }

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Seleccione una fila a eliminar");
                mensaje.setVisible(true);
            }
        }
        if (ae.getSource() == this.panelClientes.jButton11) {// boton eliminar
            if (this.panelClientes.jTable1.getSelectionModel().isSelectionEmpty() == false) {
                Modelo_Clientes temp_model = new Modelo_Clientes();
                String temp_dni = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 0);
                int index = (lista_clientes.findClientes(lista_clientes, temp_dni).getTemp()).peek();
                temp_model.setId((int) ((Modelo_Clientes) lista_clientes.get(index)).getId());
                Consultas_Clientes consultas = new Consultas_Clientes();
                if (consultas.delete(temp_model)) {
                    lista_clientes.remove(index);
                    llenarTabla();
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Se elimino el registro");
                    mensaje.setVisible(true);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo eliminar el registro");
                    mensaje.setVisible(true);
                }
            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Seleccione una fila a eliminar");
                mensaje.setVisible(true);
            }
        }
    }

    private void llenarTabla() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"DNI", "Nombres y Apellidos", "DNI", "Nombres y Apellidos", "Correo", "Direccion", "Ciudad", "Pais"}, 0);
        for (int i = 0; i < clientes.size(); i++) {
            String dni = ((Modelo_Clientes) clientes.get(i)).getDni();
            String nombres_apellido = ((Modelo_Clientes) clientes.get(i)).getNombre_apellido();
            String dni_2 = ((Modelo_Clientes) clientes.get(i)).getDni_2();
            String nombres_apellido_2 = ((Modelo_Clientes) clientes.get(i)).getNombre_apellido_2();
            String correo = ((Modelo_Clientes) clientes.get(i)).getCorreo();
            String direccion = ((Modelo_Clientes) clientes.get(i)).getDireccion();
            String ciudad = ((Modelo_Clientes) clientes.get(i)).getCiudad();
            String pais = ((Modelo_Clientes) clientes.get(i)).getPais();
            model.addRow(new Object[]{dni, nombres_apellido, dni_2, nombres_apellido_2, correo, direccion, ciudad, pais});
        }
        this.panelClientes.jTable1.setModel(model);

    }

    private Modelo_Clientes leerDatosClientes() {//lee los datos los textfield

        Modelo_Clientes temp_model = new Modelo_Clientes();
        temp_model.setCiudad(this.panelClientes.cbCiudad.getSelectedItem().toString());
        temp_model.setCorreo(this.panelClientes.txfCorreo.getText());
        temp_model.setDireccion(this.panelClientes.txfDireccion.getText());
        temp_model.setPais(this.panelClientes.cbPais.getSelectedItem().toString());
        temp_model.setTelefono(this.panelClientes.txfTelefono.getText());
        String nombre_2 = this.panelClientes.txfCliente2Nombre.getText();

        String nombre_1 = this.panelClientes.txfCliente1Nombre.getText();
        String dni_2 = this.panelClientes.txfDNI2.getText();
        String dni_1 = this.panelClientes.txfDNI1.getText();
        if (dni_1.length() != 8) {
            Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "La longitud del DNI es incorrecta");
            mensaje.setVisible(true);
        }
        if (nombre_2.compareTo("") != 0 && dni_2.length() != 8) {
            Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "La longitud del DNI es incorrecta");
            mensaje.setVisible(true);
        }
        temp_model.setNombre_apellido(nombre_1);
        temp_model.setNombre_apellido_2(nombre_2);
        temp_model.setDni(dni_1);
        temp_model.setDni_2(dni_2);

        return temp_model;
    }

}
