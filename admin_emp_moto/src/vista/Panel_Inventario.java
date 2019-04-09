/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Cadenas;

/**
 *
 * @author FuryMercury
 */
public class Panel_Inventario extends javax.swing.JPanel {

    
    public Panel_Inventario() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pMenuInventario = new javax.swing.JPanel();
        txfBuscar = new javax.swing.JTextField();
        btnAgregar = new modelo.CustomButtonShaped();
        bntEliminar = new modelo.CustomButtonShaped();
        btnMarca = new modelo.CustomButtonShaped();
        btnBuscar = new modelo.CustomButtonShaped();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.GridBagLayout());

        pMenuInventario.setBackground(new java.awt.Color(250, 250, 250));
        pMenuInventario.setLayout(new java.awt.GridBagLayout());

        txfBuscar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfBuscar.setForeground(new java.awt.Color(90, 90, 90));
        txfBuscar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txfBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        txfBuscar.setCaretColor(new java.awt.Color(60, 60, 60));
        txfBuscar.setMaximumSize(new java.awt.Dimension(500, 39));
        txfBuscar.setMinimumSize(new java.awt.Dimension(500, 39));
        txfBuscar.setPreferredSize(new java.awt.Dimension(500, 39));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        pMenuInventario.add(txfBuscar, gridBagConstraints);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnAgregar.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar.setMaximumSize(new java.awt.Dimension(125, 40));
        btnAgregar.setMinimumSize(new java.awt.Dimension(125, 40));
        btnAgregar.setPreferredSize(new java.awt.Dimension(125, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pMenuInventario.add(btnAgregar, gridBagConstraints);

        bntEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBorrar.png"))); // NOI18N
        bntEliminar.setText("BORRAR");
        bntEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bntEliminar.setMaximumSize(new java.awt.Dimension(120, 40));
        bntEliminar.setMinimumSize(new java.awt.Dimension(120, 40));
        bntEliminar.setPreferredSize(new java.awt.Dimension(120, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pMenuInventario.add(bntEliminar, gridBagConstraints);

        btnMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnMarca.png"))); // NOI18N
        btnMarca.setText("MARCA");
        btnMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMarca.setMaximumSize(new java.awt.Dimension(105, 40));
        btnMarca.setMinimumSize(new java.awt.Dimension(105, 40));
        btnMarca.setPreferredSize(new java.awt.Dimension(105, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pMenuInventario.add(btnMarca, gridBagConstraints);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBuscar.png"))); // NOI18N
        btnBuscar.setCurve(0);
        btnBuscar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnBuscar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnBuscar.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        pMenuInventario.add(btnBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pMenuInventario, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jScrollPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButtonShaped bntEliminar;
    public modelo.CustomButtonShaped btnAgregar;
    public modelo.CustomButtonShaped btnBuscar;
    public modelo.CustomButtonShaped btnMarca;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JPanel pMenuInventario;
    public javax.swing.JTextField txfBuscar;
    // End of variables declaration//GEN-END:variables
}
