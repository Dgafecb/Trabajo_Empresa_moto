
package vista;



public class Panel_Login extends javax.swing.JPanel {

    //private PlaceHolder emailPH,passwordPH;
    private final String DEFAULT_EMAIL = "Ingrese correo";
    private final String DEFAULT_PASS = "Ingrese password";
    
    public Panel_Login() {
        initComponents();
        this.txtContr.setEchoChar('•');
        
    }
    
    /*@Override
    public void paintComponent(Graphics g){
    Dimension sizeLogin = getSize();
    ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/recursos/background_login.png"));
    g.drawImage(imagenFondo.getImage(), 0, 0, sizeLogin.width,sizeLogin.height,null);
    this.setOpaque(false);
    super.paintComponents(g);
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txtUsuario = new javax.swing.JTextField();
        txtContr = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        txtUsuario.setBackground(new java.awt.Color(229, 229, 229));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        add(txtUsuario, gridBagConstraints);

        txtContr.setBackground(new java.awt.Color(229, 229, 229));
        txtContr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContr.setBorder(null);
        txtContr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 10);
        add(txtContr, gridBagConstraints);

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAccederBase.png"))); // NOI18N
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setFocusPainted(false);
        btnIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAccederUnpressed.png"))); // NOI18N
        btnIngresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAccederPressed.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 20, 0);
        add(btnIngresar, gridBagConstraints);

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lblUser46x40.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        add(lblUser, gridBagConstraints);

        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lblPassword46x40.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 0);
        add(lblPassword, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUser;
    public javax.swing.JPasswordField txtContr;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
