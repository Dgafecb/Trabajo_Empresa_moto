
package vista;

public class Menu_Notificaciones extends javax.swing.JPanel {


    public Menu_Notificaciones() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnMenu = new javax.swing.JButton();
        perfil_Usuario1 = new vista.Perfil_Usuario();

        setBackground(new java.awt.Color(82, 158, 202));
        setLayout(new java.awt.GridBagLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnMenu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setFocusPainted(false);
        add(btnMenu, new java.awt.GridBagConstraints());

        perfil_Usuario1.setMaximumSize(new java.awt.Dimension(1000, 40));
        perfil_Usuario1.setMinimumSize(new java.awt.Dimension(150, 40));
        perfil_Usuario1.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        add(perfil_Usuario1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnMenu;
    private vista.Perfil_Usuario perfil_Usuario1;
    // End of variables declaration//GEN-END:variables
}
