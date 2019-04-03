
package vista;



public class Panel_Login extends javax.swing.JPanel {

    //private PlaceHolder emailPH,passwordPH;
    private final String DEFAULT_EMAIL = "Ingrese correo";
    private final String DEFAULT_PASS = "Ingrese password";
    
    public Panel_Login() {
        initComponents();
        this.txtContr.setEchoChar('•');
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txtUsuario = new javax.swing.JTextField();
        txtContr = new javax.swing.JPasswordField();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        pbLogin = new javax.swing.JProgressBar();
        lblTitulo = new javax.swing.JLabel();
        btnIngresar = new modelo.CustomButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.GridBagLayout());

        txtUsuario.setBackground(new java.awt.Color(229, 229, 229));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.setMaximumSize(new java.awt.Dimension(400, 0));
        txtUsuario.setMinimumSize(new java.awt.Dimension(0, 40));
        txtUsuario.setPreferredSize(new java.awt.Dimension(0, 35));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 30);
        add(txtUsuario, gridBagConstraints);

        txtContr.setBackground(new java.awt.Color(229, 229, 229));
        txtContr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContr.setBorder(null);
        txtContr.setMaximumSize(new java.awt.Dimension(400, 40));
        txtContr.setMinimumSize(new java.awt.Dimension(0, 40));
        txtContr.setPreferredSize(new java.awt.Dimension(0, 40));
        txtContr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 30);
        add(txtContr, gridBagConstraints);

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lblUser46x40.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 0);
        add(lblUser, gridBagConstraints);

        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lblPassword46x40.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 0);
        add(lblPassword, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 30);
        add(pbLogin, gridBagConstraints);

        lblTitulo.setBackground(new java.awt.Color(60, 60, 60));
        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Login");
        lblTitulo.setToolTipText("");
        lblTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblTitulo.setMaximumSize(new java.awt.Dimension(115, 90));
        lblTitulo.setMinimumSize(new java.awt.Dimension(115, 90));
        lblTitulo.setOpaque(true);
        lblTitulo.setPreferredSize(new java.awt.Dimension(115, 90));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(lblTitulo, gridBagConstraints);

        btnIngresar.setBackground(new java.awt.Color(82, 158, 202));
        btnIngresar.setText("Acceder");
        btnIngresar.setColorHover(new java.awt.Color(60, 60, 60));
        btnIngresar.setColorNormal(new java.awt.Color(82, 158, 202));
        btnIngresar.setColorPressed(new java.awt.Color(90, 90, 90));
        btnIngresar.setFocusPainted(false);
        btnIngresar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnIngresar.setMaximumSize(new java.awt.Dimension(200, 45));
        btnIngresar.setMinimumSize(new java.awt.Dimension(200, 45));
        btnIngresar.setPreferredSize(new java.awt.Dimension(200, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        add(btnIngresar, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButton btnIngresar;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    public javax.swing.JProgressBar pbLogin;
    public javax.swing.JPasswordField txtContr;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
