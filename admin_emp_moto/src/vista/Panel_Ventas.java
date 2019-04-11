package vista;

import java.awt.Color;
import modelo.Cadenas;

public class Panel_Ventas extends javax.swing.JPanel {


    public Panel_Ventas() {
        initComponents();
        spInventario.getViewport().setBackground(Color.WHITE);
        spDatosVentas.getViewport().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        customPanel2 = new custom.CustomPanel();
        lblFactura = new javax.swing.JLabel();
        numeroFactura = new javax.swing.JLabel();
        pClientes = new custom.CustomPanel();
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
        btnClienteBuscar = new modelo.CustomButtonShaped();
        btnClienteAgregar = new modelo.CustomButtonShaped();
        jPanel1 = new javax.swing.JPanel();
        txfBuscar = new custom.CustomTextField();
        pDireccion = new javax.swing.JPanel();
        lblCiudad = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        cbCiudad = new javax.swing.JComboBox<>();
        cbPais = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        pAlmacen = new custom.CustomPanel();
        spInventario = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pBuscarPor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        pBuscarCliente1 = new javax.swing.JPanel();
        btnClienteBuscar1 = new modelo.CustomButtonShaped();
        btnClienteAgregar1 = new modelo.CustomButtonShaped();
        jPanel2 = new javax.swing.JPanel();
        txfBuscar1 = new custom.CustomTextField();
        pAdicionalAlmacen = new custom.CustomPanel();
        txfAnhoFab = new javax.swing.JTextField();
        txfCantidad = new javax.swing.JTextField();
        txfPrecioUnidad = new javax.swing.JTextField();
        txfDescripcion = new javax.swing.JTextField();
        txfPrecioMayor = new javax.swing.JTextField();
        iconProductDefault = new javax.swing.JLabel();
        txfModelo = new javax.swing.JTextField();
        txfCategoria = new javax.swing.JTextField();
        txfProductoID = new javax.swing.JTextField();
        txfMarca = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblPrecioxUnidad = new javax.swing.JLabel();
        lblPrecioxMayor = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblAnhoFab = new javax.swing.JLabel();
        customPanel4 = new custom.CustomPanel();
        lblTipoVenta = new javax.swing.JLabel();
        txfCuotaInicial = new javax.swing.JTextField();
        lblNombreTrabajador = new javax.swing.JLabel();
        lblCuotas = new javax.swing.JLabel();
        lblCuotaInicial = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        cbTipoVenta = new javax.swing.JComboBox<>();
        spnrCuotas = new javax.swing.JSpinner();
        txfDescuento = new javax.swing.JTextField();
        pDatosVenta = new custom.CustomPanel();
        spDatosVentas = new javax.swing.JScrollPane();
        tDatosVentas = new javax.swing.JTable();
        customPanel3 = new custom.CustomPanel();
        btnAgregar = new javax.swing.JButton();
        btnCotizar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnFacturar = new javax.swing.JButton();
        pTipoFactura = new javax.swing.JPanel();
        rbBoleta = new javax.swing.JRadioButton();
        rbContrato = new javax.swing.JRadioButton();
        rbFactura = new javax.swing.JRadioButton();
        customPanel1 = new custom.CustomPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(60, 60, 60));
        setMaximumSize(new java.awt.Dimension(933, 632));
        setMinimumSize(new java.awt.Dimension(933, 632));
        setLayout(new java.awt.GridBagLayout());

        customPanel2.setBackground(new java.awt.Color(250, 250, 250));
        customPanel2.setForeground(new java.awt.Color(60, 60, 60));
        customPanel2.setMaximumSize(new java.awt.Dimension(300, 55));
        customPanel2.setMinimumSize(new java.awt.Dimension(300, 55));
        customPanel2.setOpaque(false);
        customPanel2.setPreferredSize(new java.awt.Dimension(300, 55));
        customPanel2.setLayout(new java.awt.GridBagLayout());

        lblFactura.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        lblFactura.setForeground(new java.awt.Color(60, 60, 60));
        lblFactura.setText("Nro. Factura :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        customPanel2.add(lblFactura, gridBagConstraints);

        numeroFactura.setBackground(new java.awt.Color(255, 255, 255));
        numeroFactura.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        numeroFactura.setForeground(new java.awt.Color(60, 60, 60));
        numeroFactura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeroFactura.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        customPanel2.add(numeroFactura, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel2, gridBagConstraints);

        pClientes.setBackground(new java.awt.Color(250, 250, 250));
        pClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "CLIENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 18), new java.awt.Color(60, 60, 60))); // NOI18N
        pClientes.setForeground(new java.awt.Color(60, 60, 60));
        pClientes.setOpaque(false);
        pClientes.setLayout(new java.awt.GridBagLayout());

        lblNombreApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreApellido.setForeground(new java.awt.Color(60, 60, 60));
        lblNombreApellido.setText("Nombre y Apellidos :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(lblNombreApellido, gridBagConstraints);

        lblDNI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(60, 60, 60));
        lblDNI.setText("DNI :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(lblDNI, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 60));
        jLabel1.setText("Correo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 60, 60));
        jLabel2.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 60, 60));
        jLabel3.setText("Direccion :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jLabel3, gridBagConstraints);

        txfCliente1Nombre.setMaximumSize(new java.awt.Dimension(200, 20));
        txfCliente1Nombre.setMinimumSize(new java.awt.Dimension(200, 20));
        txfCliente1Nombre.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(txfCliente1Nombre, gridBagConstraints);

        txfCliente2Nombre.setMaximumSize(new java.awt.Dimension(200, 20));
        txfCliente2Nombre.setMinimumSize(new java.awt.Dimension(200, 20));
        txfCliente2Nombre.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(txfCliente2Nombre, gridBagConstraints);

        txfDNI1.setMaximumSize(new java.awt.Dimension(200, 20));
        txfDNI1.setMinimumSize(new java.awt.Dimension(200, 20));
        txfDNI1.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(txfDNI1, gridBagConstraints);

        txfDNI2.setMaximumSize(new java.awt.Dimension(200, 20));
        txfDNI2.setMinimumSize(new java.awt.Dimension(200, 20));
        txfDNI2.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(txfDNI2, gridBagConstraints);

        txfTelefono.setMaximumSize(new java.awt.Dimension(200, 20));
        txfTelefono.setMinimumSize(new java.awt.Dimension(200, 20));
        txfTelefono.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(txfTelefono, gridBagConstraints);

        txfCorreo.setMaximumSize(new java.awt.Dimension(200, 20));
        txfCorreo.setMinimumSize(new java.awt.Dimension(200, 20));
        txfCorreo.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(txfCorreo, gridBagConstraints);

        txfDireccion.setMaximumSize(new java.awt.Dimension(200, 20));
        txfDireccion.setMinimumSize(new java.awt.Dimension(200, 20));
        txfDireccion.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(txfDireccion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jSeparator2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jSeparator3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jSeparator4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jSeparator5, gridBagConstraints);

        pBuscarCliente.setBackground(new java.awt.Color(250, 250, 250));
        pBuscarCliente.setLayout(new java.awt.GridBagLayout());

        btnClienteBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBuscar.png"))); // NOI18N
        btnClienteBuscar.setToolTipText("");
        btnClienteBuscar.setCurve(0);
        btnClienteBuscar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pBuscarCliente.add(btnClienteBuscar, gridBagConstraints);

        btnClienteAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnAgregar2.png"))); // NOI18N
        btnClienteAgregar.setToolTipText("");
        btnClienteAgregar.setCurve(15);
        btnClienteAgregar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnClienteAgregar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnClienteAgregar.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pBuscarCliente.add(btnClienteAgregar, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jPanel1.setMaximumSize(new java.awt.Dimension(100, 40));
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txfBuscar.setBorder(null);
        txfBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscar.setMaximumSize(new java.awt.Dimension(200, 38));
        txfBuscar.setMinimumSize(new java.awt.Dimension(200, 38));
        txfBuscar.setPhColor(new java.awt.Color(150, 150, 150));
        txfBuscar.setPlaceholder(Cadenas.CLIENTES_BUSCAR);
        txfBuscar.setPreferredSize(new java.awt.Dimension(200, 38));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel1.add(txfBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        pBuscarCliente.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pBuscarCliente, gridBagConstraints);

        pDireccion.setBackground(new java.awt.Color(250, 250, 250));
        pDireccion.setLayout(new java.awt.GridBagLayout());

        lblCiudad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(60, 60, 60));
        lblCiudad.setText("Ciudad :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(lblCiudad, gridBagConstraints);

        lblPais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPais.setForeground(new java.awt.Color(60, 60, 60));
        lblPais.setText("Pais :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(lblPais, gridBagConstraints);

        cbCiudad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbCiudad.setForeground(new java.awt.Color(60, 60, 60));
        cbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCiudad.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(cbCiudad, gridBagConstraints);

        cbPais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbPais.setForeground(new java.awt.Color(60, 60, 60));
        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Argentina", "Brasil", "Colombia", "Ecuador", "Mexico", "Peru", "Venezuela" }));
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
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pDireccion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pClientes, gridBagConstraints);

        pAlmacen.setBackground(new java.awt.Color(250, 250, 250));
        pAlmacen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "ALMACEN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 18), new java.awt.Color(60, 60, 60))); // NOI18N
        pAlmacen.setForeground(new java.awt.Color(60, 60, 60));
        pAlmacen.setOpaque(false);
        pAlmacen.setLayout(new java.awt.GridBagLayout());

        spInventario.setMaximumSize(new java.awt.Dimension(150, 100));
        spInventario.setMinimumSize(new java.awt.Dimension(150, 100));
        spInventario.setPreferredSize(new java.awt.Dimension(150, 100));

        jTable1.setBackground(new java.awt.Color(250, 250, 250));
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
        jTable1.setOpaque(false);
        jTable1.setPreferredSize(new java.awt.Dimension(100, 50));
        spInventario.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAlmacen.add(spInventario, gridBagConstraints);

        pBuscarPor.setBackground(new java.awt.Color(250, 250, 250));
        pBuscarPor.setMaximumSize(new java.awt.Dimension(400, 60));
        pBuscarPor.setMinimumSize(new java.awt.Dimension(200, 60));
        pBuscarPor.setPreferredSize(new java.awt.Dimension(250, 60));
        pBuscarPor.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(60, 60, 60));
        jLabel6.setText("Buscar :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        pBuscarPor.add(jLabel6, gridBagConstraints);

        jRadioButton1.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(60, 60, 60));
        jRadioButton1.setText("Codigo");
        jRadioButton1.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarPor.add(jRadioButton1, gridBagConstraints);

        jRadioButton2.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(60, 60, 60));
        jRadioButton2.setText("Nombre");
        jRadioButton2.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarPor.add(jRadioButton2, gridBagConstraints);

        jRadioButton3.setBackground(new java.awt.Color(250, 250, 250));
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(60, 60, 60));
        jRadioButton3.setText("Marca");
        jRadioButton3.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarPor.add(jRadioButton3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAlmacen.add(pBuscarPor, gridBagConstraints);

        pBuscarCliente1.setBackground(new java.awt.Color(250, 250, 250));
        pBuscarCliente1.setLayout(new java.awt.GridBagLayout());

        btnClienteBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBuscar.png"))); // NOI18N
        btnClienteBuscar1.setToolTipText("");
        btnClienteBuscar1.setCurve(0);
        btnClienteBuscar1.setMaximumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar1.setMinimumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar1.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pBuscarCliente1.add(btnClienteBuscar1, gridBagConstraints);

        btnClienteAgregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnAgregar2.png"))); // NOI18N
        btnClienteAgregar1.setToolTipText("");
        btnClienteAgregar1.setCurve(15);
        btnClienteAgregar1.setMaximumSize(new java.awt.Dimension(40, 40));
        btnClienteAgregar1.setMinimumSize(new java.awt.Dimension(40, 40));
        btnClienteAgregar1.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pBuscarCliente1.add(btnClienteAgregar1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jPanel2.setMaximumSize(new java.awt.Dimension(100, 40));
        jPanel2.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        txfBuscar1.setBorder(null);
        txfBuscar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscar1.setMaximumSize(new java.awt.Dimension(200, 38));
        txfBuscar1.setMinimumSize(new java.awt.Dimension(200, 38));
        txfBuscar1.setPhColor(new java.awt.Color(150, 150, 150));
        txfBuscar1.setPreferredSize(new java.awt.Dimension(200, 38));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel2.add(txfBuscar1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        pBuscarCliente1.add(jPanel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAlmacen.add(pBuscarCliente1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pAlmacen, gridBagConstraints);

        pAdicionalAlmacen.setBackground(new java.awt.Color(250, 250, 250));
        pAdicionalAlmacen.setForeground(new java.awt.Color(60, 60, 60));
        pAdicionalAlmacen.setOpaque(false);
        pAdicionalAlmacen.setLayout(new java.awt.GridBagLayout());

        txfAnhoFab.setEnabled(false);
        txfAnhoFab.setMaximumSize(new java.awt.Dimension(100, 20));
        txfAnhoFab.setMinimumSize(new java.awt.Dimension(100, 20));
        txfAnhoFab.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfAnhoFab, gridBagConstraints);

        txfCantidad.setEnabled(false);
        txfCantidad.setMaximumSize(new java.awt.Dimension(100, 20));
        txfCantidad.setMinimumSize(new java.awt.Dimension(100, 20));
        txfCantidad.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfCantidad, gridBagConstraints);

        txfPrecioUnidad.setEnabled(false);
        txfPrecioUnidad.setMaximumSize(new java.awt.Dimension(100, 20));
        txfPrecioUnidad.setMinimumSize(new java.awt.Dimension(100, 20));
        txfPrecioUnidad.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfPrecioUnidad, gridBagConstraints);

        txfDescripcion.setEnabled(false);
        txfDescripcion.setMaximumSize(new java.awt.Dimension(100, 20));
        txfDescripcion.setMinimumSize(new java.awt.Dimension(100, 20));
        txfDescripcion.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfDescripcion, gridBagConstraints);

        txfPrecioMayor.setEnabled(false);
        txfPrecioMayor.setMaximumSize(new java.awt.Dimension(100, 20));
        txfPrecioMayor.setMinimumSize(new java.awt.Dimension(100, 20));
        txfPrecioMayor.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfPrecioMayor, gridBagConstraints);

        iconProductDefault.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(80x80px)iconProductDefault.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(iconProductDefault, gridBagConstraints);

        txfModelo.setEnabled(false);
        txfModelo.setMaximumSize(new java.awt.Dimension(100, 20));
        txfModelo.setMinimumSize(new java.awt.Dimension(100, 20));
        txfModelo.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfModelo, gridBagConstraints);

        txfCategoria.setEnabled(false);
        txfCategoria.setMaximumSize(new java.awt.Dimension(100, 20));
        txfCategoria.setMinimumSize(new java.awt.Dimension(100, 20));
        txfCategoria.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfCategoria, gridBagConstraints);

        txfProductoID.setEnabled(false);
        txfProductoID.setMaximumSize(new java.awt.Dimension(100, 20));
        txfProductoID.setMinimumSize(new java.awt.Dimension(100, 20));
        txfProductoID.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfProductoID, gridBagConstraints);

        txfMarca.setEnabled(false);
        txfMarca.setMaximumSize(new java.awt.Dimension(100, 20));
        txfMarca.setMinimumSize(new java.awt.Dimension(100, 20));
        txfMarca.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfMarca, gridBagConstraints);

        lblCodigo.setText("Codigo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblCodigo, gridBagConstraints);

        lblCategoria.setText("Categoria :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblCategoria, gridBagConstraints);

        lblDescripcion.setText("Descripcion :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblDescripcion, gridBagConstraints);

        lblPrecioxUnidad.setText("Precio por unidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblPrecioxUnidad, gridBagConstraints);

        lblPrecioxMayor.setText("Precio por mayor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblPrecioxMayor, gridBagConstraints);

        lblCantidad.setText("Cantidad disponible :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblCantidad, gridBagConstraints);

        lblMarca.setText("Marca :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblMarca, gridBagConstraints);

        lblModelo.setText("Modelo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblModelo, gridBagConstraints);

        lblAnhoFab.setText("Año de Fab. :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblAnhoFab, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pAdicionalAlmacen, gridBagConstraints);

        customPanel4.setBackground(new java.awt.Color(250, 250, 250));
        customPanel4.setForeground(new java.awt.Color(60, 60, 60));
        customPanel4.setOpaque(false);
        customPanel4.setLayout(new java.awt.GridBagLayout());

        lblTipoVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipoVenta.setForeground(new java.awt.Color(60, 60, 60));
        lblTipoVenta.setText("Tipo de Venta :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(lblTipoVenta, gridBagConstraints);

        txfCuotaInicial.setMaximumSize(new java.awt.Dimension(200, 20));
        txfCuotaInicial.setMinimumSize(new java.awt.Dimension(200, 20));
        txfCuotaInicial.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(txfCuotaInicial, gridBagConstraints);

        lblNombreTrabajador.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        lblNombreTrabajador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreTrabajador.setText("SELLER : DEFAULT WORKER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(lblNombreTrabajador, gridBagConstraints);

        lblCuotas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCuotas.setForeground(new java.awt.Color(60, 60, 60));
        lblCuotas.setText("Cuotas :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(lblCuotas, gridBagConstraints);

        lblCuotaInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCuotaInicial.setForeground(new java.awt.Color(60, 60, 60));
        lblCuotaInicial.setText("Cuota Inicial:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(lblCuotaInicial, gridBagConstraints);

        lblDescuento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescuento.setForeground(new java.awt.Color(60, 60, 60));
        lblDescuento.setText("Descuento :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(lblDescuento, gridBagConstraints);

        cbTipoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbTipoVenta.setFocusable(false);
        cbTipoVenta.setMaximumSize(new java.awt.Dimension(100, 20));
        cbTipoVenta.setMinimumSize(new java.awt.Dimension(100, 20));
        cbTipoVenta.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(cbTipoVenta, gridBagConstraints);

        spnrCuotas.setMaximumSize(new java.awt.Dimension(100, 20));
        spnrCuotas.setMinimumSize(new java.awt.Dimension(100, 20));
        spnrCuotas.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(spnrCuotas, gridBagConstraints);

        txfDescuento.setMaximumSize(new java.awt.Dimension(200, 20));
        txfDescuento.setMinimumSize(new java.awt.Dimension(200, 20));
        txfDescuento.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(txfDescuento, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel4, gridBagConstraints);

        pDatosVenta.setBackground(new java.awt.Color(250, 250, 250));
        pDatosVenta.setForeground(new java.awt.Color(60, 60, 60));
        pDatosVenta.setOpaque(false);
        pDatosVenta.setLayout(new java.awt.GridBagLayout());

        spDatosVentas.setMaximumSize(new java.awt.Dimension(1200, 800));
        spDatosVentas.setMinimumSize(new java.awt.Dimension(600, 500));
        spDatosVentas.setPreferredSize(new java.awt.Dimension(700, 500));

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
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pDatosVenta.add(spDatosVentas, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pDatosVenta, gridBagConstraints);

        customPanel3.setBackground(new java.awt.Color(250, 250, 250));
        customPanel3.setForeground(new java.awt.Color(60, 60, 60));
        customPanel3.setOpaque(false);
        customPanel3.setLayout(new java.awt.GridBagLayout());

        btnAgregar.setText("AGREGAR");
        btnAgregar.setFocusPainted(false);
        btnAgregar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnAgregar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnAgregar.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(btnAgregar, gridBagConstraints);

        btnCotizar.setText("COTIZAR");
        btnCotizar.setFocusPainted(false);
        btnCotizar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnCotizar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnCotizar.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(btnCotizar, gridBagConstraints);

        btnQuitar.setText("QUITAR");
        btnQuitar.setFocusPainted(false);
        btnQuitar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnQuitar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnQuitar.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(btnQuitar, gridBagConstraints);

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setMaximumSize(new java.awt.Dimension(120, 25));
        btnLimpiar.setMinimumSize(new java.awt.Dimension(120, 25));
        btnLimpiar.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(btnLimpiar, gridBagConstraints);

        btnFacturar.setText("REGISTRAR");
        btnFacturar.setFocusPainted(false);
        btnFacturar.setMaximumSize(new java.awt.Dimension(120, 60));
        btnFacturar.setMinimumSize(new java.awt.Dimension(120, 60));
        btnFacturar.setPreferredSize(new java.awt.Dimension(120, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(btnFacturar, gridBagConstraints);

        pTipoFactura.setBackground(new java.awt.Color(250, 250, 250));
        pTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Emision", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(60, 60, 60))); // NOI18N
        pTipoFactura.setLayout(new java.awt.GridBagLayout());

        rbBoleta.setBackground(new java.awt.Color(250, 250, 250));
        rbBoleta.setText("Boleta");
        rbBoleta.setFocusPainted(false);
        rbBoleta.setMaximumSize(new java.awt.Dimension(120, 25));
        rbBoleta.setMinimumSize(new java.awt.Dimension(120, 25));
        rbBoleta.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pTipoFactura.add(rbBoleta, gridBagConstraints);

        rbContrato.setBackground(new java.awt.Color(250, 250, 250));
        rbContrato.setText("Contrato");
        rbContrato.setFocusPainted(false);
        rbContrato.setMaximumSize(new java.awt.Dimension(120, 25));
        rbContrato.setMinimumSize(new java.awt.Dimension(120, 25));
        rbContrato.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pTipoFactura.add(rbContrato, gridBagConstraints);

        rbFactura.setBackground(new java.awt.Color(250, 250, 250));
        rbFactura.setText("Factura");
        rbFactura.setFocusPainted(false);
        rbFactura.setMaximumSize(new java.awt.Dimension(120, 25));
        rbFactura.setMinimumSize(new java.awt.Dimension(120, 25));
        rbFactura.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pTipoFactura.add(rbFactura, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(pTipoFactura, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel3, gridBagConstraints);

        customPanel1.setBackground(new java.awt.Color(250, 250, 250));
        customPanel1.setOpaque(false);
        customPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Precio sin IGV :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel15, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Precio con IGV :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel16, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Cuota Inicial :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel17, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel18.setText("TOTAL :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel18, gridBagConstraints);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Precio sin Descuento :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel19, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Precio con Descuento :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel20, gridBagConstraints);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Cuota Mensual :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel21, gridBagConstraints);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel22, gridBagConstraints);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel23, gridBagConstraints);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel24, gridBagConstraints);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel25, gridBagConstraints);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel26, gridBagConstraints);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel27, gridBagConstraints);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("0.00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel28, gridBagConstraints);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        customPanel1.add(jLabel29, gridBagConstraints);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("MONEDA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        customPanel1.add(jLabel30, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private modelo.CustomButtonShaped btnClienteAgregar;
    private modelo.CustomButtonShaped btnClienteAgregar1;
    private modelo.CustomButtonShaped btnClienteBuscar;
    private modelo.CustomButtonShaped btnClienteBuscar1;
    private javax.swing.JButton btnCotizar;
    private javax.swing.JButton btnFacturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JComboBox<String> cbCiudad;
    private javax.swing.JComboBox<String> cbPais;
    private javax.swing.JComboBox<String> cbTipoVenta;
    private custom.CustomPanel customPanel1;
    private custom.CustomPanel customPanel2;
    private custom.CustomPanel customPanel3;
    private custom.CustomPanel customPanel4;
    private javax.swing.JLabel iconProductDefault;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAnhoFab;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCuotaInicial;
    private javax.swing.JLabel lblCuotas;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblNombreApellido;
    private javax.swing.JLabel lblNombreTrabajador;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPrecioxMayor;
    private javax.swing.JLabel lblPrecioxUnidad;
    private javax.swing.JLabel lblTipoVenta;
    private javax.swing.JLabel numeroFactura;
    private custom.CustomPanel pAdicionalAlmacen;
    private custom.CustomPanel pAlmacen;
    private javax.swing.JPanel pBuscarCliente;
    private javax.swing.JPanel pBuscarCliente1;
    private javax.swing.JPanel pBuscarPor;
    private custom.CustomPanel pClientes;
    private custom.CustomPanel pDatosVenta;
    private javax.swing.JPanel pDireccion;
    private javax.swing.JPanel pTipoFactura;
    private javax.swing.JRadioButton rbBoleta;
    private javax.swing.JRadioButton rbContrato;
    private javax.swing.JRadioButton rbFactura;
    private javax.swing.JScrollPane spDatosVentas;
    private javax.swing.JScrollPane spInventario;
    private javax.swing.JSpinner spnrCuotas;
    private javax.swing.JTable tDatosVentas;
    private javax.swing.JTextField txfAnhoFab;
    private custom.CustomTextField txfBuscar;
    private custom.CustomTextField txfBuscar1;
    private javax.swing.JTextField txfCantidad;
    private javax.swing.JTextField txfCategoria;
    private javax.swing.JTextField txfCliente1Nombre;
    private javax.swing.JTextField txfCliente2Nombre;
    private javax.swing.JTextField txfCorreo;
    private javax.swing.JTextField txfCuotaInicial;
    private javax.swing.JTextField txfDNI1;
    private javax.swing.JTextField txfDNI2;
    private javax.swing.JTextField txfDescripcion;
    private javax.swing.JTextField txfDescuento;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfMarca;
    private javax.swing.JTextField txfModelo;
    private javax.swing.JTextField txfPrecioMayor;
    private javax.swing.JTextField txfPrecioUnidad;
    private javax.swing.JTextField txfProductoID;
    private javax.swing.JTextField txfTelefono;
    // End of variables declaration//GEN-END:variables
}
