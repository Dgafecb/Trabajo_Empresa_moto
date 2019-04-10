/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Cadenas;
import modelo.CustomButtonShaped;

public class Panel_Inventario extends javax.swing.JPanel {

    
    public Panel_Inventario() {
        initComponents();
        grupoBuscarFiltro.add(rbId);
        grupoBuscarFiltro.add(rbMarca);
        grupoBuscarFiltro.add(rbDescripcion);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupoBuscarFiltro = new javax.swing.ButtonGroup();
        pMenuInventario = new javax.swing.JPanel();
        btnAgregar = new modelo.CustomButtonShaped();
        bntEliminar = new modelo.CustomButtonShaped();
        btnMarca = new modelo.CustomButtonShaped();
        btnBuscar = new modelo.CustomButtonShaped();
        btnModificar = new CustomButtonShaped();
        pBuscar = new javax.swing.JPanel();
        txfBuscar = new modelo.CustomTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbId = new javax.swing.JRadioButton();
        rbMarca = new javax.swing.JRadioButton();
        rbDescripcion = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.GridBagLayout());

        pMenuInventario.setBackground(new java.awt.Color(250, 250, 250));
        pMenuInventario.setLayout(new java.awt.GridBagLayout());

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pMenuInventario.add(bntEliminar, gridBagConstraints);

        btnMarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnMarca.png"))); // NOI18N
        btnMarca.setText("MARCA");
        btnMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMarca.setMaximumSize(new java.awt.Dimension(105, 40));
        btnMarca.setMinimumSize(new java.awt.Dimension(105, 40));
        btnMarca.setPreferredSize(new java.awt.Dimension(105, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pMenuInventario.add(btnMarca, gridBagConstraints);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBuscar.png"))); // NOI18N
        btnBuscar.setCurve(0);
        btnBuscar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnBuscar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnBuscar.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        pMenuInventario.add(btnBuscar, gridBagConstraints);

        btnModificar.setText("MODIFICAR");
        btnModificar.setMaximumSize(new java.awt.Dimension(130, 40));
        btnModificar.setMinimumSize(new java.awt.Dimension(130, 40));
        btnModificar.setPreferredSize(new java.awt.Dimension(130, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        pMenuInventario.add(btnModificar, gridBagConstraints);

        pBuscar.setBackground(new java.awt.Color(255, 255, 255));
        pBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pBuscar.setLayout(new java.awt.GridBagLayout());

        txfBuscar.setBorder(null);
        txfBuscar.setForeground(new java.awt.Color(60, 60, 60));
        txfBuscar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfBuscar.setMaximumSize(new java.awt.Dimension(500, 39));
        txfBuscar.setMinimumSize(new java.awt.Dimension(500, 39));
        txfBuscar.setPhColor(new java.awt.Color(150, 150, 150));
        txfBuscar.setPlaceholder(Cadenas.INVENTARIO_BUSCAR);
        txfBuscar.setPreferredSize(new java.awt.Dimension(500, 39));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBuscar.add(txfBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        pMenuInventario.add(pBuscar, gridBagConstraints);

        jLabel1.setText("Buscar por :");
        jPanel1.add(jLabel1);

        rbId.setText("ID");
        rbId.setFocusPainted(false);
        jPanel1.add(rbId);

        rbMarca.setText("Marca");
        rbMarca.setFocusPainted(false);
        jPanel1.add(rbMarca);

        rbDescripcion.setText("Descripcion");
        rbDescripcion.setFocusPainted(false);
        jPanel1.add(rbDescripcion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        pMenuInventario.add(jPanel1, gridBagConstraints);

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
    public CustomButtonShaped btnModificar;
    private javax.swing.ButtonGroup grupoBuscarFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JPanel pBuscar;
    public javax.swing.JPanel pMenuInventario;
    public javax.swing.JRadioButton rbDescripcion;
    public javax.swing.JRadioButton rbId;
    public javax.swing.JRadioButton rbMarca;
    public modelo.CustomTextField txfBuscar;
    // End of variables declaration//GEN-END:variables
}
