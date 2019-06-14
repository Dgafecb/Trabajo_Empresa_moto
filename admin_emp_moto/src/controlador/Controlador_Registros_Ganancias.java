package controlador;

import static controlador.Controlador_login.lista_vehiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JList;
import modelo.CustomListModel_Ventas;
import modelo.CustomRendererVentas;
import modelo.Linked_List;
import vista.Panel_Registros_Ganancias;
import vista.Ventana_Admin;


public class Controlador_Registros_Ganancias implements ActionListener {

    private JList list ;
    private Panel_Registros_Ganancias panelRegistrosGanancias;
    
    Controlador_Registros_Ganancias(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin, Panel_Registros_Ganancias panelRegistrosGanancias) {
        this.panelRegistrosGanancias = panelRegistrosGanancias;
        fillList(lista_vehiculos);
    }

    private void fillList(Linked_List lista){
        list = new JList();
        CustomListModel_Ventas model = new CustomListModel_Ventas();
        list.setCellRenderer(new CustomRendererVentas());
        panelRegistrosGanancias.jScrollPane1.setViewportView(list);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
