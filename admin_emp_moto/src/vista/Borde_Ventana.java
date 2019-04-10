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
        this.btnMinimizar.setVisible(false);
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
        btnMinimizar = new custom.CustomButtonMenu();
        btnCerrar = new custom.CustomButtonMenu();

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

        btnMinimizar.setText("-");
        btnMinimizar.setColorHover(new java.awt.Color(102, 102, 102));
        btnMinimizar.setColorNormal(new java.awt.Color(60, 60, 60));
        btnMinimizar.setColorPressed(new java.awt.Color(153, 153, 153));
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnMinimizar.setMaximumSize(new java.awt.Dimension(40, 30));
        btnMinimizar.setMinimumSize(new java.awt.Dimension(40, 30));
        btnMinimizar.setPreferredSize(new java.awt.Dimension(40, 30));
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });
        add(btnMinimizar, new java.awt.GridBagConstraints());

        btnCerrar.setText("×");
        btnCerrar.setColorHover(new java.awt.Color(255, 0, 0));
        btnCerrar.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCerrar.setColorPressed(new java.awt.Color(255, 51, 51));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnCerrar.setMaximumSize(new java.awt.Dimension(40, 30));
        btnCerrar.setMinimumSize(new java.awt.Dimension(40, 30));
        btnCerrar.setPreferredSize(new java.awt.Dimension(40, 30));
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

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        if(ventana!=null){
            ventana.setExtendedState(JFrame.ICONIFIED);
        }else if(dialogo!=null){

        }
    }//GEN-LAST:event_btnMinimizarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public custom.CustomButtonMenu btnCerrar;
    public custom.CustomButtonMenu btnMinimizar;
    private javax.swing.JLabel moverPanel;
    private javax.swing.JLabel noMoverPanel;
    // End of variables declaration//GEN-END:variables
}
