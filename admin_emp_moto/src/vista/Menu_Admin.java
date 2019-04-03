
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
        btnCompras = new modelo.CustomButton();
        btnVentas = new modelo.CustomButton();
        btnRegistros = new modelo.CustomButton();
        btnAjustes = new modelo.CustomButton();
        btnAyuda = new modelo.CustomButton();
        btnCerrarSesion = new modelo.CustomButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnEstadisticas.png"))); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.setColorHover(new java.awt.Color(82, 158, 202));
        btnEstadisticas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnEstadisticas.setColorPressed(new java.awt.Color(92, 168, 212));
        btnEstadisticas.setFocusPainted(false);
        btnEstadisticas.setFocusable(false);
        btnEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstadisticas.setMaximumSize(new java.awt.Dimension(200, 40));
        btnEstadisticas.setMinimumSize(new java.awt.Dimension(200, 40));
        btnEstadisticas.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnEstadisticas, gridBagConstraints);

        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnAlmacen.png"))); // NOI18N
        btnAlmacen.setText("Almacen");
        btnAlmacen.setColorHover(new java.awt.Color(82, 158, 202));
        btnAlmacen.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAlmacen.setColorPressed(new java.awt.Color(92, 168, 212));
        btnAlmacen.setFocusPainted(false);
        btnAlmacen.setFocusable(false);
        btnAlmacen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlmacen.setMaximumSize(new java.awt.Dimension(200, 40));
        btnAlmacen.setMinimumSize(new java.awt.Dimension(200, 40));
        btnAlmacen.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAlmacen, gridBagConstraints);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnCompras.png"))); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setColorHover(new java.awt.Color(82, 158, 202));
        btnCompras.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCompras.setColorPressed(new java.awt.Color(92, 168, 212));
        btnCompras.setFocusPainted(false);
        btnCompras.setFocusable(false);
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompras.setMaximumSize(new java.awt.Dimension(200, 40));
        btnCompras.setMinimumSize(new java.awt.Dimension(200, 40));
        btnCompras.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnCompras, gridBagConstraints);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnVentas.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setColorHover(new java.awt.Color(82, 158, 202));
        btnVentas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnVentas.setColorPressed(new java.awt.Color(92, 168, 212));
        btnVentas.setFocusPainted(false);
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas.setMaximumSize(new java.awt.Dimension(200, 40));
        btnVentas.setMinimumSize(new java.awt.Dimension(200, 40));
        btnVentas.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnVentas, gridBagConstraints);

        btnRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnRegistros.png"))); // NOI18N
        btnRegistros.setText("Registros");
        btnRegistros.setColorHover(new java.awt.Color(82, 158, 202));
        btnRegistros.setColorNormal(new java.awt.Color(60, 60, 60));
        btnRegistros.setColorPressed(new java.awt.Color(92, 168, 212));
        btnRegistros.setFocusPainted(false);
        btnRegistros.setFocusable(false);
        btnRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistros.setMaximumSize(new java.awt.Dimension(200, 40));
        btnRegistros.setMinimumSize(new java.awt.Dimension(200, 40));
        btnRegistros.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnRegistros, gridBagConstraints);

        btnAjustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnAjustes.png"))); // NOI18N
        btnAjustes.setText("Ajustes");
        btnAjustes.setColorHover(new java.awt.Color(82, 158, 202));
        btnAjustes.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAjustes.setColorPressed(new java.awt.Color(92, 168, 212));
        btnAjustes.setFocusPainted(false);
        btnAjustes.setFocusable(false);
        btnAjustes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAjustes.setMaximumSize(new java.awt.Dimension(200, 40));
        btnAjustes.setMinimumSize(new java.awt.Dimension(200, 40));
        btnAjustes.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAjustes, gridBagConstraints);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnAyuda.png"))); // NOI18N
        btnAyuda.setText("Ayuda");
        btnAyuda.setColorHover(new java.awt.Color(82, 158, 202));
        btnAyuda.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAyuda.setColorPressed(new java.awt.Color(92, 168, 212));
        btnAyuda.setFocusPainted(false);
        btnAyuda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAyuda.setMaximumSize(new java.awt.Dimension(200, 40));
        btnAyuda.setMinimumSize(new java.awt.Dimension(200, 40));
        btnAyuda.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAyuda, gridBagConstraints);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnCerrarSesion.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setColorHover(new java.awt.Color(82, 158, 202));
        btnCerrarSesion.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCerrarSesion.setColorPressed(new java.awt.Color(92, 168, 212));
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(200, 40));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(200, 40));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
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
    public modelo.CustomButton btnCompras;
    public modelo.CustomButton btnEstadisticas;
    public modelo.CustomButton btnRegistros;
    public modelo.CustomButton btnVentas;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
