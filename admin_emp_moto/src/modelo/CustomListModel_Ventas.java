package modelo;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;


public class CustomListModel_Ventas extends AbstractListModel{

    private Linked_List<LinkedList<Modelo_Ventas>> lista  = new Linked_List<LinkedList<Modelo_Ventas>>();
    
    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int i) {
        Modelo_Ventas mv = null;
        try {
            mv = (Modelo_Ventas) lista.get(i);
        } catch (Exception ex) {
            Logger.getLogger(CustomListModel_Ajustes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mv;
    }
    
    /*public void addElement(Modelo_Ventas mv){
        lista.add(mv);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public Modelo_Ventas getVenta(int index){
        Modelo_Ventas a = null;
        try {
            a= (Modelo_Ventas) lista.get(index);
        } catch (Exception ex) {
            Logger.getLogger(CustomListModel_Ajustes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }*/
    
}
