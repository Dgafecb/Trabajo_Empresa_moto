
package vista;

import java.awt.Color;


public class Panel_Registros_Clientes extends javax.swing.JPanel {

    public Panel_Registros_Clientes() {
        initComponents();
        jScrollPane1.getViewport().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pClientes = new javax.swing.JPanel();
        pDatosCliente = new javax.swing.JPanel();
        lblNombreApellido = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txfCliente1Nombre = new javax.swing.JTextField();
        txfCliente2Nombre = new javax.swing.JTextField();
        txfDNI1 = new javax.swing.JTextField();
        txfDNI2 = new javax.swing.JTextField();
        txfTelefono = new javax.swing.JTextField();
        txfCorreo = new javax.swing.JTextField();
        txfDireccion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        pBuscarCliente = new javax.swing.JPanel();
        pDireccion = new javax.swing.JPanel();
        lblCiudad = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        cbCiudad = new javax.swing.JComboBox<>();
        cbPais = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        pClienteBotones = new javax.swing.JPanel();
        pCRUD = new javax.swing.JPanel();
        jButton9 = new custom.CustomButtonShaped();
        jButton10 = new custom.CustomButtonShaped();
        jButton11 = new custom.CustomButtonShaped();
        pClienteBuscar = new javax.swing.JPanel();
        btnClienteBuscar = new modelo.CustomButtonShaped();
        pBuscar = new javax.swing.JPanel();
        txfBuscar = new modelo.CustomTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.GridBagLayout());

        pClientes.setBackground(new java.awt.Color(250, 250, 250));
        pClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)), "Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(60, 60, 60))); // NOI18N
        pClientes.setLayout(new java.awt.GridBagLayout());

        pDatosCliente.setBackground(new java.awt.Color(250, 250, 250));
        pDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)), "Datos Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(60, 60, 60))); // NOI18N
        pDatosCliente.setMaximumSize(new java.awt.Dimension(400, 450));
        pDatosCliente.setMinimumSize(new java.awt.Dimension(300, 350));
        pDatosCliente.setPreferredSize(new java.awt.Dimension(350, 400));
        pDatosCliente.setLayout(new java.awt.GridBagLayout());

        lblNombreApellido.setText("Nombre y Apellidos :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(lblNombreApellido, gridBagConstraints);

        lblDNI.setText("DNI :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(lblDNI, gridBagConstraints);

        jLabel16.setText("Correo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(jLabel16, gridBagConstraints);

        jLabel17.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(jLabel17, gridBagConstraints);

        jLabel18.setText("Direccion :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(jLabel18, gridBagConstraints);

        txfCliente1Nombre.setMaximumSize(new java.awt.Dimension(200, 20));
        txfCliente1Nombre.setMinimumSize(new java.awt.Dimension(200, 20));
        txfCliente1Nombre.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfCliente1Nombre, gridBagConstraints);

        txfCliente2Nombre.setMaximumSize(new java.awt.Dimension(200, 20));
        txfCliente2Nombre.setMinimumSize(new java.awt.Dimension(200, 20));
        txfCliente2Nombre.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfCliente2Nombre, gridBagConstraints);

        txfDNI1.setMaximumSize(new java.awt.Dimension(200, 20));
        txfDNI1.setMinimumSize(new java.awt.Dimension(200, 20));
        txfDNI1.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfDNI1, gridBagConstraints);

        txfDNI2.setMaximumSize(new java.awt.Dimension(200, 20));
        txfDNI2.setMinimumSize(new java.awt.Dimension(200, 20));
        txfDNI2.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfDNI2, gridBagConstraints);

        txfTelefono.setMaximumSize(new java.awt.Dimension(200, 20));
        txfTelefono.setMinimumSize(new java.awt.Dimension(200, 20));
        txfTelefono.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfTelefono, gridBagConstraints);

        txfCorreo.setMaximumSize(new java.awt.Dimension(200, 20));
        txfCorreo.setMinimumSize(new java.awt.Dimension(200, 20));
        txfCorreo.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfCorreo, gridBagConstraints);

        txfDireccion.setMaximumSize(new java.awt.Dimension(200, 20));
        txfDireccion.setMinimumSize(new java.awt.Dimension(200, 20));
        txfDireccion.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfDireccion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pDatosCliente.add(jSeparator2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pDatosCliente.add(jSeparator3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pDatosCliente.add(jSeparator4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pDatosCliente.add(jSeparator5, gridBagConstraints);

        pBuscarCliente.setBackground(new java.awt.Color(250, 250, 250));
        pBuscarCliente.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        pDatosCliente.add(pBuscarCliente, gridBagConstraints);

        pDireccion.setBackground(new java.awt.Color(250, 250, 250));
        pDireccion.setLayout(new java.awt.GridBagLayout());

        lblCiudad.setText("Ciudad :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(lblCiudad, gridBagConstraints);

        lblPais.setText("Pais :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(lblPais, gridBagConstraints);

        cbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCiudad.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(cbCiudad, gridBagConstraints);

        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPais.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(cbPais, gridBagConstraints);

        jSeparator6.setBackground(new java.awt.Color(250, 250, 250));
        jSeparator6.setForeground(new java.awt.Color(250, 250, 250));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(jSeparator6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(pDireccion, gridBagConstraints);

        pClienteBotones.setBackground(new java.awt.Color(250, 250, 250));
        pClienteBotones.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pDatosCliente.add(pClienteBotones, gridBagConstraints);

        pCRUD.setBackground(new java.awt.Color(250, 250, 250));
        pCRUD.setLayout(new java.awt.GridBagLayout());

        jButton9.setText("AGREGAR");
        jButton9.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton9.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        pCRUD.add(jButton9, gridBagConstraints);

        jButton10.setText("EDITAR");
        jButton10.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton10.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        pCRUD.add(jButton10, gridBagConstraints);

        jButton11.setText("BORRAR");
        jButton11.setMinimumSize(new java.awt.Dimension(100, 35));
        jButton11.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        pCRUD.add(jButton11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(pCRUD, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pDatosCliente, gridBagConstraints);

        pClienteBuscar.setBackground(new java.awt.Color(250, 250, 250));
        pClienteBuscar.setLayout(new java.awt.GridBagLayout());

        btnClienteBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBuscar.png"))); // NOI18N
        btnClienteBuscar.setCurve(0);
        btnClienteBuscar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
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
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        pClienteBuscar.add(pBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pClienteBuscar, gridBagConstraints);

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
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 20);
        add(pClientes, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButtonShaped btnClienteBuscar;
    public javax.swing.JComboBox<String> cbCiudad;
    public javax.swing.JComboBox<String> cbPais;
    public custom.CustomButtonShaped jButton10;
    public custom.CustomButtonShaped jButton11;
    public custom.CustomButtonShaped jButton9;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblNombreApellido;
    private javax.swing.JLabel lblPais;
    private javax.swing.JPanel pBuscar;
    private javax.swing.JPanel pBuscarCliente;
    public javax.swing.JPanel pCRUD;
    private javax.swing.JPanel pClienteBotones;
    public javax.swing.JPanel pClienteBuscar;
    public javax.swing.JPanel pClientes;
    public javax.swing.JPanel pDatosCliente;
    private javax.swing.JPanel pDireccion;
    public modelo.CustomTextField txfBuscar;
    public javax.swing.JTextField txfCliente1Nombre;
    public javax.swing.JTextField txfCliente2Nombre;
    public javax.swing.JTextField txfCorreo;
    public javax.swing.JTextField txfDNI1;
    public javax.swing.JTextField txfDNI2;
    public javax.swing.JTextField txfDireccion;
    public javax.swing.JTextField txfTelefono;
    // End of variables declaration//GEN-END:variables
}
