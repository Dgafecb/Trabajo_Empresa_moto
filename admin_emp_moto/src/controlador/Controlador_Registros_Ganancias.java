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
import modelo.Modelo_Inventario_Vehiculos;
import modelo.Modelo_Ventas;
import vista.Panel_Registros_Ganancias;
import vista.Ventana_Admin;


public class Controlador_Registros_Ganancias implements ActionListener {

    private JList list ;
    private Panel_Registros_Ganancias panelRegistrosGanancias;
    
    Controlador_Registros_Ganancias(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin, Panel_Registros_Ganancias panelRegistrosGanancias) {
        this.panelRegistrosGanancias = panelRegistrosGanancias;
        fillList(lista_ventas);
    }

    private void fillList(Linked_List<Modelo_Ventas> lista){
        LinkedList<Modelo_Ventas> listaVenta = new LinkedList<Modelo_Ventas>();
        listaVenta.add((Modelo_Ventas)lista.get(0));
        CustomListModel_Ventas model = new CustomListModel_Ventas();
        model.addElement(listaVenta);
        list = new JList();
        
        list.setModel(model);
        
        list.setCellRenderer(new CustomRendererVentas());
        panelRegistrosGanancias.jScrollPane1.setViewportView(list);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
