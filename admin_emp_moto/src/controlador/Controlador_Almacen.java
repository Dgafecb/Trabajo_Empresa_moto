package controlador;

import static controlador.Controlador_login.lista_repuestos;
import static controlador.Controlador_login.lista_vehiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Consultas_Inventario_Vehiculos;
import modelo.Linked_List;
import modelo.Linked_List.InventarioTEMP;
import modelo.Modelo_Inventario_Repuestos;
import modelo.Modelo_Inventario_Vehiculos;
import vista.Emergente_Aviso;
import vista.Emergente_Panel;
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
        repuestos = lista_repuestos;
    }

    private void llamarComponentes() {
        this.panelInventario.btnAgregar.addActionListener(this);
        this.panelInventario.bntEliminar.addActionListener(this);
        this.panelInventario.btnBuscar.addActionListener(this);
        this.panelInventario.btnModificar.addActionListener(this);
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controlador_Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.llenarTablaAlmacen();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.panelInventario.btnAgregar) {
            Emergente_Panel panel = new Emergente_Panel(ventanaAdmin, true);
            panel.setVisible(true);
            LinkedList<String> listaAgregar = panel.inventario;
            if (listaAgregar.isEmpty()) {// caso que presiono cancelar

            } else {

                String id = listaAgregar.get(0);
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
                    this.llenarTablaAlmacen();
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo agregar al inventario");
                    mensaje.setVisible(true);
                }
            }

        }
        if (e.getSource() == this.panelInventario.bntEliminar) {
            if (this.panelInventario.jTable1.getSelectionModel().isSelectionEmpty() == false) {
                String temp_id = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 0);
                int index = lista_vehiculos.findInventario(lista_vehiculos, temp_id);
                Modelo_Inventario_Vehiculos temp_model = new Modelo_Inventario_Vehiculos();
                temp_model.setId(((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getId());
                Consultas_Inventario_Vehiculos consultas = new Consultas_Inventario_Vehiculos();
                if (consultas.delete(temp_model)) {

                    lista_vehiculos.remove(index);
                    this.llenarTablaAlmacen();
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Se eliminó del inventario");
                    mensaje.setVisible(true);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se logró eliminar");
                    mensaje.setVisible(true);
                }

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Seleccione una fila a eliminar");
                mensaje.setVisible(true);

            }

        }
        if (e.getSource() == this.panelInventario.btnModificar) {
            if (this.panelInventario.jTable1.getSelectionModel().isSelectionEmpty() == false) {
                String id = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 0);
                String categoria = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 1);
                String descripcion = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 2);
                int cantidad = Integer.valueOf( this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 3).toString());
                float precio = Float.valueOf(this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 4).toString());
                String marca = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 5);
                String modelo = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 6);
                String color = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 7);
                String motor = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 8);
                String chasis = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 9);
                String anho_fab = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 10);
                String anhos_garantia = (String) this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 11);
                int advertencia = Integer.valueOf( this.panelInventario.jTable1.getValueAt(this.panelInventario.jTable1.getSelectedRow(), 12).toString());

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
                    this.llenarTablaAlmacen();
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Se actualizó el registro");
                    mensaje.setVisible(true);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo actualizar el registro");
                    mensaje.setVisible(true);
                }

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Seleccione una fila a modificar");
                mensaje.setVisible(true);

            }

        }
        if (e.getSource() == this.panelInventario.btnBuscar) {
            if (this.panelInventario.rbId.isSelected()) {
                String temp_id = this.panelInventario.txfBuscar.getText();
                InventarioTEMP temp = lista_vehiculos.findIndexId(lista_vehiculos, temp_id);
                if (temp.isFunciona()) {
                    int index = (int) ((temp.getTemp()).peek());

                    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Categoría", "Descripción","Cantidad", "Precio",  "Marca", "Modelo", "Color", "Motor", "Chasis", "Año de Fabricación",
                        "Años de Garantía", "Advertencia"}, 0);
                    String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getId();
                    String categoria = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getTipo_vehiculo();
                    String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getNombre_prod();
                    int cantidad = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getCantidad();
                    float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getPrecio();
                    String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getMarca();
                    String modelo = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getModelo();
                    String color = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getColor();
                    String motor = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getMotor();
                    String chasis = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getChasis();
                    String anho_fab = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getAnho_fab();
                    String anhos_garantia = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getAnhos_garantia();
                    int advertencia = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getLimite_advertencia();

                    model.addRow(new Object[]{id, categoria, descripcion, cantidad, precio, marca, modelo, color, motor, chasis, anho_fab, anhos_garantia, advertencia});

                    this.panelInventario.jTable1.setModel(model);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el articulo con ese ID");
                    mensaje.setVisible(true);
                }
            }
            if (this.panelInventario.rbDescripcion.isSelected()) {
                String temp_id = this.panelInventario.txfBuscar.getText();
                InventarioTEMP temp = lista_vehiculos.findIndexMarca(lista_vehiculos, temp_id);
                if (temp.isFunciona()) {
                    int index = (int) ((temp.getTemp()).peek());

                    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Categoría", "Descripción","Cantidad", "Precio",  "Marca", "Modelo", "Color", "Motor", "Chasis", "Año de Fabricación",
                        "Años de Garantía", "Advertencia"}, 0);
                    String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getId();
                    String categoria = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getTipo_vehiculo();
                    String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getNombre_prod();
                    int cantidad = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getCantidad();
                    float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getPrecio();
                    String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getMarca();
                    String modelo = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getModelo();
                    String color = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getColor();
                    String motor = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getMotor();
                    String chasis = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getChasis();
                    String anho_fab = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getAnho_fab();
                    String anhos_garantia = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getAnhos_garantia();
                    int advertencia = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getLimite_advertencia();

                    model.addRow(new Object[]{id, categoria, descripcion, cantidad, precio, marca, modelo, color, motor, chasis, anho_fab, anhos_garantia, advertencia});

                    this.panelInventario.jTable1.setModel(model);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el articulo con ese ID");
                    mensaje.setVisible(true);
                }
            }
            if (this.panelInventario.rbMarca.isSelected()) {
                String temp_id = this.panelInventario.txfBuscar.getText();
                InventarioTEMP temp = lista_vehiculos.findIndexMarca(lista_vehiculos, temp_id);
                if (temp.isFunciona()) {
                    int index = (int) ((temp.getTemp()).peek());

                    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Categoría", "Descripción", "Cantidad","Precio",  "Marca", "Modelo", "Color", "Motor", "Chasis", "Año de Fabricación",
                        "Años de Garantía", "Advertencia"}, 0);
                    String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getId();
                    String categoria = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getTipo_vehiculo();
                    String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getNombre_prod();
                    int cantidad = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getCantidad();
                    float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getPrecio();
                    String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getMarca();
                    String modelo = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getModelo();
                    String color = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getColor();
                    String motor = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getMotor();
                    String chasis = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getChasis();
                    String anho_fab = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getAnho_fab();
                    String anhos_garantia = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getAnhos_garantia();
                    int advertencia = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getLimite_advertencia();

                    model.addRow(new Object[]{id, categoria, descripcion, cantidad, precio, marca, modelo, color, motor, chasis, anho_fab, anhos_garantia, advertencia});

                    this.panelInventario.jTable1.setModel(model);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el articulo con ese ID");
                    mensaje.setVisible(true);
                }
            }

        }

    }

    private void llenarTablaAlmacen() {
        
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Categoría", "Descripción", "Cantidad","Precio",  "Marca", "Modelo", "Color", "Motor", "Chasis", "Año de Fabricación",
            "Años de Garantía", "Advertencia"}, 0);
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
    }
}
