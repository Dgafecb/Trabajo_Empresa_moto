package controlador;

import static controlador.Controlador_login.lista_vehiculos;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import modelo.Consultas_Almacen;
import modelo.CustomRenderAlmacen;
import modelo.Exporter;
import modelo.Linked_List;
import modelo.Linked_List.InventarioTEMP;
import modelo.Modelo_Inventario_Repuestos;
import modelo.Modelo_Almacen;
import vista.Emergente_Aviso;
import vista.Emergente_Panel_Almacen;
import vista.Panel_Inventario;
import vista.Panel_Update;
import vista.Ventana_Admin;
import vista.Ventana_Trabajador;

public class Controlador_Almacen implements ActionListener {

    private Controlador_admin controladorA;
    private Controlador_trabajador controladorT;
    private Ventana_Admin ventanaA;
    private Ventana_Trabajador ventanaT;
    private Panel_Inventario panelInventario;
    private Panel_Update panelUpdate;

    public Controlador_Almacen(Controlador_admin controlador, Ventana_Admin ventana) {
        this.controladorA = controlador;
        this.ventanaA = ventana;
        this.iniciarComponentes();
        this.llamarComponentes();
    }

    public Controlador_Almacen(Controlador_trabajador controlador, Ventana_Trabajador ventana) {
        this.controladorT = controlador;
        this.ventanaT = ventana;
        this.iniciarComponentes();
        this.llamarComponentes();
        
    }

    private void iniciarComponentes() {
        if (controladorA != null) {
            this.panelInventario = controladorA.getPanelInventario();
        } else if (controladorT != null) {
            this.panelInventario = controladorT.panel_almacen;
            panelInventario.btnAgregar.setVisible(true);
            panelInventario.btnModificar.setVisible(false);
            panelInventario.bntEliminar.setVisible(false);
        }
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
        Linked_List<Modelo_Almacen> listaBusqueda;
        switch (numero) {
            case 1: {
                listaBusqueda = new Linked_List<Modelo_Almacen>();
                int tamanho = lista_vehiculos.size();
                for (int i = 0; i < tamanho; i++) {
                    int tamanhoRef = ((Modelo_Almacen) lista_vehiculos.get(i)).getId().length() + 1;
                    String palabra = ((Modelo_Almacen) lista_vehiculos.get(i)).getId();
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
                listaBusqueda = new Linked_List<Modelo_Almacen>();
                int tamanho = lista_vehiculos.size();
                for (int i = 0; i < tamanho; i++) {
                    buscar = ((Modelo_Almacen) lista_vehiculos.get(i)).getNombre_prod();
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
                listaBusqueda = new Linked_List<Modelo_Almacen>();
                int tamanho = lista_vehiculos.size();
                for (int i = 0; i < tamanho; i++) {
                    int tamanhoRef = ((Modelo_Almacen) lista_vehiculos.get(i)).getMarca().length() + 1;
                    String palabra = ((Modelo_Almacen) lista_vehiculos.get(i)).getMarca();
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

    private void exportar(JTable jTable1) {
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
        } else {
            mensaje("NO HAY DATOS PARA EXPORTAR");
        }
    }

    private void Agregar() {
        LinkedList<String> listaAgregar;
        Emergente_Panel_Almacen panel = null;
        if (ventanaA != null) {
            panel = new Emergente_Panel_Almacen(ventanaA, true);
            panel.setVisible(true);
        } else if (ventanaT != null) {
            panel = new Emergente_Panel_Almacen(ventanaT, true);
            panel.setVisible(true);
        }
        listaAgregar = panel.inventario;
        if (listaAgregar == null) {// caso que presiono cancelar

        } else {
            String id = listaAgregar.get(0);
            InventarioTEMP busqueda = lista_vehiculos.findIndexId(lista_vehiculos, id);

            if (busqueda.isFunciona()) {
                mensaje("EL ID DEL ARTICULO YA EXISTE");
            } else {

                String categoria = listaAgregar.get(1);
                String descripcion = listaAgregar.get(2);
                int cantidad = Integer.valueOf(listaAgregar.get(10));
                float precio = Float.valueOf(listaAgregar.get(11));
                float precio_compra = Float.valueOf(listaAgregar.get(13));
                String marca = listaAgregar.get(3);
                String modelo = listaAgregar.get(4);
                String color = listaAgregar.get(5);
                String motor = listaAgregar.get(6);
                String chasis = listaAgregar.get(7);
                String anho_fab = listaAgregar.get(8);
                String anhos_garantia = listaAgregar.get(9);
                int advertencia = Integer.valueOf(listaAgregar.get(12));
                int comision = Integer.valueOf(listaAgregar.get(14));
                int cant_init = cantidad;
                String fecha_ingreso = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime());
                
                Modelo_Almacen temp_model = new Modelo_Almacen();
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
                temp_model.setPrecio_compra(precio_compra);
                temp_model.setComision(comision);
                temp_model.setCant_init(cant_init);
                temp_model.setFecha_ingreso(fecha_ingreso);

                Consultas_Almacen consultas = new Consultas_Almacen();
                if (consultas.create(temp_model)) {
                    lista_vehiculos.add(temp_model);
                    this.llenarTablaAlmacen(lista_vehiculos);
                } else {
                    mensaje("NO SE PUDO AGREGAR AL INVENTARIO");
                }
            }

        }
    }

    private void Modificar() {
        if (this.panelInventario.jTable1.getSelectionModel().isSelectionEmpty() == false) {
            if (this.panelInventario.jTable1.isEditing()) {
                this.panelInventario.jTable1.getCellEditor().stopCellEditing();
                String id = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 0);
                String categoria = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 1);
                String descripcion = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 2);
                String marca = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 3);
                String modelo = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 4);
                String color = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 5);
                String motor = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 6);
                String chasis = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 7);
                String anho_fab = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 8);
                String anhos_garantia = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 9);
                int cantidad = Integer.valueOf(this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 10).toString());
                int advertencia = Integer.valueOf(this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 11).toString());
                float precio = Float.valueOf(this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 13).toString());
                float precio_compra = Float.valueOf(this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 12).toString());
                String pcomision = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 14);
                int comision;
                if (pcomision.endsWith("%")) {
                    comision = Integer.valueOf(pcomision.substring(0, pcomision.length() - 1));
                } else {
                    comision = Integer.valueOf(pcomision);

                }
                Modelo_Almacen temp_model = new Modelo_Almacen();
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
                temp_model.setPrecio_compra(precio_compra);
                temp_model.setComision(comision);
                Consultas_Almacen consultas = new Consultas_Almacen();

                if (consultas.update(temp_model)) {
                    int index = (lista_vehiculos.findIndexId(lista_vehiculos, id).getTemp()).peek();
                    lista_vehiculos.remove(index);
                    lista_vehiculos.add(index, temp_model);
                    this.llenarTablaAlmacen(lista_vehiculos);
                    mensaje("SE ACTUALIZO EL REGISTRO");
                } else {
                    mensaje("NO SE PUDO ACTUALIZAR REGISTRO");
                }
            }
        } else {
            mensaje("SELECCIONE UNA FILA A MODIFICAR");

        }

    }

    private void Eliminar() {
        if (this.panelInventario.jTable1.getSelectionModel().isSelectionEmpty() == false) {
            String temp_id = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 0);
            int index = lista_vehiculos.findInventario(lista_vehiculos, temp_id);
            Modelo_Almacen temp_model = new Modelo_Almacen();
            temp_model.setId(((Modelo_Almacen) lista_vehiculos.get(index)).getId());
            Consultas_Almacen consultas = new Consultas_Almacen();
            if (consultas.delete(temp_model)) {
                lista_vehiculos.remove(index);
                this.llenarTablaAlmacen(lista_vehiculos);
                mensaje("OPERACION REALIZADA CON EXITO");
            } else {
                mensaje("NO SE LOGRO ELIMINAR");
            }
        } else {
            mensaje("SELECCIONE UNA FILA A ELIMINAR");

        }
    }

    private void Update() {
        panelUpdate = new Panel_Update();
        panelInventario.jScrollPane1.setViewportView(panelUpdate);
        Consultas_Almacen consulta = new Consultas_Almacen();
        lista_vehiculos = consulta.readAll();
        llenarTablaAlmacen(lista_vehiculos);
        panelInventario.jScrollPane1.setViewportView(panelInventario.jTable1);
        panelUpdate = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.panelInventario.btnAgregar) {
            this.Agregar();
        } else if (e.getSource() == this.panelInventario.bntEliminar) {
            this.Eliminar();
        } else if (e.getSource() == this.panelInventario.btnModificar) {
            this.Modificar();
        } else if (e.getSource() == this.panelInventario.btnBuscar) {
            if (this.panelInventario.rbId.isSelected()) {// UNICO ID
                buscarAlmacen(panelInventario.txfBuscar.getText().toUpperCase(), 1);
            } else if (this.panelInventario.rbDescripcion.isSelected()) { // DESCRIPCION
                buscarAlmacen(panelInventario.txfBuscar.getText().toUpperCase(), 2);
            } else if (this.panelInventario.rbMarca.isSelected()) {
                buscarAlmacen(panelInventario.txfBuscar.getText().toUpperCase(), 3);
            }
        } else if (e.getSource() == this.panelInventario.btnupdate) {
            Thread hilo = new Thread() {
                @Override
                public void run() {
                    Update();
                    return;
                }
            };
            hilo.start();
        } else if (e.getSource() == this.panelInventario.btnExportar) {
            exportar(panelInventario.jTable1);
        }

    }

    private void llenarTablaAlmacen(Linked_List lista_vehiculos) {
        

        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "CATEGORIA", "DESCRIPCION", "MARCA",
            "MODELO", "COLOR", "MOTOR", "CHASIS", "AÑO DE FAB.",
            "AÑOS DE GARANTIA", "CANTIDAD", "ADVERTENCIA", "PRECIO DE COMP.", "PRECIO DE VENTA", "COMISION"}, 0) {
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
        if (lista_vehiculos != null) {
            for (int i = 0; i < lista_vehiculos.size(); i++) {
                String id = ((Modelo_Almacen) lista_vehiculos.get(i)).getId();
                String categoria = ((Modelo_Almacen) lista_vehiculos.get(i)).getTipo_vehiculo();
                String descripcion = ((Modelo_Almacen) lista_vehiculos.get(i)).getNombre_prod();
                int cantidad = ((Modelo_Almacen) lista_vehiculos.get(i)).getCantidad();
                float precio = ((Modelo_Almacen) lista_vehiculos.get(i)).getPrecio();
                String marca = ((Modelo_Almacen) lista_vehiculos.get(i)).getMarca();
                String modelo = ((Modelo_Almacen) lista_vehiculos.get(i)).getModelo();
                String color = ((Modelo_Almacen) lista_vehiculos.get(i)).getColor();
                String motor = ((Modelo_Almacen) lista_vehiculos.get(i)).getMotor();
                String chasis = ((Modelo_Almacen) lista_vehiculos.get(i)).getChasis();
                String anho_fab = ((Modelo_Almacen) lista_vehiculos.get(i)).getAnho_fab();
                String anhos_garantia = ((Modelo_Almacen) lista_vehiculos.get(i)).getAnhos_garantia();
                int advertencia = ((Modelo_Almacen) lista_vehiculos.get(i)).getLimite_advertencia();
                float precio_compra = ((Modelo_Almacen) lista_vehiculos.get(i)).getPrecio_compra();
                int comision = ((Modelo_Almacen) lista_vehiculos.get(i)).getComision();
                String pcomision = String.valueOf(comision) + "%";
                model.addRow(new Object[]{id, categoria, descripcion, marca, modelo, color, motor, chasis,
                    anho_fab, anhos_garantia, cantidad, advertencia, precio_compra, precio, pcomision});
            }
        }
        
        //this.panelInventario.jTable1.setAutoCreateRowSorter(false);
        
        this.panelInventario.jTable1.setModel(model);

        //CONFIGURACION DE TABLA
        JTableHeader jtableHeader = new JTableHeader();
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) panelInventario.jTable1.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        jtableHeader.setDefaultRenderer(render);

        CustomRenderAlmacen tcrCenter = new CustomRenderAlmacen();
        tcrCenter.setHorizontalAlignment(SwingConstants.CENTER);
        panelInventario.jTable1.getColumnModel().getColumn(1).setCellRenderer(tcrCenter);
        panelInventario.jTable1.getColumnModel().getColumn(8).setCellRenderer(tcrCenter);
        panelInventario.jTable1.getColumnModel().getColumn(9).setCellRenderer(tcrCenter);
        panelInventario.jTable1.getColumnModel().getColumn(10).setCellRenderer(tcrCenter);
        panelInventario.jTable1.getColumnModel().getColumn(11).setCellRenderer(tcrCenter);
        panelInventario.jTable1.getColumnModel().getColumn(14).setCellRenderer(tcrCenter);

        CustomRenderAlmacen tcrRight = new CustomRenderAlmacen();
        tcrRight.setHorizontalAlignment(SwingConstants.RIGHT);
        panelInventario.jTable1.getColumnModel().getColumn(12).setCellRenderer(tcrRight);
        panelInventario.jTable1.getColumnModel().getColumn(13).setCellRenderer(tcrRight);

        if (this.ventanaT != null) {
            panelInventario.jTable1.getColumnModel().getColumn(12).setMaxWidth(0);
            panelInventario.jTable1.getColumnModel().getColumn(12).setMinWidth(0);
            panelInventario.jTable1.getTableHeader().getColumnModel().getColumn(12).setMaxWidth(0);
            panelInventario.jTable1.getTableHeader().getColumnModel().getColumn(12).setMinWidth(0);
        }

        this.panelInventario.jTable1.setDefaultRenderer(Object.class, new CustomRenderAlmacen());
        
        

    }

    private void mensaje(String msg) {
        if (ventanaA != null) {
            Emergente_Aviso mensajes = new Emergente_Aviso(ventanaA, true, msg);
            mensajes.setVisible(true);
        } else if (ventanaT != null) {
            Emergente_Aviso mensajes = new Emergente_Aviso(ventanaT, true, msg);
            mensajes.setVisible(true);
        }
    }

}
