package controlador;

import static controlador.Controlador_login.lista_ajustes;
import static controlador.Controlador_login.lista_clientes;
import static controlador.Controlador_login.lista_repuestos;
import static controlador.Controlador_login.lista_vehiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Linked_List;
import modelo.Modelo_Ajustes;
import modelo.Modelo_Clientes;
import modelo.Modelo_Inventario_Vehiculos;
import vista.Emergente_Aviso;
import vista.Panel_Ventas;

import vista.Ventana_Admin;

public class Controlador_Ventas implements ActionListener {

    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Ventas panelVentas;

    public Controlador_Ventas(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin) {
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();

    }

    private void iniciarComponentes() {
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelVentas = controladorAdmin.getPanelVentas();

    }

    private void llamarComponentes() {

        /*try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Controlador_Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        this.llenarTablaAlmacen();
        this.panelVentas.btnAlmacenBuscar.addActionListener(this);
        this.panelVentas.tAlmacen.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {

                System.out.println(panelVentas.tAlmacen.getValueAt(panelVentas.tAlmacen.getSelectedRow(), 0).toString());
                String selected_id = (String) panelVentas.tAlmacen.getValueAt(panelVentas.tAlmacen.getSelectedRow(), 0);

                Linked_List.InventarioTEMP temp = lista_vehiculos.findIndexId(lista_vehiculos, selected_id);

                int index = (int) ((temp.getTemp()).peek());

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

                panelVentas.txfMarca.setText(marca);
                panelVentas.txfModelo.setText(modelo);
                panelVentas.txfPrecioUnidad.setText(Float.toString(precio));
                panelVentas.txfProductoID.setText(id);
                panelVentas.txfDescripcion.setText(descripcion);
                panelVentas.txfCategoria.setText(categoria);
                panelVentas.txfAnhoFab.setText(anho_fab);
                panelVentas.txfCantidad.setText(Integer.toString(cantidad));
                String dsctoMayor = ((Modelo_Ajustes) (lista_ajustes.get(5))).getValor();// 
                if (dsctoMayor.endsWith("%")) {
                    dsctoMayor = dsctoMayor.substring(0, dsctoMayor.length() - 1);

                }
                float precioMayor = (Integer.valueOf(dsctoMayor)/100.f)*precio;
                panelVentas.txfPrecioMayor.setText(Float.toString(precioMayor));
            }
        });

    }

    private void llenarTablaAlmacen() {

        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Descripcion", "Marca", "Precio",}, 0);
        for (int i = 0; i < lista_vehiculos.size(); i++) {
            String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getId();

            String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getNombre_prod();

            float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getPrecio();
            String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getMarca();

            model.addRow(new Object[]{id, descripcion, marca, precio});
        }
        this.panelVentas.tAlmacen.setModel(model);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.panelVentas.btnAlmacenBuscar) {//boton buscar del almacen
            if (this.panelVentas.rbCodigo.isSelected()) {// UNICO ID
                String temp_id = this.panelVentas.txfAlmacenBuscar.getText();
                Linked_List.InventarioTEMP temp = lista_vehiculos.findIndexId(lista_vehiculos, temp_id);
                if (temp.isFunciona()) {
                    int index = (int) ((temp.getTemp()).peek());

                    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Descripcion", "Marca", "Precio",}, 0);
                    String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getId();

                    String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getNombre_prod();

                    float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getPrecio();
                    String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getMarca();

                    model.addRow(new Object[]{id, descripcion, marca, precio});

                    this.panelVentas.tAlmacen.setModel(model);

                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el articulo con ese ID");
                    mensaje.setVisible(true);
                }
            }
            if (this.panelVentas.rbDescripcion.isSelected()) { // DESCRIPCION
                String temp_id = this.panelVentas.txfAlmacenBuscar.getText();
                Linked_List.InventarioTEMP temp = lista_vehiculos.findIndexNombre(lista_vehiculos, temp_id);
                if (temp.isFunciona()) {

                    LinkedList<Integer> temp_list = temp.getTemp();
                    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Descripcion", "Marca", "Precio",}, 0);
                    for (int j = 0; j < temp_list.size(); j++) {
                        int i = (int) temp.getTemp().get(j);
                        String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getId();

                        String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getNombre_prod();

                        float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getPrecio();
                        String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getMarca();

                        model.addRow(new Object[]{id, descripcion, marca, precio});

                    }

                    this.panelVentas.tAlmacen.setModel(model);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el articulo con esa descripción");
                    mensaje.setVisible(true);
                }
            }
            if (this.panelVentas.rbMarca.isSelected()) { // MARCA
                String temp_id = this.panelVentas.txfAlmacenBuscar.getText();
                Linked_List.InventarioTEMP temp = lista_vehiculos.findIndexMarca(lista_vehiculos, temp_id);
                if (temp.isFunciona()) {

                    LinkedList<Integer> temp_list = temp.getTemp();
                    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Descripcion", "Marca", "Precio",}, 0);
                    for (int j = 0; j < temp_list.size(); j++) {
                        int i = (int) temp.getTemp().get(j);
                        String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getId();

                        String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getNombre_prod();

                        float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getPrecio();
                        String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getMarca();

                        model.addRow(new Object[]{id, descripcion, marca, precio});

                    }
                    this.panelVentas.tAlmacen.setModel(model);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el articulo con esa marca");
                    mensaje.setVisible(true);
                }
            }

        }

    }
}
