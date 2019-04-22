
package vista;

public class Panel_Ajustes extends javax.swing.JPanel {


    public Panel_Ajustes() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        customPanel5 = new custom.CustomPanel();
        pDatosVentas = new custom.CustomPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txfVentaCredito = new javax.swing.JTextField();
        txfVentaEfectivo = new javax.swing.JTextField();
        txfVentaMayor = new javax.swing.JTextField();
        txfIGV = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        txfLimiteDescuento = new javax.swing.JTextField();
        txfComision = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txfCambioMoneda = new javax.swing.JTextField();
        customPanel4 = new custom.CustomPanel();
        btnGuardar = new modelo.CustomButtonShaped();
        customPanel2 = new custom.CustomPanel();
        jLabel12 = new javax.swing.JLabel();
        txfTolerancia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txfHoraEntrada = new javax.swing.JTextField();
        customPanel3 = new custom.CustomPanel();
        customPanel1 = new custom.CustomPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txfEmpresaNombre = new javax.swing.JTextField();
        txfRuc = new javax.swing.JTextField();
        txfTelefono = new javax.swing.JTextField();
        txfLocalidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaComentario = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        customPanel5.setBackground(new java.awt.Color(250, 250, 250));
        customPanel5.setForeground(new java.awt.Color(60, 60, 60));
        customPanel5.setOpaque(false);
        customPanel5.setLayout(new java.awt.GridBagLayout());

        pDatosVentas.setBackground(new java.awt.Color(250, 250, 250));
        pDatosVentas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "DATOS VENTAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Monospaced", 0, 14), new java.awt.Color(60, 60, 60))); // NOI18N
        pDatosVentas.setForeground(new java.awt.Color(250, 250, 250));
        pDatosVentas.setOpaque(false);
        pDatosVentas.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(60, 60, 60));
        jLabel6.setText("Venta Credito :");
        jLabel6.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(60, 60, 60));
        jLabel7.setText("Venta Efectivo :");
        jLabel7.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel7.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel7.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 60, 60));
        jLabel8.setText("Venta por Mayor :");
        jLabel8.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel8.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel8.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(60, 60, 60));
        jLabel9.setText("I.G.V. :");
        jLabel9.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel9.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel9.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 60, 60));
        jLabel10.setText("Moneda :");
        jLabel10.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel10.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel10.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(jLabel10, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 60, 60));
        jLabel11.setText("Limite de Dcto. :");
        jLabel11.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel11.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel11.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(jLabel11, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(60, 60, 60));
        jLabel14.setText("Comision por venta :");
        jLabel14.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel14.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel14.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(jLabel14, gridBagConstraints);

        txfVentaCredito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfVentaCredito.setForeground(new java.awt.Color(60, 60, 60));
        txfVentaCredito.setMaximumSize(new java.awt.Dimension(600, 35));
        txfVentaCredito.setMinimumSize(new java.awt.Dimension(600, 35));
        txfVentaCredito.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(txfVentaCredito, gridBagConstraints);

        txfVentaEfectivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfVentaEfectivo.setForeground(new java.awt.Color(60, 60, 60));
        txfVentaEfectivo.setMaximumSize(new java.awt.Dimension(600, 35));
        txfVentaEfectivo.setMinimumSize(new java.awt.Dimension(600, 35));
        txfVentaEfectivo.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(txfVentaEfectivo, gridBagConstraints);

        txfVentaMayor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfVentaMayor.setForeground(new java.awt.Color(60, 60, 60));
        txfVentaMayor.setMaximumSize(new java.awt.Dimension(600, 35));
        txfVentaMayor.setMinimumSize(new java.awt.Dimension(600, 35));
        txfVentaMayor.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(txfVentaMayor, gridBagConstraints);

        txfIGV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfIGV.setForeground(new java.awt.Color(60, 60, 60));
        txfIGV.setMaximumSize(new java.awt.Dimension(600, 35));
        txfIGV.setMinimumSize(new java.awt.Dimension(600, 35));
        txfIGV.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(txfIGV, gridBagConstraints);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NUEVOS SOLES", "DOLARES" }));
        jComboBox1.setEnabled(false);
        jComboBox1.setFocusable(false);
        jComboBox1.setMaximumSize(new java.awt.Dimension(600, 35));
        jComboBox1.setMinimumSize(new java.awt.Dimension(600, 35));
        jComboBox1.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(jComboBox1, gridBagConstraints);

        txfLimiteDescuento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfLimiteDescuento.setForeground(new java.awt.Color(60, 60, 60));
        txfLimiteDescuento.setMaximumSize(new java.awt.Dimension(600, 35));
        txfLimiteDescuento.setMinimumSize(new java.awt.Dimension(600, 35));
        txfLimiteDescuento.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(txfLimiteDescuento, gridBagConstraints);

        txfComision.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfComision.setForeground(new java.awt.Color(60, 60, 60));
        txfComision.setMaximumSize(new java.awt.Dimension(600, 35));
        txfComision.setMinimumSize(new java.awt.Dimension(600, 35));
        txfComision.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(txfComision, gridBagConstraints);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(60, 60, 60));
        jLabel15.setText("Cambio Moneda Actual:");
        jLabel15.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel15.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel15.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(jLabel15, gridBagConstraints);

        txfCambioMoneda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCambioMoneda.setForeground(new java.awt.Color(60, 60, 60));
        txfCambioMoneda.setEnabled(false);
        txfCambioMoneda.setMaximumSize(new java.awt.Dimension(600, 35));
        txfCambioMoneda.setMinimumSize(new java.awt.Dimension(600, 35));
        txfCambioMoneda.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVentas.add(txfCambioMoneda, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 50);
        customPanel5.add(pDatosVentas, gridBagConstraints);

        customPanel4.setBackground(new java.awt.Color(60, 60, 60));
        customPanel4.setForeground(new java.awt.Color(60, 60, 60));
        customPanel4.setOpaque(false);
        customPanel4.setLayout(new java.awt.GridBagLayout());

        btnGuardar.setText("GUARDAR");
        btnGuardar.setColorPressedGrad1(new java.awt.Color(60, 60, 60));
        btnGuardar.setColorPressedGrad2(new java.awt.Color(60, 60, 60));
        customPanel4.add(btnGuardar, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 50);
        customPanel5.add(customPanel4, gridBagConstraints);

        customPanel2.setBackground(new java.awt.Color(250, 250, 250));
        customPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "DATOS ASISTENCIA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Monospaced", 0, 14), new java.awt.Color(60, 60, 60))); // NOI18N
        customPanel2.setForeground(new java.awt.Color(250, 250, 250));
        customPanel2.setOpaque(false);
        customPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(60, 60, 60));
        jLabel12.setText("Hora de entrada :");
        jLabel12.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel12.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel12.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel2.add(jLabel12, gridBagConstraints);

        txfTolerancia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfTolerancia.setForeground(new java.awt.Color(60, 60, 60));
        txfTolerancia.setMaximumSize(new java.awt.Dimension(600, 35));
        txfTolerancia.setMinimumSize(new java.awt.Dimension(600, 35));
        txfTolerancia.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel2.add(txfTolerancia, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(60, 60, 60));
        jLabel13.setText("Tolerancia :");
        jLabel13.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel13.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel13.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel2.add(jLabel13, gridBagConstraints);

        txfHoraEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfHoraEntrada.setForeground(new java.awt.Color(60, 60, 60));
        txfHoraEntrada.setMaximumSize(new java.awt.Dimension(600, 35));
        txfHoraEntrada.setMinimumSize(new java.awt.Dimension(600, 35));
        txfHoraEntrada.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel2.add(txfHoraEntrada, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 50);
        customPanel5.add(customPanel2, gridBagConstraints);

        customPanel3.setLayout(new java.awt.GridBagLayout());
        customPanel5.add(customPanel3, new java.awt.GridBagConstraints());

        customPanel1.setBackground(new java.awt.Color(250, 250, 250));
        customPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "DATOS EMPRESA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Monospaced", 0, 14), new java.awt.Color(60, 60, 60))); // NOI18N
        customPanel1.setForeground(new java.awt.Color(250, 250, 250));
        customPanel1.setOpaque(false);
        customPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 60, 60));
        jLabel3.setText("R.U.C. :");
        jLabel3.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel3, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 60, 60));
        jLabel2.setText("Telefono :");
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 60, 60));
        jLabel4.setText("Localidad :");
        jLabel4.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 60, 60));
        jLabel5.setText("Comentario :");
        jLabel5.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel5, gridBagConstraints);

        txfEmpresaNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfEmpresaNombre.setForeground(new java.awt.Color(60, 60, 60));
        txfEmpresaNombre.setMaximumSize(new java.awt.Dimension(600, 35));
        txfEmpresaNombre.setMinimumSize(new java.awt.Dimension(600, 35));
        txfEmpresaNombre.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(txfEmpresaNombre, gridBagConstraints);

        txfRuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfRuc.setForeground(new java.awt.Color(60, 60, 60));
        txfRuc.setMaximumSize(new java.awt.Dimension(600, 35));
        txfRuc.setMinimumSize(new java.awt.Dimension(600, 35));
        txfRuc.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(txfRuc, gridBagConstraints);

        txfTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfTelefono.setForeground(new java.awt.Color(60, 60, 60));
        txfTelefono.setMaximumSize(new java.awt.Dimension(600, 35));
        txfTelefono.setMinimumSize(new java.awt.Dimension(600, 35));
        txfTelefono.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(txfTelefono, gridBagConstraints);

        txfLocalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfLocalidad.setForeground(new java.awt.Color(60, 60, 60));
        txfLocalidad.setMaximumSize(new java.awt.Dimension(600, 35));
        txfLocalidad.setMinimumSize(new java.awt.Dimension(600, 35));
        txfLocalidad.setPreferredSize(new java.awt.Dimension(600, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(txfLocalidad, gridBagConstraints);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));

        txaComentario.setColumns(20);
        txaComentario.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txaComentario.setLineWrap(true);
        txaComentario.setRows(6);
        txaComentario.setBorder(null);
        jScrollPane1.setViewportView(txaComentario);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 60));
        jLabel1.setText("Empresa :");
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 25));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 25));
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 50, 10, 50);
        customPanel5.add(customPanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(jSeparator2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel5, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButtonShaped btnGuardar;
    private custom.CustomPanel customPanel1;
    private custom.CustomPanel customPanel2;
    private custom.CustomPanel customPanel3;
    private custom.CustomPanel customPanel4;
    private custom.CustomPanel customPanel5;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private custom.CustomPanel pDatosVentas;
    public javax.swing.JTextArea txaComentario;
    public javax.swing.JTextField txfCambioMoneda;
    public javax.swing.JTextField txfComision;
    public javax.swing.JTextField txfEmpresaNombre;
    public javax.swing.JTextField txfHoraEntrada;
    public javax.swing.JTextField txfIGV;
    public javax.swing.JTextField txfLimiteDescuento;
    public javax.swing.JTextField txfLocalidad;
    public javax.swing.JTextField txfRuc;
    public javax.swing.JTextField txfTelefono;
    public javax.swing.JTextField txfTolerancia;
    public javax.swing.JTextField txfVentaCredito;
    public javax.swing.JTextField txfVentaEfectivo;
    public javax.swing.JTextField txfVentaMayor;
    // End of variables declaration//GEN-END:variables
}
