package vista;

import java.awt.Color;
import java.awt.event.ItemEvent;
import modelo.Cadenas;

public class Panel_Ventas extends javax.swing.JPanel {


    public Panel_Ventas() {
        initComponents();
        spAlmacen.getViewport().setBackground(Color.WHITE);
        spDatosVentas.getViewport().setBackground(Color.WHITE);
        llenarCiudad(0);
    }
    
    private void llenarCiudad(int i){
        cbCiudad.removeAllItems();
        switch (i) {
            case 0:{
                cbCiudad.addItem("Amazonas");
                cbCiudad.addItem("Áncash");
                cbCiudad.addItem("Apurímac");
                cbCiudad.addItem("Arequipa");
                cbCiudad.addItem("Ayacucho");
                cbCiudad.addItem("Cajamarca");
                cbCiudad.addItem("Callao");
                cbCiudad.addItem("Cusco");
                cbCiudad.addItem("Huancavelica");
                cbCiudad.addItem("Huánuco");
                cbCiudad.addItem("Ica");
                cbCiudad.addItem("Junín");
                cbCiudad.addItem("La Libertad");
                cbCiudad.addItem("Lambayeque");
                cbCiudad.addItem("Lima");
                cbCiudad.addItem("Loreto");
                cbCiudad.addItem("Madre de Dios");
                cbCiudad.addItem("Moquegua");
                cbCiudad.addItem("Pasco");
                cbCiudad.addItem("Piura");
                cbCiudad.addItem("Puno");
                cbCiudad.addItem("Pasco");
                cbCiudad.addItem("San Martín");
                cbCiudad.addItem("Tacna"); 
                cbCiudad.addItem("Tumbes");
                cbCiudad.addItem("Ucayali");
                break;
                }
            case 1:
                break;
            case 2:
                break;
            default:cbCiudad.addItem("Ingresa Pais");
                break;
        }
    }

    private void evaluarPais(String item){
        switch (item) {
            case "Peru": llenarCiudad(0);
                break;
            default: llenarCiudad(-1);
                break;
        }
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
        pCNombre1 = new javax.swing.JPanel();
        txfCNombre1 = new custom.CustomTextField();
        pCNombre2 = new javax.swing.JPanel();
        txfCNombre2 = new custom.CustomTextField();
        pCDNI1 = new javax.swing.JPanel();
        txfCDNI1 = new custom.CustomTextField();
        pCDNI2 = new javax.swing.JPanel();
        txfCDNI2 = new custom.CustomTextField();
        pCTelefono = new javax.swing.JPanel();
        txfCTelefono = new custom.CustomTextField();
        pCCorreo = new javax.swing.JPanel();
        txfCCorreo = new custom.CustomTextField();
        pCDireccion = new javax.swing.JPanel();
        txfCDireccion = new custom.CustomTextField();
        pDireccion = new javax.swing.JPanel();
        lblCiudad = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        cbCiudad = new javax.swing.JComboBox<>();
        cbPais = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        pAlmacen = new custom.CustomPanel();
        spAlmacen = new javax.swing.JScrollPane();
        tAlmacen = new javax.swing.JTable();
        pBuscarPor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        pAlmacenBuscar = new javax.swing.JPanel();
        btnAlmacenBuscar = new modelo.CustomButtonShaped();
        pContenedor = new javax.swing.JPanel();
        txfAlmacenBuscar = new custom.CustomTextField();
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
        pTipoFactura = new javax.swing.JPanel();
        rbBoleta = new javax.swing.JRadioButton();
        rbContrato = new javax.swing.JRadioButton();
        rbFactura = new javax.swing.JRadioButton();
        customButtonShaped1 = new custom.CustomButtonShaped();
        customButtonShaped2 = new custom.CustomButtonShaped();
        customButtonShaped3 = new custom.CustomButtonShaped();
        customButtonShaped4 = new custom.CustomButtonShaped();
        customButtonShaped5 = new custom.CustomButtonShaped();
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
        lblsgnoMoneda = new javax.swing.JLabel();
        lblMoneda = new javax.swing.JLabel();

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

        jSeparator1.setForeground(new java.awt.Color(200, 200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jSeparator1, gridBagConstraints);

        jSeparator2.setForeground(new java.awt.Color(200, 200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jSeparator2, gridBagConstraints);

        jSeparator3.setForeground(new java.awt.Color(200, 200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jSeparator3, gridBagConstraints);

        jSeparator4.setForeground(new java.awt.Color(200, 200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(jSeparator4, gridBagConstraints);

        jSeparator5.setForeground(new java.awt.Color(200, 200, 200));
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
        txfBuscar.setCaretColor(new java.awt.Color(60, 60, 60));
        txfBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscar.setMaximumSize(new java.awt.Dimension(200, 38));
        txfBuscar.setMinimumSize(new java.awt.Dimension(200, 38));
        txfBuscar.setPhColor(new java.awt.Color(60, 60, 60));
        txfBuscar.setPlaceholder(Cadenas.CLIENTES_BUSCAR);
        txfBuscar.setPreferredSize(new java.awt.Dimension(200, 38));
        txfBuscar.setSelectionColor(new java.awt.Color(60, 60, 60));
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

        pCNombre1.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre1.setMaximumSize(new java.awt.Dimension(100, 30));
        pCNombre1.setMinimumSize(new java.awt.Dimension(100, 30));
        pCNombre1.setPreferredSize(new java.awt.Dimension(100, 30));
        pCNombre1.setLayout(new java.awt.GridBagLayout());

        txfCNombre1.setBorder(null);
        txfCNombre1.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCNombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCNombre1.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCNombre1.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCNombre1.setPhColor(new java.awt.Color(60, 60, 60));
        txfCNombre1.setPlaceholder(Cadenas.CLIENTES_NOMBRE1);
        txfCNombre1.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCNombre1.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre1.add(txfCNombre1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pCNombre1, gridBagConstraints);

        pCNombre2.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre2.setMaximumSize(new java.awt.Dimension(100, 30));
        pCNombre2.setMinimumSize(new java.awt.Dimension(100, 30));
        pCNombre2.setPreferredSize(new java.awt.Dimension(100, 30));
        pCNombre2.setLayout(new java.awt.GridBagLayout());

        txfCNombre2.setBorder(null);
        txfCNombre2.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCNombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCNombre2.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCNombre2.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCNombre2.setPhColor(new java.awt.Color(60, 60, 60));
        txfCNombre2.setPlaceholder(Cadenas.CLIENTES_NOMBRE2);
        txfCNombre2.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCNombre2.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre2.add(txfCNombre2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pCNombre2, gridBagConstraints);

        pCDNI1.setBackground(new java.awt.Color(255, 255, 255));
        pCDNI1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCDNI1.setMaximumSize(new java.awt.Dimension(100, 30));
        pCDNI1.setMinimumSize(new java.awt.Dimension(100, 30));
        pCDNI1.setPreferredSize(new java.awt.Dimension(100, 30));
        pCDNI1.setLayout(new java.awt.GridBagLayout());

        txfCDNI1.setBorder(null);
        txfCDNI1.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCDNI1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCDNI1.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCDNI1.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCDNI1.setPhColor(new java.awt.Color(60, 60, 60));
        txfCDNI1.setPlaceholder(Cadenas.CLIENTES_DNI1);
        txfCDNI1.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCDNI1.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCDNI1.add(txfCDNI1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pCDNI1, gridBagConstraints);

        pCDNI2.setBackground(new java.awt.Color(255, 255, 255));
        pCDNI2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCDNI2.setMaximumSize(new java.awt.Dimension(100, 30));
        pCDNI2.setMinimumSize(new java.awt.Dimension(100, 30));
        pCDNI2.setPreferredSize(new java.awt.Dimension(100, 30));
        pCDNI2.setLayout(new java.awt.GridBagLayout());

        txfCDNI2.setBorder(null);
        txfCDNI2.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCDNI2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCDNI2.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCDNI2.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCDNI2.setPhColor(new java.awt.Color(60, 60, 60));
        txfCDNI2.setPlaceholder(Cadenas.CLIENTES_DNI2);
        txfCDNI2.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCDNI2.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCDNI2.add(txfCDNI2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pCDNI2, gridBagConstraints);

        pCTelefono.setBackground(new java.awt.Color(255, 255, 255));
        pCTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCTelefono.setMaximumSize(new java.awt.Dimension(100, 30));
        pCTelefono.setMinimumSize(new java.awt.Dimension(100, 30));
        pCTelefono.setPreferredSize(new java.awt.Dimension(100, 30));
        pCTelefono.setLayout(new java.awt.GridBagLayout());

        txfCTelefono.setBorder(null);
        txfCTelefono.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCTelefono.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCTelefono.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCTelefono.setPhColor(new java.awt.Color(60, 60, 60));
        txfCTelefono.setPlaceholder(Cadenas.CLIENTES_TELEFONO);
        txfCTelefono.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCTelefono.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCTelefono.add(txfCTelefono, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pCTelefono, gridBagConstraints);

        pCCorreo.setBackground(new java.awt.Color(255, 255, 255));
        pCCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCCorreo.setMaximumSize(new java.awt.Dimension(100, 30));
        pCCorreo.setMinimumSize(new java.awt.Dimension(100, 30));
        pCCorreo.setPreferredSize(new java.awt.Dimension(100, 30));
        pCCorreo.setLayout(new java.awt.GridBagLayout());

        txfCCorreo.setBorder(null);
        txfCCorreo.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCCorreo.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCCorreo.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCCorreo.setPhColor(new java.awt.Color(60, 60, 60));
        txfCCorreo.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCCorreo.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCCorreo.add(txfCCorreo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pCCorreo, gridBagConstraints);

        pCDireccion.setBackground(new java.awt.Color(255, 255, 255));
        pCDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCDireccion.setMaximumSize(new java.awt.Dimension(100, 30));
        pCDireccion.setMinimumSize(new java.awt.Dimension(100, 30));
        pCDireccion.setPreferredSize(new java.awt.Dimension(100, 30));
        pCDireccion.setLayout(new java.awt.GridBagLayout());

        txfCDireccion.setBorder(null);
        txfCDireccion.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCDireccion.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCDireccion.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCDireccion.setPhColor(new java.awt.Color(60, 60, 60));
        txfCDireccion.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCDireccion.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCDireccion.add(txfCDireccion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pCDireccion, gridBagConstraints);

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
        cbCiudad.setFocusable(false);
        cbCiudad.setMaximumSize(new java.awt.Dimension(150, 30));
        cbCiudad.setMinimumSize(new java.awt.Dimension(150, 30));
        cbCiudad.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(cbCiudad, gridBagConstraints);

        cbPais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbPais.setForeground(new java.awt.Color(60, 60, 60));
        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peru", "Venezuela" }));
        cbPais.setFocusable(false);
        cbPais.setMaximumSize(new java.awt.Dimension(100, 30));
        cbPais.setMinimumSize(new java.awt.Dimension(100, 30));
        cbPais.setPreferredSize(new java.awt.Dimension(100, 30));
        cbPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPaisItemStateChanged(evt);
            }
        });
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

        spAlmacen.setMaximumSize(new java.awt.Dimension(150, 100));
        spAlmacen.setMinimumSize(new java.awt.Dimension(150, 100));
        spAlmacen.setPreferredSize(new java.awt.Dimension(150, 100));

        tAlmacen.setBackground(new java.awt.Color(250, 250, 250));
        tAlmacen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tAlmacen.setForeground(new java.awt.Color(60, 60, 60));
        tAlmacen.setModel(new javax.swing.table.DefaultTableModel(
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
        tAlmacen.setFocusable(false);
        tAlmacen.setOpaque(false);
        tAlmacen.setSelectionBackground(new java.awt.Color(60, 60, 60));
        tAlmacen.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spAlmacen.setViewportView(tAlmacen);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAlmacen.add(spAlmacen, gridBagConstraints);

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
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
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

        pAlmacenBuscar.setBackground(new java.awt.Color(250, 250, 250));
        pAlmacenBuscar.setLayout(new java.awt.GridBagLayout());

        btnAlmacenBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBuscar.png"))); // NOI18N
        btnAlmacenBuscar.setToolTipText("");
        btnAlmacenBuscar.setCurve(0);
        btnAlmacenBuscar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnAlmacenBuscar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnAlmacenBuscar.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pAlmacenBuscar.add(btnAlmacenBuscar, gridBagConstraints);

        pContenedor.setBackground(new java.awt.Color(255, 255, 255));
        pContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pContenedor.setMaximumSize(new java.awt.Dimension(100, 40));
        pContenedor.setMinimumSize(new java.awt.Dimension(100, 40));
        pContenedor.setPreferredSize(new java.awt.Dimension(100, 40));
        pContenedor.setLayout(new java.awt.GridBagLayout());

        txfAlmacenBuscar.setBorder(null);
        txfAlmacenBuscar.setCaretColor(new java.awt.Color(60, 60, 60));
        txfAlmacenBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfAlmacenBuscar.setMaximumSize(new java.awt.Dimension(200, 38));
        txfAlmacenBuscar.setMinimumSize(new java.awt.Dimension(200, 38));
        txfAlmacenBuscar.setPhColor(new java.awt.Color(60, 60, 60));
        txfAlmacenBuscar.setPreferredSize(new java.awt.Dimension(200, 38));
        txfAlmacenBuscar.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pContenedor.add(txfAlmacenBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        pAlmacenBuscar.add(pContenedor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAlmacen.add(pAlmacenBuscar, gridBagConstraints);

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

        txfAnhoFab.setEditable(false);
        txfAnhoFab.setBackground(new java.awt.Color(245, 245, 245));
        txfAnhoFab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfAnhoFab.setForeground(new java.awt.Color(60, 60, 60));
        txfAnhoFab.setEnabled(false);
        txfAnhoFab.setMaximumSize(new java.awt.Dimension(100, 20));
        txfAnhoFab.setMinimumSize(new java.awt.Dimension(100, 20));
        txfAnhoFab.setPreferredSize(new java.awt.Dimension(100, 20));
        txfAnhoFab.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfAnhoFab, gridBagConstraints);

        txfCantidad.setEditable(false);
        txfCantidad.setBackground(new java.awt.Color(245, 245, 245));
        txfCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCantidad.setForeground(new java.awt.Color(60, 60, 60));
        txfCantidad.setEnabled(false);
        txfCantidad.setMaximumSize(new java.awt.Dimension(100, 20));
        txfCantidad.setMinimumSize(new java.awt.Dimension(100, 20));
        txfCantidad.setPreferredSize(new java.awt.Dimension(100, 20));
        txfCantidad.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pAdicionalAlmacen.add(txfCantidad, gridBagConstraints);

        txfPrecioUnidad.setEditable(false);
        txfPrecioUnidad.setBackground(new java.awt.Color(245, 245, 245));
        txfPrecioUnidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPrecioUnidad.setForeground(new java.awt.Color(60, 60, 60));
        txfPrecioUnidad.setEnabled(false);
        txfPrecioUnidad.setMaximumSize(new java.awt.Dimension(100, 20));
        txfPrecioUnidad.setMinimumSize(new java.awt.Dimension(100, 20));
        txfPrecioUnidad.setPreferredSize(new java.awt.Dimension(100, 20));
        txfPrecioUnidad.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pAdicionalAlmacen.add(txfPrecioUnidad, gridBagConstraints);

        txfDescripcion.setEditable(false);
        txfDescripcion.setBackground(new java.awt.Color(245, 245, 245));
        txfDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDescripcion.setForeground(new java.awt.Color(60, 60, 60));
        txfDescripcion.setEnabled(false);
        txfDescripcion.setMaximumSize(new java.awt.Dimension(100, 20));
        txfDescripcion.setMinimumSize(new java.awt.Dimension(100, 20));
        txfDescripcion.setPreferredSize(new java.awt.Dimension(100, 20));
        txfDescripcion.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfDescripcion, gridBagConstraints);

        txfPrecioMayor.setEditable(false);
        txfPrecioMayor.setBackground(new java.awt.Color(245, 245, 245));
        txfPrecioMayor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPrecioMayor.setForeground(new java.awt.Color(60, 60, 60));
        txfPrecioMayor.setEnabled(false);
        txfPrecioMayor.setMaximumSize(new java.awt.Dimension(100, 20));
        txfPrecioMayor.setMinimumSize(new java.awt.Dimension(100, 20));
        txfPrecioMayor.setPreferredSize(new java.awt.Dimension(100, 20));
        txfPrecioMayor.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 10);
        pAdicionalAlmacen.add(txfPrecioMayor, gridBagConstraints);

        iconProductDefault.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(80x80px)iconProductDefault.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(iconProductDefault, gridBagConstraints);

        txfModelo.setEditable(false);
        txfModelo.setBackground(new java.awt.Color(245, 245, 245));
        txfModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfModelo.setForeground(new java.awt.Color(60, 60, 60));
        txfModelo.setEnabled(false);
        txfModelo.setMaximumSize(new java.awt.Dimension(100, 20));
        txfModelo.setMinimumSize(new java.awt.Dimension(100, 20));
        txfModelo.setPreferredSize(new java.awt.Dimension(100, 20));
        txfModelo.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfModelo, gridBagConstraints);

        txfCategoria.setEditable(false);
        txfCategoria.setBackground(new java.awt.Color(245, 245, 245));
        txfCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCategoria.setForeground(new java.awt.Color(60, 60, 60));
        txfCategoria.setEnabled(false);
        txfCategoria.setMaximumSize(new java.awt.Dimension(100, 20));
        txfCategoria.setMinimumSize(new java.awt.Dimension(100, 20));
        txfCategoria.setPreferredSize(new java.awt.Dimension(100, 20));
        txfCategoria.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfCategoria, gridBagConstraints);

        txfProductoID.setEditable(false);
        txfProductoID.setBackground(new java.awt.Color(245, 245, 245));
        txfProductoID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfProductoID.setForeground(new java.awt.Color(60, 60, 60));
        txfProductoID.setEnabled(false);
        txfProductoID.setMaximumSize(new java.awt.Dimension(100, 20));
        txfProductoID.setMinimumSize(new java.awt.Dimension(100, 20));
        txfProductoID.setPreferredSize(new java.awt.Dimension(100, 20));
        txfProductoID.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfProductoID, gridBagConstraints);

        txfMarca.setEditable(false);
        txfMarca.setBackground(new java.awt.Color(245, 245, 245));
        txfMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfMarca.setForeground(new java.awt.Color(60, 60, 60));
        txfMarca.setEnabled(false);
        txfMarca.setMaximumSize(new java.awt.Dimension(100, 20));
        txfMarca.setMinimumSize(new java.awt.Dimension(100, 20));
        txfMarca.setPreferredSize(new java.awt.Dimension(100, 20));
        txfMarca.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfMarca, gridBagConstraints);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(60, 60, 60));
        lblCodigo.setText("Codigo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblCodigo, gridBagConstraints);

        lblCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(60, 60, 60));
        lblCategoria.setText("Categoria :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblCategoria, gridBagConstraints);

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(60, 60, 60));
        lblDescripcion.setText("Descripcion :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblDescripcion, gridBagConstraints);

        lblPrecioxUnidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecioxUnidad.setForeground(new java.awt.Color(60, 60, 60));
        lblPrecioxUnidad.setText("Precio por unidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblPrecioxUnidad, gridBagConstraints);

        lblPrecioxMayor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrecioxMayor.setForeground(new java.awt.Color(60, 60, 60));
        lblPrecioxMayor.setText("Precio por mayor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblPrecioxMayor, gridBagConstraints);

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(60, 60, 60));
        lblCantidad.setText("Cantidad disponible :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblCantidad, gridBagConstraints);

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(60, 60, 60));
        lblMarca.setText("Marca :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblMarca, gridBagConstraints);

        lblModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(60, 60, 60));
        lblModelo.setText("Modelo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblModelo, gridBagConstraints);

        lblAnhoFab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAnhoFab.setForeground(new java.awt.Color(60, 60, 60));
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

        tDatosVentas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tDatosVentas.setForeground(new java.awt.Color(60, 60, 60));
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
        tDatosVentas.setSelectionBackground(new java.awt.Color(60, 60, 60));
        tDatosVentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pDatosVenta, gridBagConstraints);

        customPanel3.setBackground(new java.awt.Color(250, 250, 250));
        customPanel3.setForeground(new java.awt.Color(60, 60, 60));
        customPanel3.setOpaque(false);
        customPanel3.setLayout(new java.awt.GridBagLayout());

        pTipoFactura.setBackground(new java.awt.Color(250, 250, 250));
        pTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Emision", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(60, 60, 60))); // NOI18N
        pTipoFactura.setLayout(new java.awt.GridBagLayout());

        rbBoleta.setBackground(new java.awt.Color(250, 250, 250));
        rbBoleta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbBoleta.setForeground(new java.awt.Color(60, 60, 60));
        rbBoleta.setText("Boleta");
        rbBoleta.setFocusPainted(false);
        rbBoleta.setFocusable(false);
        rbBoleta.setMaximumSize(new java.awt.Dimension(120, 25));
        rbBoleta.setMinimumSize(new java.awt.Dimension(120, 25));
        rbBoleta.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pTipoFactura.add(rbBoleta, gridBagConstraints);

        rbContrato.setBackground(new java.awt.Color(250, 250, 250));
        rbContrato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbContrato.setForeground(new java.awt.Color(60, 60, 60));
        rbContrato.setText("Contrato");
        rbContrato.setFocusPainted(false);
        rbContrato.setFocusable(false);
        rbContrato.setMaximumSize(new java.awt.Dimension(120, 25));
        rbContrato.setMinimumSize(new java.awt.Dimension(120, 25));
        rbContrato.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pTipoFactura.add(rbContrato, gridBagConstraints);

        rbFactura.setBackground(new java.awt.Color(250, 250, 250));
        rbFactura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbFactura.setForeground(new java.awt.Color(60, 60, 60));
        rbFactura.setText("Factura");
        rbFactura.setFocusPainted(false);
        rbFactura.setFocusable(false);
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

        customButtonShaped1.setText("AGREGAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(customButtonShaped1, gridBagConstraints);

        customButtonShaped2.setText("QUITAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(customButtonShaped2, gridBagConstraints);

        customButtonShaped3.setText("REGISTRAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(customButtonShaped3, gridBagConstraints);

        customButtonShaped4.setText("COTIZAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(customButtonShaped4, gridBagConstraints);

        customButtonShaped5.setText("LIMPIAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(customButtonShaped5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel3, gridBagConstraints);

        customPanel1.setBackground(new java.awt.Color(250, 250, 250));
        customPanel1.setForeground(new java.awt.Color(60, 60, 60));
        customPanel1.setOpaque(false);
        customPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Precio sin IGV :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        customPanel1.add(jLabel15, gridBagConstraints);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Precio con IGV :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        customPanel1.add(jLabel16, gridBagConstraints);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Cuota Inicial :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        customPanel1.add(jLabel17, gridBagConstraints);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel18.setText("TOTAL :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
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

        lblsgnoMoneda.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        lblsgnoMoneda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblsgnoMoneda.setText("$");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        customPanel1.add(lblsgnoMoneda, gridBagConstraints);

        lblMoneda.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        lblMoneda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMoneda.setText("MONEDA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        customPanel1.add(lblMoneda, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void cbPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPaisItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            evaluarPais(item.toString());
        }
    }//GEN-LAST:event_cbPaisItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.CustomButtonShaped btnAlmacenBuscar;
    private modelo.CustomButtonShaped btnClienteAgregar;
    private modelo.CustomButtonShaped btnClienteBuscar;
    private javax.swing.JComboBox<String> cbCiudad;
    private javax.swing.JComboBox<String> cbPais;
    private javax.swing.JComboBox<String> cbTipoVenta;
    private custom.CustomButtonShaped customButtonShaped1;
    private custom.CustomButtonShaped customButtonShaped2;
    private custom.CustomButtonShaped customButtonShaped3;
    private custom.CustomButtonShaped customButtonShaped4;
    private custom.CustomButtonShaped customButtonShaped5;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
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
    private javax.swing.JLabel lblMoneda;
    private javax.swing.JLabel lblNombreApellido;
    private javax.swing.JLabel lblNombreTrabajador;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblPrecioxMayor;
    private javax.swing.JLabel lblPrecioxUnidad;
    private javax.swing.JLabel lblTipoVenta;
    private javax.swing.JLabel lblsgnoMoneda;
    private javax.swing.JLabel numeroFactura;
    private custom.CustomPanel pAdicionalAlmacen;
    private custom.CustomPanel pAlmacen;
    private javax.swing.JPanel pAlmacenBuscar;
    private javax.swing.JPanel pBuscarCliente;
    private javax.swing.JPanel pBuscarPor;
    private javax.swing.JPanel pCCorreo;
    private javax.swing.JPanel pCDNI1;
    private javax.swing.JPanel pCDNI2;
    private javax.swing.JPanel pCDireccion;
    private javax.swing.JPanel pCNombre1;
    private javax.swing.JPanel pCNombre2;
    private javax.swing.JPanel pCTelefono;
    private custom.CustomPanel pClientes;
    private javax.swing.JPanel pContenedor;
    private custom.CustomPanel pDatosVenta;
    private javax.swing.JPanel pDireccion;
    private javax.swing.JPanel pTipoFactura;
    private javax.swing.JRadioButton rbBoleta;
    private javax.swing.JRadioButton rbContrato;
    private javax.swing.JRadioButton rbFactura;
    private javax.swing.JScrollPane spAlmacen;
    private javax.swing.JScrollPane spDatosVentas;
    private javax.swing.JSpinner spnrCuotas;
    public javax.swing.JTable tAlmacen;
    private javax.swing.JTable tDatosVentas;
    private custom.CustomTextField txfAlmacenBuscar;
    private javax.swing.JTextField txfAnhoFab;
    private custom.CustomTextField txfBuscar;
    private custom.CustomTextField txfCCorreo;
    private custom.CustomTextField txfCDNI1;
    private custom.CustomTextField txfCDNI2;
    private custom.CustomTextField txfCDireccion;
    private custom.CustomTextField txfCNombre1;
    private custom.CustomTextField txfCNombre2;
    private custom.CustomTextField txfCTelefono;
    private javax.swing.JTextField txfCantidad;
    private javax.swing.JTextField txfCategoria;
    private javax.swing.JTextField txfCuotaInicial;
    private javax.swing.JTextField txfDescripcion;
    private javax.swing.JTextField txfDescuento;
    private javax.swing.JTextField txfMarca;
    private javax.swing.JTextField txfModelo;
    private javax.swing.JTextField txfPrecioMayor;
    private javax.swing.JTextField txfPrecioUnidad;
    private javax.swing.JTextField txfProductoID;
    // End of variables declaration//GEN-END:variables
}
