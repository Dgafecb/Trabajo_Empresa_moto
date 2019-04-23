
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.plaf.basic.BasicProgressBarUI;



public class Panel_Login extends javax.swing.JPanel {

    //private PlaceHolder emailPH,passwordPH;
    private final String DEFAULT_EMAIL = "Ingrese correo";
    private final String DEFAULT_PASS = "Ingrese password";
    
    public Panel_Login() {
        initComponents();
        this.txtContr.setEchoChar('•');
        this.updateUI();
        loading.setVisible(false);
        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txtUsuario = new javax.swing.JTextField();
        txtContr = new javax.swing.JPasswordField();
        lblUser = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnAcceder = new modelo.CustomButtonShaped();
        loading = new javax.swing.JLabel();

        setBackground(new java.awt.Color(250, 250, 250));
        setLayout(new java.awt.GridBagLayout());

        txtUsuario.setBackground(new java.awt.Color(60, 60, 60));
        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setMaximumSize(new java.awt.Dimension(400, 0));
        txtUsuario.setMinimumSize(new java.awt.Dimension(0, 40));
        txtUsuario.setPreferredSize(new java.awt.Dimension(0, 35));
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

        txtContr.setBackground(new java.awt.Color(60, 60, 60));
        txtContr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtContr.setForeground(new java.awt.Color(255, 255, 255));
        txtContr.setBorder(null);
        txtContr.setCaretColor(new java.awt.Color(255, 255, 255));
        txtContr.setMaximumSize(new java.awt.Dimension(400, 40));
        txtContr.setMinimumSize(new java.awt.Dimension(0, 40));
        txtContr.setPreferredSize(new java.awt.Dimension(0, 40));
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

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(46x40px)iconUsuario.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 0);
        add(lblUser, gridBagConstraints);

        lblPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(46x40px)iconPassword.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 30, 10, 0);
        add(lblPassword, gridBagConstraints);

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

        btnAcceder.setText("ACCEDER");
        btnAcceder.setMaximumSize(new java.awt.Dimension(200, 45));
        btnAcceder.setMinimumSize(new java.awt.Dimension(200, 45));
        btnAcceder.setPreferredSize(new java.awt.Dimension(200, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        add(btnAcceder, gridBagConstraints);

        loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(75x75px)Loading2.gif"))); // NOI18N
        loading.setFocusable(false);
        loading.setMaximumSize(new java.awt.Dimension(100, 45));
        loading.setMinimumSize(new java.awt.Dimension(100, 45));
        loading.setPreferredSize(new java.awt.Dimension(100, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        add(loading, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButtonShaped btnAcceder;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    public javax.swing.JLabel loading;
    public javax.swing.JPasswordField txtContr;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
