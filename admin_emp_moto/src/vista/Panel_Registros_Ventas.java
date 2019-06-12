
package vista;

import java.awt.Color;
import modelo.Cadenas;


public class Panel_Registros_Ventas extends javax.swing.JPanel {


    public Panel_Registros_Ventas() {
        initComponents();
        this.jScrollPane1.getViewport().setBackground(Color.WHITE);
        bgVentas.add(jRadioButton1);
        bgVentas.add(jRadioButton4);
        bgVentas.add(jRadioButton2);
        bgVentas.add(jRadioButton3);
        jRadioButton1.setSelected(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bgVentas = new javax.swing.ButtonGroup();
        customPanel1 = new custom.CustomPanel();
        pCRUD = new javax.swing.JPanel();
        jButton9 = new custom.CustomButtonShaped();
        jButton10 = new custom.CustomButtonShaped();
        jButton11 = new custom.CustomButtonShaped();
        jButton12 = new custom.CustomButtonShaped();
        jButton13 = new custom.CustomButtonShaped();
        pVentasBuscar = new javax.swing.JPanel();
        btnClienteBuscar = new modelo.CustomButtonShaped();
        pBuscar = new javax.swing.JPanel();
        txfBuscar = new modelo.CustomTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        customPanel1.setBackground(new java.awt.Color(250, 250, 250));
        customPanel1.setForeground(new java.awt.Color(60, 60, 60));
        customPanel1.setOpaque(false);
        customPanel1.setLayout(new java.awt.GridBagLayout());

        pCRUD.setBackground(new java.awt.Color(250, 250, 250));
        pCRUD.setLayout(new java.awt.GridBagLayout());

        jButton9.setText("AGREGAR");
        jButton9.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton9.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(jButton9, gridBagConstraints);

        jButton10.setText("EDITAR");
        jButton10.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton10.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(jButton10, gridBagConstraints);

        jButton11.setText("BORRAR");
        jButton11.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton11.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(jButton11, gridBagConstraints);

        jButton12.setText("EXPORTAR");
        jButton12.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton12.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(jButton12, gridBagConstraints);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnUpdate.png"))); // NOI18N
        jButton13.setMaximumSize(new java.awt.Dimension(50, 35));
        jButton13.setMinimumSize(new java.awt.Dimension(50, 35));
        jButton13.setPreferredSize(new java.awt.Dimension(50, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(jButton13, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 5, 5);
        customPanel1.add(pCRUD, gridBagConstraints);

        pVentasBuscar.setBackground(new java.awt.Color(250, 250, 250));
        pVentasBuscar.setLayout(new java.awt.GridBagLayout());

        btnClienteBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBuscar.png"))); // NOI18N
        btnClienteBuscar.setCurve(0);
        btnClienteBuscar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        pVentasBuscar.add(btnClienteBuscar, gridBagConstraints);

        pBuscar.setBackground(new java.awt.Color(255, 255, 255));
        pBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pBuscar.setMinimumSize(new java.awt.Dimension(300, 41));
        pBuscar.setPreferredSize(new java.awt.Dimension(300, 41));
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
        pVentasBuscar.add(pBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 5, 20);
        customPanel1.add(pVentasBuscar, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 60));
        jLabel1.setText("Filtrar por :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);

        jRadioButton1.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(60, 60, 60));
        jRadioButton1.setText("ID PRODUCTO");
        jRadioButton1.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(60, 60, 60));
        jRadioButton2.setText("ID TRABAJADOR");
        jRadioButton2.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jRadioButton2, gridBagConstraints);

        jRadioButton3.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(60, 60, 60));
        jRadioButton3.setText("ID CLIENTE");
        jRadioButton3.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jRadioButton3, gridBagConstraints);

        jRadioButton4.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(60, 60, 60));
        jRadioButton4.setText("DESCRIPCION");
        jRadioButton4.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jRadioButton4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 20);
        customPanel1.add(jPanel1, gridBagConstraints);

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 20, 20);
        customPanel1.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgVentas;
    public modelo.CustomButtonShaped btnClienteBuscar;
    private custom.CustomPanel customPanel1;
    public custom.CustomButtonShaped jButton10;
    public custom.CustomButtonShaped jButton11;
    public custom.CustomButtonShaped jButton12;
    public custom.CustomButtonShaped jButton13;
    public custom.CustomButtonShaped jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JRadioButton jRadioButton2;
    public javax.swing.JRadioButton jRadioButton3;
    public javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JPanel pBuscar;
    public javax.swing.JPanel pCRUD;
    public javax.swing.JPanel pVentasBuscar;
    public modelo.CustomTextField txfBuscar;
    // End of variables declaration//GEN-END:variables
}
