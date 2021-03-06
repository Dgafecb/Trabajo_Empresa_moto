package controlador;

import static controlador.Controlador_login.lista_clientes;
import static controlador.Controlador_login.lista_vehiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Consultas_Clientes;
import modelo.Exporter;
import modelo.Linked_List;
import modelo.Linked_List.ResultadoClientes;
import modelo.Modelo_Clientes;
import vista.Emergente_Aviso;
import vista.Emergente_Panel_RClientes;
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

        this.llenarTabla(clientes);
        this.panelClientes.btnClienteBuscar.addActionListener(this);
        this.panelClientes.jButton10.addActionListener(this);
        this.panelClientes.jButton9.addActionListener(this);
        this.panelClientes.jButton11.addActionListener(this);
        this.panelClientes.jButton12.addActionListener(this);
        this.panelClientes.jButton13.addActionListener(this);

    }
    
      private void exportar(JTable jTable1){
         if (jTable1.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            List tb = new ArrayList();
            List nom = new ArrayList();
            tb.add(jTable1);
            nom.add("Compras por factura");
            String file = chooser.getSelectedFile().toString().concat(".xls");
            try {
                Exporter e = new Exporter(new File(file), tb, nom);
                if (e.export()) {
                     JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel en el directorio seleccionado", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage(), " Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        }else{
            JOptionPane.showMessageDialog(ventanaAdmin, "No hay datos para exportar","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }

      
    private void buscarClientes(String referencia){
        String buscar;
        Linked_List<Modelo_Clientes> listaBusqueda;
        listaBusqueda = new Linked_List<Modelo_Clientes>();
        int tamanho = lista_clientes.size();
            for (int i = 0; i < tamanho; i++) {
                int tamanhoRef = ((Modelo_Clientes) lista_clientes.get(i)).getDni().length() + 1;
                String palabra = ((Modelo_Clientes) lista_clientes.get(i)).getDni();
                for (int j = 1; j < tamanhoRef; j++) {
                   if (referencia.equalsIgnoreCase(palabra.substring(0, j))) {
                        listaBusqueda.add(lista_clientes.get(i));
                        break;
                    }
                }
            }
            if (listaBusqueda.size() > 0) {
                    llenarTabla(listaBusqueda);
                    panelClientes.jTable1.setRowSelectionInterval(0, 0);
            } else {
                listaBusqueda = new Linked_List<Modelo_Clientes>();
                for (int i = 0; i < tamanho; i++) {
                int tamanhoRef = ((Modelo_Clientes) lista_clientes.get(i)).getNombre_apellido().length() + 1;
                String palabra = ((Modelo_Clientes) lista_clientes.get(i)).getNombre_apellido();
                for (int j = 1; j < tamanhoRef; j++) {
                   if (referencia.equalsIgnoreCase(palabra.substring(0, j))) {
                        listaBusqueda.add(lista_clientes.get(i));
                        break;
                        }
                    }   
                }
                if(listaBusqueda.size() > 0){
                    llenarTabla(listaBusqueda);
                    panelClientes.jTable1.setRowSelectionInterval(0, 0);  
                }else{
                    panelClientes.jTable1.clearSelection();
                    llenarTabla(lista_clientes);
                }
                    
            }
                if (referencia.equals("")) {
                    panelClientes.jTable1.clearSelection();
                }
    }
    

    private void Agregar() {
        Emergente_Panel_RClientes panel = new Emergente_Panel_RClientes(ventanaAdmin, true);
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
            String temp_facebook = (String) lista_agregada.get(9);
            temp_model.setNombre_apellido(temp_nombre);
            temp_model.setNombre_apellido_2(temp_nombre_2);
            temp_model.setDni(temp_dni);
            temp_model.setDni_2(temp_dni_2);
            temp_model.setDireccion(temp_direccion);
            temp_model.setTelefono(temp_telefono);
            temp_model.setPais(temp_pais);
            temp_model.setCiudad(temp_ciudad);
            temp_model.setCorreo(temp_correo);
            temp_model.setFacebook(temp_facebook);
            Consultas_Clientes consultas = new Consultas_Clientes();
            if (consultas.create(temp_model)) {
                lista_clientes.add(temp_model);
                llenarTabla(clientes);
            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se agrego al trabajador");
                mensaje.setVisible(true);

            }

        }
    }

    private void Modificar() {
        if (this.panelClientes.jTable1.getSelectionModel().isSelectionEmpty() == false) {
            if (this.panelClientes.jTable1.isEditing()) {
                this.panelClientes.jTable1.getCellEditor().stopCellEditing();
                Integer id = (Integer) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 0);
                String temp_nombre = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 2);
                String temp_nombre_2 = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 4);
                String temp_dni = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 1);
                String temp_dni_2 = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 3);
                String temp_correo = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 5);
                String temp_direccion = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 6);
                String temp_telefono = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 7);
                String temp_ciudad = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 9);
                String temp_pais = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 10);
                String temp_facebook = (String) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 8);

                Modelo_Clientes temp_model = new Modelo_Clientes();
                temp_model.setNombre_apellido(temp_nombre);
                temp_model.setNombre_apellido_2(temp_nombre_2);
                temp_model.setDni(temp_dni);
                temp_model.setDni_2(temp_dni_2);
                temp_model.setDireccion(temp_direccion);
                temp_model.setTelefono(temp_telefono);
                temp_model.setPais(temp_pais);
                temp_model.setCiudad(temp_ciudad);
                temp_model.setCorreo(temp_correo);
                temp_model.setFacebook(temp_facebook);
                temp_model.setId(id);
                Consultas_Clientes consultas = new Consultas_Clientes();
                if (consultas.update(temp_model)) {

                    int index = (lista_clientes.findIdClientes(lista_clientes, id)).getI();
                    lista_clientes.remove(index);
                    lista_clientes.add(index, temp_model);
                    this.llenarTabla(clientes);
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Se actualizo el registro");
                    mensaje.setVisible(true);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo actualizar el registro");
                    mensaje.setVisible(true);
                }
            }
        } else {
            Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "SELECCIONAR FILA A MODIFICAR");
            mensaje.setVisible(true);

        }
    }

    private void Eliminar() {
        if (this.panelClientes.jTable1.getSelectionModel().isSelectionEmpty() == false) {
            Modelo_Clientes temp_model = new Modelo_Clientes();
            Integer id = (Integer) this.panelClientes.jTable1.getValueAt(this.panelClientes.jTable1.getSelectedRow(), 0);
            int index = (lista_clientes.findIdClientes(lista_clientes, id)).getI();
            temp_model.setId((int) ((Modelo_Clientes) lista_clientes.get(index)).getId());
            Consultas_Clientes consultas = new Consultas_Clientes();
            if (consultas.delete(temp_model)) {
                lista_clientes.remove(index);
                llenarTabla(clientes);
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

    private void llenarTabla(Linked_List<Modelo_Clientes> clientes) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "DNI", "Nombres y Apellidos", "DNI", 
            "Nombres y Apellidos", "Correo", "Direccion", "Telefono","facebook", "Provincia", "Departamento"}, 0) {
            
            @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    case 0:
                        return false;
                    default:
                        return true;
                }
            }
        };
        for (int i = 0; i < clientes.size(); i++) {
            int id = ((Modelo_Clientes) clientes.get(i)).getId();
            String dni = ((Modelo_Clientes) clientes.get(i)).getDni();
            String nombres_apellido = ((Modelo_Clientes) clientes.get(i)).getNombre_apellido();
            String dni_2 = ((Modelo_Clientes) clientes.get(i)).getDni_2();
            String nombres_apellido_2 = ((Modelo_Clientes) clientes.get(i)).getNombre_apellido_2();
            String correo = ((Modelo_Clientes) clientes.get(i)).getCorreo();
            String telefono = ((Modelo_Clientes) clientes.get(i)).getTelefono();
            String direccion = ((Modelo_Clientes) clientes.get(i)).getDireccion();
            String ciudad = ((Modelo_Clientes) clientes.get(i)).getCiudad();
            String pais = ((Modelo_Clientes) clientes.get(i)).getPais();
            String facebook = ((Modelo_Clientes) clientes.get(i)).getFacebook();
            model.addRow(new Object[]{id, dni, nombres_apellido, dni_2, nombres_apellido_2, correo, direccion, telefono,facebook, ciudad, pais});
        }
        this.panelClientes.jTable1.setModel(model);

    }
    private void mensaje(String msg){
        Emergente_Aviso mi_mensaje = new  Emergente_Aviso(ventanaAdmin,true,msg);
        mi_mensaje.setVisible(true);
    }

        @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.panelClientes.btnClienteBuscar) {// boton buscar
            String referencia = panelClientes.txfBuscar.getText();
            buscarClientes(referencia);
        } else if (ae.getSource() == this.panelClientes.jButton9) {//boton agregar
            Thread hilo = new Thread(){
                    @Override
                    public void run() {
                        Agregar();
                        mensaje("OPERACION REALIZADA");
                        return ;
                    }
                };
            hilo.start();
            
        } else if (ae.getSource() == this.panelClientes.jButton10) {// boton modificar
            Thread hilo = new Thread(){
                    @Override
                    public void run() {
                        Modificar();
                        return ;
                    }
                };
            hilo.start();
            
        }else if (ae.getSource() == this.panelClientes.jButton11) {// boton eliminar
            Thread hilo = new Thread(){
                    @Override
                    public void run() {
                        Eliminar();
                        return ;
                    }
                };
            hilo.start();
            
            
        }else if (ae.getSource() == this.panelClientes.jButton13) {
                Thread hilo = new Thread(){
                    @Override
                    public void run() {
                        Consultas_Clientes consulta = new Consultas_Clientes();
                        clientes = consulta.readAll();
                        llenarTabla(clientes);
                        return ;
                    }
                };
            hilo.start();
            
            
            
        }else if(ae.getSource() == this.panelClientes.jButton12){
            exportar(this.panelClientes.jTable1);
        } 
    }
    
}
