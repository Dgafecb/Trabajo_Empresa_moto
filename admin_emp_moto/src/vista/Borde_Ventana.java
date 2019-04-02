package vista;

import javax.swing.JFrame;


public class Borde_Ventana extends javax.swing.JPanel {

    private JFrame ventana;
    private int posicionx,posiciony;
    
    public Borde_Ventana(JFrame ventana) {
        this.ventana = ventana;
        initComponents();
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        moverPanel = new javax.swing.JLabel();
        btnCerrar = new modelo.CustomButton();

        setBackground(new java.awt.Color(82, 158, 202));
        setLayout(new java.awt.GridBagLayout());

        moverPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                moverPanelMouseDragged(evt);
            }
        });
        moverPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                moverPanelMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(moverPanel, gridBagConstraints);

        btnCerrar.setBackground(new java.awt.Color(82, 158, 202));
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("×");
        btnCerrar.setColorHover(new java.awt.Color(255, 0, 0));
        btnCerrar.setColorNormal(new java.awt.Color(82, 158, 202));
        btnCerrar.setColorPressed(new java.awt.Color(255, 102, 102));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCerrar.setPreferredSize(new java.awt.Dimension(48, 30));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(btnCerrar, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        ventana.setVisible(false); 
        ventana.dispose(); 
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void moverPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverPanelMousePressed
        posicionx = evt.getX();
        posiciony = evt.getY();
    }//GEN-LAST:event_moverPanelMousePressed

    private void moverPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverPanelMouseDragged
        ventana.setLocation(ventana.getLocation().x + evt.getX()- posicionx , ventana.getLocation().y + evt.getY()- posiciony);
    }//GEN-LAST:event_moverPanelMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.CustomButton btnCerrar;
    private javax.swing.JLabel moverPanel;
    // End of variables declaration//GEN-END:variables
}
