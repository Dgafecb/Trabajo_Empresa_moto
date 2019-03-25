
package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;


public class SlidingPanel {


    private JButton boton;
    private JPanel panel;
    private int pinicialx;
    private int pfinalx;

    public SlidingPanel(JButton boton, JPanel panel) {
        this.boton = boton;
        this.panel = panel;
    }
    
    public void animacion(int pfinalx){ 
            this.pinicialx = panel.getX();
            this.pfinalx = pfinalx;
            if(this.pinicialx<this.pfinalx){
                //Desplazamiento a la derecha
                boton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    new Timer(0, new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            panel.setLocation(panel.getX() + 1, 0);
                            if (pfinalx - panel.getX()== 0) {
                                ((Timer) e.getSource()).stop();
                                }
                            }
                        }).start(); 
                    }
                });
                
            }else if(pfinalx<pinicialx){
                //Desplazamiento a izquierda
                boton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    new Timer(0, new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            panel.setLocation(panel.getX() - 1, 0);
                            if (panel.getX()-pfinalx == 0) {
                                ((Timer) e.getSource()).stop();
                                }
                            }
                        }).start(); 
                    }
                });
            }
     panel.repaint();
    }
}
