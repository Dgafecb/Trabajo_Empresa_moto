/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author FuryMercury
 */
public class Panel_List_Ventas extends javax.swing.JPanel {

    /**
     * Creates new form Panel_List_Ventas
     */
    public Panel_List_Ventas() {
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

        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblGanancia = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customButtonShaped1 = new custom.CustomButtonShaped();
        lblFecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lblID.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblID.setText("#0000001");
        lblID.setMaximumSize(new java.awt.Dimension(150, 20));
        lblID.setMinimumSize(new java.awt.Dimension(150, 20));
        lblID.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(lblID, gridBagConstraints);

        lblNumero.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblNumero.setText("NO ASIGNADO");
        lblNumero.setMaximumSize(new java.awt.Dimension(150, 20));
        lblNumero.setMinimumSize(new java.awt.Dimension(150, 20));
        lblNumero.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(lblNumero, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 35;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel1.setText("Ganancias:  ");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel1, gridBagConstraints);

        lblGanancia.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblGanancia.setText("S/. 000000.00");
        lblGanancia.setMaximumSize(new java.awt.Dimension(100, 20));
        lblGanancia.setMinimumSize(new java.awt.Dimension(100, 20));
        lblGanancia.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(lblGanancia, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel3.setText("Total: ");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel3, gridBagConstraints);

        lblTotal.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblTotal.setText("S/. 00000.00");
        lblTotal.setMaximumSize(new java.awt.Dimension(100, 20));
        lblTotal.setMinimumSize(new java.awt.Dimension(100, 20));
        lblTotal.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(lblTotal, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel5.setText("Fecha:");
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel5, gridBagConstraints);

        customButtonShaped1.setText("ver mas");
        customButtonShaped1.setMaximumSize(new java.awt.Dimension(100, 30));
        customButtonShaped1.setMinimumSize(new java.awt.Dimension(100, 30));
        customButtonShaped1.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        jPanel2.add(customButtonShaped1, gridBagConstraints);

        lblFecha.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblFecha.setText("01/01/2000");
        lblFecha.setMaximumSize(new java.awt.Dimension(100, 20));
        lblFecha.setMinimumSize(new java.awt.Dimension(100, 20));
        lblFecha.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(lblFecha, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel6.setText("Hora:");
        jLabel6.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel6, gridBagConstraints);

        lblHora.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        lblHora.setText("23:59:59");
        lblHora.setMaximumSize(new java.awt.Dimension(100, 20));
        lblHora.setMinimumSize(new java.awt.Dimension(100, 20));
        lblHora.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(lblHora, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipady = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jPanel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jSeparator1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public custom.CustomButtonShaped customButtonShaped1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblGanancia;
    public javax.swing.JLabel lblHora;
    public javax.swing.JLabel lblID;
    public javax.swing.JLabel lblNumero;
    public javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}