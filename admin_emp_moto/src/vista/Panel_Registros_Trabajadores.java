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
        this.spTabla.getViewport().setBackground(Color.WHITE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pTrabajadores = new javax.swing.JPanel();
        pBuscar = new javax.swing.JPanel();
        btnTrabajadoresBuscar = new javax.swing.JButton();
        txfBuscar = new javax.swing.JTextField();
        spTabla = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pDatos = new javax.swing.JPanel();
        lblDNI = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblPrivilegio = new javax.swing.JLabel();
        lblSueldo = new javax.swing.JLabel();
        lblValidarPass = new javax.swing.JLabel();
        txfDNI = new javax.swing.JTextField();
        txfPassword = new javax.swing.JTextField();
        txfValidatePassword = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        txfApellidos = new javax.swing.JTextField();
        txfSueldo = new javax.swing.JTextField();
        cbPrivilegio = new javax.swing.JComboBox<>();
        pCRUD = new javax.swing.JPanel();
        btnTrabajadorAgregar = new custom.CustomButtonShaped();
        btnTrabajadorModificar = new custom.CustomButtonShaped();
        btnTrabajadorBorrar = new custom.CustomButtonShaped();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pAsistencia = new javax.swing.JPanel();
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
        pDatosBotones = new javax.swing.JPanel();
        btnAsistenciaAgregar = new modelo.CustomButtonShaped();
        btnAsistenciaModificar = new modelo.CustomButtonShaped();
        btnAsistenciaBorrar = new modelo.CustomButtonShaped();

        setBackground(new java.awt.Color(250, 250, 250));
        setMaximumSize(new java.awt.Dimension(140, 20));
        setMinimumSize(new java.awt.Dimension(140, 20));
        setPreferredSize(new java.awt.Dimension(140, 20));
        setLayout(new java.awt.GridBagLayout());

        pTrabajadores.setBackground(new java.awt.Color(250, 250, 250));
        pTrabajadores.setLayout(new java.awt.GridBagLayout());

        pBuscar.setBackground(new java.awt.Color(250, 250, 250));
        pBuscar.setMaximumSize(new java.awt.Dimension(400, 40));
        pBuscar.setMinimumSize(new java.awt.Dimension(400, 40));
        pBuscar.setName(""); // NOI18N
        pBuscar.setPreferredSize(new java.awt.Dimension(400, 40));
        pBuscar.setLayout(new java.awt.GridBagLayout());

        btnTrabajadoresBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTrabajadoresBuscar.setForeground(new java.awt.Color(60, 60, 60));
        btnTrabajadoresBuscar.setText("BUSCAR");
        btnTrabajadoresBuscar.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscar.add(btnTrabajadoresBuscar, gridBagConstraints);

        txfBuscar.setMaximumSize(new java.awt.Dimension(200, 20));
        txfBuscar.setMinimumSize(new java.awt.Dimension(200, 20));
        txfBuscar.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pBuscar.add(txfBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pTrabajadores.add(pBuscar, gridBagConstraints);

        spTabla.setBackground(new java.awt.Color(250, 250, 250));
        spTabla.setMaximumSize(new java.awt.Dimension(600, 100));
        spTabla.setMinimumSize(new java.awt.Dimension(600, 100));
        spTabla.setPreferredSize(new java.awt.Dimension(600, 100));

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(60, 60, 60));
        jTable2.setSelectionBackground(new java.awt.Color(60, 60, 60));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        spTabla.setViewportView(jTable2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pTrabajadores.add(spTabla, gridBagConstraints);

        pDatos.setBackground(new java.awt.Color(250, 250, 250));
        pDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)), "Datos Trabajadores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(60, 60, 60))); // NOI18N
        pDatos.setMaximumSize(new java.awt.Dimension(600, 500));
        pDatos.setMinimumSize(new java.awt.Dimension(600, 500));
        pDatos.setPreferredSize(new java.awt.Dimension(600, 500));
        pDatos.setLayout(new java.awt.GridBagLayout());

        lblDNI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(60, 60, 60));
        lblDNI.setText("DNI :");
        lblDNI.setMaximumSize(new java.awt.Dimension(200, 20));
        lblDNI.setMinimumSize(new java.awt.Dimension(200, 20));
        lblDNI.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(lblDNI, gridBagConstraints);

        lblPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPass.setForeground(new java.awt.Color(60, 60, 60));
        lblPass.setText("Contraseña :");
        lblPass.setMaximumSize(new java.awt.Dimension(200, 20));
        lblPass.setMinimumSize(new java.awt.Dimension(200, 20));
        lblPass.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(lblPass, gridBagConstraints);

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(60, 60, 60));
        lblNombre.setText("Nombre :");
        lblNombre.setMaximumSize(new java.awt.Dimension(200, 20));
        lblNombre.setMinimumSize(new java.awt.Dimension(200, 20));
        lblNombre.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(lblNombre, gridBagConstraints);

        lblApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(60, 60, 60));
        lblApellidos.setText("Apellidos :");
        lblApellidos.setMaximumSize(new java.awt.Dimension(200, 20));
        lblApellidos.setMinimumSize(new java.awt.Dimension(200, 20));
        lblApellidos.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(lblApellidos, gridBagConstraints);

        lblPrivilegio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrivilegio.setForeground(new java.awt.Color(60, 60, 60));
        lblPrivilegio.setText("Privilegio :");
        lblPrivilegio.setMaximumSize(new java.awt.Dimension(200, 20));
        lblPrivilegio.setMinimumSize(new java.awt.Dimension(200, 20));
        lblPrivilegio.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(lblPrivilegio, gridBagConstraints);

        lblSueldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSueldo.setForeground(new java.awt.Color(60, 60, 60));
        lblSueldo.setText("Sueldo :");
        lblSueldo.setMaximumSize(new java.awt.Dimension(200, 20));
        lblSueldo.setMinimumSize(new java.awt.Dimension(200, 20));
        lblSueldo.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(lblSueldo, gridBagConstraints);

        lblValidarPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblValidarPass.setForeground(new java.awt.Color(60, 60, 60));
        lblValidarPass.setText("Validar Contraseña :");
        lblValidarPass.setMaximumSize(new java.awt.Dimension(200, 20));
        lblValidarPass.setMinimumSize(new java.awt.Dimension(200, 20));
        lblValidarPass.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(lblValidarPass, gridBagConstraints);

        txfDNI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDNI.setForeground(new java.awt.Color(60, 60, 60));
        txfDNI.setMaximumSize(new java.awt.Dimension(250, 25));
        txfDNI.setMinimumSize(new java.awt.Dimension(250, 25));
        txfDNI.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(txfDNI, gridBagConstraints);

        txfPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPassword.setForeground(new java.awt.Color(60, 60, 60));
        txfPassword.setMaximumSize(new java.awt.Dimension(250, 25));
        txfPassword.setMinimumSize(new java.awt.Dimension(250, 25));
        txfPassword.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(txfPassword, gridBagConstraints);

        txfValidatePassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfValidatePassword.setForeground(new java.awt.Color(60, 60, 60));
        txfValidatePassword.setMaximumSize(new java.awt.Dimension(250, 25));
        txfValidatePassword.setMinimumSize(new java.awt.Dimension(250, 25));
        txfValidatePassword.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(txfValidatePassword, gridBagConstraints);

        txfNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfNombre.setForeground(new java.awt.Color(60, 60, 60));
        txfNombre.setMaximumSize(new java.awt.Dimension(250, 25));
        txfNombre.setMinimumSize(new java.awt.Dimension(250, 25));
        txfNombre.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(txfNombre, gridBagConstraints);

        txfApellidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfApellidos.setForeground(new java.awt.Color(60, 60, 60));
        txfApellidos.setMaximumSize(new java.awt.Dimension(250, 25));
        txfApellidos.setMinimumSize(new java.awt.Dimension(250, 25));
        txfApellidos.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(txfApellidos, gridBagConstraints);

        txfSueldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfSueldo.setForeground(new java.awt.Color(60, 60, 60));
        txfSueldo.setMaximumSize(new java.awt.Dimension(250, 25));
        txfSueldo.setMinimumSize(new java.awt.Dimension(250, 25));
        txfSueldo.setPreferredSize(new java.awt.Dimension(250, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(txfSueldo, gridBagConstraints);

        cbPrivilegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Trabajador" }));
        cbPrivilegio.setMaximumSize(new java.awt.Dimension(250, 20));
        cbPrivilegio.setMinimumSize(new java.awt.Dimension(250, 20));
        cbPrivilegio.setPreferredSize(new java.awt.Dimension(250, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(cbPrivilegio, gridBagConstraints);

        pCRUD.setBackground(new java.awt.Color(250, 250, 250));
        pCRUD.setLayout(new java.awt.GridBagLayout());

        btnTrabajadorAgregar.setText("AGREGAR");
        btnTrabajadorAgregar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnTrabajadorAgregar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        pCRUD.add(btnTrabajadorAgregar, gridBagConstraints);

        btnTrabajadorModificar.setText("EDITAR");
        btnTrabajadorModificar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnTrabajadorModificar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        pCRUD.add(btnTrabajadorModificar, gridBagConstraints);

        btnTrabajadorBorrar.setText("BORRAR");
        btnTrabajadorBorrar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnTrabajadorBorrar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        pCRUD.add(btnTrabajadorBorrar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(pCRUD, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(jSeparator7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(jSeparator8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatos.add(jSeparator9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pTrabajadores.add(pDatos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 5, 20);
        add(pTrabajadores, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jSeparator2, gridBagConstraints);

        pAsistencia.setBackground(new java.awt.Color(250, 250, 250));
        pAsistencia.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(600, 100));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(600, 100));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 100));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(60, 60, 60));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(60, 60));
        jTable1.setSelectionBackground(new java.awt.Color(60, 60, 60));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
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

        pDatosBotones.setBackground(new java.awt.Color(250, 250, 250));
        pDatosBotones.setLayout(new java.awt.GridBagLayout());

        btnAsistenciaAgregar.setText("AGREGAR");
        btnAsistenciaAgregar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnAsistenciaAgregar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        pDatosBotones.add(btnAsistenciaAgregar, gridBagConstraints);

        btnAsistenciaModificar.setText("EDITAR");
        btnAsistenciaModificar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnAsistenciaModificar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        pDatosBotones.add(btnAsistenciaModificar, gridBagConstraints);

        btnAsistenciaBorrar.setText("BORRAR");
        btnAsistenciaBorrar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnAsistenciaBorrar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        pDatosBotones.add(btnAsistenciaBorrar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(pDatosBotones, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistencia.add(pAsistenciaDatos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 20, 20);
        add(pAsistencia, gridBagConstraints);
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
    public custom.CustomButtonShaped btnTrabajadorAgregar;
    public custom.CustomButtonShaped btnTrabajadorBorrar;
    public custom.CustomButtonShaped btnTrabajadorModificar;
    public javax.swing.JButton btnTrabajadoresBuscar;
    public javax.swing.JComboBox<String> cbPrivilegio;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JLabel lblApellidos;
    public javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblDatosDescuento;
    private javax.swing.JLabel lblDatosFecha;
    private javax.swing.JLabel lblDatosHora;
    private javax.swing.JLabel lblDatosID;
    private javax.swing.JLabel lblDatosNombre;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblPass;
    public javax.swing.JLabel lblPrivilegio;
    public javax.swing.JLabel lblSueldo;
    public javax.swing.JLabel lblValidarPass;
    public javax.swing.JPanel pAsistencia;
    public javax.swing.JPanel pAsistenciaBuscar;
    public javax.swing.JPanel pAsistenciaDatos;
    public javax.swing.JPanel pBuscar;
    public javax.swing.JPanel pCRUD;
    public javax.swing.JPanel pDatos;
    private javax.swing.JPanel pDatosBotones;
    private javax.swing.JPanel pTrabajadores;
    public javax.swing.JScrollPane spTabla;
    public javax.swing.JTextField txfApellidos;
    public javax.swing.JTextField txfBuscar;
    public javax.swing.JTextField txfDNI;
    public javax.swing.JTextField txfDatosDNI;
    public javax.swing.JLabel txfDatosDescuento;
    public javax.swing.JTextField txfDatosFecha;
    public javax.swing.JTextField txfDatosHora;
    public javax.swing.JLabel txfDatosNombre;
    public javax.swing.JTextField txfNombre;
    public javax.swing.JTextField txfPassword;
    public javax.swing.JTextField txfSueldo;
    public javax.swing.JTextField txfValidatePassword;
    // End of variables declaration//GEN-END:variables
}
