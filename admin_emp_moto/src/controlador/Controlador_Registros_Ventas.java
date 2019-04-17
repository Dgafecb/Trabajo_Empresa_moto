package controlador;

import static controlador.Controlador_login.lista_ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
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
            "DESCUENTO", "CUOTAS","CANTIDAD","MONTO TOTAL"}, 0) {
            
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
            
            String fecha = fecha_hora.substring(0,2)+"/"+fecha_hora.substring(2,4)+"/"+fecha_hora.substring(4, 8);
            String hora = fecha_hora.substring(9,11)+":"+fecha_hora.substring(11,13)+":"+fecha_hora.substring(13, 15);
            
            model.addRow(new Object[]{id_venta, id_producto , id_trabajador, id_cliente, fecha, hora, monto_inicial,dscto, cuotas, cantidad, monto_total});
        }
        panelVentas.jTable1.setModel(model);
    }
    
    private void buscar(String referencia){
        
    }
    
    private void agregar(){
        
    }
    
    private void modificar(){
        
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
