
package vista;

import static controlador.Controlador_login.lista_clientes;
import static controlador.Controlador_login.lista_trabajadores;
import static controlador.Controlador_login.lista_vehiculos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.CustomRenderAlmacen;
import modelo.Modelo_Almacen;
import modelo.Modelo_Clientes;
import modelo.Modelo_Trabajadores;
import modelo.Modelo_Ventas;


public class Emergente_Detalle_Ventas extends javax.swing.JDialog {

    
    public Borde_Ventana bordeVentana;
    private LinkedList<Modelo_Ventas> lista;
    private Panel_Detalle_Ventas panel ;
    private Dimension res = new Dimension (600,600);
    
    public Emergente_Detalle_Ventas(java.awt.Frame parent, boolean modal, LinkedList<Modelo_Ventas> lista) {
        super(parent, modal);
        this.lista = lista;
        initDialog();
        initPanel();
        
    }
    
    private void initDialog(){
        setMinimumSize(new Dimension(res));
        setMaximumSize(new Dimension(res));
        setSize(new Dimension(res));
        setPreferredSize(res);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        setBackground(new Color(250,250,250));
        getContentPane().setBackground(new Color(250,250,250));
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,60,60)));
        getContentPane().setLayout(new BorderLayout(0,0));
        
        panel = new Panel_Detalle_Ventas();
        bordeVentana = new Borde_Ventana(this);
        bordeVentana.moverVentana(true);
        
        getContentPane().add(bordeVentana, BorderLayout.NORTH);
        getContentPane().add(panel, BorderLayout.CENTER);
        
        
    }
    
    private void initPanel(){
        if(lista!=null){
            Integer id_trabajador = lista.get(0).getId_trabajador();
            Integer index_id_trabajador = lista_trabajadores.findIndexTrabajador(lista_trabajadores, id_trabajador);
            String trabajador = null;
            if(index_id_trabajador!=-1){
                trabajador = ((Modelo_Trabajadores)lista_trabajadores.get(index_id_trabajador)).getNombre()+
                    " "+((Modelo_Trabajadores)lista_trabajadores.get(index_id_trabajador)).getApellido();
            }else{
                trabajador = String.valueOf(id_trabajador);
            }
            
            Integer id_cliente = lista.get(0).getId_cliente();
            Integer index_id_cliente = lista_clientes.findindexCliente(lista_clientes,id_cliente);
            String Cliente1 = null;
            String Cliente2 = null;
            if(index_id_cliente!=-1){
                Cliente1 = ((Modelo_Clientes)lista_clientes.get(index_id_cliente)).getNombre_apellido();
                Cliente2 = ((Modelo_Clientes)lista_clientes.get(index_id_cliente)).getNombre_apellido_2();
            }else{
                Cliente1 = String.valueOf(id_cliente);
                Cliente2 = "NO ENCONTRADO";
            }
            
            Double total = 0.00;
            for(int i=0;i<lista.size();i++){
                total += lista.get(i).getTotal();
            }
            
            
            String id_venta = lista.get(0).getId_factura();
            
            panel.lblID.setText("#"+id_venta);
            panel.lblVendedor.setText(trabajador);
            panel.lblCliente1.setText(Cliente1);
            panel.lblCliente2.setText(Cliente2);
            panel.lblTotal.setText(String.valueOf(total));
            fillTable(lista);
        }
    }

    private void fillTable(LinkedList<Modelo_Ventas> lista){
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Producto", "Cant.","Total"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    default:
                        return false;
                }
            }
        };
        for (int i = 0; i < lista.size(); i++) {
            String id = ((Modelo_Ventas) lista.get(i)).getId_prod();
            Integer cantidad = ((Modelo_Ventas) lista.get(i)).getCantidad();
            String producto = null;
            float total = ((Modelo_Ventas) lista.get(i)).getTotal();
            int index  = lista_vehiculos.findIndexAlmacen(lista_vehiculos, id);
            if(index !=-1){
                Modelo_Almacen almacen = (Modelo_Almacen) lista_vehiculos.get(index);
                producto  = almacen.getTipo_vehiculo()+" x "+almacen.getNombre_prod();
            }else{
                producto = "NO DISPONIBLE";
            }
            model.addRow(new Object[]{id,producto,cantidad,total});
        }
        panel.jTable1.setModel(model);
        //CONFIGURACION DE TABLA
        JTableHeader jtableHeader = new JTableHeader();
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) panel.jTable1.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        jtableHeader.setDefaultRenderer(render);

        DefaultTableCellRenderer tcrCenter = new DefaultTableCellRenderer();
        tcrCenter.setHorizontalAlignment(SwingConstants.CENTER);
        panel.jTable1.getColumnModel().getColumn(0).setCellRenderer(tcrCenter);
        panel.jTable1.getColumnModel().getColumn(2).setCellRenderer(tcrCenter);
        panel.jTable1.getColumnModel().getColumn(3).setCellRenderer(tcrCenter);

        panel.jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
        panel.jTable1.getColumnModel().getColumn(0).setMinWidth(80);
        panel.jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(80);
        panel.jTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(80);
        
        
        panel.jTable1.getColumnModel().getColumn(2).setMaxWidth(50);
        panel.jTable1.getColumnModel().getColumn(2).setMinWidth(50);
        panel.jTable1.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(50);
        panel.jTable1.getTableHeader().getColumnModel().getColumn(2).setMinWidth(50);
        
        panel.jTable1.getColumnModel().getColumn(3).setMaxWidth(100);
        panel.jTable1.getColumnModel().getColumn(3).setMinWidth(100);
        panel.jTable1.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(100);
        panel.jTable1.getTableHeader().getColumnModel().getColumn(3).setMinWidth(100);

        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
