package controlador;

import static controlador.Controlador_login.lista_clientes;
import static controlador.Controlador_login.lista_ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.Consultas_Clientes;
import modelo.Consultas_Ventas;
import modelo.Linked_List;
import modelo.Modelo_Ventas;
import vista.Emergente_Aviso;
import vista.Panel_Registros_Ventas;
import vista.Ventana_Admin;

public class Controlador_Registros_Ventas implements ActionListener{
    
    private Linked_List<Modelo_Ventas> listaVentas;
    private final Controlador_admin controladorAdmin;
    private final Ventana_Admin ventanaAdmin;
    private final Panel_Registros_Ventas panelVentas;

    public Controlador_Registros_Ventas(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin, Panel_Registros_Ventas panelVentas) {
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
        this.panelVentas = panelVentas;
        this.initComp();
        this.callComp();
        this.updateComp();
    }

    private void initComp(){
       this.listaVentas  = lista_ventas;
    }
    
    private void callComp(){
        
    }
    
    private void updateComp(){
        fillTable();
    }
    
    private void fillTable(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID DE VENTA" , 
            "ID PRODUCTO ", "ID VENDEDOR", "ID CLIENTE", "FECHA", "HORA", "MONTO INICIAL",
            "DESCUENTO", "CUOTAS","CANTIDAD","MONTO UNITARIO","MONTO TOTAL"}, 0) {
            
            @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    case 0: return false;
                    case 1: return false;
                    case 2: return false;
                    case 3: return false;
                    default:return true;
                }
            }
        };
        for (int i = 0; i < listaVentas.size(); i++) {
            
            Integer id_venta = ((Modelo_Ventas)listaVentas.get(i)).getId();
            String id_producto = ((Modelo_Ventas) listaVentas.get(i)).getId_prod();
            Integer id_trabajador = ((Modelo_Ventas) listaVentas.get(i)).getId_trabajador();
            Integer id_cliente = ((Modelo_Ventas) listaVentas.get(i)).getId_cliente();
            String fecha_hora = ((Modelo_Ventas) listaVentas.get(i)).getFecha_hora();
            Float monto_inicial = ((Modelo_Ventas) listaVentas.get(i)).getMonto_inicial();
            Integer dscto =((Modelo_Ventas) listaVentas.get(i)).getDscto();
            Integer cuotas = ((Modelo_Ventas) listaVentas.get(i)).getCuotas();
            Integer cantidad = ((Modelo_Ventas) listaVentas.get(i)).getCantidad();
            Float monto_total = ((Modelo_Ventas) listaVentas.get(i)).getTotal();
            Float monto_unitario = monto_total/cantidad;
            
            String fecha = fecha_hora.substring(0,2)+"/"+fecha_hora.substring(2,4)+"/"+fecha_hora.substring(4, 8);
            String hora = fecha_hora.substring(9,11)+":"+fecha_hora.substring(11,13)+":"+fecha_hora.substring(13, 15);
            
            model.addRow(new Object[]{id_venta, id_producto , id_trabajador, id_cliente, fecha,
                hora, monto_inicial,dscto, cuotas, cantidad, monto_unitario ,monto_total});
        }
        panelVentas.jTable1.setModel(model);
        
        //CONFIGURACION DE TABLA
        JTableHeader jtableHeader = new JTableHeader();
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) panelVentas.jTable1.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        jtableHeader.setDefaultRenderer(render);
        
        DefaultTableCellRenderer tcrCenter = new DefaultTableCellRenderer();
        tcrCenter.setHorizontalAlignment(SwingConstants.CENTER);
        panelVentas.jTable1.getColumnModel().getColumn(4).setCellRenderer(tcrCenter);
        panelVentas.jTable1.getColumnModel().getColumn(5).setCellRenderer(tcrCenter);
        panelVentas.jTable1.getColumnModel().getColumn(7).setCellRenderer(tcrCenter);
        panelVentas.jTable1.getColumnModel().getColumn(8).setCellRenderer(tcrCenter);
        panelVentas.jTable1.getColumnModel().getColumn(9).setCellRenderer(tcrCenter);
        
        DefaultTableCellRenderer tcrRight = new DefaultTableCellRenderer();
        tcrRight.setHorizontalAlignment(SwingConstants.RIGHT);
        panelVentas.jTable1.getColumnModel().getColumn(6).setCellRenderer(tcrRight);
        panelVentas.jTable1.getColumnModel().getColumn(10).setCellRenderer(tcrRight);
        panelVentas.jTable1.getColumnModel().getColumn(11).setCellRenderer(tcrRight);
    }
    
    private void buscar(String referencia){
        
    }
    
    private void agregar(){
        
    }
    
    private void modificar(){
        if (this.panelVentas.jTable1.getSelectionModel().isSelectionEmpty() == false) {
            if (this.panelVentas.jTable1.isEditing()) {
                this.panelVentas.jTable1.getCellEditor().stopCellEditing();
                Integer id_venta = (Integer)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0);
                String id_producto = (String)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0);
                Integer id_trabajador = (Integer)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0);
                Integer id_cliente = (Integer)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0);
                String fecha = (String)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0);
                String hora = (String)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0);
                Float monto_inicial = (Float)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0);
                Integer dscto =(Integer)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0);
                Integer cuotas = (Integer)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0);
                Integer cantidad = (Integer)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0);
                Float monto_total = (Float)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0);
                String fecha_hora = fecha.substring(0,2)+fecha.substring(3,5)+fecha.substring(6,9)+
                        "_"+hora.substring(0, 2)+hora.substring(3,5)+hora.substring(6, 8);
                Modelo_Ventas venta_temp = new Modelo_Ventas();
                venta_temp.setId(id_venta);
                venta_temp.setId_factura("0");
                venta_temp.setId_trabajador(id_trabajador);
                venta_temp.setId_cliente(id_cliente);
                venta_temp.setFecha_hora(fecha_hora);
                venta_temp.setMonto_inicial(monto_inicial );
                venta_temp.setDscto(dscto);
                venta_temp.setCuotas(cuotas);
                venta_temp.setCantidad(cantidad );
                venta_temp.setTotal(monto_total);
                
                Consultas_Ventas consultas = new Consultas_Ventas();
                if (consultas.update(venta_temp)) {
                    int index = (lista_ventas.findIdVentas(lista_ventas, id_venta));
                    lista_ventas.remove(index);
                    lista_ventas.add(index, venta_temp);
                    fillTable();
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Se actualizo el registro");
                    mensaje.setVisible(true);
                }else{
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo actualizar el registro");
                    mensaje.setVisible(true);
                }
            }
        }
    }
    
    private void eliminar(){
        
    }
    
    private void mensaje(String msg){
        Emergente_Aviso mi_mensaje = new  Emergente_Aviso(ventanaAdmin,true,msg);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
