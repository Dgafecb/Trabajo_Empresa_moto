package controlador;

import static controlador.Controlador_login.lista_vehiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Consultas_Inventario_Vehiculos;
import modelo.CustomRenderAsistencia;
import modelo.Exporter;
import modelo.Linked_List;
import modelo.Linked_List.InventarioTEMP;
import modelo.Modelo_Inventario_Repuestos;
import modelo.Modelo_Inventario_Vehiculos;
import vista.Emergente_Aviso;
import vista.Emergente_Panel_Almacen;
import vista.Panel_Inventario;
import vista.Ventana_Admin;

public class Controlador_Almacen implements ActionListener {

    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Inventario panelInventario;
    private Linked_List<Modelo_Inventario_Vehiculos> vehiculos;
    private Linked_List<Modelo_Inventario_Repuestos> repuestos;

    public Controlador_Almacen(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin) {
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();
    }

    private void iniciarComponentes() {
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelInventario = controladorAdmin.getPanelInventario();
        vehiculos = lista_vehiculos;
    }

    private void llamarComponentes() {
        this.panelInventario.btnAgregar.addActionListener(this);
        this.panelInventario.bntEliminar.addActionListener(this);
        this.panelInventario.btnBuscar.addActionListener(this);
        this.panelInventario.btnModificar.addActionListener(this);
        this.panelInventario.btnupdate.addActionListener(this);
        this.panelInventario.btnExportar.addActionListener(this);
        this.llenarTablaAlmacen(lista_vehiculos);
    }
    
    private void buscarAlmacen(String referencia, int numero) {

        String buscar;
        Linked_List<Modelo_Inventario_Vehiculos> listaBusqueda;
        switch (numero) {
            case 1: {
                listaBusqueda = new Linked_List<Modelo_Inventario_Vehiculos>();
                int tamanho = lista_vehiculos.size();
                for (int i = 0; i < tamanho; i++) {
                    int tamanhoRef = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getId().length() + 1;
                    String palabra = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getId();
                    for (int j = 1; j < tamanhoRef; j++) {
                        if (referencia.equalsIgnoreCase(palabra)) {
                            // BUSQUEDA PERFECTA CODIGO AQUI
                            listaBusqueda.add(lista_vehiculos.get(i));
                            break;
                        } else if (referencia.equalsIgnoreCase(palabra.substring(0, j))) {
                            listaBusqueda.add(lista_vehiculos.get(i));
                            break;
                        }
                    }
                }
                if (listaBusqueda.size() > 0) {
                    llenarTablaAlmacen(listaBusqueda);
                    panelInventario.jTable1.setRowSelectionInterval(0, 0);
                } else {
                    mensaje("NO SE ENCONTRARON COINCIDENCIAS");
                    panelInventario.txfBuscar.setText("");
                    panelInventario.jTable1.clearSelection();
                    llenarTablaAlmacen(lista_vehiculos);
                }
                if (referencia.equals("")) {
                    this.panelInventario.jTable1.clearSelection();
                }
                break;
            }
            case 2: {
                listaBusqueda = new Linked_List<Modelo_Inventario_Vehiculos>();
                int tamanho = lista_vehiculos.size();
                for (int i = 0; i < tamanho; i++) {
                    buscar = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getNombre_prod();
                    String[] palabras = referencia.split("\\s+");
                    for (String palabra : palabras) {
                        if (buscar.contains(palabra)) {
                            listaBusqueda.add(lista_vehiculos.get(i));
                        }
                    }
                }
                if (listaBusqueda.size() > 0) {
                    llenarTablaAlmacen(listaBusqueda);
                    panelInventario.jTable1.setRowSelectionInterval(0, 0);
                } else {
                    mensaje("NO SE ENCONTRARON COINCIDENCIAS");
                    panelInventario.txfBuscar.setText("");
                    panelInventario.jTable1.clearSelection();

                    llenarTablaAlmacen(lista_vehiculos);
                }
                break;
            }
            case 3: {
                listaBusqueda = new Linked_List<Modelo_Inventario_Vehiculos>();
                int tamanho = lista_vehiculos.size();
                for (int i = 0; i < tamanho; i++) {
                    int tamanhoRef = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getMarca().length() + 1;
                    String palabra = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getMarca();
                    for (int j = 1; j < tamanhoRef; j++) {
                        if (referencia.equalsIgnoreCase(palabra)) {
                            // BUSQUEDA PERFECTA CODIGO AQUI
                            listaBusqueda.add(lista_vehiculos.get(i));
                            break;
                        } else if (referencia.equalsIgnoreCase(palabra.substring(0, j))) {
                            listaBusqueda.add(lista_vehiculos.get(i));
                            break;
                        }
                    }
                }
                if (listaBusqueda.size() > 0) {
                    llenarTablaAlmacen(listaBusqueda);
                     panelInventario.jTable1.setRowSelectionInterval(0, 0);
                } else {
                    mensaje("NO SE ENCONTRARON COINCIDENCIAS");
                    panelInventario.txfBuscar.setText("");
                     panelInventario.jTable1.clearSelection();

                    llenarTablaAlmacen(lista_vehiculos);
                }
                break;
            }
            default:
                break;
        }

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
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.panelInventario.btnAgregar) {
            Emergente_Panel_Almacen panel = new Emergente_Panel_Almacen(ventanaAdmin, true);
            panel.setVisible(true);
            LinkedList<String> listaAgregar = panel.inventario;
            if (listaAgregar == null) {// caso que presiono cancelar

            } else {
                String id = listaAgregar.get(0);
                InventarioTEMP busqueda = lista_vehiculos.findIndexId(lista_vehiculos, id);

                if (busqueda.isFunciona()) {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "El ID del artículo ya existe, utilize otro ID o actualize el artículo ");
                    mensaje.setVisible(true);
                } else {

                    String categoria = listaAgregar.get(1);
                    String descripcion = listaAgregar.get(2);
                    int cantidad = Integer.valueOf(listaAgregar.get(10));
                    float precio = Float.valueOf(listaAgregar.get(11));
                    String marca = listaAgregar.get(3);
                    String modelo = listaAgregar.get(4);
                    String color = listaAgregar.get(5);
                    String motor = listaAgregar.get(6);
                    String chasis = listaAgregar.get(7);
                    String anho_fab = listaAgregar.get(8);
                    String anhos_garantia = listaAgregar.get(9);
                    int advertencia = Integer.valueOf(listaAgregar.get(12));
                    Modelo_Inventario_Vehiculos temp_model = new Modelo_Inventario_Vehiculos();
                    temp_model.setAnho_fab(anho_fab);
                    temp_model.setAnhos_garantia(anhos_garantia);
                    temp_model.setCantidad(cantidad);
                    temp_model.setChasis(chasis);
                    temp_model.setColor(color);
                    temp_model.setId(id);
                    temp_model.setLimite_advertencia(advertencia);
                    temp_model.setMarca(marca);
                    temp_model.setModelo(modelo);
                    temp_model.setMotor(motor);
                    temp_model.setNombre_prod(descripcion);
                    temp_model.setPrecio(precio);
                    temp_model.setTipo_vehiculo(categoria);

                    Consultas_Inventario_Vehiculos consultas = new Consultas_Inventario_Vehiculos();
                    if (consultas.create(temp_model)) {
                        lista_vehiculos.add(temp_model);
                        this.llenarTablaAlmacen(lista_vehiculos);
                    } else {
                        Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo agregar al inventario");
                        mensaje.setVisible(true);
                    }
                }

            }

        }

        if (e.getSource()
                == this.panelInventario.bntEliminar) {
            if (this.panelInventario.jTable1.getSelectionModel().isSelectionEmpty() == false) {
                String temp_id = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 0);
                int index = lista_vehiculos.findInventario(lista_vehiculos, temp_id);
                Modelo_Inventario_Vehiculos temp_model = new Modelo_Inventario_Vehiculos();
                temp_model.setId(((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getId());
                Consultas_Inventario_Vehiculos consultas = new Consultas_Inventario_Vehiculos();
                if (consultas.delete(temp_model)) {

                    lista_vehiculos.remove(index);
                    this.llenarTablaAlmacen(lista_vehiculos);
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Se elimino del inventario");
                    mensaje.setVisible(true);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se logro eliminar");
                    mensaje.setVisible(true);
                }

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Seleccione una fila a eliminar");
                mensaje.setVisible(true);

            }

        }

        if (e.getSource() == this.panelInventario.btnModificar) {
            if (this.panelInventario.jTable1.getSelectionModel().isSelectionEmpty() == false) {
                if (this.panelInventario.jTable1.isEditing()) {
                    this.panelInventario.jTable1.getCellEditor().stopCellEditing();
                    String id = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 0);
                    String categoria = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 1);
                    String descripcion = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 2);
                    int cantidad = Integer.valueOf(this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 3).toString());
                    float precio = Float.valueOf(this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 4).toString());
                    String marca = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 5);
                    String modelo = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 6);
                    String color = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 7);
                    String motor = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 8);
                    String chasis = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 9);
                    String anho_fab = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 10);
                    String anhos_garantia = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 11);
                    int advertencia = Integer.valueOf(this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 12).toString());

                    Modelo_Inventario_Vehiculos temp_model = new Modelo_Inventario_Vehiculos();
                    temp_model.setId(id);
                    temp_model.setTipo_vehiculo(categoria);
                    temp_model.setNombre_prod(descripcion);
                    temp_model.setCantidad(cantidad);
                    temp_model.setPrecio(precio);
                    temp_model.setMarca(marca);
                    temp_model.setModelo(modelo);
                    temp_model.setColor(color);
                    temp_model.setMotor(motor);
                    temp_model.setChasis(chasis);
                    temp_model.setAnho_fab(anho_fab);
                    temp_model.setAnhos_garantia(anhos_garantia);
                    temp_model.setLimite_advertencia(advertencia);
                    Consultas_Inventario_Vehiculos consultas = new Consultas_Inventario_Vehiculos();

                    if (consultas.update(temp_model)) {
                        int index = (lista_vehiculos.findIndexId(lista_vehiculos, id).getTemp()).peek();
                        lista_vehiculos.remove(index);
                        lista_vehiculos.add(index, temp_model);
                        this.llenarTablaAlmacen(lista_vehiculos);
                        Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Se actualizo el registro");
                        mensaje.setVisible(true);
                    } else {
                        Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo actualizar el registro");
                        mensaje.setVisible(true);
                    }
                }
            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Seleccione una fila a modificar");
                mensaje.setVisible(true);

            }

        }else if (e.getSource() == this.panelInventario.btnBuscar) {
            if (this.panelInventario.rbId.isSelected()) {// UNICO ID
                buscarAlmacen(panelInventario.txfBuscar.getText(), 1);
            }else if (this.panelInventario.rbDescripcion.isSelected()) { // DESCRIPCION
                buscarAlmacen(panelInventario.txfBuscar.getText(), 2);
            }else if (this.panelInventario.rbMarca.isSelected()) {
                buscarAlmacen(panelInventario.txfBuscar.getText(), 3);
            }
        }else if (e.getSource() == this.panelInventario.btnupdate) {
                Thread hilo = new Thread(){
                    @Override
                    public void run() {
                        Consultas_Inventario_Vehiculos consulta = new Consultas_Inventario_Vehiculos();
                        vehiculos = consulta.readAll();
                         llenarTablaAlmacen(vehiculos);
                        mensaje("OPERACION REALIZADA");
                        return ;
                    }
                };
            hilo.start();
            
        }else if(e.getSource() == this.panelInventario.btnExportar){
            exportar(panelInventario.jTable1);
        } 
        

    }

    private void llenarTablaAlmacen(Linked_List lista_vehiculos) {

        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Categoria", "Descripcion", "Cantidad", "Precio", "Marca", "Modelo", "Color", "Motor", "Chasis", "Año de Fabricacion",
            "Años de Garantia", "Advertencia"}, 0){
            @Override
            public boolean isCellEditable(int row, int column){
                switch (column) {
                    case 0:return false;
                    default:return true;
                    }
                }
            };
        for (int i = 0; i < lista_vehiculos.size(); i++) {
            String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getId();
            String categoria = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getTipo_vehiculo();
            String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getNombre_prod();
            int cantidad = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getCantidad();
            float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getPrecio();
            String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getMarca();
            String modelo = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getModelo();
            String color = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getColor();
            String motor = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getMotor();
            String chasis = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getChasis();
            String anho_fab = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getAnho_fab();
            String anhos_garantia = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getAnhos_garantia();
            int advertencia = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getLimite_advertencia();
            model.addRow(new Object[]{id, categoria, descripcion, cantidad, precio, marca, modelo, color, motor, chasis, anho_fab, anhos_garantia, advertencia});
        }
        
        this.panelInventario.jTable1.setModel(model);
        this.panelInventario.jTable1.setDefaultRenderer (Object.class, new CustomRenderAsistencia());
    }
    
    private void mensaje(String msg) {
        Emergente_Aviso mensajes = new Emergente_Aviso(ventanaAdmin, true, msg);
        mensajes.setVisible(true);
    }
    
    
    
 }

    
    


    