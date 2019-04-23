package vista;

import java.awt.Color;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import javax.swing.JFormattedTextField;


public class Panel_Registros_Trabajadores extends javax.swing.JPanel {


    public Panel_Registros_Trabajadores() {
        initComponents();
        this.jScrollPane1.getViewport().setBackground(Color.WHITE);
        this.jScrollPane2.getViewport().setBackground(Color.WHITE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        customPanel1 = new custom.CustomPanel();
        pTrabajadores = new javax.swing.JPanel();
        pCRUD = new javax.swing.JPanel();
        btnTrabajadorAgregar = new custom.CustomButtonShaped();
        btnTrabajadorModificar = new custom.CustomButtonShaped();
        btnTrabajadorBorrar = new custom.CustomButtonShaped();
        pVentasBuscar = new javax.swing.JPanel();
        btnClienteBuscar = new modelo.CustomButtonShaped();
        pBuscar1 = new javax.swing.JPanel();
        txfBuscar1 = new modelo.CustomTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pAsistencia = new javax.swing.JPanel();
        pDatosBotones = new javax.swing.JPanel();
        btnAsistenciaAgregar = new modelo.CustomButtonShaped();
        btnAsistenciaModificar = new modelo.CustomButtonShaped();
        btnAsistenciaBorrar = new modelo.CustomButtonShaped();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pAsistenciaBuscar = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        btnAsistenciaBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pAsistenciaDatos = new javax.swing.JPanel();
        lblDatosID = new javax.swing.JLabel();
        lblDatosNombre = new javax.swing.JLabel();
        lblDatosFecha = new javax.swing.JLabel();
        lblDatosHora = new javax.swing.JLabel();
        lblDatosDescuento = new javax.swing.JLabel();
        txfDatosNombre = new javax.swing.JLabel();
        txfDatosDescuento = new javax.swing.JLabel();
        txfDatosDNI = new javax.swing.JTextField();
        txfDatosFecha = new javax.swing.JTextField();
        txfDatosHora = new javax.swing.JTextField();
        pVentasBuscar1 = new javax.swing.JPanel();
        btnClienteBuscar1 = new modelo.CustomButtonShaped();
        pBuscar2 = new javax.swing.JPanel();
        txfBuscar2 = new modelo.CustomTextField();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(60, 60, 60));
        setMaximumSize(new java.awt.Dimension(140, 20));
        setMinimumSize(new java.awt.Dimension(140, 20));
        setPreferredSize(new java.awt.Dimension(140, 20));
        setLayout(new java.awt.GridBagLayout());

        customPanel1.setBackground(new java.awt.Color(250, 250, 250));
        customPanel1.setOpaque(false);
        customPanel1.setLayout(new java.awt.GridBagLayout());

        pTrabajadores.setBackground(new java.awt.Color(250, 250, 250));
        pTrabajadores.setOpaque(false);
        pTrabajadores.setLayout(new java.awt.GridBagLayout());

        pCRUD.setBackground(new java.awt.Color(250, 250, 250));
        pCRUD.setLayout(new java.awt.GridBagLayout());

        btnTrabajadorAgregar.setText("AGREGAR");
        btnTrabajadorAgregar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnTrabajadorAgregar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(btnTrabajadorAgregar, gridBagConstraints);

        btnTrabajadorModificar.setText("EDITAR");
        btnTrabajadorModificar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnTrabajadorModificar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(btnTrabajadorModificar, gridBagConstraints);

        btnTrabajadorBorrar.setText("BORRAR");
        btnTrabajadorBorrar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnTrabajadorBorrar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(btnTrabajadorBorrar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pTrabajadores.add(pCRUD, gridBagConstraints);

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

        pBuscar1.setBackground(new java.awt.Color(255, 255, 255));
        pBuscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pBuscar1.setLayout(new java.awt.GridBagLayout());

        txfBuscar1.setBorder(null);
        txfBuscar1.setForeground(new java.awt.Color(60, 60, 60));
        txfBuscar1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfBuscar1.setMaximumSize(new java.awt.Dimension(500, 39));
        txfBuscar1.setMinimumSize(new java.awt.Dimension(500, 39));
        txfBuscar1.setPhColor(new java.awt.Color(150, 150, 150));
        txfBuscar1.setPreferredSize(new java.awt.Dimension(500, 39));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBuscar1.add(txfBuscar1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pVentasBuscar.add(pBuscar1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pTrabajadores.add(pVentasBuscar, gridBagConstraints);

        jTable2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(60, 60, 60));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setFocusable(false);
        jTable2.setSelectionBackground(new java.awt.Color(60, 60, 60));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        pTrabajadores.add(jScrollPane2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 5, 20);
        customPanel1.add(pTrabajadores, gridBagConstraints);

        pAsistencia.setBackground(new java.awt.Color(250, 250, 250));
        pAsistencia.setLayout(new java.awt.GridBagLayout());

        pDatosBotones.setBackground(new java.awt.Color(250, 250, 250));
        pDatosBotones.setLayout(new java.awt.GridBagLayout());

        btnAsistenciaAgregar.setText("AGREGAR");
        btnAsistenciaAgregar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnAsistenciaAgregar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pDatosBotones.add(btnAsistenciaAgregar, gridBagConstraints);

        btnAsistenciaModificar.setText("EDITAR");
        btnAsistenciaModificar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnAsistenciaModificar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pDatosBotones.add(btnAsistenciaModificar, gridBagConstraints);

        btnAsistenciaBorrar.setText("BORRAR");
        btnAsistenciaBorrar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnAsistenciaBorrar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pDatosBotones.add(btnAsistenciaBorrar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pAsistencia.add(pDatosBotones, gridBagConstraints);

        jTable1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(60, 60, 60));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(60, 60, 60));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistencia.add(jScrollPane1, gridBagConstraints);

        pAsistenciaBuscar.setBackground(new java.awt.Color(250, 250, 250));
        pAsistenciaBuscar.setLayout(new java.awt.GridBagLayout());

        jTextField4.setMaximumSize(new java.awt.Dimension(200, 20));
        jTextField4.setMinimumSize(new java.awt.Dimension(200, 20));
        jTextField4.setPreferredSize(new java.awt.Dimension(200, 20));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaBuscar.add(jTextField4, gridBagConstraints);

        btnAsistenciaBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAsistenciaBuscar.setForeground(new java.awt.Color(60, 60, 60));
        btnAsistenciaBuscar.setText("BUSCAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaBuscar.add(btnAsistenciaBuscar, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 60));
        jLabel1.setText("Filtra por :");
        jLabel1.setMaximumSize(new java.awt.Dimension(62, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(62, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(62, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaBuscar.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pAsistencia.add(pAsistenciaBuscar, gridBagConstraints);

        pAsistenciaDatos.setBackground(new java.awt.Color(250, 250, 250));
        pAsistenciaDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)), "Datos Asistencia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(60, 60, 60))); // NOI18N
        pAsistenciaDatos.setMaximumSize(new java.awt.Dimension(600, 300));
        pAsistenciaDatos.setMinimumSize(new java.awt.Dimension(600, 300));
        pAsistenciaDatos.setPreferredSize(new java.awt.Dimension(600, 300));
        pAsistenciaDatos.setLayout(new java.awt.GridBagLayout());

        lblDatosID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDatosID.setForeground(new java.awt.Color(60, 60, 60));
        lblDatosID.setText("D.N.I.:");
        lblDatosID.setMaximumSize(new java.awt.Dimension(200, 20));
        lblDatosID.setMinimumSize(new java.awt.Dimension(200, 20));
        lblDatosID.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosID, gridBagConstraints);

        lblDatosNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDatosNombre.setForeground(new java.awt.Color(60, 60, 60));
        lblDatosNombre.setText("Nombre Trabajador :");
        lblDatosNombre.setMaximumSize(new java.awt.Dimension(200, 20));
        lblDatosNombre.setMinimumSize(new java.awt.Dimension(200, 20));
        lblDatosNombre.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosNombre, gridBagConstraints);

        lblDatosFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDatosFecha.setForeground(new java.awt.Color(60, 60, 60));
        lblDatosFecha.setText("Fecha :");
        lblDatosFecha.setMaximumSize(new java.awt.Dimension(200, 20));
        lblDatosFecha.setMinimumSize(new java.awt.Dimension(200, 20));
        lblDatosFecha.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosFecha, gridBagConstraints);

        lblDatosHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDatosHora.setForeground(new java.awt.Color(60, 60, 60));
        lblDatosHora.setText("Hora de entrada :");
        lblDatosHora.setMaximumSize(new java.awt.Dimension(200, 20));
        lblDatosHora.setMinimumSize(new java.awt.Dimension(200, 20));
        lblDatosHora.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosHora, gridBagConstraints);

        lblDatosDescuento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDatosDescuento.setForeground(new java.awt.Color(60, 60, 60));
        lblDatosDescuento.setText("Descuento :");
        lblDatosDescuento.setMaximumSize(new java.awt.Dimension(200, 20));
        lblDatosDescuento.setMinimumSize(new java.awt.Dimension(200, 20));
        lblDatosDescuento.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosDescuento, gridBagConstraints);

        txfDatosNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDatosNombre.setForeground(new java.awt.Color(60, 60, 60));
        txfDatosNombre.setText("NAME_DEFAULT");
        txfDatosNombre.setMaximumSize(new java.awt.Dimension(250, 20));
        txfDatosNombre.setMinimumSize(new java.awt.Dimension(250, 20));
        txfDatosNombre.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(txfDatosNombre, gridBagConstraints);

        txfDatosDescuento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txfDatosDescuento.setForeground(new java.awt.Color(60, 60, 60));
        txfDatosDescuento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txfDatosDescuento.setText("0.0");
        txfDatosDescuento.setMaximumSize(new java.awt.Dimension(250, 20));
        txfDatosDescuento.setMinimumSize(new java.awt.Dimension(250, 20));
        txfDatosDescuento.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(txfDatosDescuento, gridBagConstraints);

        txfDatosDNI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDatosDNI.setForeground(new java.awt.Color(60, 60, 60));
        txfDatosDNI.setMaximumSize(new java.awt.Dimension(250, 25));
        txfDatosDNI.setMinimumSize(new java.awt.Dimension(250, 25));
        txfDatosDNI.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(txfDatosDNI, gridBagConstraints);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        txfDatosFecha = new javax.swing.JFormattedTextField(df);
        txfDatosFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDatosFecha.setForeground(new java.awt.Color(60, 60, 60));
        txfDatosFecha.setMaximumSize(new java.awt.Dimension(250, 25));
        txfDatosFecha.setMinimumSize(new java.awt.Dimension(250, 25));
        txfDatosFecha.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(txfDatosFecha, gridBagConstraints);

        Format timeFormat = new SimpleDateFormat("HH:mm:ss");
        txfDatosHora = new JFormattedTextField(timeFormat);
        txfDatosHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDatosHora.setForeground(new java.awt.Color(60, 60, 60));
        txfDatosHora.setMaximumSize(new java.awt.Dimension(250, 25));
        txfDatosHora.setMinimumSize(new java.awt.Dimension(250, 25));
        txfDatosHora.setPreferredSize(new java.awt.Dimension(250, 25));
        txfDatosHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDatosHoraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(txfDatosHora, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistencia.add(pAsistenciaDatos, gridBagConstraints);

        pVentasBuscar1.setBackground(new java.awt.Color(250, 250, 250));
        pVentasBuscar1.setLayout(new java.awt.GridBagLayout());

        btnClienteBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBuscar.png"))); // NOI18N
        btnClienteBuscar1.setCurve(0);
        btnClienteBuscar1.setMaximumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar1.setMinimumSize(new java.awt.Dimension(40, 40));
        btnClienteBuscar1.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        pVentasBuscar1.add(btnClienteBuscar1, gridBagConstraints);

        pBuscar2.setBackground(new java.awt.Color(255, 255, 255));
        pBuscar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pBuscar2.setLayout(new java.awt.GridBagLayout());

        txfBuscar2.setBorder(null);
        txfBuscar2.setForeground(new java.awt.Color(60, 60, 60));
        txfBuscar2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfBuscar2.setMaximumSize(new java.awt.Dimension(500, 39));
        txfBuscar2.setMinimumSize(new java.awt.Dimension(500, 39));
        txfBuscar2.setPhColor(new java.awt.Color(150, 150, 150));
        txfBuscar2.setPreferredSize(new java.awt.Dimension(500, 39));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBuscar2.add(txfBuscar2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 0);
        pVentasBuscar1.add(pBuscar2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pAsistencia.add(pVentasBuscar1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 20, 20);
        customPanel1.add(pAsistencia, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel1.add(jSeparator2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txfDatosHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDatosHoraActionPerformed

    }//GEN-LAST:event_txfDatosHoraActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButtonShaped btnAsistenciaAgregar;
    public modelo.CustomButtonShaped btnAsistenciaBorrar;
    public javax.swing.JButton btnAsistenciaBuscar;
    public modelo.CustomButtonShaped btnAsistenciaModificar;
    public modelo.CustomButtonShaped btnClienteBuscar;
    public modelo.CustomButtonShaped btnClienteBuscar1;
    public custom.CustomButtonShaped btnTrabajadorAgregar;
    public custom.CustomButtonShaped btnTrabajadorBorrar;
    public custom.CustomButtonShaped btnTrabajadorModificar;
    private custom.CustomPanel customPanel1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    public javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblDatosDescuento;
    private javax.swing.JLabel lblDatosFecha;
    private javax.swing.JLabel lblDatosHora;
    private javax.swing.JLabel lblDatosID;
    private javax.swing.JLabel lblDatosNombre;
    public javax.swing.JPanel pAsistencia;
    public javax.swing.JPanel pAsistenciaBuscar;
    public javax.swing.JPanel pAsistenciaDatos;
    private javax.swing.JPanel pBuscar1;
    private javax.swing.JPanel pBuscar2;
    public javax.swing.JPanel pCRUD;
    private javax.swing.JPanel pDatosBotones;
    private javax.swing.JPanel pTrabajadores;
    public javax.swing.JPanel pVentasBuscar;
    public javax.swing.JPanel pVentasBuscar1;
    public modelo.CustomTextField txfBuscar1;
    public modelo.CustomTextField txfBuscar2;
    public javax.swing.JTextField txfDatosDNI;
    public javax.swing.JLabel txfDatosDescuento;
    public javax.swing.JTextField txfDatosFecha;
    public javax.swing.JTextField txfDatosHora;
    public javax.swing.JLabel txfDatosNombre;
    // End of variables declaration//GEN-END:variables
}
