
package vista;


public class Menu_Admin extends javax.swing.JPanel {

    public Perfil_Usuario user;

    public Menu_Admin() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnEstadisticas = new modelo.CustomButton();
        btnAlmacen = new modelo.CustomButton();
        btnVentas = new modelo.CustomButton();
        btnRegistros = new modelo.CustomButton();
        btnAjustes = new modelo.CustomButton();
        btnAyuda = new modelo.CustomButton();
        btnCerrarSesion = new modelo.CustomButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(60, 60, 60));
        setMinimumSize(new java.awt.Dimension(40, 40));
        setPreferredSize(new java.awt.Dimension(200, 320));
        setLayout(new java.awt.GridBagLayout());

        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnEstadisticas.png"))); // NOI18N
        btnEstadisticas.setText("ESTADISTICAS");
        btnEstadisticas.setColorHover(new java.awt.Color(90, 90, 90));
        btnEstadisticas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnEstadisticas.setColorPressed(new java.awt.Color(70, 70, 70));
        btnEstadisticas.setFocusPainted(false);
        btnEstadisticas.setFocusable(false);
        btnEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstadisticas.setMaximumSize(new java.awt.Dimension(250, 40));
        btnEstadisticas.setMinimumSize(new java.awt.Dimension(40, 40));
        btnEstadisticas.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(btnEstadisticas, gridBagConstraints);

        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnAlmacen.png"))); // NOI18N
        btnAlmacen.setText("ALMACEN");
        btnAlmacen.setColorHover(new java.awt.Color(90, 90, 90));
        btnAlmacen.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAlmacen.setColorPressed(new java.awt.Color(70, 70, 70));
        btnAlmacen.setFocusPainted(false);
        btnAlmacen.setFocusable(false);
        btnAlmacen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlmacen.setMaximumSize(new java.awt.Dimension(250, 40));
        btnAlmacen.setMinimumSize(new java.awt.Dimension(40, 40));
        btnAlmacen.setPreferredSize(new java.awt.Dimension(250, 40));
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
        btnVentas.setMaximumSize(new java.awt.Dimension(250, 40));
        btnVentas.setMinimumSize(new java.awt.Dimension(40, 40));
        btnVentas.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(btnVentas, gridBagConstraints);

        btnRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnRegistros.png"))); // NOI18N
        btnRegistros.setText("REGISTROS");
        btnRegistros.setColorHover(new java.awt.Color(90, 90, 90));
        btnRegistros.setColorNormal(new java.awt.Color(60, 60, 60));
        btnRegistros.setColorPressed(new java.awt.Color(70, 70, 70));
        btnRegistros.setFocusPainted(false);
        btnRegistros.setFocusable(false);
        btnRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistros.setMaximumSize(new java.awt.Dimension(250, 40));
        btnRegistros.setMinimumSize(new java.awt.Dimension(40, 40));
        btnRegistros.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(btnRegistros, gridBagConstraints);

        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnAjustes.png"))); // NOI18N
        btnAjustes.setText("AJUSTES");
        btnAjustes.setColorHover(new java.awt.Color(90, 90, 90));
        btnAjustes.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAjustes.setColorPressed(new java.awt.Color(70, 70, 70));
        btnAjustes.setFocusPainted(false);
        btnAjustes.setFocusable(false);
        btnAjustes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAjustes.setMaximumSize(new java.awt.Dimension(250, 40));
        btnAjustes.setMinimumSize(new java.awt.Dimension(40, 40));
        btnAjustes.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(btnAjustes, gridBagConstraints);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnAyuda.png"))); // NOI18N
        btnAyuda.setText("AYUDA");
        btnAyuda.setColorHover(new java.awt.Color(90, 90, 90));
        btnAyuda.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAyuda.setColorPressed(new java.awt.Color(70, 70, 70));
        btnAyuda.setFocusPainted(false);
        btnAyuda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAyuda.setMaximumSize(new java.awt.Dimension(250, 40));
        btnAyuda.setMinimumSize(new java.awt.Dimension(40, 40));
        btnAyuda.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(btnAyuda, gridBagConstraints);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnCerrarSesion.png"))); // NOI18N
        btnCerrarSesion.setText("CERRAR SESION");
        btnCerrarSesion.setColorHover(new java.awt.Color(90, 90, 90));
        btnCerrarSesion.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCerrarSesion.setColorPressed(new java.awt.Color(70, 70, 70));
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(250, 40));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(40, 40));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(250, 40));
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
    public modelo.CustomButton btnAjustes;
    public modelo.CustomButton btnAlmacen;
    public modelo.CustomButton btnAyuda;
    public modelo.CustomButton btnCerrarSesion;
    public modelo.CustomButton btnEstadisticas;
    public modelo.CustomButton btnRegistros;
    public modelo.CustomButton btnVentas;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
