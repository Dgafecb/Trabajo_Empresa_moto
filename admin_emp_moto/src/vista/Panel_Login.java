
package vista;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Panel_Login extends javax.swing.JPanel {

    //private PlaceHolder emailPH,passwordPH;
    private final String DEFAULT_EMAIL = "Ingrese correo";
    private final String DEFAULT_PASS = "Ingrese password";
    
    public Panel_Login() {
        initComponents();
        this.txtContr.setEchoChar('•');
        
    }
    
    @Override
    public void paintComponent(Graphics g){
    Dimension sizeLogin = getSize();
    ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/recursos/background_login.png"));
    g.drawImage(imagenFondo.getImage(), 0, 0, sizeLogin.width,sizeLogin.height,null);
    this.setOpaque(false);
    super.paintComponents(g);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtContr = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();

        txtUsuario.setBackground(new java.awt.Color(229, 229, 229));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        txtContr.setBackground(new java.awt.Color(229, 229, 229));
        txtContr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtContr.setBorder(null);
        txtContr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContrActionPerformed(evt);
            }
        });

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAccederBase.png"))); // NOI18N
        btnIngresar.setBorder(null);
        btnIngresar.setBorderPainted(false);
        btnIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAccederUnpressed.png"))); // NOI18N
        btnIngresar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAccederPressed.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIngresar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtContr, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(322, Short.MAX_VALUE)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(txtContr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(btnIngresar)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContrActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresar;
    public javax.swing.JPasswordField txtContr;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
