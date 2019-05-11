package modelo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;


public class CustomListModel_Ajustes extends AbstractListModel{

    private Linked_List<Modelo_Ajustes> lista  = new Linked_List<Modelo_Ajustes>();
    
    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public Object getElementAt(int i) {
        Modelo_Ajustes a = null;
        try {
            a= (Modelo_Ajustes) lista.get(i);
        } catch (Exception ex) {
            Logger.getLogger(CustomListModel_Ajustes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    public void addElement(Modelo_Ajustes a){
        lista.add(a);
        this.fireIntervalAdded(this, getSize(), getSize()+1);
    }
    
    public Modelo_Ajustes getCurso(int index){
        Modelo_Ajustes a = null;
        try {
            a= (Modelo_Ajustes) lista.get(index);
        } catch (Exception ex) {
            Logger.getLogger(CustomListModel_Ajustes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
}
