
package vista;

public class Vista_Panel_UserBar extends javax.swing.JPanel {


    public Vista_Panel_UserBar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fotoPerfil = new javax.swing.JLabel();
        btnUsuario = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 5, 0));

        fotoPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/imagenPerfilDefault.png"))); // NOI18N
        add(fotoPerfil);

        btnUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(51, 51, 51));
        btnUsuario.setText("Username@Default");
        btnUsuario.setBorder(null);
        btnUsuario.setBorderPainted(false);
        btnUsuario.setContentAreaFilled(false);
        add(btnUsuario);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel fotoPerfil;
    // End of variables declaration//GEN-END:variables
}
