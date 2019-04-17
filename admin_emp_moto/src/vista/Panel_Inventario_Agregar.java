
package vista;

import java.awt.event.ItemEvent;


public class Panel_Inventario_Agregar extends javax.swing.JPanel {


    public Panel_Inventario_Agregar() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Motor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txfID = new javax.swing.JTextField();
        txfMarca = new javax.swing.JTextField();
        txfModelo = new javax.swing.JTextField();
        txfColor = new javax.swing.JTextField();
        txfMotor = new javax.swing.JTextField();
        txfChasis = new javax.swing.JTextField();
        txfFab = new javax.swing.JTextField();
        txfGarantia = new javax.swing.JTextField();
        txfPrecio = new javax.swing.JTextField();
        txfCantidad = new javax.swing.JTextField();
        txfAdvertencia = new javax.swing.JTextField();
        cbxVehiculo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txfDescripicion = new javax.swing.JTextField();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 60));
        jLabel1.setText("ID :");
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 60, 60));
        jLabel2.setText("Descripcion :");
        jLabel2.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 60, 60));
        jLabel3.setText("Marca :");
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 60, 60));
        jLabel4.setText("Modelo :");
        jLabel4.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 60, 60));
        jLabel5.setText("Color :");
        jLabel5.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel5, gridBagConstraints);

        Motor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Motor.setForeground(new java.awt.Color(60, 60, 60));
        Motor.setText("Motor :");
        Motor.setMaximumSize(new java.awt.Dimension(150, 20));
        Motor.setMinimumSize(new java.awt.Dimension(150, 20));
        Motor.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(Motor, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(60, 60, 60));
        jLabel6.setText("Chasis :");
        jLabel6.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(60, 60, 60));
        jLabel7.setText("Año de Fabricacion :");
        jLabel7.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 60, 60));
        jLabel8.setText("Años de Garantia :");
        jLabel8.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(60, 60, 60));
        jLabel9.setText("Cantidad :");
        jLabel9.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel9.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 60, 60));
        jLabel10.setText("Precio :");
        jLabel10.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel10.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 60, 60));
        jLabel11.setText("Cantidad Advertencia :");
        jLabel11.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel11.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel11.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel11, gridBagConstraints);

        txfID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfID.setToolTipText("");
        txfID.setMaximumSize(new java.awt.Dimension(250, 20));
        txfID.setMinimumSize(new java.awt.Dimension(250, 20));
        txfID.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfID, gridBagConstraints);

        txfMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfMarca.setToolTipText("");
        txfMarca.setMaximumSize(new java.awt.Dimension(250, 20));
        txfMarca.setMinimumSize(new java.awt.Dimension(250, 20));
        txfMarca.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfMarca, gridBagConstraints);

        txfModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfModelo.setToolTipText("");
        txfModelo.setMaximumSize(new java.awt.Dimension(250, 20));
        txfModelo.setMinimumSize(new java.awt.Dimension(250, 20));
        txfModelo.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfModelo, gridBagConstraints);

        txfColor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfColor.setToolTipText("");
        txfColor.setMaximumSize(new java.awt.Dimension(250, 20));
        txfColor.setMinimumSize(new java.awt.Dimension(250, 20));
        txfColor.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfColor, gridBagConstraints);

        txfMotor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfMotor.setToolTipText("");
        txfMotor.setMaximumSize(new java.awt.Dimension(250, 20));
        txfMotor.setMinimumSize(new java.awt.Dimension(250, 20));
        txfMotor.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfMotor, gridBagConstraints);

        txfChasis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfChasis.setToolTipText("");
        txfChasis.setMaximumSize(new java.awt.Dimension(250, 20));
        txfChasis.setMinimumSize(new java.awt.Dimension(250, 20));
        txfChasis.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfChasis, gridBagConstraints);

        txfFab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfFab.setToolTipText("");
        txfFab.setMaximumSize(new java.awt.Dimension(250, 20));
        txfFab.setMinimumSize(new java.awt.Dimension(250, 20));
        txfFab.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfFab, gridBagConstraints);

        txfGarantia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfGarantia.setToolTipText("");
        txfGarantia.setMaximumSize(new java.awt.Dimension(250, 20));
        txfGarantia.setMinimumSize(new java.awt.Dimension(250, 20));
        txfGarantia.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfGarantia, gridBagConstraints);

        txfPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPrecio.setToolTipText("");
        txfPrecio.setMaximumSize(new java.awt.Dimension(250, 20));
        txfPrecio.setMinimumSize(new java.awt.Dimension(250, 20));
        txfPrecio.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfPrecio, gridBagConstraints);

        txfCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCantidad.setToolTipText("");
        txfCantidad.setMaximumSize(new java.awt.Dimension(250, 20));
        txfCantidad.setMinimumSize(new java.awt.Dimension(250, 20));
        txfCantidad.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfCantidad, gridBagConstraints);

        txfAdvertencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfAdvertencia.setToolTipText("");
        txfAdvertencia.setMaximumSize(new java.awt.Dimension(250, 20));
        txfAdvertencia.setMinimumSize(new java.awt.Dimension(250, 20));
        txfAdvertencia.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfAdvertencia, gridBagConstraints);

        cbxVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VEHICULO", "REPUESTO" }));
        cbxVehiculo.setFocusable(false);
        cbxVehiculo.setMaximumSize(new java.awt.Dimension(250, 20));
        cbxVehiculo.setMinimumSize(new java.awt.Dimension(250, 20));
        cbxVehiculo.setPreferredSize(new java.awt.Dimension(250, 20));
        cbxVehiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxVehiculoItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(cbxVehiculo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jSeparator2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jSeparator3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jSeparator4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jSeparator5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jSeparator6, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(60, 60, 60));
        jLabel12.setText("Categoria :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel12, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jSeparator7, gridBagConstraints);

        txfDescripicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDescripicion.setToolTipText("");
        txfDescripicion.setMaximumSize(new java.awt.Dimension(250, 20));
        txfDescripicion.setMinimumSize(new java.awt.Dimension(250, 20));
        txfDescripicion.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(txfDescripicion, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxVehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxVehiculoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            if (item.toString().equals("REPUESTO")) {
                this.txfModelo.setText("");
                this.txfModelo.setEnabled(false);
                this.txfColor.setText("");
                this.txfColor.setEnabled(false);
                this.txfMotor.setText("");
                this.txfMotor.setEnabled(false);
                this.txfChasis.setText("");
                this.txfChasis.setEnabled(false);
            } else {
                this.txfModelo.setEnabled(true);
                this.txfColor.setEnabled(true);
                this.txfMotor.setEnabled(true);
                this.txfChasis.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cbxVehiculoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Motor;
    public javax.swing.JComboBox<String> cbxVehiculo;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public javax.swing.JSeparator jSeparator7;
    public javax.swing.JTextField txfAdvertencia;
    public javax.swing.JTextField txfCantidad;
    public javax.swing.JTextField txfChasis;
    public javax.swing.JTextField txfColor;
    public javax.swing.JTextField txfDescripicion;
    public javax.swing.JTextField txfFab;
    public javax.swing.JTextField txfGarantia;
    public javax.swing.JTextField txfID;
    public javax.swing.JTextField txfMarca;
    public javax.swing.JTextField txfModelo;
    public javax.swing.JTextField txfMotor;
    public javax.swing.JTextField txfPrecio;
    // End of variables declaration//GEN-END:variables
}
