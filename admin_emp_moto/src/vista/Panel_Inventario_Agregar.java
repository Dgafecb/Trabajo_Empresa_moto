
package vista;

import java.awt.Color;
import java.awt.event.ItemEvent;


public class Panel_Inventario_Agregar extends javax.swing.JPanel {


    public Panel_Inventario_Agregar() {
        initComponents();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSeparator7 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        pCNombre5 = new javax.swing.JPanel();
        txfFab = new custom.CustomTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pCNombre4 = new javax.swing.JPanel();
        txfGarantia = new custom.CustomTextField();
        jLabel13 = new javax.swing.JLabel();
        pCNombre13 = new javax.swing.JPanel();
        txfPrecioC = new custom.CustomTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        pCNombre3 = new javax.swing.JPanel();
        txfPrecio = new custom.CustomTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        pCNombre2 = new javax.swing.JPanel();
        txfCantidad = new custom.CustomTextField();
        pCNombre1 = new javax.swing.JPanel();
        txfAdvertencia = new custom.CustomTextField();
        jLabel6 = new javax.swing.JLabel();
        pCNombre6 = new javax.swing.JPanel();
        txfChasis = new custom.CustomTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Motor = new javax.swing.JLabel();
        pCNombre7 = new javax.swing.JPanel();
        txfMotor = new custom.CustomTextField();
        pCNombre8 = new javax.swing.JPanel();
        txfColor = new custom.CustomTextField();
        pCNombre9 = new javax.swing.JPanel();
        txfModelo = new custom.CustomTextField();
        pCNombre10 = new javax.swing.JPanel();
        txfMarca = new custom.CustomTextField();
        pCNombre11 = new javax.swing.JPanel();
        txfDescripicion = new custom.CustomTextField();
        cbxVehiculo = new javax.swing.JComboBox<>();
        pCNombre12 = new javax.swing.JPanel();
        txfID = new custom.CustomTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.GridBagLayout());

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jSeparator7, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        pCNombre5.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre5.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre5.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre5.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre5.setLayout(new java.awt.GridBagLayout());

        txfFab.setBorder(null);
        txfFab.setCaretColor(new java.awt.Color(60, 60, 60));
        txfFab.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfFab.setMaximumSize(new java.awt.Dimension(200, 28));
        txfFab.setMinimumSize(new java.awt.Dimension(200, 28));
        txfFab.setPhColor(new java.awt.Color(60, 60, 60));
        txfFab.setPlaceholder("Ingresar año (ejm. 2019)");
        txfFab.setPreferredSize(new java.awt.Dimension(200, 28));
        txfFab.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre5.add(txfFab, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(pCNombre5, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(60, 60, 60));
        jLabel7.setText("Año de Fabricacion :");
        jLabel7.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 60, 60));
        jLabel8.setText("Años de Garantia :");
        jLabel8.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel8, gridBagConstraints);

        pCNombre4.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre4.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre4.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre4.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre4.setLayout(new java.awt.GridBagLayout());

        txfGarantia.setBorder(null);
        txfGarantia.setCaretColor(new java.awt.Color(60, 60, 60));
        txfGarantia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfGarantia.setMaximumSize(new java.awt.Dimension(200, 28));
        txfGarantia.setMinimumSize(new java.awt.Dimension(200, 28));
        txfGarantia.setPhColor(new java.awt.Color(60, 60, 60));
        txfGarantia.setPlaceholder("Ingresar años de garantia");
        txfGarantia.setPreferredSize(new java.awt.Dimension(200, 28));
        txfGarantia.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre4.add(txfGarantia, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(pCNombre4, gridBagConstraints);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(60, 60, 60));
        jLabel13.setText("Precio Compra:");
        jLabel13.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel13.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel13.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel13, gridBagConstraints);

        pCNombre13.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre13.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre13.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre13.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre13.setLayout(new java.awt.GridBagLayout());

        txfPrecioC.setBorder(null);
        txfPrecioC.setCaretColor(new java.awt.Color(60, 60, 60));
        txfPrecioC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPrecioC.setMaximumSize(new java.awt.Dimension(200, 28));
        txfPrecioC.setMinimumSize(new java.awt.Dimension(200, 28));
        txfPrecioC.setPhColor(new java.awt.Color(60, 60, 60));
        txfPrecioC.setPlaceholder("Ingresar precio de costo");
        txfPrecioC.setPreferredSize(new java.awt.Dimension(200, 28));
        txfPrecioC.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre13.add(txfPrecioC, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(pCNombre13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jSeparator5, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 60, 60));
        jLabel10.setText("Precio Venta:");
        jLabel10.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel10.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel10, gridBagConstraints);

        pCNombre3.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre3.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre3.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre3.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre3.setLayout(new java.awt.GridBagLayout());

        txfPrecio.setBorder(null);
        txfPrecio.setCaretColor(new java.awt.Color(60, 60, 60));
        txfPrecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfPrecio.setMaximumSize(new java.awt.Dimension(200, 28));
        txfPrecio.setMinimumSize(new java.awt.Dimension(200, 28));
        txfPrecio.setPhColor(new java.awt.Color(60, 60, 60));
        txfPrecio.setPlaceholder("Ingresar precio de venta");
        txfPrecio.setPreferredSize(new java.awt.Dimension(200, 28));
        txfPrecio.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre3.add(txfPrecio, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(pCNombre3, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(60, 60, 60));
        jLabel9.setText("Cantidad :");
        jLabel9.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel9.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jSeparator6, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(60, 60, 60));
        jLabel11.setText("Cantidad Advertencia :");
        jLabel11.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel11.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel11.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel11, gridBagConstraints);

        pCNombre2.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre2.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre2.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre2.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre2.setLayout(new java.awt.GridBagLayout());

        txfCantidad.setBorder(null);
        txfCantidad.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCantidad.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCantidad.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCantidad.setPhColor(new java.awt.Color(60, 60, 60));
        txfCantidad.setPlaceholder("Ingresar stock disponible");
        txfCantidad.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCantidad.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre2.add(txfCantidad, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(pCNombre2, gridBagConstraints);

        pCNombre1.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre1.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre1.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre1.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre1.setLayout(new java.awt.GridBagLayout());

        txfAdvertencia.setBorder(null);
        txfAdvertencia.setCaretColor(new java.awt.Color(60, 60, 60));
        txfAdvertencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfAdvertencia.setMaximumSize(new java.awt.Dimension(200, 28));
        txfAdvertencia.setMinimumSize(new java.awt.Dimension(200, 28));
        txfAdvertencia.setPhColor(new java.awt.Color(60, 60, 60));
        txfAdvertencia.setPlaceholder("Ingresar cantidad minima");
        txfAdvertencia.setPreferredSize(new java.awt.Dimension(200, 28));
        txfAdvertencia.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre1.add(txfAdvertencia, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(pCNombre1, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(60, 60, 60));
        jLabel6.setText("Chasis :");
        jLabel6.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel6, gridBagConstraints);

        pCNombre6.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre6.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre6.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre6.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre6.setLayout(new java.awt.GridBagLayout());

        txfChasis.setBorder(null);
        txfChasis.setCaretColor(new java.awt.Color(60, 60, 60));
        txfChasis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfChasis.setMaximumSize(new java.awt.Dimension(200, 28));
        txfChasis.setMinimumSize(new java.awt.Dimension(200, 28));
        txfChasis.setPhColor(new java.awt.Color(60, 60, 60));
        txfChasis.setPlaceholder("Ingresar chasis");
        txfChasis.setPreferredSize(new java.awt.Dimension(200, 28));
        txfChasis.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre6.add(txfChasis, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(pCNombre6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jSeparator8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        add(jPanel1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(60, 60, 60));
        jLabel12.setText("Categoria :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel12, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 60));
        jLabel1.setText("ID :");
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 60, 60));
        jLabel2.setText("Descripcion :");
        jLabel2.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 60, 60));
        jLabel3.setText("Marca :");
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 60, 60));
        jLabel4.setText("Modelo :");
        jLabel4.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 60, 60));
        jLabel5.setText("Color :");
        jLabel5.setMaximumSize(new java.awt.Dimension(150, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jLabel5, gridBagConstraints);

        Motor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Motor.setForeground(new java.awt.Color(60, 60, 60));
        Motor.setText("Motor :");
        Motor.setMaximumSize(new java.awt.Dimension(150, 20));
        Motor.setMinimumSize(new java.awt.Dimension(150, 20));
        Motor.setPreferredSize(new java.awt.Dimension(150, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(Motor, gridBagConstraints);

        pCNombre7.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre7.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre7.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre7.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre7.setLayout(new java.awt.GridBagLayout());

        txfMotor.setBorder(null);
        txfMotor.setCaretColor(new java.awt.Color(60, 60, 60));
        txfMotor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfMotor.setMaximumSize(new java.awt.Dimension(200, 28));
        txfMotor.setMinimumSize(new java.awt.Dimension(200, 28));
        txfMotor.setPhColor(new java.awt.Color(60, 60, 60));
        txfMotor.setPlaceholder("Ingresar motor");
        txfMotor.setPreferredSize(new java.awt.Dimension(200, 28));
        txfMotor.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre7.add(txfMotor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(pCNombre7, gridBagConstraints);

        pCNombre8.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre8.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre8.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre8.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre8.setLayout(new java.awt.GridBagLayout());

        txfColor.setBorder(null);
        txfColor.setCaretColor(new java.awt.Color(60, 60, 60));
        txfColor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfColor.setMaximumSize(new java.awt.Dimension(200, 28));
        txfColor.setMinimumSize(new java.awt.Dimension(200, 28));
        txfColor.setPhColor(new java.awt.Color(60, 60, 60));
        txfColor.setPlaceholder("Ingresar color");
        txfColor.setPreferredSize(new java.awt.Dimension(200, 28));
        txfColor.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre8.add(txfColor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(pCNombre8, gridBagConstraints);

        pCNombre9.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre9.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre9.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre9.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre9.setLayout(new java.awt.GridBagLayout());

        txfModelo.setBorder(null);
        txfModelo.setCaretColor(new java.awt.Color(60, 60, 60));
        txfModelo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfModelo.setMaximumSize(new java.awt.Dimension(200, 28));
        txfModelo.setMinimumSize(new java.awt.Dimension(200, 28));
        txfModelo.setPhColor(new java.awt.Color(60, 60, 60));
        txfModelo.setPlaceholder("Ingresar modelo");
        txfModelo.setPreferredSize(new java.awt.Dimension(200, 28));
        txfModelo.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre9.add(txfModelo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(pCNombre9, gridBagConstraints);

        pCNombre10.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre10.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre10.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre10.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre10.setLayout(new java.awt.GridBagLayout());

        txfMarca.setBorder(null);
        txfMarca.setCaretColor(new java.awt.Color(60, 60, 60));
        txfMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfMarca.setMaximumSize(new java.awt.Dimension(200, 28));
        txfMarca.setMinimumSize(new java.awt.Dimension(200, 28));
        txfMarca.setPhColor(new java.awt.Color(60, 60, 60));
        txfMarca.setPlaceholder("Ingresar marca");
        txfMarca.setPreferredSize(new java.awt.Dimension(200, 28));
        txfMarca.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre10.add(txfMarca, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(pCNombre10, gridBagConstraints);

        pCNombre11.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre11.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre11.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre11.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre11.setLayout(new java.awt.GridBagLayout());

        txfDescripicion.setBorder(null);
        txfDescripicion.setCaretColor(new java.awt.Color(60, 60, 60));
        txfDescripicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfDescripicion.setMaximumSize(new java.awt.Dimension(200, 28));
        txfDescripicion.setMinimumSize(new java.awt.Dimension(200, 28));
        txfDescripicion.setPhColor(new java.awt.Color(60, 60, 60));
        txfDescripicion.setPlaceholder("Ingresar descripcion");
        txfDescripicion.setPreferredSize(new java.awt.Dimension(200, 28));
        txfDescripicion.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre11.add(txfDescripicion, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(pCNombre11, gridBagConstraints);

        cbxVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOTOCICLETAS", "TRIMONOTO DE CARGA", "REPUESTOS", "ADITIVOS", "CASCOS" }));
        cbxVehiculo.setFocusable(false);
        cbxVehiculo.setMaximumSize(new java.awt.Dimension(250, 30));
        cbxVehiculo.setMinimumSize(new java.awt.Dimension(250, 30));
        cbxVehiculo.setPreferredSize(new java.awt.Dimension(250, 30));
        cbxVehiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxVehiculoItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(cbxVehiculo, gridBagConstraints);

        pCNombre12.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre12.setMaximumSize(new java.awt.Dimension(250, 30));
        pCNombre12.setMinimumSize(new java.awt.Dimension(250, 30));
        pCNombre12.setPreferredSize(new java.awt.Dimension(250, 30));
        pCNombre12.setLayout(new java.awt.GridBagLayout());

        txfID.setBorder(null);
        txfID.setCaretColor(new java.awt.Color(60, 60, 60));
        txfID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfID.setMaximumSize(new java.awt.Dimension(200, 28));
        txfID.setMinimumSize(new java.awt.Dimension(200, 28));
        txfID.setPhColor(new java.awt.Color(60, 60, 60));
        txfID.setPlaceholder("Ingresar ID de producto");
        txfID.setPreferredSize(new java.awt.Dimension(200, 28));
        txfID.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre12.add(txfID, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(pCNombre12, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jSeparator3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jSeparator2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel2.add(jSeparator4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        add(jPanel2, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxVehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxVehiculoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            if (item.toString().equals("REPUESTOS")||item.toString().equals("ADITIVOS")
                    ||item.toString().equals("CASCOS")) {
                this.txfMotor.setText("");
                this.txfMotor.setEnabled(false);
                this.txfChasis.setText("");
                this.txfChasis.setEnabled(false);
                this.pCNombre6.setBackground(new Color(240,240,240));
                this.pCNombre7.setBackground(new Color(240,240,240));
            } else {
                this.txfMotor.setEnabled(true);
                this.txfChasis.setEnabled(true);
                this.pCNombre6.setBackground(new Color(255,255,255));
                this.pCNombre7.setBackground(new Color(255,255,255));
            }
        }
    }//GEN-LAST:event_cbxVehiculoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Motor;
    public javax.swing.JComboBox<String> cbxVehiculo;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel10;
    public javax.swing.JLabel jLabel11;
    public javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public javax.swing.JSeparator jSeparator7;
    public javax.swing.JSeparator jSeparator8;
    private javax.swing.JPanel pCNombre1;
    private javax.swing.JPanel pCNombre10;
    private javax.swing.JPanel pCNombre11;
    private javax.swing.JPanel pCNombre12;
    private javax.swing.JPanel pCNombre13;
    private javax.swing.JPanel pCNombre2;
    private javax.swing.JPanel pCNombre3;
    private javax.swing.JPanel pCNombre4;
    private javax.swing.JPanel pCNombre5;
    private javax.swing.JPanel pCNombre6;
    private javax.swing.JPanel pCNombre7;
    private javax.swing.JPanel pCNombre8;
    private javax.swing.JPanel pCNombre9;
    public custom.CustomTextField txfAdvertencia;
    public custom.CustomTextField txfCantidad;
    public custom.CustomTextField txfChasis;
    public custom.CustomTextField txfColor;
    public custom.CustomTextField txfDescripicion;
    public custom.CustomTextField txfFab;
    public custom.CustomTextField txfGarantia;
    public custom.CustomTextField txfID;
    public custom.CustomTextField txfMarca;
    public custom.CustomTextField txfModelo;
    public custom.CustomTextField txfMotor;
    public custom.CustomTextField txfPrecio;
    public custom.CustomTextField txfPrecioC;
    // End of variables declaration//GEN-END:variables
}
