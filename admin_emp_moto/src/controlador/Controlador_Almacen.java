package controlador;

import static controlador.Controlador_login.lista_repuestos;
import static controlador.Controlador_login.lista_vehiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import modelo.Linked_List;
import modelo.Modelo_Inventario_Repuestos;
import modelo.Modelo_Inventario_Vehiculos;
import vista.Emergente_Panel;
import vista.Panel_Inventario;
import vista.Ventana_Admin;


public class Controlador_Almacen implements ActionListener {

    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Inventario panelInventario;
    private Linked_List<Modelo_Inventario_Vehiculos> vehiculos;
    private Linked_List<Modelo_Inventario_Repuestos> repuestos;
    
    public Controlador_Almacen(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin){
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();
    }
    private void iniciarComponentes(){
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelInventario = controladorAdmin.getPanelInventario();
        vehiculos = lista_vehiculos;
        repuestos = lista_repuestos;
    }
    private void llamarComponentes(){
        this.panelInventario.btnAgregar.addActionListener(this);
        this.llenarTablaAlmacen();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.panelInventario.btnAgregar) {
            Emergente_Panel panel = new Emergente_Panel(ventanaAdmin, true);
            panel.setVisible(true);
            LinkedList<String> listaAgregar = panel.inventario;
            if(listaAgregar.isEmpty()){// caso que presiono cancelar


            }
            else{


            }


        }
    }
        private void llenarTablaAlmacen() {
            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Categoría", "Descripción", "Cantidad", "Precio", "Marca", "Modelo", "Color", "Motor", "Chasis", "Año de Fabricación",
            "Años de Garantía", "Cantidad Crítica"}, 0);
        for (int i = 0; i < lista_vehiculos.size(); i++) {
            int id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getId();
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