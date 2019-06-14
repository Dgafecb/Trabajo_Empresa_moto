package modelo;

import static controlador.Controlador_login.lista_vehiculos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import vista.Panel_List_Ventas;


public class CustomRendererVentas extends JPanel implements ListCellRenderer<LinkedList<Modelo_Ventas>>{
    
    

    private JList lDetalles;
    
    private Panel_List_Ventas plv;
    
    
    public CustomRendererVentas(){
        this.setLayout(new BorderLayout(5, 5));
        plv = new Panel_List_Ventas();
        add(plv, BorderLayout.CENTER);
    }
    

    
    @Override
    public Component getListCellRendererComponent(JList<? extends LinkedList<Modelo_Ventas>> jlist, LinkedList<Modelo_Ventas> e, int i, boolean bln, boolean bln1) {
        Modelo_Inventario_Vehiculos miv;
        Double montoTotal = 0.0;
        Double ganancia = 0.0;
        String idProducto;
        for (Modelo_Ventas mv : e) {
            idProducto = mv.getId_prod();
            miv = lista_vehiculos.findIdProductoxID(lista_vehiculos, idProducto);

            //Calcula la ganancia y total
            ganancia = ganancia + (miv.getPrecio()-miv.getPrecio_compra())*mv.getCantidad();
            montoTotal += mv.getTotal();
        }
        if(e.get(0)!=null){
            plv.lblID.setText("#"+((Modelo_Ventas)e.get(0)).getId_factura());
            plv.lblGanancia.setText("S/. " +String.valueOf(ganancia)+ " +");
            plv.lblTotal.setText("S/. " +String.valueOf(montoTotal));
            String fecha=((Modelo_Ventas)e.get(0)).getFecha_hora();
            String hora = "NO DISPONIBLE";
            if(fecha.length()==15){
                String dd = fecha.substring(0, 2);
                String mm = fecha.substring(2, 4);
                String aa = fecha.substring(4, 8);
                
                
                String hh = fecha.substring(9, 11);
                String mi = fecha.substring(11, 13);
                String ss = fecha.substring(13, 15);;
                
                fecha = dd + "/" + mm + "/" + aa;
                hora = hh + ":" + mi + ":" + ss;
                
            }else{
                fecha = "NO DISPONIBLE";
            }
            plv.lblFecha.setText(fecha);
            plv.lblHora.setText(hora);
        }
        
        return this;
    }
    
}
