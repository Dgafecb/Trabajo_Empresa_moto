package vista;

public class Panel_Ventas extends javax.swing.JPanel {


    public Panel_Ventas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pDatosFactura = new javax.swing.JPanel();
        lblFactura = new javax.swing.JLabel();
        numeroFactura = new javax.swing.JLabel();
        pDatosCliente = new javax.swing.JPanel();
        lblNombreApellido = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfCliente1Nombre = new javax.swing.JTextField();
        txfCliente2Nombre = new javax.swing.JTextField();
        txfDNI1 = new javax.swing.JTextField();
        txfDNI2 = new javax.swing.JTextField();
        txfTelefono = new javax.swing.JTextField();
        txfCorreo = new javax.swing.JTextField();
        txfDireccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        pBuscarCliente = new javax.swing.JPanel();
        btnClienteBuscar = new javax.swing.JButton();
        btnClienteAgregar = new javax.swing.JButton();
        txfBuscar = new javax.swing.JTextField();
        pDireccion = new javax.swing.JPanel();
        lblCiudad = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        cbCiudad = new javax.swing.JComboBox<>();
        cbPais = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        pDatosInventario = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        pBuscarPor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        spInventario = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pDatosInventarioAdicional = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        pDatosTrabajador = new javax.swing.JPanel();
        lblTipoVenta = new javax.swing.JLabel();
        lblNombreTrabajador = new javax.swing.JLabel();
        lblCuotas = new javax.swing.JLabel();
        lblCuotaInicial = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        cbTipoVenta = new javax.swing.JComboBox<>();
        spnrCuotas = new javax.swing.JSpinner();
        txfDescuento = new javax.swing.JTextField();
        txfCuotaInicial = new javax.swing.JTextField();
        pDatosVenta = new javax.swing.JPanel();
        spDatosVentas = new javax.swing.JScrollPane();
        tDatosVentas = new javax.swing.JTable();
        pDatoBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnFacturar = new javax.swing.JButton();
        btnCotizar = new javax.swing.JButton();
        pTipoFactura = new javax.swing.JPanel();
        Boleta = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        pDatosAdicionales = new javax.swing.JPanel();

        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(933, 632));
        setMinimumSize(new java.awt.Dimension(933, 632));
        setLayout(new java.awt.GridBagLayout());

        pDatosFactura.setBackground(new java.awt.Color(250, 250, 250));
        pDatosFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pDatosFactura.setMaximumSize(new java.awt.Dimension(500, 75));
        pDatosFactura.setMinimumSize(new java.awt.Dimension(300, 55));
        pDatosFactura.setPreferredSize(new java.awt.Dimension(400, 65));
        pDatosFactura.setLayout(new java.awt.GridBagLayout());

        lblFactura.setText("Nro. Factura :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        pDatosFactura.add(lblFactura, gridBagConstraints);

        numeroFactura.setBackground(new java.awt.Color(255, 255, 255));
        numeroFactura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numeroFactura.setForeground(new java.awt.Color(60, 60, 60));
        numeroFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroFactura.setText("0");
        numeroFactura.setMaximumSize(new java.awt.Dimension(23, 39));
        numeroFactura.setMinimumSize(new java.awt.Dimension(23, 39));
        numeroFactura.setPreferredSize(new java.awt.Dimension(23, 39));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        pDatosFactura.add(numeroFactura, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pDatosFactura, gridBagConstraints);

        pDatosCliente.setBackground(new java.awt.Color(250, 250, 250));
        pDatosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)), "Datos Clientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(60, 60, 60))); // NOI18N
        pDatosCliente.setMaximumSize(new java.awt.Dimension(400, 450));
        pDatosCliente.setMinimumSize(new java.awt.Dimension(300, 350));
        pDatosCliente.setPreferredSize(new java.awt.Dimension(350, 400));
        pDatosCliente.setLayout(new java.awt.GridBagLayout());

        lblNombreApellido.setText("Nombre y Apellidos :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(lblNombreApellido, gridBagConstraints);

        lblDNI.setText("DNI :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(lblDNI, gridBagConstraints);

        jLabel1.setText("Correo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Direccion :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(jLabel3, gridBagConstraints);

        txfCliente1Nombre.setMaximumSize(new java.awt.Dimension(200, 20));
        txfCliente1Nombre.setMinimumSize(new java.awt.Dimension(200, 20));
        txfCliente1Nombre.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfCliente1Nombre, gridBagConstraints);

        txfCliente2Nombre.setMaximumSize(new java.awt.Dimension(200, 20));
        txfCliente2Nombre.setMinimumSize(new java.awt.Dimension(200, 20));
        txfCliente2Nombre.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfCliente2Nombre, gridBagConstraints);

        txfDNI1.setMaximumSize(new java.awt.Dimension(200, 20));
        txfDNI1.setMinimumSize(new java.awt.Dimension(200, 20));
        txfDNI1.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfDNI1, gridBagConstraints);

        txfDNI2.setMaximumSize(new java.awt.Dimension(200, 20));
        txfDNI2.setMinimumSize(new java.awt.Dimension(200, 20));
        txfDNI2.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfDNI2, gridBagConstraints);

        txfTelefono.setMaximumSize(new java.awt.Dimension(200, 20));
        txfTelefono.setMinimumSize(new java.awt.Dimension(200, 20));
        txfTelefono.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfTelefono, gridBagConstraints);

        txfCorreo.setMaximumSize(new java.awt.Dimension(200, 20));
        txfCorreo.setMinimumSize(new java.awt.Dimension(200, 20));
        txfCorreo.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfCorreo, gridBagConstraints);

        txfDireccion.setMaximumSize(new java.awt.Dimension(200, 20));
        txfDireccion.setMinimumSize(new java.awt.Dimension(200, 20));
        txfDireccion.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(txfDireccion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pDatosCliente.add(jSeparator1, gridBagConstraints);
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
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pDatosCliente.add(jSeparator4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pDatosCliente.add(jSeparator5, gridBagConstraints);

        pBuscarCliente.setBackground(new java.awt.Color(250, 250, 250));
        pBuscarCliente.setLayout(new java.awt.GridBagLayout());

        btnClienteBuscar.setText("Buscar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarCliente.add(btnClienteBuscar, gridBagConstraints);

        btnClienteAgregar.setText("+");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarCliente.add(btnClienteAgregar, gridBagConstraints);

        txfBuscar.setMaximumSize(new java.awt.Dimension(150, 20));
        txfBuscar.setMinimumSize(new java.awt.Dimension(150, 20));
        txfBuscar.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarCliente.add(txfBuscar, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(cbCiudad, gridBagConstraints);

        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
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
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosCliente.add(pDireccion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pDatosCliente, gridBagConstraints);

        pDatosInventario.setBackground(new java.awt.Color(250, 250, 250));
        pDatosInventario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pDatosInventario.setMaximumSize(new java.awt.Dimension(500, 250));
        pDatosInventario.setMinimumSize(new java.awt.Dimension(200, 150));
        pDatosInventario.setPreferredSize(new java.awt.Dimension(400, 200));
        pDatosInventario.setLayout(new java.awt.GridBagLayout());

        jTextField1.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField1.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField1.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventario.add(jTextField1, gridBagConstraints);

        jButton6.setText("buscar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventario.add(jButton6, gridBagConstraints);

        pBuscarPor.setBackground(new java.awt.Color(250, 250, 250));
        pBuscarPor.setMaximumSize(new java.awt.Dimension(400, 30));
        pBuscarPor.setMinimumSize(new java.awt.Dimension(200, 30));
        pBuscarPor.setPreferredSize(new java.awt.Dimension(250, 30));
        pBuscarPor.setLayout(new java.awt.GridBagLayout());

        jLabel6.setText("Buscar por:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarPor.add(jLabel6, gridBagConstraints);

        jRadioButton1.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton1.setText("Codigo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarPor.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton2.setText("Marca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarPor.add(jRadioButton2, gridBagConstraints);

        jRadioButton3.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton3.setText("Modelo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarPor.add(jRadioButton3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventario.add(pBuscarPor, gridBagConstraints);

        spInventario.setMaximumSize(new java.awt.Dimension(150, 100));
        spInventario.setMinimumSize(new java.awt.Dimension(150, 100));
        spInventario.setPreferredSize(new java.awt.Dimension(150, 100));

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
        jTable1.setMaximumSize(new java.awt.Dimension(100, 50));
        jTable1.setMinimumSize(new java.awt.Dimension(100, 50));
        jTable1.setPreferredSize(new java.awt.Dimension(100, 50));
        spInventario.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventario.add(spInventario, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pDatosInventario, gridBagConstraints);

        pDatosInventarioAdicional.setBackground(new java.awt.Color(250, 250, 250));
        pDatosInventarioAdicional.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Adicionales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(60, 60, 60))); // NOI18N
        pDatosInventarioAdicional.setMaximumSize(new java.awt.Dimension(800, 100));
        pDatosInventarioAdicional.setMinimumSize(new java.awt.Dimension(600, 100));
        pDatosInventarioAdicional.setPreferredSize(new java.awt.Dimension(700, 100));
        pDatosInventarioAdicional.setLayout(new java.awt.GridBagLayout());

        jLabel7.setText("Codigo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jLabel7, gridBagConstraints);

        jLabel8.setText("Marca :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jLabel8, gridBagConstraints);

        jLabel9.setText("Motor :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jLabel9, gridBagConstraints);

        jTextField2.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField2.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField2.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jTextField2, gridBagConstraints);

        jTextField3.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField3.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField3.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jTextField3, gridBagConstraints);

        jTextField4.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField4.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField4.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jTextField4, gridBagConstraints);

        jLabel10.setText("Chasis :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jLabel10, gridBagConstraints);

        jLabel11.setText("Precio:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jLabel11, gridBagConstraints);

        jLabel12.setText("Cantidad :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jLabel12, gridBagConstraints);

        jTextField5.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField5.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField5.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jTextField5, gridBagConstraints);

        jTextField6.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField6.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField6.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jTextField6, gridBagConstraints);

        jTextField7.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField7.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField7.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosInventarioAdicional.add(jTextField7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pDatosInventarioAdicional, gridBagConstraints);

        pDatosTrabajador.setBackground(new java.awt.Color(250, 250, 250));
        pDatosTrabajador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pDatosTrabajador.setLayout(new java.awt.GridBagLayout());

        lblTipoVenta.setText("Tipo de Venta :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosTrabajador.add(lblTipoVenta, gridBagConstraints);

        lblNombreTrabajador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombreTrabajador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreTrabajador.setText("SELLER : DEFAULT WORKER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosTrabajador.add(lblNombreTrabajador, gridBagConstraints);

        lblCuotas.setText("Cuotas :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosTrabajador.add(lblCuotas, gridBagConstraints);

        lblCuotaInicial.setText("Cuota Inicial:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosTrabajador.add(lblCuotaInicial, gridBagConstraints);

        lblDescuento.setText("Descuento :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosTrabajador.add(lblDescuento, gridBagConstraints);

        cbTipoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTipoVenta.setMaximumSize(new java.awt.Dimension(100, 20));
        cbTipoVenta.setMinimumSize(new java.awt.Dimension(100, 20));
        cbTipoVenta.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosTrabajador.add(cbTipoVenta, gridBagConstraints);

        spnrCuotas.setMaximumSize(new java.awt.Dimension(100, 20));
        spnrCuotas.setMinimumSize(new java.awt.Dimension(100, 20));
        spnrCuotas.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosTrabajador.add(spnrCuotas, gridBagConstraints);

        txfDescuento.setMaximumSize(new java.awt.Dimension(100, 20));
        txfDescuento.setMinimumSize(new java.awt.Dimension(100, 20));
        txfDescuento.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosTrabajador.add(txfDescuento, gridBagConstraints);

        txfCuotaInicial.setMaximumSize(new java.awt.Dimension(100, 20));
        txfCuotaInicial.setMinimumSize(new java.awt.Dimension(100, 20));
        txfCuotaInicial.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosTrabajador.add(txfCuotaInicial, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pDatosTrabajador, gridBagConstraints);

        pDatosVenta.setBackground(new java.awt.Color(250, 250, 250));
        pDatosVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pDatosVenta.setLayout(new java.awt.GridBagLayout());

        tDatosVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        spDatosVentas.setViewportView(tDatosVentas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosVenta.add(spDatosVentas, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        add(pDatosVenta, gridBagConstraints);

        pDatoBotones.setBackground(new java.awt.Color(250, 250, 250));
        pDatoBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pDatoBotones.setLayout(new java.awt.GridBagLayout());

        btnAgregar.setText("Agregar");
        btnAgregar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatoBotones.add(btnAgregar, gridBagConstraints);

        btnQuitar.setText("Quitar");
        btnQuitar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatoBotones.add(btnQuitar, gridBagConstraints);

        btnLimpiar.setText("Limpia");
        btnLimpiar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatoBotones.add(btnLimpiar, gridBagConstraints);

        btnFacturar.setText("Registrar");
        btnFacturar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatoBotones.add(btnFacturar, gridBagConstraints);

        btnCotizar.setText("Cotizar");
        btnCotizar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatoBotones.add(btnCotizar, gridBagConstraints);

        pTipoFactura.setBackground(new java.awt.Color(250, 250, 250));
        pTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(60, 60, 60))); // NOI18N
        pTipoFactura.setLayout(new java.awt.GridBagLayout());

        Boleta.setBackground(new java.awt.Color(250, 250, 250));
        Boleta.setText("Boleta");
        Boleta.setMaximumSize(new java.awt.Dimension(120, 25));
        Boleta.setMinimumSize(new java.awt.Dimension(120, 25));
        Boleta.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pTipoFactura.add(Boleta, gridBagConstraints);

        jRadioButton5.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton5.setText("Contrato");
        jRadioButton5.setMaximumSize(new java.awt.Dimension(120, 25));
        jRadioButton5.setMinimumSize(new java.awt.Dimension(120, 25));
        jRadioButton5.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pTipoFactura.add(jRadioButton5, gridBagConstraints);

        jRadioButton6.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton6.setText("Factura");
        jRadioButton6.setMaximumSize(new java.awt.Dimension(120, 25));
        jRadioButton6.setMinimumSize(new java.awt.Dimension(120, 25));
        jRadioButton6.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pTipoFactura.add(jRadioButton6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        pDatoBotones.add(pTipoFactura, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pDatoBotones, gridBagConstraints);

        pDatosAdicionales.setBackground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout pDatosAdicionalesLayout = new javax.swing.GroupLayout(pDatosAdicionales);
        pDatosAdicionales.setLayout(pDatosAdicionalesLayout);
        pDatosAdicionalesLayout.setHorizontalGroup(
            pDatosAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDatosAdicionalesLayout.setVerticalGroup(
            pDatosAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 6, 11, 0);
        add(pDatosAdicionales, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Boleta;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnClienteAgregar;
    private javax.swing.JButton btnClienteBuscar;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnFacturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox<String> cbCiudad;
    private javax.swing.JComboBox<String> cbPais;
    private javax.swing.JComboBox<String> cbTipoVenta;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCuotaInicial;
    private javax.swing.JLabel lblCuotas;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblNombreApellido;
    private javax.swing.JLabel lblNombreTrabajador;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblTipoVenta;
    private javax.swing.JLabel numeroFactura;
    private javax.swing.JPanel pBuscarCliente;
    private javax.swing.JPanel pBuscarPor;
    private javax.swing.JPanel pDatoBotones;
    private javax.swing.JPanel pDatosAdicionales;
    private javax.swing.JPanel pDatosCliente;
    private javax.swing.JPanel pDatosFactura;
    private javax.swing.JPanel pDatosInventario;
    private javax.swing.JPanel pDatosInventarioAdicional;
    private javax.swing.JPanel pDatosTrabajador;
    private javax.swing.JPanel pDatosVenta;
    private javax.swing.JPanel pDireccion;
    private javax.swing.JPanel pTipoFactura;
    private javax.swing.JScrollPane spDatosVentas;
    private javax.swing.JScrollPane spInventario;
    private javax.swing.JSpinner spnrCuotas;
    private javax.swing.JTable tDatosVentas;
    private javax.swing.JTextField txfBuscar;
    private javax.swing.JTextField txfCliente1Nombre;
    private javax.swing.JTextField txfCliente2Nombre;
    private javax.swing.JTextField txfCorreo;
    private javax.swing.JTextField txfCuotaInicial;
    private javax.swing.JTextField txfDNI1;
    private javax.swing.JTextField txfDNI2;
    private javax.swing.JTextField txfDescuento;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfTelefono;
    // End of variables declaration//GEN-END:variables
}
