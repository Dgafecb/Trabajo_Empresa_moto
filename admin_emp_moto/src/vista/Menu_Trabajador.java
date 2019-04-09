
package vista;


public class Menu_Trabajador extends javax.swing.JPanel {

    public Perfil_Usuario user;

    public Menu_Trabajador() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnInicio = new modelo.CustomButton();
        btnAlmacen = new modelo.CustomButton();
        btnVentas = new modelo.CustomButton();
        btnCerrarSesion = new modelo.CustomButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(60, 60, 60));
        setMinimumSize(new java.awt.Dimension(40, 40));
        setPreferredSize(new java.awt.Dimension(200, 320));
        setLayout(new java.awt.GridBagLayout());

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnEstadisticas.png"))); // NOI18N
        btnInicio.setText("INICIO");
        btnInicio.setColorHover(new java.awt.Color(90, 90, 90));
        btnInicio.setColorNormal(new java.awt.Color(60, 60, 60));
        btnInicio.setColorPressed(new java.awt.Color(70, 70, 70));
        btnInicio.setFocusPainted(false);
        btnInicio.setFocusable(false);
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setMaximumSize(new java.awt.Dimension(200, 40));
        btnInicio.setMinimumSize(new java.awt.Dimension(40, 40));
        btnInicio.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(btnInicio, gridBagConstraints);

        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnAlmacen.png"))); // NOI18N
        btnAlmacen.setText("ALMACEN");
        btnAlmacen.setColorHover(new java.awt.Color(90, 90, 90));
        btnAlmacen.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAlmacen.setColorPressed(new java.awt.Color(70, 70, 70));
        btnAlmacen.setFocusPainted(false);
        btnAlmacen.setFocusable(false);
        btnAlmacen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlmacen.setMaximumSize(new java.awt.Dimension(200, 40));
        btnAlmacen.setMinimumSize(new java.awt.Dimension(40, 40));
        btnAlmacen.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(btnAlmacen, gridBagConstraints);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnVentas.png"))); // NOI18N
        btnVentas.setText("VENTAS");
        btnVentas.setColorHover(new java.awt.Color(90, 90, 90));
        btnVentas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnVentas.setColorPressed(new java.awt.Color(70, 70, 70));
        btnVentas.setFocusPainted(false);
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas.setMaximumSize(new java.awt.Dimension(200, 40));
        btnVentas.setMinimumSize(new java.awt.Dimension(40, 40));
        btnVentas.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(btnVentas, gridBagConstraints);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnCerrarSesion.png"))); // NOI18N
        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.setColorHover(new java.awt.Color(90, 90, 90));
        btnCerrarSesion.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCerrarSesion.setColorPressed(new java.awt.Color(70, 70, 70));
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(200, 40));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(40, 40));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(btnCerrarSesion, gridBagConstraints);

        jSeparator1.setBackground(new java.awt.Color(60, 60, 60));
        jSeparator1.setForeground(new java.awt.Color(60, 60, 60));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        add(jSeparator1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButton btnAlmacen;
    public modelo.CustomButton btnCerrarSesion;
    public modelo.CustomButton btnInicio;
    public modelo.CustomButton btnVentas;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
