
package modelo;

import java.awt.Container;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import javax.swing.JPanel;

public class CustomPanel extends JPanel implements HierarchyListener {
    
    public boolean amIVisbile(){
        Container c = getParent();
        while(c != null){
            if (!c.isVisible()) {
                return false;
            } else {
                c = c.getParent();
            }
        }
        return true;
    }

    @Override
    public void addNotify(){
        super.addNotify();
        addHierarchyListener(this);
    }

    @Override
    public void removeNotify(){
        removeHierarchyListener(this);
        super.removeNotify();
    }

    @Override
    public void hierarchyChanged(HierarchyEvent e){
        System.out.println("Cambio en la jeraquia.");
            if(this.amIVisbile()){
          //EJECUTO MI CODIGO. 
          }
    } 
}  
    
