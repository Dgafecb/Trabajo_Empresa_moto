
package vista;

import java.awt.event.ItemEvent;
import modelo.Cadenas;


public class Panel_Registro_Clientes_Agregar extends javax.swing.JPanel {

    
    
    public Panel_Registro_Clientes_Agregar() {
        initComponents();
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
            case "PERU": llenarCiudad(0);
                break;
            default: llenarCiudad(-1);
                break;
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        customPanel5 = new custom.CustomPanel();
        pCNombre1 = new javax.swing.JPanel();
        txfCNombre1 = new custom.CustomTextField();
        lblDNI = new javax.swing.JLabel();
        pCDNI2 = new javax.swing.JPanel();
        txfCDNI2 = new custom.CustomTextField();
        jLabel3 = new javax.swing.JLabel();
        pCNombre2 = new javax.swing.JPanel();
        txfCNombre2 = new custom.CustomTextField();
        jSeparator5 = new javax.swing.JSeparator();
        pCCorreo = new javax.swing.JPanel();
        txfCCorreo = new custom.CustomTextField();
        pCDNI1 = new javax.swing.JPanel();
        txfCDNI1 = new custom.CustomTextField();
        pCTelefono = new javax.swing.JPanel();
        txfCTelefono = new custom.CustomTextField();
        jSeparator2 = new javax.swing.JSeparator();
        pCDireccion = new javax.swing.JPanel();
        txfCDireccion = new custom.CustomTextField();
        pDireccion = new javax.swing.JPanel();
        lblCiudad = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        cbCiudad = new javax.swing.JComboBox<>();
        cbPais = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        lblNombreApellido = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.GridBagLayout());

        customPanel5.setBackground(new java.awt.Color(250, 250, 250));
        customPanel5.setForeground(new java.awt.Color(250, 250, 250));
        customPanel5.setLayout(new java.awt.GridBagLayout());

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
        customPanel5.add(pCNombre1, gridBagConstraints);

        lblDNI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(60, 60, 60));
        lblDNI.setText("DNI :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(lblDNI, gridBagConstraints);

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
        customPanel5.add(pCDNI2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 60, 60));
        jLabel3.setText("Direccion :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(jLabel3, gridBagConstraints);

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
        customPanel5.add(pCNombre2, gridBagConstraints);

        jSeparator5.setForeground(new java.awt.Color(200, 200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(jSeparator5, gridBagConstraints);

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
        txfCCorreo.setPlaceholder(Cadenas.CLIENTES_CORREO);
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
        customPanel5.add(pCCorreo, gridBagConstraints);

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
        customPanel5.add(pCDNI1, gridBagConstraints);

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
        customPanel5.add(pCTelefono, gridBagConstraints);

        jSeparator2.setForeground(new java.awt.Color(200, 200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(jSeparator2, gridBagConstraints);

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
        txfCDireccion.setPlaceholder(Cadenas.CLIENTES_DIRECCION);
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
        customPanel5.add(pCDireccion, gridBagConstraints);

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
        cbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PERU", "VENEZUELA" }));
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
        customPanel5.add(pDireccion, gridBagConstraints);

        lblNombreApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombreApellido.setForeground(new java.awt.Color(60, 60, 60));
        lblNombreApellido.setText("Nombre y Apellidos :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(lblNombreApellido, gridBagConstraints);

        jSeparator3.setForeground(new java.awt.Color(200, 200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(jSeparator3, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 60));
        jLabel1.setText("Correo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 60, 60));
        jLabel2.setText("Telefono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(jLabel2, gridBagConstraints);

        jSeparator4.setForeground(new java.awt.Color(200, 200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(jSeparator4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel5, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void cbPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPaisItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            evaluarPais(item.toString());
        }
    }//GEN-LAST:event_cbPaisItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cbCiudad;
    public javax.swing.JComboBox<String> cbPais;
    private custom.CustomPanel customPanel5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblNombreApellido;
    private javax.swing.JLabel lblPais;
    private javax.swing.JPanel pCCorreo;
    private javax.swing.JPanel pCDNI1;
    private javax.swing.JPanel pCDNI2;
    private javax.swing.JPanel pCDireccion;
    private javax.swing.JPanel pCNombre1;
    private javax.swing.JPanel pCNombre2;
    private javax.swing.JPanel pCTelefono;
    private javax.swing.JPanel pDireccion;
    public custom.CustomTextField txfCCorreo;
    public custom.CustomTextField txfCDNI1;
    public custom.CustomTextField txfCDNI2;
    public custom.CustomTextField txfCDireccion;
    public custom.CustomTextField txfCNombre1;
    public custom.CustomTextField txfCNombre2;
    public custom.CustomTextField txfCTelefono;
    // End of variables declaration//GEN-END:variables
}
