package controlador;

import static controlador.Controlador_login.lista_vehiculos;
import static controlador.Controlador_login.lista_ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.Consultas_Inventario_Vehiculos;
import modelo.Consultas_Ventas;
import modelo.Exporter;
import modelo.Linked_List;
import modelo.Modelo_Almacen;
import modelo.Modelo_Ventas;
import vista.Emergente_Aviso;
import vista.Emergente_Panel_RVentas;
import vista.Panel_Registros_Ventas;
import vista.Ventana_Admin;

public class Controlador_Registros_Ventas_old implements ActionListener{
    
    private Linked_List<Modelo_Ventas> listaVentas;
    private final Controlador_admin controladorAdmin;
    private final Ventana_Admin ventanaAdmin;
    private final Panel_Registros_Ventas panelVentas;

    public Controlador_Registros_Ventas_old(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin, Panel_Registros_Ventas panelVentas) {
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
        panelVentas.jButton9.addActionListener(this);
        panelVentas.jButton10.addActionListener(this);
        panelVentas.jButton11.addActionListener(this);
        panelVentas.jButton12.addActionListener(this);
        panelVentas.jButton13.addActionListener(this);
        panelVentas.btnClienteBuscar.addActionListener(this);
    }
    
    private void updateComp(){
        fillTable(listaVentas);
    }
    
    private void fillTable(Linked_List<Modelo_Ventas> listaVentas){
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID DE VENTA" , 
            "ID PRODUCTO","DESCRIPCION", "ID TRABAJADOR", "ID CLIENTE", "FECHA", "HORA", "MONTO INICIAL",
            "DESCUENTO", "CUOTAS","CANTIDAD","MONTO UNITARIO","MONTO TOTAL"}, 0) {
            
            @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    case 0: return false;
                    case 1: return false;
                    case 2: return false;
                    case 3: return false;
                    case 4: return false;
                    default:return true;
                }
            }
        };
        for (int i = 0; i < listaVentas.size(); i++) {
            
            Integer id_venta = ((Modelo_Ventas)listaVentas.get(i)).getId();
            String id_producto = ((Modelo_Ventas) listaVentas.get(i)).getId_prod();
            String descripcion = lista_vehiculos.findIdProductoxID(lista_vehiculos, id_producto).getNombre_prod();
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
            
            model.addRow(new Object[]{id_venta, id_producto,descripcion , id_trabajador, id_cliente, fecha,
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
        panelVentas.jTable1.getColumnModel().getColumn(5).setCellRenderer(tcrCenter);
        panelVentas.jTable1.getColumnModel().getColumn(6).setCellRenderer(tcrCenter);
        panelVentas.jTable1.getColumnModel().getColumn(8).setCellRenderer(tcrCenter);
        panelVentas.jTable1.getColumnModel().getColumn(9).setCellRenderer(tcrCenter);
        panelVentas.jTable1.getColumnModel().getColumn(10).setCellRenderer(tcrCenter);
        
        DefaultTableCellRenderer tcrRight = new DefaultTableCellRenderer();
        tcrRight.setHorizontalAlignment(SwingConstants.RIGHT);
        panelVentas.jTable1.getColumnModel().getColumn(7).setCellRenderer(tcrRight);
        panelVentas.jTable1.getColumnModel().getColumn(11).setCellRenderer(tcrRight);
        panelVentas.jTable1.getColumnModel().getColumn(12).setCellRenderer(tcrRight);
        
        panelVentas.jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        panelVentas.jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        panelVentas.jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        panelVentas.jTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
    }
    
    private void buscar(String referencia,int caso){
        String buscar ;
        Linked_List<Modelo_Ventas> listaBusqueda ;
        switch(caso){
            case 1:{
                listaBusqueda  = new Linked_List<Modelo_Ventas>();
                int tamanho = lista_ventas.size();
                for(int i = 0 ;i<tamanho;i++){
                   buscar = ((Modelo_Ventas)lista_ventas.get(i)).getId_prod();
                   String[] palabras = referencia.split("\\s+");
                    for (String palabra : palabras) {
                        if (buscar.contains(palabra)) {
                            listaBusqueda.add(lista_ventas.get(i));
                        }
                    }
                }
                if(listaBusqueda.size()>0){
                    fillTable(listaBusqueda);
                }else{
                    mensaje("NO SE ENCONTRARON COINCIDENCIAS");
                    fillTable(lista_ventas);
                    
                }
                break;
            }
      
            case 2:{
                listaBusqueda  = new Linked_List<Modelo_Ventas>();
                int tamanho = lista_ventas.size();
                for(int i = 0 ;i<tamanho;i++){
                   buscar = String.valueOf(((Modelo_Ventas)lista_ventas.get(i)).getId_trabajador());
                   String[] palabras = referencia.split("\\s+");
                    for (String palabra : palabras) {
                        if (buscar.contains(palabra)) {
                            listaBusqueda.add(lista_ventas.get(i));
                        }
                    }
                }
                if(listaBusqueda.size()>0){
                    fillTable(listaBusqueda);
                }else{
                    mensaje("NO SE ENCONTRARON COINCIDENCIAS");
                    fillTable(lista_ventas);
                    
                }
                break;
            }
            case 3:{
                listaBusqueda  = new Linked_List<Modelo_Ventas>();
                int tamanho = lista_ventas.size();
                for(int i = 0 ;i<tamanho;i++){
                   buscar = String.valueOf(((Modelo_Ventas)lista_ventas.get(i)).getId_cliente());
                   String[] palabras = referencia.split("\\s+");
                    for (String palabra : palabras) {
                        if (buscar.contains(palabra)) {
                            listaBusqueda.add(lista_ventas.get(i));
                        }
                    }
                }
                if(listaBusqueda.size()>0){
                    fillTable(listaBusqueda);
                }else{
                    mensaje("NO SE ENCONTRARON COINCIDENCIAS");
                    fillTable(lista_ventas);
                    
                }
                break;
            }
            case 4:{
                listaBusqueda  = new Linked_List<Modelo_Ventas>();
                int tamanho = lista_ventas.size();
                for(int i = 0 ;i<tamanho;i++){
                   buscar = String.valueOf(((Modelo_Ventas)lista_ventas.get(i)).getId_prod());
                   if(lista_vehiculos.findIdProductoxDescripcion(lista_vehiculos,referencia)!=null){
                    String ref = (lista_vehiculos.findIdProductoxDescripcion(lista_vehiculos,referencia)).getId();
                    String[] palabras = ref.split("\\s+");
                        for (String palabra : palabras) {
                            if (buscar.contains(palabra)) {
                            listaBusqueda.add(lista_ventas.get(i));
                        }
                        }
                   }
                }
                if(listaBusqueda.size()>0){
                    fillTable(listaBusqueda);
                }else{
                    mensaje("NO SE ENCONTRARON COINCIDENCIAS");
                    fillTable(lista_ventas);
                    
                }
                break;
            }
            default:{
                fillTable(lista_ventas);
                break;
            }
        }
    }
    
    private boolean agregar(){
        Emergente_Panel_RVentas panelAdd = new Emergente_Panel_RVentas(ventanaAdmin,true);
        panelAdd.setVisible(true);
        if(panelAdd.ventas!=null){
            String id_producto = panelAdd.ventas.get(0);
            Integer id_trabajador = Integer.valueOf(panelAdd.ventas.get(1));
            Integer id_cliente = Integer.valueOf(panelAdd.ventas.get(2));;
            String fecha_hora = panelAdd.ventas.get(3)+"_"+panelAdd.ventas.get(4);
            Float monto_inicial = Float.valueOf(panelAdd.ventas.get(5));
            Integer dscto = Integer.valueOf(panelAdd.ventas.get(6));
            Integer cuotas = Integer.valueOf(panelAdd.ventas.get(7));
            Integer cantidad = Integer.valueOf(panelAdd.ventas.get(8));
            Float monto_total = Float.valueOf(panelAdd.ventas.get(9))/cantidad;
            
            Modelo_Ventas venta_temp = new Modelo_Ventas();
            venta_temp.setId_factura("0");
            venta_temp.setId_prod(id_producto);
            venta_temp.setId_trabajador(id_trabajador);
            venta_temp.setId_cliente(id_cliente);
            venta_temp.setFecha_hora(fecha_hora);
            venta_temp.setMonto_inicial(monto_inicial );
            venta_temp.setDscto(dscto);
            venta_temp.setCuotas(cuotas);
            venta_temp.setCantidad(cantidad );
            venta_temp.setTotal(monto_total);
            
            Consultas_Ventas consultas = new Consultas_Ventas();
            if (consultas.create(venta_temp)) {
                    lista_ventas.add(venta_temp);
                    fillTable(listaVentas);
            }
            return true;
        }else{
            return false;
        }
    }
    
    private boolean modificar(){
        boolean state = false;
        if (this.panelVentas.jTable1.getSelectionModel().isSelectionEmpty() == false) {
            if (this.panelVentas.jTable1.isEditing()) {
                this.panelVentas.jTable1.getCellEditor().stopCellEditing();
                Integer id_venta = Integer.valueOf(this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 0).toString());
                String id_producto = (String)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 1);
                Integer id_trabajador = Integer.valueOf(this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 3).toString());
                Integer id_cliente = Integer.valueOf(this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 4).toString());
                String fecha = (String)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 5);
                String hora = (String)this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 6);
                Float monto_inicial = Float.valueOf(this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 7).toString());
                Integer dscto =Integer.valueOf(this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 8).toString());
                Integer cuotas = Integer.valueOf(this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 9).toString());
                Integer cantidad = Integer.valueOf(this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 11).toString());
                Float monto_total = Float.valueOf(this.panelVentas.jTable1.getValueAt(this.panelVentas.jTable1.getSelectedRow(), 12).toString());
                String fecha_hora = fecha.substring(0,2)+fecha.substring(3,5)+fecha.substring(6,10)+
                        "_"+hora.substring(0, 2)+hora.substring(3,5)+hora.substring(6, 8);
                
                if(fecha.length()!=10 || !fecha.substring(2,3).equals("/") ||!fecha.substring(5,6).equals("/")){
                    return state;
                }else if(hora.length()!=8 || !hora.substring(2,3).equals(":") ||!hora.substring(5,6).equals(":")){
                    return state;
                }
                
                
                Modelo_Ventas venta_temp = new Modelo_Ventas();
                venta_temp.setId(id_venta);
                venta_temp.setId_factura("0");
                venta_temp.setId_prod(id_producto);
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
                    fillTable(listaVentas);
                    state = true;
                }else{
                    state =  false;
                }
            }
        }
        return state;
    }
    
    private boolean eliminar(){
        boolean state = false;
        if (panelVentas.jTable1.getSelectionModel().isSelectionEmpty() == false) {
        int temp_id = Integer.parseInt( panelVentas.jTable1.getValueAt(panelVentas.jTable1.getSelectedRow(), 0).toString());
        String id_producto = panelVentas.jTable1.getValueAt(panelVentas.jTable1.getSelectedRow(), 1).toString();
        int cantidad = Integer.parseInt( panelVentas.jTable1.getValueAt(panelVentas.jTable1.getSelectedRow(), 10).toString());
        int index = lista_ventas.findIdVentas(lista_ventas, temp_id);
        Modelo_Ventas temp_model = new Modelo_Ventas();
        temp_model.setId(((Modelo_Ventas) lista_ventas.get(index)).getId()); 
        Consultas_Ventas cv = new Consultas_Ventas();
        Consultas_Inventario_Vehiculos civ = new Consultas_Inventario_Vehiculos();
            if (cv.delete(temp_model)) {
                lista_ventas.remove(index);
                fillTable(listaVentas);
                Modelo_Almacen miv = lista_vehiculos.findIdProductoxID(lista_vehiculos, id_producto);
                miv.setCantidad(miv.getCantidad()+cantidad);
                civ.update(miv);
                int index_vehiculo = lista_vehiculos.findIdProductoIndex(lista_vehiculos, miv);
                lista_vehiculos.remove(index_vehiculo);
                lista_vehiculos.add(index_vehiculo, miv);
                
                
                state = true;
            }else{
                state = false;
            }
        }
        return state;
    }
    
    private void mensaje(String msg){
        Emergente_Aviso mi_mensaje = new  Emergente_Aviso(ventanaAdmin,true,msg);
        mi_mensaje.setVisible(true);
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
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==panelVentas.btnClienteBuscar){
            if(panelVentas.jRadioButton1.isSelected()){
                buscar(panelVentas.txfBuscar.getText(),1);
            }else if(panelVentas.jRadioButton2.isSelected()){
                buscar(panelVentas.txfBuscar.getText(),2);
            }else if(panelVentas.jRadioButton3.isSelected()){
                buscar(panelVentas.txfBuscar.getText(),3);
            }else if(panelVentas.jRadioButton4.isSelected()){
                buscar(panelVentas.txfBuscar.getText(),4);
            }
            
        }else if(ae.getSource()==panelVentas.jButton9){
            Thread hilo = new Thread(){
                @Override
                public void run() {
                   if(agregar()) mensaje("OPERACION REALIZADA");
                   else mensaje("OPERACION FALLIDA");
                    return ;
                }
            };
            hilo.start();
        }else if(ae.getSource()==panelVentas.jButton10){
            Thread hilo = new Thread(){
                @Override
                public void run() {
                   if(modificar()) mensaje("OPERACION REALIZADA");
                   else mensaje("OPERACION FALLIDA");
                    return ;
                }
            };
            hilo.start();
        }else if(ae.getSource()==panelVentas.jButton11){
            Thread hilo = new Thread(){
                @Override
                public void run() {
                   if(eliminar()) mensaje("OPERACION REALIZADA");
                   else mensaje("OPERACION FALLIDA");
                    return ;
                }
            };
            hilo.start();
        }else if(ae.getSource()==panelVentas.jButton12){
            exportar(panelVentas.jTable1);
        }else if(ae.getSource()==panelVentas.jButton13){
            Thread hilo = new Thread(){
                @Override
                public void run() {
                    Consultas_Ventas consulta = new Consultas_Ventas();
                    listaVentas = consulta.readAll();
                    fillTable(listaVentas);
                    mensaje("OPERACION REALIZADA");
                   
                    return ;
                }
            };
            hilo.start();
        }
            
    }
    
}
