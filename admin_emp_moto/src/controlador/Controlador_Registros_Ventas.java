package controlador;

import static controlador.Controlador_login.lista_vehiculos;
import static controlador.Controlador_login.lista_ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.JList;
import modelo.CustomListModel_Ventas;
import modelo.CustomRendererVentas;
import modelo.Linked_List;
import modelo.Modelo_Almacen;
import modelo.Modelo_Ventas;
import vista.Panel_Registros_Ganancias;
import vista.Ventana_Admin;


public class Controlador_Registros_Ventas implements ActionListener {

    private JList list ;
    private Panel_Registros_Ganancias panelRegistrosGanancias;
    private Ventana_Admin ventanaAdmin;
    
    Controlador_Registros_Ventas(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin, Panel_Registros_Ganancias panelRegistrosGanancias) {
        this.ventanaAdmin = ventanaAdmin;
        this.panelRegistrosGanancias = panelRegistrosGanancias;
        fillList(lista_ventas);
    }

    private void fillList(Linked_List<Modelo_Ventas> lista){
        CustomListModel_Ventas model = new CustomListModel_Ventas();
        LinkedList<Modelo_Ventas> listaVenta = new LinkedList<Modelo_Ventas>();
        for(int i = 0;i< lista.size();i++){
            if(i<lista.size()-1){
                Modelo_Ventas mv1 = (Modelo_Ventas) lista.get(i);
                Modelo_Ventas mv2 = (Modelo_Ventas) lista.get(i+1);
                if(mv1.getId_factura().equalsIgnoreCase(mv2.getId_factura())){
                    listaVenta.add(mv1);
                }else{
                    listaVenta.add(mv1);
                    model.addElement(listaVenta);
                    listaVenta = new LinkedList<Modelo_Ventas>();
                }
            }else{
                Modelo_Ventas mv1 = (Modelo_Ventas) lista.get(i);
                Modelo_Ventas mv2 = (Modelo_Ventas) lista.get(i-1);
                if(mv1.getId_factura().equalsIgnoreCase(mv2.getId_factura())){
                    listaVenta.add(mv1);
                    model.addElement(listaVenta);
                }else{
                    listaVenta = new LinkedList<Modelo_Ventas>();
                    listaVenta.add(mv1);
                    model.addElement(listaVenta);
                    
                }
            }

        }
        
        list = new JList();
        
        list.setModel(model);
        
        list.setCellRenderer(new CustomRendererVentas(list,ventanaAdmin));
        panelRegistrosGanancias.jScrollPane1.setViewportView(list);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
