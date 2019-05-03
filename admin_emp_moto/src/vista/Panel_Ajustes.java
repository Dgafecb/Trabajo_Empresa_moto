
package vista;

import javax.swing.border.EmptyBorder;
import modelo.Cadenas;
import modelo.Modelo_Ajustes;

public class Panel_Ajustes extends javax.swing.JPanel {


    public Panel_Ajustes() {
        initComponents();
        this.jScrollPane3.setBorder(null);
        this.jScrollPane3.setBackground(Cadenas.COLOR_DEFAULT_WHITE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        customPanel5 = new custom.CustomPanel();
        jScrollPane3 = new javax.swing.JScrollPane();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        customPanel5.setBackground(new java.awt.Color(250, 250, 250));
        customPanel5.setForeground(new java.awt.Color(60, 60, 60));
        customPanel5.setOpaque(false);
        customPanel5.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 2, 5, 2);
        customPanel5.add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel5, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.CustomPanel customPanel5;
    public javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
