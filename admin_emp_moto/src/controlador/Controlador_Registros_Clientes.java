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
import vista.Emergente_Panel_Clientes;
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
            Buscar();
        }else if (ae.getSource() == this.panelClientes.jButton9) {//boton agregar
            Agregar();
        }else if (ae.getSource() == this.panelClientes.jButton10) {// boton modificar
            
        }
        if (ae.getSource() == this.panelClientes.jButton11) {// boton eliminar
            Eliminar();
        }
    }

    
    private void Buscar(){
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

                    model.addRow(new Object[]{dni, nombres_apellido, dni_2, nombres_apellido_2, correo, direccion, ciudad, pais});

                }
                this.panelClientes.jTable1.setModel(model);

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el DNI");
                mensaje.setVisible(true);
            }  
    }
    
    private void Agregar(){
         Emergente_Panel_Clientes panel = new Emergente_Panel_Clientes(ventanaAdmin, true);
            panel.setVisible(true);
            LinkedList<String> lista_agregada = panel.clientes;
            if (lista_agregada == null) {
                //Si se apreto el boton cancelar

            } else {
                Modelo_Clientes temp_model = new Modelo_Clientes();
                String temp_nombre = (String) lista_agregada.get(0);
                String temp_nombre_2 = (String) lista_agregada.get(1);
                String temp_dni = (String) lista_agregada.get(2);
                String temp_dni_2 = (String) lista_agregada.get(3);
                String temp_correo = (String) lista_agregada.get(4);
                String temp_direccion = (String) lista_agregada.get(5);
                String temp_telefono = (String) lista_agregada.get(6);
                String temp_ciudad = (String) lista_agregada.get(7);
                String temp_pais = (String) lista_agregada.get(8);
                temp_model.setNombre_apellido(temp_nombre);
                temp_model.setNombre_apellido_2(temp_nombre_2);
                temp_model.setDni(temp_dni);
                temp_model.setDni_2(temp_dni_2);
                temp_model.setDireccion(temp_direccion);
                temp_model.setTelefono(temp_telefono);
                temp_model.setPais(temp_pais);
                temp_model.setCiudad(temp_ciudad);
                temp_model.setCorreo(temp_correo);
                Consultas_Clientes consultas = new Consultas_Clientes();
                if (consultas.create(temp_model)) {
                    lista_clientes.add(temp_model);
                    llenarTabla();
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se agrego al trabajador");
                    mensaje.setVisible(true);

                }

            }
    }
    
    private void Modificar(){
        
    }
    
    private void Eliminar(){
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

  

}
