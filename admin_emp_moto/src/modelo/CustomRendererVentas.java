package modelo;

import static controlador.Controlador_login.lista_vehiculos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import vista.Emergente_Detalle_Ventas;
import vista.Panel_List_Ventas;
import vista.Ventana_Admin;


public class CustomRendererVentas extends JPanel implements ListCellRenderer<LinkedList<Modelo_Ventas>>{
    
    

    private JList list;
    
    private Panel_List_Ventas plv;
    
    
    public CustomRendererVentas(JList list,Ventana_Admin frame){
        this.list = list;
        this.setLayout(new BorderLayout(5, 5));
        plv = new Panel_List_Ventas();
        add(plv, BorderLayout.CENTER);
        list.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseReleased ( MouseEvent e ){
              if ( SwingUtilities.isLeftMouseButton ( e ) ){
                    int index = list.locationToIndex ( e.getPoint () );
                    if ( index != -1 && list.isSelectedIndex ( index ) )
                    {
                        Rectangle rect = list.getCellBounds ( index, index );
                        Point pointWithinCell = new Point ( e.getX () - rect.x, e.getY () - rect.y );
                        Rectangle crossRect = new Rectangle ( 775 , 36 , 100, 30 );
                        System.out.println(rect.height+"-"+rect.width);
                        System.out.println(pointWithinCell.x+"-"+pointWithinCell.y);
                        System.out.println(index);
                        if ( crossRect.contains ( pointWithinCell ) )
                        {
                           LinkedList<Modelo_Ventas> lista_detalle = ((CustomListModel_Ventas)list.getModel()).getVenta(index);
                           if(lista_detalle!=null){
                               Emergente_Detalle_Ventas detalle = new Emergente_Detalle_Ventas(frame,true,lista_detalle);
                               detalle.show(true);
                           }
                           
                        }
                    }
                }
            }


        });
        
    }
    

    
    @Override
    public Component getListCellRendererComponent(JList<? extends LinkedList<Modelo_Ventas>> jlist, LinkedList<Modelo_Ventas> e, int i, boolean bln, boolean bln1) {
        Modelo_Almacen miv;
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
