
package vista;

import java.awt.event.ItemEvent;
import javax.swing.JComboBox;
import modelo.Cadenas;


public class Panel_Registro_Clientes_Agregar extends javax.swing.JPanel {

    
    
    public Panel_Registro_Clientes_Agregar() {
        initComponents();
        llenarDepartamento();
        llenarProvincia(-1);
        
    }
    
    private void llenarDepartamento(){
        cbDepartamento.removeAllItems();
        cbDepartamento.addItem("AMAZONAS");
        cbDepartamento.addItem("ÁNCASH");
        cbDepartamento.addItem("APURIMAC");
        cbDepartamento.addItem("AREQUIPA");
        cbDepartamento.addItem("AYACUCHO");
        cbDepartamento.addItem("CAJAMARCA");
        cbDepartamento.addItem("CALLAO");
        cbDepartamento.addItem("CUSCO");
        cbDepartamento.addItem("HUANCAVELICA");
        cbDepartamento.addItem("HUÁNUCO");
        cbDepartamento.addItem("ICA");
        cbDepartamento.addItem("JUNÍN");
        cbDepartamento.addItem("LA LIBERTAD");
        cbDepartamento.addItem("LAMBAYEQUE");
        cbDepartamento.addItem("LIMA");
        cbDepartamento.addItem("LORETO");
        cbDepartamento.addItem("MADRE DE DIOS");
        cbDepartamento.addItem("MOQUEGUA");
        cbDepartamento.addItem("PASCO");
        cbDepartamento.addItem("PIURA");
        cbDepartamento.addItem("PUNO");
        cbDepartamento.addItem("PASCO");
        cbDepartamento.addItem("SAN MARTÍN");
        cbDepartamento.addItem("TACNA"); 
        cbDepartamento.addItem("TUMBES");
        cbDepartamento.addItem("UCAYALI");
    }
    
    
    private void llenarProvincia(int i){
        cbProvincia.removeAllItems();
        switch (i) {
            case 0:{
                cbProvincia.addItem("BAGUA");
                cbProvincia.addItem("BONGARA");
                cbProvincia.addItem("CHACHAPOYAS");
                cbProvincia.addItem("CONDORCANQUI");
                cbProvincia.addItem("LUYA");
                cbProvincia.addItem("RODRIGUEZ DE MENDOZA");
                cbProvincia.addItem("UTCUBAMBA");                      
                break;}
            case 1:{
                cbProvincia.addItem("HUARAZ");
                cbProvincia.addItem("CARHUAZ");
                cbProvincia.addItem("CASMA");
                cbProvincia.addItem("HUARI");
                cbProvincia.addItem("HUAYLAS");
                cbProvincia.addItem("RECUAY");
                cbProvincia.addItem("YUNGAY");
                cbProvincia.addItem("HUARMEY");
                cbProvincia.addItem("PALLASCA");
                cbProvincia.addItem("CORONGO");
                cbProvincia.addItem("SIHUAS");
                cbProvincia.addItem("SANTA");
                cbProvincia.addItem("POMABAMBA");
                cbProvincia.addItem("MARISCAL LUZURIAGA");
                cbProvincia.addItem("CARLOS FERMIN F.");
                cbProvincia.addItem("ANTONIO RAYMONDI");
                cbProvincia.addItem("ASUNCION");
                cbProvincia.addItem("AIJA");
                cbProvincia.addItem("BOLOGNESI");
                cbProvincia.addItem("OCROS");
                break;}
            case 2:{
                cbProvincia.addItem("ABANCAY");
                cbProvincia.addItem("ANDAHUAYLAS");
                cbProvincia.addItem("ANTABAMBA");
                cbProvincia.addItem("AYMARAES");
                cbProvincia.addItem("CHINCHEROS");
                cbProvincia.addItem("COTABAMBAS");
                cbProvincia.addItem("GRAU");
                break;}
            case 3:{
                cbProvincia.addItem("AREQUIPA");
                cbProvincia.addItem("CAMANA");
                cbProvincia.addItem("CARAVELI");
                cbProvincia.addItem("APLAO");
                cbProvincia.addItem("CHIVAY");
                cbProvincia.addItem("CHUQUIBAMBA");
                cbProvincia.addItem("MOLLENDO");
                cbProvincia.addItem("COTAHUASI");
                break;}
            case 4:{
                cbProvincia.addItem("CANGALLO");
                cbProvincia.addItem("HUAMANDA");
                cbProvincia.addItem("HUANCA SANCOS");
                cbProvincia.addItem("HUANTA");
                cbProvincia.addItem("LA MAR");
                cbProvincia.addItem("LUCANAS");
                cbProvincia.addItem("PARINACOCHAS");
                cbProvincia.addItem("PAUCAR DEL SARA SARA");
                cbProvincia.addItem("SUCRE");
                cbProvincia.addItem("VICTOR FAJARDO");
                cbProvincia.addItem("VILCASHUAMAN");
                break;}
            case 5:{
                cbProvincia.addItem("CAJAMARCA");
                cbProvincia.addItem("CAJABAMBA");
                cbProvincia.addItem("CELENDIN");
                cbProvincia.addItem("CONTUMAZA");
                cbProvincia.addItem("CUTERVO");
                cbProvincia.addItem("CHOTA");
                cbProvincia.addItem("HUALGAYOC");
                cbProvincia.addItem("JAEN");
                cbProvincia.addItem("SANTA CRUZ");
                cbProvincia.addItem("SAN MIGUEL");
                cbProvincia.addItem("SAN IGNACIO");
                cbProvincia.addItem("SAN MARCOS");
                cbProvincia.addItem("SAN PABLO");
                break;}
            case 6:{
                //CALLAO
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 7:{
                //CUSCO
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 8:{
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 9:{
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 10:{
                cbProvincia.addItem("CHINCHA");
                cbProvincia.addItem("ICA");
                cbProvincia.addItem("PALPA");
                cbProvincia.addItem("PISCO");
                cbProvincia.addItem("NAZCA");
                break;}
            case 11:{
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 12:{
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 13:{
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 14:{
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 15:{
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 16:{
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 17:{
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 18:{
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 19:{
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 20:{ 
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
            case 21:{ 
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                cbProvincia.addItem("");
                break;}
                
            default:cbProvincia.addItem("INGRESA DEPARTAMENTO");
                break;
        }
    }

    private void evaluarPais(String item){
        switch (item) {
            case "AMAZONAS": llenarProvincia(0);
                break;
            case "ÁNCASH": llenarProvincia(1);
                break;
            case "APURIMAC": llenarProvincia(2);
                break;
            case "AREQUIPA": llenarProvincia(3);
                break;
            case "AYACUCHO": llenarProvincia(4);
                break;
            case "CAJAMARCA": llenarProvincia(5);
                break;
            case "CALLAO": llenarProvincia(6);
                break;
            case "CUSCO": llenarProvincia(7);
                break;
            case "HUANCAVELICA": llenarProvincia(8);
                break;
            case "HUÁNUCO": llenarProvincia(9);
                break;
            case "ICA": llenarProvincia(10);
                break;
            case "JUNÍN": llenarProvincia(11);
                break;
            case "LA LIBERTAD": llenarProvincia(12);
                break;
            case "LAMBAYEQUE": llenarProvincia(13);
                break;
            case "MOQUEGUA": llenarProvincia(14);
                break;
            case "LORETO": llenarProvincia(15);
                break;
            case "MADRE DE DIOS": llenarProvincia(16);
                break;
            case "PASCO": llenarProvincia(17);
                break;
            case "SAN MARTÍN": llenarProvincia(18);
                break;
            case "TACNA": llenarProvincia(19);
                break;
            case "TUMBES": llenarProvincia(20);
                break;
            case "UCAYALI": llenarProvincia(21);
                break;
            default: llenarProvincia(-1);
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
        pCCorreo1 = new javax.swing.JPanel();
        txfCFacebook = new custom.CustomTextField();
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
        cbProvincia = new javax.swing.JComboBox<>();
        cbDepartamento = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        lblNombreApellido = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

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
        gridBagConstraints.gridy = 14;
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

        pCCorreo1.setBackground(new java.awt.Color(255, 255, 255));
        pCCorreo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pCCorreo1.setMaximumSize(new java.awt.Dimension(100, 30));
        pCCorreo1.setMinimumSize(new java.awt.Dimension(100, 30));
        pCCorreo1.setPreferredSize(new java.awt.Dimension(100, 30));
        pCCorreo1.setLayout(new java.awt.GridBagLayout());

        txfCFacebook.setBorder(null);
        txfCFacebook.setCaretColor(new java.awt.Color(60, 60, 60));
        txfCFacebook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txfCFacebook.setMaximumSize(new java.awt.Dimension(200, 28));
        txfCFacebook.setMinimumSize(new java.awt.Dimension(200, 28));
        txfCFacebook.setPhColor(new java.awt.Color(60, 60, 60));
        txfCFacebook.setPlaceholder("facebook.com/");
        txfCFacebook.setPreferredSize(new java.awt.Dimension(200, 28));
        txfCFacebook.setSelectionColor(new java.awt.Color(60, 60, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pCCorreo1.add(txfCFacebook, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(pCCorreo1, gridBagConstraints);

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
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(pCDireccion, gridBagConstraints);

        pDireccion.setBackground(new java.awt.Color(250, 250, 250));
        pDireccion.setLayout(new java.awt.GridBagLayout());

        lblCiudad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCiudad.setForeground(new java.awt.Color(60, 60, 60));
        lblCiudad.setText("Provincia :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(lblCiudad, gridBagConstraints);

        lblPais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPais.setForeground(new java.awt.Color(60, 60, 60));
        lblPais.setText("Departamento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(lblPais, gridBagConstraints);

        cbProvincia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbProvincia.setForeground(new java.awt.Color(60, 60, 60));
        cbProvincia.setFocusable(false);
        cbProvincia.setMaximumSize(new java.awt.Dimension(180, 30));
        cbProvincia.setMinimumSize(new java.awt.Dimension(180, 30));
        cbProvincia.setPreferredSize(new java.awt.Dimension(180, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(cbProvincia, gridBagConstraints);

        cbDepartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDepartamento.setForeground(new java.awt.Color(60, 60, 60));
        cbDepartamento.setFocusable(false);
        cbDepartamento.setMaximumSize(new java.awt.Dimension(100, 30));
        cbDepartamento.setMinimumSize(new java.awt.Dimension(100, 30));
        cbDepartamento.setPreferredSize(new java.awt.Dimension(100, 30));
        cbDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDepartamentoItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        pDireccion.add(cbDepartamento, gridBagConstraints);

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
        gridBagConstraints.gridy = 15;
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
        jLabel1.setText("Facebook :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
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

        jSeparator7.setForeground(new java.awt.Color(200, 200, 200));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(jSeparator7, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 60, 60));
        jLabel4.setText("Correo :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        customPanel5.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel5, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void cbDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDepartamentoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            evaluarPais(item.toString());
        }
    }//GEN-LAST:event_cbDepartamentoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cbDepartamento;
    public javax.swing.JComboBox<String> cbProvincia;
    private custom.CustomPanel customPanel5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblNombreApellido;
    private javax.swing.JLabel lblPais;
    private javax.swing.JPanel pCCorreo;
    private javax.swing.JPanel pCCorreo1;
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
    public custom.CustomTextField txfCFacebook;
    public custom.CustomTextField txfCNombre1;
    public custom.CustomTextField txfCNombre2;
    public custom.CustomTextField txfCTelefono;
    // End of variables declaration//GEN-END:variables
}
