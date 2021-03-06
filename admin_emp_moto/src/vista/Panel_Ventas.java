package vista;

import java.awt.Color;
import java.awt.event.ItemEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import modelo.Cadenas;

public class Panel_Ventas extends javax.swing.JPanel {


    public Panel_Ventas() {
        initComponents();
        spAlmacen.getViewport().setBackground(Color.WHITE);
        spDatosVentas.getViewport().setBackground(Color.WHITE);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        grupoAlmacen.add(rbCodigo);
        grupoAlmacen.add(rbDescripcion);
        grupoAlmacen.add(rbMarca);
        rbCodigo.setSelected(true);
        
        grupoEmision.add(rbIndefinido);
        grupoEmision.add(rbContrato);
        grupoEmision.add(rbFactura);
        rbIndefinido.setSelected(true);
        this.jSlider1.setValue(0);
        //Temporal

        this.jLabel20.setVisible(false);
        this.jLabel21.setVisible(false);
        this.jLabel22.setVisible(false);
        this.jLabel23.setVisible(false);
        this.jLabel24.setVisible(false);
        this.jLabel25.setVisible(false);
        this.jLabel26.setVisible(false);
        this.jLabel27.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        grupoAlmacen = new javax.swing.ButtonGroup();
        grupoEmision = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        customPanel2 = new custom.CustomPanel();
        lblFactura = new javax.swing.JLabel();
        nroVenta = new javax.swing.JLabel();
        pClientes = new custom.CustomPanel();
        pBuscarCliente = new javax.swing.JPanel();
        btnClienteBuscar = new modelo.CustomButtonShaped();
        btnClienteAgregar = new modelo.CustomButtonShaped();
        jPanel1 = new javax.swing.JPanel();
        txfBuscar = new custom.CustomTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pAlmacen = new custom.CustomPanel();
        spAlmacen = new javax.swing.JScrollPane();
        tAlmacen = new javax.swing.JTable();
        pBuscarPor = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rbCodigo = new javax.swing.JRadioButton();
        rbDescripcion = new javax.swing.JRadioButton();
        rbMarca = new javax.swing.JRadioButton();
        pAlmacenBuscar = new javax.swing.JPanel();
        btnAlmacenBuscar = new modelo.CustomButtonShaped();
        pContenedor = new javax.swing.JPanel();
        txfAlmacenBuscar = new custom.CustomTextField();
        jPanel3 = new javax.swing.JPanel();
        customPanel1 = new custom.CustomPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblsgnoMoneda = new javax.swing.JLabel();
        lblMoneda = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        customPanel4 = new custom.CustomPanel();
        lblTipoVenta = new javax.swing.JLabel();
        lblNombreTrabajador = new javax.swing.JLabel();
        lblCuotas = new javax.swing.JLabel();
        lblCuotaInicial = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        cbTipoVenta = new javax.swing.JComboBox<>();
        spnrCuotas = new javax.swing.JSpinner();
        pVCuotaInicial = new javax.swing.JPanel();
        txfVCuotaInicial = new custom.CustomTextField();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        pDatosVenta = new custom.CustomPanel();
        spDatosVentas = new javax.swing.JScrollPane();
        tDatosVentas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
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
        customPanel3 = new custom.CustomPanel();
        pTipoFactura = new javax.swing.JPanel();
        rbIndefinido = new javax.swing.JRadioButton();
        rbContrato = new javax.swing.JRadioButton();
        rbFactura = new javax.swing.JRadioButton();
        customButtonShaped1 = new custom.CustomButtonShaped();
        customButtonShaped2 = new custom.CustomButtonShaped();
        customButtonShaped3 = new custom.CustomButtonShaped();
        customButtonShaped4 = new custom.CustomButtonShaped();
        customButtonShaped5 = new custom.CustomButtonShaped();

        setBackground(new java.awt.Color(60, 60, 60));
        setMaximumSize(new java.awt.Dimension(933, 632));
        setMinimumSize(new java.awt.Dimension(933, 632));
        setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(60, 60, 60));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        customPanel2.setBackground(new java.awt.Color(250, 250, 250));
        customPanel2.setForeground(new java.awt.Color(60, 60, 60));
        customPanel2.setMinimumSize(new java.awt.Dimension(200, 55));
        customPanel2.setOpaque(false);
        customPanel2.setPreferredSize(new java.awt.Dimension(200, 55));
        customPanel2.setLayout(new java.awt.GridBagLayout());

        lblFactura.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        lblFactura.setForeground(new java.awt.Color(60, 60, 60));
        lblFactura.setText("Nro. Venta:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        customPanel2.add(lblFactura, gridBagConstraints);

        nroVenta.setBackground(new java.awt.Color(255, 255, 255));
        nroVenta.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        nroVenta.setForeground(new java.awt.Color(60, 60, 60));
        nroVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nroVenta.setText("0000000");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        customPanel2.add(nroVenta, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(customPanel2, gridBagConstraints);

        pClientes.setBackground(new java.awt.Color(250, 250, 250));
        pClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "CLIENTES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 18), new java.awt.Color(60, 60, 60))); // NOI18N
        pClientes.setForeground(new java.awt.Color(60, 60, 60));
        pClientes.setMinimumSize(new java.awt.Dimension(300, 200));
        pClientes.setOpaque(false);
        pClientes.setPreferredSize(new java.awt.Dimension(300, 200));
        pClientes.setLayout(new java.awt.GridBagLayout());

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
        btnClienteAgregar.setCurve(40);
        btnClienteAgregar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnClienteAgregar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnClienteAgregar.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pBuscarCliente.add(btnClienteAgregar, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        jPanel1.setMinimumSize(new java.awt.Dimension(50, 40));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 40));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txfBuscar.setBorder(null);
        txfBuscar.setCaretColor(new java.awt.Color(60, 60, 60));
        txfBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfBuscar.setMinimumSize(new java.awt.Dimension(50, 38));
        txfBuscar.setPhColor(new java.awt.Color(60, 60, 60));
        txfBuscar.setPlaceholder(Cadenas.CLIENTES_BUSCAR);
        txfBuscar.setPreferredSize(new java.awt.Dimension(100, 38));
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
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pClientes.add(pBuscarCliente, gridBagConstraints);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(452, 400));

        jTable1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(60, 60, 60));
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
        jTable1.setFocusable(false);
        jTable1.setSelectionBackground(new java.awt.Color(60, 60, 60));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(pClientes, gridBagConstraints);

        pAlmacen.setBackground(new java.awt.Color(250, 250, 250));
        pAlmacen.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), "ALMACEN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Monospaced", 0, 18), new java.awt.Color(60, 60, 60))); // NOI18N
        pAlmacen.setForeground(new java.awt.Color(60, 60, 60));
        pAlmacen.setMinimumSize(new java.awt.Dimension(300, 200));
        pAlmacen.setOpaque(false);
        pAlmacen.setPreferredSize(new java.awt.Dimension(300, 200));
        pAlmacen.setLayout(new java.awt.GridBagLayout());

        spAlmacen.setBackground(new java.awt.Color(255, 255, 255));
        spAlmacen.setMaximumSize(new java.awt.Dimension(32767, 70));
        spAlmacen.setMinimumSize(new java.awt.Dimension(23, 70));
        spAlmacen.setPreferredSize(new java.awt.Dimension(2, 70));

        tAlmacen.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
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
        tAlmacen.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        tAlmacen.setOpaque(false);
        tAlmacen.setSelectionBackground(new java.awt.Color(60, 60, 60));
        tAlmacen.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spAlmacen.setViewportView(tAlmacen);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAlmacen.add(spAlmacen, gridBagConstraints);

        pBuscarPor.setBackground(new java.awt.Color(250, 250, 250));
        pBuscarPor.setMinimumSize(new java.awt.Dimension(250, 60));
        pBuscarPor.setPreferredSize(new java.awt.Dimension(250, 60));
        pBuscarPor.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(60, 60, 60));
        jLabel6.setText("Buscar :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        pBuscarPor.add(jLabel6, gridBagConstraints);

        rbCodigo.setBackground(new java.awt.Color(250, 250, 250));
        rbCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbCodigo.setForeground(new java.awt.Color(60, 60, 60));
        rbCodigo.setText("Codigo");
        rbCodigo.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarPor.add(rbCodigo, gridBagConstraints);

        rbDescripcion.setBackground(new java.awt.Color(250, 250, 250));
        rbDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbDescripcion.setForeground(new java.awt.Color(60, 60, 60));
        rbDescripcion.setText("Descripcion");
        rbDescripcion.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarPor.add(rbDescripcion, gridBagConstraints);

        rbMarca.setBackground(new java.awt.Color(250, 250, 250));
        rbMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbMarca.setForeground(new java.awt.Color(60, 60, 60));
        rbMarca.setText("Marca");
        rbMarca.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscarPor.add(rbMarca, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
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
        btnAlmacenBuscar.setFocusable(false);
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
        pContenedor.setMaximumSize(new java.awt.Dimension(250, 40));
        pContenedor.setMinimumSize(new java.awt.Dimension(50, 40));
        pContenedor.setPreferredSize(new java.awt.Dimension(100, 40));
        pContenedor.setLayout(new java.awt.GridBagLayout());

        txfAlmacenBuscar.setBorder(null);
        txfAlmacenBuscar.setCaretColor(new java.awt.Color(60, 60, 60));
        txfAlmacenBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfAlmacenBuscar.setMinimumSize(new java.awt.Dimension(50, 38));
        txfAlmacenBuscar.setPhColor(new java.awt.Color(60, 60, 60));
        txfAlmacenBuscar.setPlaceholder(Cadenas.INVENTARIO_BUSCAR);
        txfAlmacenBuscar.setPreferredSize(new java.awt.Dimension(100, 38));
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
        jPanel2.add(pAlmacen, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(60, 60, 60));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        customPanel1.setBackground(new java.awt.Color(250, 250, 250));
        customPanel1.setForeground(new java.awt.Color(60, 60, 60));
        customPanel1.setOpaque(false);
        customPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(60, 60, 60));
        jLabel18.setText("TOTAL :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 5, 5);
        customPanel1.add(jLabel18, gridBagConstraints);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(60, 60, 60));
        jLabel20.setText("Precio con dscto :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel20, gridBagConstraints);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(60, 60, 60));
        jLabel21.setText("Cuota Mensual :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel21, gridBagConstraints);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(60, 60, 60));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("0,00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel22, gridBagConstraints);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(60, 60, 60));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("0,00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel23, gridBagConstraints);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(60, 60, 60));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("0,00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel25, gridBagConstraints);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(60, 60, 60));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("0,00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel26, gridBagConstraints);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(60, 60, 60));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("0,00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel27, gridBagConstraints);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(60, 60, 60));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("0,00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel28, gridBagConstraints);

        lblsgnoMoneda.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        lblsgnoMoneda.setForeground(new java.awt.Color(60, 60, 60));
        lblsgnoMoneda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblsgnoMoneda.setText("S./");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        customPanel1.add(lblsgnoMoneda, gridBagConstraints);

        lblMoneda.setFont(new java.awt.Font("Tahoma", 0, 32)); // NOI18N
        lblMoneda.setForeground(new java.awt.Color(60, 60, 60));
        lblMoneda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMoneda.setText("SOLES");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        customPanel1.add(lblMoneda, gridBagConstraints);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(60, 60, 60));
        jLabel24.setText("Precio con dscto :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jLabel24, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(customPanel1, gridBagConstraints);

        customPanel4.setBackground(new java.awt.Color(250, 250, 250));
        customPanel4.setForeground(new java.awt.Color(60, 60, 60));
        customPanel4.setMinimumSize(new java.awt.Dimension(500, 80));
        customPanel4.setOpaque(false);
        customPanel4.setPreferredSize(new java.awt.Dimension(500, 80));
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

        lblNombreTrabajador.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        lblNombreTrabajador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreTrabajador.setText("SELLER : DEFAULT WORKER");
        lblNombreTrabajador.setMaximumSize(new java.awt.Dimension(250, 33));
        lblNombreTrabajador.setMinimumSize(new java.awt.Dimension(250, 33));
        lblNombreTrabajador.setPreferredSize(new java.awt.Dimension(250, 33));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
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
        lblCuotaInicial.setText("Monto Inicial:");
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

        cbTipoVenta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTipoVenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EFECTIVO", "CREDITO", "POR MAYOR" }));
        cbTipoVenta.setFocusable(false);
        cbTipoVenta.setMinimumSize(new java.awt.Dimension(60, 30));
        cbTipoVenta.setPreferredSize(new java.awt.Dimension(60, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(cbTipoVenta, gridBagConstraints);

        spnrCuotas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spnrCuotas.setMaximumSize(new java.awt.Dimension(100, 30));
        spnrCuotas.setMinimumSize(new java.awt.Dimension(100, 30));
        spnrCuotas.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(spnrCuotas, gridBagConstraints);

        pVCuotaInicial.setBackground(new java.awt.Color(255, 255, 255));
        pVCuotaInicial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pVCuotaInicial.setMinimumSize(new java.awt.Dimension(100, 30));
        pVCuotaInicial.setPreferredSize(new java.awt.Dimension(100, 30));
        pVCuotaInicial.setLayout(new java.awt.GridBagLayout());

        txfVCuotaInicial.setBorder(null);
        txfVCuotaInicial.setForeground(new java.awt.Color(60, 60, 60));
        txfVCuotaInicial.setCaretColor(new java.awt.Color(60, 60, 60));
        txfVCuotaInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfVCuotaInicial.setMinimumSize(new java.awt.Dimension(100, 28));
        txfVCuotaInicial.setPhColor(new java.awt.Color(60, 60, 60));
        txfVCuotaInicial.setPlaceholder(Cadenas.VENTAS_CUOTA_INICIAL);
        txfVCuotaInicial.setPreferredSize(new java.awt.Dimension(100, 28));
        txfVCuotaInicial.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pVCuotaInicial.add(txfVCuotaInicial, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(pVCuotaInicial, gridBagConstraints);

        jSlider1.setBackground(new java.awt.Color(250, 250, 250));
        jSlider1.setPaintTicks(true);
        jSlider1.setSnapToTicks(true);
        jSlider1.setFocusable(false);
        jSlider1.setMinimumSize(new java.awt.Dimension(130, 30));
        jSlider1.setPreferredSize(new java.awt.Dimension(130, 30));
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(jSlider1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(40, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(40, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel4.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(customPanel4, gridBagConstraints);

        pDatosVenta.setBackground(new java.awt.Color(250, 250, 250));
        pDatosVenta.setForeground(new java.awt.Color(60, 60, 60));
        pDatosVenta.setOpaque(false);
        pDatosVenta.setLayout(new java.awt.GridBagLayout());

        spDatosVentas.setBackground(new java.awt.Color(255, 255, 255));
        spDatosVentas.setMaximumSize(new java.awt.Dimension(32767, 150));
        spDatosVentas.setMinimumSize(new java.awt.Dimension(23, 150));
        spDatosVentas.setName(""); // NOI18N
        spDatosVentas.setPreferredSize(new java.awt.Dimension(2, 150));

        tDatosVentas.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        tDatosVentas.setForeground(new java.awt.Color(60, 60, 60));
        tDatosVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tDatosVentas.setFocusable(false);
        tDatosVentas.setSelectionBackground(new java.awt.Color(60, 60, 60));
        tDatosVentas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spDatosVentas.setViewportView(tDatosVentas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        pDatosVenta.add(spDatosVentas, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(pDatosVenta, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jPanel3, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(60, 60, 60));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        pAdicionalAlmacen.setBackground(new java.awt.Color(250, 250, 250));
        pAdicionalAlmacen.setForeground(new java.awt.Color(60, 60, 60));
        pAdicionalAlmacen.setOpaque(false);
        pAdicionalAlmacen.setLayout(new java.awt.GridBagLayout());

        txfAnhoFab.setEditable(false);
        txfAnhoFab.setBackground(new java.awt.Color(245, 245, 245));
        txfAnhoFab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfAnhoFab.setForeground(new java.awt.Color(60, 60, 60));
        txfAnhoFab.setEnabled(false);
        txfAnhoFab.setMaximumSize(new java.awt.Dimension(100, 25));
        txfAnhoFab.setMinimumSize(new java.awt.Dimension(70, 15));
        txfAnhoFab.setPreferredSize(new java.awt.Dimension(100, 15));
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
        txfCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfCantidad.setForeground(new java.awt.Color(60, 60, 60));
        txfCantidad.setEnabled(false);
        txfCantidad.setMaximumSize(new java.awt.Dimension(100, 25));
        txfCantidad.setMinimumSize(new java.awt.Dimension(70, 15));
        txfCantidad.setPreferredSize(new java.awt.Dimension(100, 15));
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
        txfPrecioUnidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfPrecioUnidad.setForeground(new java.awt.Color(60, 60, 60));
        txfPrecioUnidad.setEnabled(false);
        txfPrecioUnidad.setMaximumSize(new java.awt.Dimension(100, 25));
        txfPrecioUnidad.setMinimumSize(new java.awt.Dimension(70, 15));
        txfPrecioUnidad.setPreferredSize(new java.awt.Dimension(100, 15));
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
        txfDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfDescripcion.setForeground(new java.awt.Color(60, 60, 60));
        txfDescripcion.setEnabled(false);
        txfDescripcion.setMaximumSize(new java.awt.Dimension(100, 25));
        txfDescripcion.setMinimumSize(new java.awt.Dimension(70, 15));
        txfDescripcion.setPreferredSize(new java.awt.Dimension(100, 15));
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
        txfPrecioMayor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfPrecioMayor.setForeground(new java.awt.Color(60, 60, 60));
        txfPrecioMayor.setEnabled(false);
        txfPrecioMayor.setMaximumSize(new java.awt.Dimension(100, 25));
        txfPrecioMayor.setMinimumSize(new java.awt.Dimension(70, 15));
        txfPrecioMayor.setPreferredSize(new java.awt.Dimension(100, 15));
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
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pAdicionalAlmacen.add(iconProductDefault, gridBagConstraints);

        txfModelo.setEditable(false);
        txfModelo.setBackground(new java.awt.Color(245, 245, 245));
        txfModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfModelo.setForeground(new java.awt.Color(60, 60, 60));
        txfModelo.setEnabled(false);
        txfModelo.setMaximumSize(new java.awt.Dimension(100, 25));
        txfModelo.setMinimumSize(new java.awt.Dimension(70, 15));
        txfModelo.setPreferredSize(new java.awt.Dimension(100, 15));
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
        txfCategoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfCategoria.setForeground(new java.awt.Color(60, 60, 60));
        txfCategoria.setEnabled(false);
        txfCategoria.setMaximumSize(new java.awt.Dimension(100, 25));
        txfCategoria.setMinimumSize(new java.awt.Dimension(70, 15));
        txfCategoria.setPreferredSize(new java.awt.Dimension(100, 15));
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
        txfProductoID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfProductoID.setForeground(new java.awt.Color(60, 60, 60));
        txfProductoID.setEnabled(false);
        txfProductoID.setMaximumSize(new java.awt.Dimension(100, 25));
        txfProductoID.setMinimumSize(new java.awt.Dimension(70, 15));
        txfProductoID.setPreferredSize(new java.awt.Dimension(100, 15));
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
        txfMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfMarca.setForeground(new java.awt.Color(60, 60, 60));
        txfMarca.setEnabled(false);
        txfMarca.setMaximumSize(new java.awt.Dimension(100, 25));
        txfMarca.setMinimumSize(new java.awt.Dimension(70, 15));
        txfMarca.setPreferredSize(new java.awt.Dimension(100, 15));
        txfMarca.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(txfMarca, gridBagConstraints);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(60, 60, 60));
        lblCodigo.setText("Codigo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblCodigo, gridBagConstraints);

        lblCategoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(60, 60, 60));
        lblCategoria.setText("Categoria :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblCategoria, gridBagConstraints);

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(60, 60, 60));
        lblDescripcion.setText("Descripcion :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblDescripcion, gridBagConstraints);

        lblPrecioxUnidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPrecioxUnidad.setForeground(new java.awt.Color(60, 60, 60));
        lblPrecioxUnidad.setText("Precio por unidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblPrecioxUnidad, gridBagConstraints);

        lblPrecioxMayor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPrecioxMayor.setForeground(new java.awt.Color(60, 60, 60));
        lblPrecioxMayor.setText("Precio por mayor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblPrecioxMayor, gridBagConstraints);

        lblCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(60, 60, 60));
        lblCantidad.setText("Cantidad disponible :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblCantidad, gridBagConstraints);

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMarca.setForeground(new java.awt.Color(60, 60, 60));
        lblMarca.setText("Marca :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblMarca, gridBagConstraints);

        lblModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblModelo.setForeground(new java.awt.Color(60, 60, 60));
        lblModelo.setText("Modelo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAdicionalAlmacen.add(lblModelo, gridBagConstraints);

        lblAnhoFab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(pAdicionalAlmacen, gridBagConstraints);

        customPanel3.setBackground(new java.awt.Color(250, 250, 250));
        customPanel3.setForeground(new java.awt.Color(60, 60, 60));
        customPanel3.setOpaque(false);
        customPanel3.setLayout(new java.awt.GridBagLayout());

        pTipoFactura.setBackground(new java.awt.Color(250, 250, 250));
        pTipoFactura.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Emision", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(60, 60, 60))); // NOI18N
        pTipoFactura.setMinimumSize(new java.awt.Dimension(132, 100));
        pTipoFactura.setPreferredSize(new java.awt.Dimension(132, 100));
        pTipoFactura.setLayout(new java.awt.GridBagLayout());

        rbIndefinido.setBackground(new java.awt.Color(250, 250, 250));
        rbIndefinido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbIndefinido.setForeground(new java.awt.Color(60, 60, 60));
        rbIndefinido.setText("SIN ASIGNAR");
        rbIndefinido.setFocusPainted(false);
        rbIndefinido.setFocusable(false);
        rbIndefinido.setMaximumSize(new java.awt.Dimension(120, 25));
        rbIndefinido.setMinimumSize(new java.awt.Dimension(120, 25));
        rbIndefinido.setPreferredSize(new java.awt.Dimension(120, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pTipoFactura.add(rbIndefinido, gridBagConstraints);

        rbContrato.setBackground(new java.awt.Color(250, 250, 250));
        rbContrato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbContrato.setForeground(new java.awt.Color(60, 60, 60));
        rbContrato.setText("CONTRATO");
        rbContrato.setEnabled(false);
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
        rbFactura.setText("FACTURA");
        rbFactura.setEnabled(false);
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
        customButtonShaped1.setMaximumSize(new java.awt.Dimension(250, 45));
        customButtonShaped1.setMinimumSize(new java.awt.Dimension(120, 30));
        customButtonShaped1.setPreferredSize(new java.awt.Dimension(120, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        customPanel3.add(customButtonShaped1, gridBagConstraints);

        customButtonShaped2.setText("QUITAR");
        customButtonShaped2.setMaximumSize(new java.awt.Dimension(250, 45));
        customButtonShaped2.setMinimumSize(new java.awt.Dimension(120, 30));
        customButtonShaped2.setPreferredSize(new java.awt.Dimension(120, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        customPanel3.add(customButtonShaped2, gridBagConstraints);

        customButtonShaped3.setText("REGISTRAR");
        customButtonShaped3.setMaximumSize(new java.awt.Dimension(250, 45));
        customButtonShaped3.setMinimumSize(new java.awt.Dimension(120, 30));
        customButtonShaped3.setPreferredSize(new java.awt.Dimension(120, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 5);
        customPanel3.add(customButtonShaped3, gridBagConstraints);

        customButtonShaped4.setText("COTIZAR");
        customButtonShaped4.setMaximumSize(new java.awt.Dimension(250, 45));
        customButtonShaped4.setMinimumSize(new java.awt.Dimension(120, 30));
        customButtonShaped4.setPreferredSize(new java.awt.Dimension(120, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(customButtonShaped4, gridBagConstraints);

        customButtonShaped5.setText("LIMPIAR");
        customButtonShaped5.setMaximumSize(new java.awt.Dimension(250, 45));
        customButtonShaped5.setMinimumSize(new java.awt.Dimension(120, 30));
        customButtonShaped5.setPreferredSize(new java.awt.Dimension(120, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel3.add(customButtonShaped5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel4.add(customPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        add(jPanel4, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        this.jLabel1.setText(Integer.toString(this.jSlider1.getValue())+" %");
    }//GEN-LAST:event_jSlider1StateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButtonShaped btnAlmacenBuscar;
    public modelo.CustomButtonShaped btnClienteAgregar;
    public modelo.CustomButtonShaped btnClienteBuscar;
    public javax.swing.JComboBox<String> cbTipoVenta;
    public custom.CustomButtonShaped customButtonShaped1;
    public custom.CustomButtonShaped customButtonShaped2;
    public custom.CustomButtonShaped customButtonShaped3;
    public custom.CustomButtonShaped customButtonShaped4;
    public custom.CustomButtonShaped customButtonShaped5;
    private custom.CustomPanel customPanel1;
    private custom.CustomPanel customPanel2;
    private custom.CustomPanel customPanel3;
    private custom.CustomPanel customPanel4;
    private javax.swing.ButtonGroup grupoAlmacen;
    private javax.swing.ButtonGroup grupoEmision;
    private javax.swing.JLabel iconProductDefault;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    public javax.swing.JLabel jLabel22;
    public javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel26;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSlider jSlider1;
    public javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAnhoFab;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCuotaInicial;
    private javax.swing.JLabel lblCuotas;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    public javax.swing.JLabel lblMoneda;
    public javax.swing.JLabel lblNombreTrabajador;
    private javax.swing.JLabel lblPrecioxMayor;
    private javax.swing.JLabel lblPrecioxUnidad;
    private javax.swing.JLabel lblTipoVenta;
    public javax.swing.JLabel lblsgnoMoneda;
    public javax.swing.JLabel nroVenta;
    private custom.CustomPanel pAdicionalAlmacen;
    private custom.CustomPanel pAlmacen;
    private javax.swing.JPanel pAlmacenBuscar;
    private javax.swing.JPanel pBuscarCliente;
    private javax.swing.JPanel pBuscarPor;
    private custom.CustomPanel pClientes;
    private javax.swing.JPanel pContenedor;
    private custom.CustomPanel pDatosVenta;
    private javax.swing.JPanel pTipoFactura;
    private javax.swing.JPanel pVCuotaInicial;
    public javax.swing.JRadioButton rbCodigo;
    public javax.swing.JRadioButton rbContrato;
    public javax.swing.JRadioButton rbDescripcion;
    public javax.swing.JRadioButton rbFactura;
    public javax.swing.JRadioButton rbIndefinido;
    public javax.swing.JRadioButton rbMarca;
    private javax.swing.JScrollPane spAlmacen;
    private javax.swing.JScrollPane spDatosVentas;
    public javax.swing.JSpinner spnrCuotas;
    public javax.swing.JTable tAlmacen;
    public javax.swing.JTable tDatosVentas;
    public custom.CustomTextField txfAlmacenBuscar;
    public javax.swing.JTextField txfAnhoFab;
    public custom.CustomTextField txfBuscar;
    public javax.swing.JTextField txfCantidad;
    public javax.swing.JTextField txfCategoria;
    public javax.swing.JTextField txfDescripcion;
    public javax.swing.JTextField txfMarca;
    public javax.swing.JTextField txfModelo;
    public javax.swing.JTextField txfPrecioMayor;
    public javax.swing.JTextField txfPrecioUnidad;
    public javax.swing.JTextField txfProductoID;
    public custom.CustomTextField txfVCuotaInicial;
    // End of variables declaration//GEN-END:variables
}
