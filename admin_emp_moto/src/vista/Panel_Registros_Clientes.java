
package vista;

import java.awt.Color;
import java.awt.event.ItemEvent;


public class Panel_Registros_Clientes extends javax.swing.JPanel {

    public Panel_Registros_Clientes() {
        initComponents();
        jScrollPane1.getViewport().setBackground(Color.WHITE);
    }



    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        customPanel1 = new custom.CustomPanel();
        pClienteBuscar = new javax.swing.JPanel();
        btnClienteBuscar = new modelo.CustomButtonShaped();
        pBuscar = new javax.swing.JPanel();
        txfBuscar = new modelo.CustomTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pCRUD = new javax.swing.JPanel();
        jButton9 = new custom.CustomButtonShaped();
        jButton10 = new custom.CustomButtonShaped();
        jButton11 = new custom.CustomButtonShaped();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        customPanel1.setBackground(new java.awt.Color(250, 250, 250));
        customPanel1.setForeground(new java.awt.Color(60, 60, 60));
        customPanel1.setOpaque(false);
        customPanel1.setLayout(new java.awt.GridBagLayout());

        pClienteBuscar.setBackground(new java.awt.Color(250, 250, 250));
        pClienteBuscar.setLayout(new java.awt.GridBagLayout());

        btnClienteBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBuscar.png"))); // NOI18N
        btnClienteBuscar.setCurve(0);
        btnClienteBuscar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        pClienteBuscar.add(btnClienteBuscar, gridBagConstraints);

        pBuscar.setBackground(new java.awt.Color(255, 255, 255));
        pBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pBuscar.setLayout(new java.awt.GridBagLayout());

        txfBuscar.setBorder(null);
        txfBuscar.setForeground(new java.awt.Color(60, 60, 60));
        txfBuscar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfBuscar.setMaximumSize(new java.awt.Dimension(500, 39));
        txfBuscar.setMinimumSize(new java.awt.Dimension(500, 39));
        txfBuscar.setPhColor(new java.awt.Color(150, 150, 150));
        txfBuscar.setPreferredSize(new java.awt.Dimension(500, 39));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBuscar.add(txfBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pClienteBuscar.add(pBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 5, 20);
        customPanel1.add(pClienteBuscar, gridBagConstraints);

        jTable1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(60, 60, 60));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setSelectionBackground(new java.awt.Color(60, 60, 60));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 20, 20);
        customPanel1.add(jScrollPane1, gridBagConstraints);

        pCRUD.setBackground(new java.awt.Color(250, 250, 250));
        pCRUD.setLayout(new java.awt.GridBagLayout());

        jButton9.setText("AGREGAR");
        jButton9.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton9.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(jButton9, gridBagConstraints);

        jButton10.setText("EDITAR");
        jButton10.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton10.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(jButton10, gridBagConstraints);

        jButton11.setText("BORRAR");
        jButton11.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton11.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(jButton11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 5, 5);
        customPanel1.add(pCRUD, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButtonShaped btnClienteBuscar;
    private custom.CustomPanel customPanel1;
    public custom.CustomButtonShaped jButton10;
    public custom.CustomButtonShaped jButton11;
    public custom.CustomButtonShaped jButton9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JPanel pBuscar;
    public javax.swing.JPanel pCRUD;
    public javax.swing.JPanel pClienteBuscar;
    public modelo.CustomTextField txfBuscar;
    // End of variables declaration//GEN-END:variables
}
