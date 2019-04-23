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
        btnTrabajadorAgregar1 = new custom.CustomButtonShaped();
        btnTrabajadorAgregar2 = new custom.CustomButtonShaped();
        pVentasBuscar = new javax.swing.JPanel();
        btnClienteBuscar = new modelo.CustomButtonShaped();
        pBuscar1 = new javax.swing.JPanel();
        txfBuscar1 = new modelo.CustomTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        pAsistencia = new javax.swing.JPanel();
        pDatosBotones = new javax.swing.JPanel();
        btnAsistenciaModificar = new modelo.CustomButtonShaped();
        btnAsistenciaBorrar = new modelo.CustomButtonShaped();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pAsistenciaDatos = new javax.swing.JPanel();
        lblDatosID = new javax.swing.JLabel();
        lblDatosDescuento = new javax.swing.JLabel();
        txfTiempo = new javax.swing.JTextField();
        txfDescuento = new javax.swing.JTextField();
        lblDatosID1 = new javax.swing.JLabel();
        txfTardanza = new javax.swing.JTextField();
        pVentasBuscar1 = new javax.swing.JPanel();
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        pCRUD.add(btnTrabajadorAgregar, gridBagConstraints);

        btnTrabajadorModificar.setText("EDITAR");
        btnTrabajadorModificar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnTrabajadorModificar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(btnTrabajadorModificar, gridBagConstraints);

        btnTrabajadorBorrar.setText("BORRAR");
        btnTrabajadorBorrar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnTrabajadorBorrar.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        pCRUD.add(btnTrabajadorBorrar, gridBagConstraints);

        btnTrabajadorAgregar1.setText("EXPORTAR");
        btnTrabajadorAgregar1.setMinimumSize(new java.awt.Dimension(100, 35));
        btnTrabajadorAgregar1.setPreferredSize(new java.awt.Dimension(120, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        pCRUD.add(btnTrabajadorAgregar1, gridBagConstraints);

        btnTrabajadorAgregar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnUpdate.png"))); // NOI18N
        btnTrabajadorAgregar2.setMaximumSize(new java.awt.Dimension(50, 35));
        btnTrabajadorAgregar2.setMinimumSize(new java.awt.Dimension(50, 35));
        btnTrabajadorAgregar2.setPreferredSize(new java.awt.Dimension(50, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 5);
        pCRUD.add(btnTrabajadorAgregar2, gridBagConstraints);

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
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
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
        jTable1.setFocusable(false);
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

        pAsistenciaDatos.setBackground(new java.awt.Color(250, 250, 250));
        pAsistenciaDatos.setMaximumSize(new java.awt.Dimension(600, 300));
        pAsistenciaDatos.setMinimumSize(new java.awt.Dimension(600, 300));
        pAsistenciaDatos.setPreferredSize(new java.awt.Dimension(600, 300));
        pAsistenciaDatos.setLayout(new java.awt.GridBagLayout());

        lblDatosID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDatosID.setForeground(new java.awt.Color(60, 60, 60));
        lblDatosID.setText("TIEMPO DE TARDANZA :");
        lblDatosID.setMaximumSize(new java.awt.Dimension(350, 40));
        lblDatosID.setMinimumSize(new java.awt.Dimension(300, 40));
        lblDatosID.setPreferredSize(new java.awt.Dimension(300, 40));
        lblDatosID.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosID, gridBagConstraints);

        lblDatosDescuento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDatosDescuento.setForeground(new java.awt.Color(60, 60, 60));
        lblDatosDescuento.setText("DESCUENTO TOTAL :");
        lblDatosDescuento.setMaximumSize(new java.awt.Dimension(350, 40));
        lblDatosDescuento.setMinimumSize(new java.awt.Dimension(300, 40));
        lblDatosDescuento.setPreferredSize(new java.awt.Dimension(300, 40));
        lblDatosDescuento.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosDescuento, gridBagConstraints);

        txfTiempo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txfTiempo.setForeground(new java.awt.Color(60, 60, 60));
        txfTiempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTiempo.setText("00:00:00");
        txfTiempo.setEnabled(false);
        txfTiempo.setFocusable(false);
        txfTiempo.setMaximumSize(new java.awt.Dimension(250, 40));
        txfTiempo.setMinimumSize(new java.awt.Dimension(250, 40));
        txfTiempo.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(txfTiempo, gridBagConstraints);

        txfDescuento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txfDescuento.setForeground(new java.awt.Color(60, 60, 60));
        txfDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfDescuento.setText("0,00");
        txfDescuento.setEnabled(false);
        txfDescuento.setFocusable(false);
        txfDescuento.setMaximumSize(new java.awt.Dimension(250, 40));
        txfDescuento.setMinimumSize(new java.awt.Dimension(250, 40));
        txfDescuento.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(txfDescuento, gridBagConstraints);

        lblDatosID1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDatosID1.setForeground(new java.awt.Color(60, 60, 60));
        lblDatosID1.setText("TARDANZAS TOTALES:");
        lblDatosID1.setMaximumSize(new java.awt.Dimension(350, 40));
        lblDatosID1.setMinimumSize(new java.awt.Dimension(300, 40));
        lblDatosID1.setPreferredSize(new java.awt.Dimension(300, 40));
        lblDatosID1.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosID1, gridBagConstraints);

        txfTardanza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txfTardanza.setForeground(new java.awt.Color(60, 60, 60));
        txfTardanza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfTardanza.setText("0");
        txfTardanza.setEnabled(false);
        txfTardanza.setFocusable(false);
        txfTardanza.setMaximumSize(new java.awt.Dimension(250, 40));
        txfTardanza.setMinimumSize(new java.awt.Dimension(250, 40));
        txfTardanza.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(txfTardanza, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistencia.add(pAsistenciaDatos, gridBagConstraints);

        pVentasBuscar1.setBackground(new java.awt.Color(250, 250, 250));
        pVentasBuscar1.setLayout(new java.awt.GridBagLayout());
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButtonShaped btnAsistenciaBorrar;
    public modelo.CustomButtonShaped btnAsistenciaModificar;
    public modelo.CustomButtonShaped btnClienteBuscar;
    public custom.CustomButtonShaped btnTrabajadorAgregar;
    public custom.CustomButtonShaped btnTrabajadorAgregar1;
    public custom.CustomButtonShaped btnTrabajadorAgregar2;
    public custom.CustomButtonShaped btnTrabajadorBorrar;
    public custom.CustomButtonShaped btnTrabajadorModificar;
    private custom.CustomPanel customPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    private javax.swing.JLabel lblDatosDescuento;
    private javax.swing.JLabel lblDatosID;
    private javax.swing.JLabel lblDatosID1;
    public javax.swing.JPanel pAsistencia;
    public javax.swing.JPanel pAsistenciaDatos;
    private javax.swing.JPanel pBuscar1;
    public javax.swing.JPanel pCRUD;
    private javax.swing.JPanel pDatosBotones;
    private javax.swing.JPanel pTrabajadores;
    public javax.swing.JPanel pVentasBuscar;
    public javax.swing.JPanel pVentasBuscar1;
    public modelo.CustomTextField txfBuscar1;
    public javax.swing.JTextField txfDescuento;
    public javax.swing.JTextField txfTardanza;
    public javax.swing.JTextField txfTiempo;
    // End of variables declaration//GEN-END:variables
}
