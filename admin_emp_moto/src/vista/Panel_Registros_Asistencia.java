/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;

/**
 *
 * @author FuryMercury
 */
public class Panel_Registros_Asistencia extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Registros_Asistencia
     */
    public Panel_Registros_Asistencia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pAsistencia = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pAsistenciaDatos = new javax.swing.JPanel();
        lblDatosID = new javax.swing.JLabel();
        lblDatosNombre = new javax.swing.JLabel();
        lblDatosFecha = new javax.swing.JLabel();
        lblDatosHora = new javax.swing.JLabel();
        lblDatosDescuento = new javax.swing.JLabel();
        txfDatosNombre = new javax.swing.JLabel();
        txfDatosDescuento = new javax.swing.JLabel();
        txfDatosID = new javax.swing.JTextField();
        pDatosBotones = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txfDatosFecha = new javax.swing.JFormattedTextField();
        txfDatosHora = new javax.swing.JFormattedTextField();

        setLayout(new java.awt.GridBagLayout());

        pAsistencia.setBackground(new java.awt.Color(250, 250, 250));
        pAsistencia.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)), "Asistencia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(60, 60, 60))); // NOI18N
        pAsistencia.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setMaximumSize(new java.awt.Dimension(200, 50));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(200, 50));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 50));

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
        jTable1.setMaximumSize(new java.awt.Dimension(200, 50));
        jTable1.setMinimumSize(new java.awt.Dimension(200, 50));
        jTable1.setPreferredSize(new java.awt.Dimension(200, 50));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistencia.add(jScrollPane1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jTextField4, gridBagConstraints);

        jButton4.setText("Buscar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jButton4, gridBagConstraints);

        jLabel1.setText("Filtra por :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistencia.add(jPanel2, gridBagConstraints);

        pAsistenciaDatos.setBackground(new java.awt.Color(250, 250, 250));
        pAsistenciaDatos.setLayout(new java.awt.GridBagLayout());

        lblDatosID.setText("D.N.I.:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosID, gridBagConstraints);

        lblDatosNombre.setText("Nombre Trabajador :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosNombre, gridBagConstraints);

        lblDatosFecha.setText("Fecha :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosFecha, gridBagConstraints);

        lblDatosHora.setText("Hora de entrada :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosHora, gridBagConstraints);

        lblDatosDescuento.setText("Descuento :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(lblDatosDescuento, gridBagConstraints);

        txfDatosNombre.setText("NAME_DEFAULT");
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        pAsistenciaDatos.add(txfDatosDescuento, gridBagConstraints);

        txfDatosID.setMaximumSize(new java.awt.Dimension(200, 20));
        txfDatosID.setMinimumSize(new java.awt.Dimension(200, 20));
        txfDatosID.setPreferredSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(txfDatosID, gridBagConstraints);

        pDatosBotones.setBackground(new java.awt.Color(250, 250, 250));
        pDatosBotones.setLayout(new java.awt.GridBagLayout());

        jButton3.setText("AGREGAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosBotones.add(jButton3, gridBagConstraints);

        jButton2.setText("ELIMINAR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosBotones.add(jButton2, gridBagConstraints);

        jButton1.setText("MODIFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDatosBotones.add(jButton1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(pDatosBotones, gridBagConstraints);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        txfDatosFecha = new JFormattedTextField(df);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(txfDatosFecha, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistenciaDatos.add(txfDatosHora, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pAsistencia.add(pAsistenciaDatos, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(43, 0, 44, 0);
        add(pAsistencia, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblDatosDescuento;
    private javax.swing.JLabel lblDatosFecha;
    private javax.swing.JLabel lblDatosHora;
    private javax.swing.JLabel lblDatosID;
    private javax.swing.JLabel lblDatosNombre;
    public javax.swing.JPanel pAsistencia;
    public javax.swing.JPanel pAsistenciaDatos;
    private javax.swing.JPanel pDatosBotones;
    public javax.swing.JLabel txfDatosDescuento;
    public javax.swing.JFormattedTextField txfDatosFecha;
    public javax.swing.JFormattedTextField txfDatosHora;
    private javax.swing.JTextField txfDatosID;
    public javax.swing.JLabel txfDatosNombre;
    // End of variables declaration//GEN-END:variables
}
