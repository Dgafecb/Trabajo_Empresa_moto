
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.SystemColor;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


public class Ventana_Login extends javax.swing.JFrame {

    private Borde_Ventana bordeVentana;
    public Panel_Login panelLogin;

    public Ventana_Login() {
        configFrame();
        initPaneles();
        pack();
    }

    private void configFrame(){    
        setMinimumSize(new Dimension(400, 300));
        setMaximumSize(new Dimension(1200, 900));
        setSize(new Dimension(250, 400));
        setLocationRelativeTo(null);
        setBackground(SystemColor.window);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout (new GridBagLayout());
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,60,60)));
        
        pack();
    }
    
    private void initPaneles(){
        bordeVentana = new Borde_Ventana(this);
        bordeVentana.moverVentana(true);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 1; // El área de texto ocupa dos columnas
        constraints.gridheight = 1; // El área de texto ocupa una fila
        constraints.weightx = 1.0; // La columna se estira
        constraints.weighty = 0.0; // La fila no se estira
        constraints.fill = GridBagConstraints.HORIZONTAL;//Estirar los componentes
        constraints.anchor = GridBagConstraints.CENTER;//Poscion que ocupa el componente
        getContentPane().add (bordeVentana, constraints);
        
        panelLogin = new Panel_Login();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0; 
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        getContentPane().add (panelLogin, constraints);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
