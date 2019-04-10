package vista;

import javax.swing.JDialog;
import javax.swing.JFrame;


public class Borde_Ventana extends javax.swing.JPanel {

    private JFrame ventana;
    private JDialog dialogo;
    private int posicionx,posiciony;
    
    public Borde_Ventana(JFrame ventana) {
        this.ventana = ventana;
        initComponents();
    }
    
    public Borde_Ventana(JDialog dialogo) {
        this.dialogo = dialogo;
        initComponents();
        this.customButtonMenu1.setVisible(false);
        this.updateUI();
    }

    public void moverVentana(boolean mover){
        if(mover!=true){
            moverPanel.setVisible(false);
            noMoverPanel.setVisible(true);
            updateUI();
        }else{
            moverPanel.setVisible(true);
            noMoverPanel.setVisible(false);
            updateUI();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        moverPanel = new javax.swing.JLabel();
        noMoverPanel = new javax.swing.JLabel();
        customButtonMenu1 = new modelo.CustomButtonMenu();
        btnCerrar = new modelo.CustomButtonMenu();

        setBackground(new java.awt.Color(60, 60, 60));
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(noMoverPanel, gridBagConstraints);

        customButtonMenu1.setText("-");
        customButtonMenu1.setColorHover(new java.awt.Color(92, 92, 92));
        customButtonMenu1.setColorNormal(new java.awt.Color(60, 60, 60));
        customButtonMenu1.setColorPressed(new java.awt.Color(143, 143, 143));
        customButtonMenu1.setFocusPainted(false);
        customButtonMenu1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        customButtonMenu1.setMaximumSize(new java.awt.Dimension(48, 30));
        customButtonMenu1.setMinimumSize(new java.awt.Dimension(48, 30));
        customButtonMenu1.setPreferredSize(new java.awt.Dimension(48, 30));
        customButtonMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButtonMenu1ActionPerformed(evt);
            }
        });
        add(customButtonMenu1, new java.awt.GridBagConstraints());

        btnCerrar.setText("×");
        btnCerrar.setColorHover(new java.awt.Color(255, 0, 0));
        btnCerrar.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCerrar.setColorPressed(new java.awt.Color(255, 102, 102));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCerrar.setMaximumSize(new java.awt.Dimension(48, 30));
        btnCerrar.setMinimumSize(new java.awt.Dimension(48, 30));
        btnCerrar.setPreferredSize(new java.awt.Dimension(48, 30));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        add(btnCerrar, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents

    private void moverPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverPanelMousePressed
        posicionx = evt.getX();
        posiciony = evt.getY();
    }//GEN-LAST:event_moverPanelMousePressed

    private void moverPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moverPanelMouseDragged
        if(ventana!=null){
            ventana.setLocation(ventana.getLocation().x + evt.getX()- posicionx , ventana.getLocation().y + evt.getY()- posiciony);
        }else if(dialogo!=null){
            dialogo.setLocation(dialogo.getLocation().x + evt.getX()- posicionx , dialogo.getLocation().y + evt.getY()- posiciony);
        }
        
        
    }//GEN-LAST:event_moverPanelMouseDragged


    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        if(ventana!=null){
            ventana.setVisible(false);
            ventana.dispose();
            System.exit(0);
        }else if(dialogo!=null){
            dialogo.dispose();
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void customButtonMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButtonMenu1ActionPerformed
        if(ventana!=null){
            ventana.setExtendedState(JFrame.ICONIFIED);
        }else if(dialogo!=null){

        }
    }//GEN-LAST:event_customButtonMenu1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.CustomButtonMenu btnCerrar;
    private modelo.CustomButtonMenu customButtonMenu1;
    private javax.swing.JLabel moverPanel;
    private javax.swing.JLabel noMoverPanel;
    // End of variables declaration//GEN-END:variables
}
