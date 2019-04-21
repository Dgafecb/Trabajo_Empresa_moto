
package vista;

import modelo.Cadenas;


public class Panel_Registro_Ventas_Agregar extends javax.swing.JPanel {


    public Panel_Registro_Ventas_Agregar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pVProducto = new javax.swing.JPanel();
        txfVProducto = new custom.CustomTextField();
        pCNombre2 = new javax.swing.JPanel();
        txfCNombre2 = new custom.CustomTextField();
        pCNombre3 = new javax.swing.JPanel();
        txfCNombre3 = new custom.CustomTextField();
        pCNombre4 = new javax.swing.JPanel();
        txfCNombre4 = new custom.CustomTextField();
        pCNombre5 = new javax.swing.JPanel();
        txfCNombre5 = new custom.CustomTextField();
        pCNombre6 = new javax.swing.JPanel();
        txfCNombre6 = new custom.CustomTextField();
        pCNombre7 = new javax.swing.JPanel();
        txfCNombre7 = new custom.CustomTextField();
        pCNombre8 = new javax.swing.JPanel();
        txfCNombre8 = new custom.CustomTextField();
        jLabel10 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 60));
        jLabel1.setText("Producto ID:");
        jLabel1.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel1.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel1.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 60, 60));
        jLabel2.setText("Trabajador ID:");
        jLabel2.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel2.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 60, 60));
        jLabel3.setText("Cliente ID:");
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 60, 60));
        jLabel4.setText("Fecha:");
        jLabel4.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 60, 60));
        jLabel5.setText("Hora:");
        jLabel5.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel5.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel5.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(60, 60, 60));
        jLabel6.setText("Monto Inicial:");
        jLabel6.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel6.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel6.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(60, 60, 60));
        jLabel7.setText("Descuento:");
        jLabel7.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel7.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel7.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(60, 60, 60));
        jLabel8.setText("Cuotas:");
        jLabel8.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel8.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel8.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(60, 60, 60));
        jLabel9.setText("Cantidad:");
        jLabel9.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel9.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel9.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel9, gridBagConstraints);

        pVProducto.setBackground(new java.awt.Color(255, 255, 255));
        pVProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pVProducto.setMaximumSize(new java.awt.Dimension(200, 30));
        pVProducto.setMinimumSize(new java.awt.Dimension(200, 30));
        pVProducto.setPreferredSize(new java.awt.Dimension(200, 30));
        pVProducto.setLayout(new java.awt.GridBagLayout());

        txfVProducto.setBorder(null);
        txfVProducto.setCaretColor(new java.awt.Color(60, 60, 60));
        txfVProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfVProducto.setMaximumSize(new java.awt.Dimension(200, 28));
        txfVProducto.setMinimumSize(new java.awt.Dimension(200, 28));
        txfVProducto.setPhColor(new java.awt.Color(60, 60, 60));
        txfVProducto.setPlaceholder(Cadenas.CLIENTES_NOMBRE1);
        txfVProducto.setPreferredSize(new java.awt.Dimension(200, 28));
        txfVProducto.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pVProducto.add(txfVProducto, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pVProducto, gridBagConstraints);

        pCNombre2.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre2.setMaximumSize(new java.awt.Dimension(200, 30));
        pCNombre2.setMinimumSize(new java.awt.Dimension(200, 30));
        pCNombre2.setPreferredSize(new java.awt.Dimension(200, 30));
        pCNombre2.setLayout(new java.awt.GridBagLayout());

        txfCNombre2.setBorder(null);
        txfCNombre2.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCNombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCNombre2.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCNombre2.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCNombre2.setPhColor(new java.awt.Color(60, 60, 60));
        txfCNombre2.setPlaceholder(Cadenas.CLIENTES_NOMBRE1);
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
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pCNombre2, gridBagConstraints);

        pCNombre3.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre3.setMaximumSize(new java.awt.Dimension(200, 30));
        pCNombre3.setMinimumSize(new java.awt.Dimension(200, 30));
        pCNombre3.setPreferredSize(new java.awt.Dimension(200, 30));
        pCNombre3.setLayout(new java.awt.GridBagLayout());

        txfCNombre3.setBorder(null);
        txfCNombre3.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCNombre3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCNombre3.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCNombre3.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCNombre3.setPhColor(new java.awt.Color(60, 60, 60));
        txfCNombre3.setPlaceholder(Cadenas.CLIENTES_NOMBRE1);
        txfCNombre3.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCNombre3.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre3.add(txfCNombre3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pCNombre3, gridBagConstraints);

        pCNombre4.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre4.setMaximumSize(new java.awt.Dimension(200, 30));
        pCNombre4.setMinimumSize(new java.awt.Dimension(200, 30));
        pCNombre4.setPreferredSize(new java.awt.Dimension(200, 30));
        pCNombre4.setLayout(new java.awt.GridBagLayout());

        txfCNombre4.setBorder(null);
        txfCNombre4.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCNombre4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCNombre4.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCNombre4.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCNombre4.setPhColor(new java.awt.Color(60, 60, 60));
        txfCNombre4.setPlaceholder(Cadenas.CLIENTES_NOMBRE1);
        txfCNombre4.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCNombre4.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre4.add(txfCNombre4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pCNombre4, gridBagConstraints);

        pCNombre5.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre5.setMaximumSize(new java.awt.Dimension(200, 30));
        pCNombre5.setMinimumSize(new java.awt.Dimension(200, 30));
        pCNombre5.setPreferredSize(new java.awt.Dimension(200, 30));
        pCNombre5.setLayout(new java.awt.GridBagLayout());

        txfCNombre5.setBorder(null);
        txfCNombre5.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCNombre5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCNombre5.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCNombre5.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCNombre5.setPhColor(new java.awt.Color(60, 60, 60));
        txfCNombre5.setPlaceholder(Cadenas.CLIENTES_NOMBRE1);
        txfCNombre5.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCNombre5.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre5.add(txfCNombre5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pCNombre5, gridBagConstraints);

        pCNombre6.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre6.setMaximumSize(new java.awt.Dimension(200, 30));
        pCNombre6.setMinimumSize(new java.awt.Dimension(200, 30));
        pCNombre6.setPreferredSize(new java.awt.Dimension(200, 30));
        pCNombre6.setLayout(new java.awt.GridBagLayout());

        txfCNombre6.setBorder(null);
        txfCNombre6.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCNombre6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCNombre6.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCNombre6.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCNombre6.setPhColor(new java.awt.Color(60, 60, 60));
        txfCNombre6.setPlaceholder(Cadenas.CLIENTES_NOMBRE1);
        txfCNombre6.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCNombre6.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre6.add(txfCNombre6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pCNombre6, gridBagConstraints);

        pCNombre7.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre7.setMaximumSize(new java.awt.Dimension(200, 30));
        pCNombre7.setMinimumSize(new java.awt.Dimension(200, 30));
        pCNombre7.setPreferredSize(new java.awt.Dimension(200, 30));
        pCNombre7.setLayout(new java.awt.GridBagLayout());

        txfCNombre7.setBorder(null);
        txfCNombre7.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCNombre7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCNombre7.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCNombre7.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCNombre7.setPhColor(new java.awt.Color(60, 60, 60));
        txfCNombre7.setPlaceholder(Cadenas.CLIENTES_NOMBRE1);
        txfCNombre7.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCNombre7.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre7.add(txfCNombre7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pCNombre7, gridBagConstraints);

        pCNombre8.setBackground(new java.awt.Color(255, 255, 255));
        pCNombre8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCNombre8.setMaximumSize(new java.awt.Dimension(200, 30));
        pCNombre8.setMinimumSize(new java.awt.Dimension(200, 30));
        pCNombre8.setPreferredSize(new java.awt.Dimension(200, 30));
        pCNombre8.setLayout(new java.awt.GridBagLayout());

        txfCNombre8.setBorder(null);
        txfCNombre8.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCNombre8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCNombre8.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCNombre8.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCNombre8.setPhColor(new java.awt.Color(60, 60, 60));
        txfCNombre8.setPlaceholder(Cadenas.CLIENTES_NOMBRE1);
        txfCNombre8.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCNombre8.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCNombre8.add(txfCNombre8, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(pCNombre8, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 60, 60));
        jLabel10.setText("Monto por Unidad");
        jLabel10.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel10.setMinimumSize(new java.awt.Dimension(150, 25));
        jLabel10.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(datePicker1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(timePicker1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pCNombre2;
    private javax.swing.JPanel pCNombre3;
    private javax.swing.JPanel pCNombre4;
    private javax.swing.JPanel pCNombre5;
    private javax.swing.JPanel pCNombre6;
    private javax.swing.JPanel pCNombre7;
    private javax.swing.JPanel pCNombre8;
    private javax.swing.JPanel pVProducto;
    public com.github.lgooddatepicker.components.TimePicker timePicker1;
    public custom.CustomTextField txfCNombre2;
    public custom.CustomTextField txfCNombre3;
    public custom.CustomTextField txfCNombre4;
    public custom.CustomTextField txfCNombre5;
    public custom.CustomTextField txfCNombre6;
    public custom.CustomTextField txfCNombre7;
    public custom.CustomTextField txfCNombre8;
    public custom.CustomTextField txfVProducto;
    // End of variables declaration//GEN-END:variables
}
