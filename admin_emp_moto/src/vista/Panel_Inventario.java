/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import modelo.Cadenas;
import modelo.CustomButtonShaped;

public class Panel_Inventario extends javax.swing.JPanel {

    
    public Panel_Inventario() {
        initComponents();
        grupoBuscarFiltro.add(rbId);
        grupoBuscarFiltro.add(rbMarca);
        grupoBuscarFiltro.add(rbDescripcion);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        rbId.setSelected(true);
       

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupoBuscarFiltro = new javax.swing.ButtonGroup();
        customPanel1 = new custom.CustomPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pMenuInventario = new javax.swing.JPanel();
        btnAgregar = new modelo.CustomButtonShaped();
        bntEliminar = new modelo.CustomButtonShaped();
        btnBuscar = new modelo.CustomButtonShaped();
        btnModificar = new custom.CustomButtonShaped();
        pBuscar = new javax.swing.JPanel();
        txfBuscar = new modelo.CustomTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rbId = new javax.swing.JRadioButton();
        rbMarca = new javax.swing.JRadioButton();
        rbDescripcion = new javax.swing.JRadioButton();
        btnExportar = new modelo.CustomButtonShaped();
        btnupdate = new modelo.CustomButtonShaped();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        customPanel1.setBackground(new java.awt.Color(250, 250, 250));
        customPanel1.setForeground(new java.awt.Color(60, 60, 60));
        customPanel1.setOpaque(false);
        customPanel1.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBackground(new java.awt.Color(250, 250, 250));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setSelectionBackground(new java.awt.Color(102, 102, 102));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 30, 30, 30);
        customPanel1.add(jScrollPane1, gridBagConstraints);

        pMenuInventario.setBackground(new java.awt.Color(250, 250, 250));
        pMenuInventario.setLayout(new java.awt.GridBagLayout());

        btnAgregar.setText("AGREGAR");
        btnAgregar.setMaximumSize(new java.awt.Dimension(150, 40));
        btnAgregar.setMinimumSize(new java.awt.Dimension(150, 40));
        btnAgregar.setPreferredSize(new java.awt.Dimension(150, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pMenuInventario.add(btnAgregar, gridBagConstraints);

        bntEliminar.setText("BORRAR");
        bntEliminar.setMaximumSize(new java.awt.Dimension(150, 40));
        bntEliminar.setMinimumSize(new java.awt.Dimension(150, 40));
        bntEliminar.setPreferredSize(new java.awt.Dimension(150, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pMenuInventario.add(bntEliminar, gridBagConstraints);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBuscar.png"))); // NOI18N
        btnBuscar.setCurve(0);
        btnBuscar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnBuscar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnBuscar.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        pMenuInventario.add(btnBuscar, gridBagConstraints);

        btnModificar.setText("EDITAR");
        btnModificar.setMaximumSize(new java.awt.Dimension(150, 40));
        btnModificar.setMinimumSize(new java.awt.Dimension(150, 40));
        btnModificar.setPreferredSize(new java.awt.Dimension(150, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pMenuInventario.add(btnModificar, gridBagConstraints);

        pBuscar.setBackground(new java.awt.Color(255, 255, 255));
        pBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pBuscar.setMinimumSize(new java.awt.Dimension(200, 40));
        pBuscar.setPreferredSize(new java.awt.Dimension(200, 40));
        pBuscar.setLayout(new java.awt.GridBagLayout());

        txfBuscar.setBorder(null);
        txfBuscar.setForeground(new java.awt.Color(60, 60, 60));
        txfBuscar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfBuscar.setMaximumSize(new java.awt.Dimension(500, 38));
        txfBuscar.setMinimumSize(new java.awt.Dimension(500, 38));
        txfBuscar.setPhColor(new java.awt.Color(60, 60, 60));
        txfBuscar.setPlaceholder(Cadenas.INVENTARIO_BUSCAR);
        txfBuscar.setPreferredSize(new java.awt.Dimension(500, 38));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBuscar.add(txfBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        pMenuInventario.add(pBuscar, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 60));
        jLabel1.setText("Buscar por :");
        jLabel1.setMaximumSize(new java.awt.Dimension(75, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(75, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(75, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);

        rbId.setBackground(new java.awt.Color(250, 250, 250));
        rbId.setForeground(new java.awt.Color(60, 60, 60));
        rbId.setText("ID");
        rbId.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 20);
        jPanel1.add(rbId, gridBagConstraints);

        rbMarca.setBackground(new java.awt.Color(250, 250, 250));
        rbMarca.setForeground(new java.awt.Color(60, 60, 60));
        rbMarca.setText("MARCA");
        rbMarca.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 20);
        jPanel1.add(rbMarca, gridBagConstraints);

        rbDescripcion.setBackground(new java.awt.Color(250, 250, 250));
        rbDescripcion.setForeground(new java.awt.Color(60, 60, 60));
        rbDescripcion.setText("DESCRIPCION");
        rbDescripcion.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 20);
        jPanel1.add(rbDescripcion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pMenuInventario.add(jPanel1, gridBagConstraints);

        btnExportar.setText("EXPORTAR");
        btnExportar.setMaximumSize(new java.awt.Dimension(150, 40));
        btnExportar.setMinimumSize(new java.awt.Dimension(150, 40));
        btnExportar.setPreferredSize(new java.awt.Dimension(150, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pMenuInventario.add(btnExportar, gridBagConstraints);

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnUpdate.png"))); // NOI18N
        btnupdate.setMaximumSize(new java.awt.Dimension(50, 40));
        btnupdate.setMinimumSize(new java.awt.Dimension(50, 40));
        btnupdate.setPreferredSize(new java.awt.Dimension(50, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pMenuInventario.add(btnupdate, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(30, 30, 5, 30);
        customPanel1.add(pMenuInventario, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButtonShaped bntEliminar;
    public modelo.CustomButtonShaped btnAgregar;
    public modelo.CustomButtonShaped btnBuscar;
    public modelo.CustomButtonShaped btnExportar;
    public custom.CustomButtonShaped btnModificar;
    public modelo.CustomButtonShaped btnupdate;
    private custom.CustomPanel customPanel1;
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
