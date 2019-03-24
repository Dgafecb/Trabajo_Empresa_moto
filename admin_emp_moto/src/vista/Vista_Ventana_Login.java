
package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Vista_Ventana_Login extends javax.swing.JFrame {

    public Vista_Panel_Login panel;

    public Vista_Ventana_Login() {
        initComponents();
        configFrame();
        panel = new Vista_Panel_Login();
        this.getContentPane().add(panel, BorderLayout.CENTER);
    }

    private void configFrame(){    
        setMinimumSize(new Dimension(400, 300));
        setMaximumSize(new Dimension(1200, 900));
        setSize(new Dimension(480, 720));
        setLocationRelativeTo(null);
        setResizable(false);
        //pack();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
