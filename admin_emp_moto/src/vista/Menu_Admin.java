
package vista;


public class Menu_Admin extends javax.swing.JPanel {

    public Perfil_Usuario user;

    public Menu_Admin() {
        initComponents();
        subRegistros.setVisible(false);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        profileUser = new vista.Perfil_Usuario();
        btnEstadisticas = new modelo.CustomButton();
        btnMantenimiento = new modelo.CustomButton();
        btnAlmacen = new modelo.CustomButton();
        btnCompras = new modelo.CustomButton();
        btnVentas = new modelo.CustomButton();
        btnRegistros = new modelo.CustomButton();
        btnConfig = new modelo.CustomButton();
        btnAyuda = new modelo.CustomButton();
        btnCerrarSesion = new modelo.CustomButton();
        subRegistros = new javax.swing.JPanel();
        btnTrabajadores = new modelo.CustomButton();
        btnAsistencia = new modelo.CustomButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        profileUser.setMaximumSize(new java.awt.Dimension(250, 150));
        profileUser.setMinimumSize(new java.awt.Dimension(250, 150));
        profileUser.setPreferredSize(new java.awt.Dimension(250, 150));
        add(profileUser, new java.awt.GridBagConstraints());

        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnEstadisticas36x36px.png"))); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.setColorHover(new java.awt.Color(82, 158, 202));
        btnEstadisticas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnEstadisticas.setColorPressed(new java.awt.Color(92, 168, 212));
        btnEstadisticas.setFocusPainted(false);
        btnEstadisticas.setFocusable(false);
        btnEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstadisticas.setMaximumSize(new java.awt.Dimension(250, 45));
        btnEstadisticas.setMinimumSize(new java.awt.Dimension(250, 45));
        btnEstadisticas.setPreferredSize(new java.awt.Dimension(250, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnEstadisticas, gridBagConstraints);

        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnMantenimiento36x36px.png"))); // NOI18N
        btnMantenimiento.setText("Mantenimiento");
        btnMantenimiento.setColorHover(new java.awt.Color(82, 158, 202));
        btnMantenimiento.setColorNormal(new java.awt.Color(60, 60, 60));
        btnMantenimiento.setColorPressed(new java.awt.Color(92, 168, 212));
        btnMantenimiento.setFocusPainted(false);
        btnMantenimiento.setFocusable(false);
        btnMantenimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMantenimiento.setMaximumSize(new java.awt.Dimension(250, 45));
        btnMantenimiento.setMinimumSize(new java.awt.Dimension(250, 45));
        btnMantenimiento.setPreferredSize(new java.awt.Dimension(250, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnMantenimiento, gridBagConstraints);

        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAlmacen36x36px.png"))); // NOI18N
        btnAlmacen.setText("Almacen");
        btnAlmacen.setColorHover(new java.awt.Color(82, 158, 202));
        btnAlmacen.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAlmacen.setColorPressed(new java.awt.Color(92, 168, 212));
        btnAlmacen.setFocusPainted(false);
        btnAlmacen.setFocusable(false);
        btnAlmacen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlmacen.setMaximumSize(new java.awt.Dimension(250, 45));
        btnAlmacen.setMinimumSize(new java.awt.Dimension(250, 45));
        btnAlmacen.setPreferredSize(new java.awt.Dimension(250, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAlmacen, gridBagConstraints);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnCompras36x36px.png"))); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setColorHover(new java.awt.Color(82, 158, 202));
        btnCompras.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCompras.setColorPressed(new java.awt.Color(92, 168, 212));
        btnCompras.setFocusPainted(false);
        btnCompras.setFocusable(false);
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCompras.setMaximumSize(new java.awt.Dimension(250, 45));
        btnCompras.setMinimumSize(new java.awt.Dimension(250, 45));
        btnCompras.setPreferredSize(new java.awt.Dimension(250, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnCompras, gridBagConstraints);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnVentas36x36px.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setColorHover(new java.awt.Color(82, 158, 202));
        btnVentas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnVentas.setColorPressed(new java.awt.Color(92, 168, 212));
        btnVentas.setFocusPainted(false);
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas.setMaximumSize(new java.awt.Dimension(250, 45));
        btnVentas.setMinimumSize(new java.awt.Dimension(250, 45));
        btnVentas.setPreferredSize(new java.awt.Dimension(250, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnVentas, gridBagConstraints);

        btnRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnConsultas36x36px.png"))); // NOI18N
        btnRegistros.setText("Registros");
        btnRegistros.setColorHover(new java.awt.Color(82, 158, 202));
        btnRegistros.setColorNormal(new java.awt.Color(60, 60, 60));
        btnRegistros.setColorPressed(new java.awt.Color(92, 168, 212));
        btnRegistros.setFocusPainted(false);
        btnRegistros.setFocusable(false);
        btnRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistros.setMaximumSize(new java.awt.Dimension(250, 45));
        btnRegistros.setMinimumSize(new java.awt.Dimension(250, 45));
        btnRegistros.setPreferredSize(new java.awt.Dimension(250, 45));
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnRegistros, gridBagConstraints);

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAjustes36x36px.png"))); // NOI18N
        btnConfig.setText("Configuracion");
        btnConfig.setColorHover(new java.awt.Color(82, 158, 202));
        btnConfig.setColorNormal(new java.awt.Color(60, 60, 60));
        btnConfig.setColorPressed(new java.awt.Color(92, 168, 212));
        btnConfig.setFocusPainted(false);
        btnConfig.setFocusable(false);
        btnConfig.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConfig.setMaximumSize(new java.awt.Dimension(250, 45));
        btnConfig.setMinimumSize(new java.awt.Dimension(250, 45));
        btnConfig.setPreferredSize(new java.awt.Dimension(250, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnConfig, gridBagConstraints);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAyuda36x36px.png"))); // NOI18N
        btnAyuda.setText("Ayuda");
        btnAyuda.setColorHover(new java.awt.Color(82, 158, 202));
        btnAyuda.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAyuda.setColorPressed(new java.awt.Color(92, 168, 212));
        btnAyuda.setFocusPainted(false);
        btnAyuda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAyuda.setMaximumSize(new java.awt.Dimension(250, 45));
        btnAyuda.setMinimumSize(new java.awt.Dimension(250, 45));
        btnAyuda.setPreferredSize(new java.awt.Dimension(250, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAyuda, gridBagConstraints);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnCerrarSesion36x36px.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setColorHover(new java.awt.Color(82, 158, 202));
        btnCerrarSesion.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCerrarSesion.setColorPressed(new java.awt.Color(92, 168, 212));
        btnCerrarSesion.setFocusPainted(false);
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(250, 45));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(250, 45));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(250, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        add(btnCerrarSesion, gridBagConstraints);

        subRegistros.setLayout(new java.awt.GridBagLayout());

        btnTrabajadores.setBackground(new java.awt.Color(60, 60, 60));
        btnTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnSubMenu52x36px.png"))); // NOI18N
        btnTrabajadores.setText("Trabajadores");
        btnTrabajadores.setColorHover(new java.awt.Color(82, 158, 202));
        btnTrabajadores.setColorNormal(new java.awt.Color(60, 60, 60));
        btnTrabajadores.setColorPressed(new java.awt.Color(92, 168, 212));
        btnTrabajadores.setFocusPainted(false);
        btnTrabajadores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTrabajadores.setMaximumSize(new java.awt.Dimension(250, 45));
        btnTrabajadores.setMinimumSize(new java.awt.Dimension(250, 45));
        btnTrabajadores.setPreferredSize(new java.awt.Dimension(250, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        subRegistros.add(btnTrabajadores, gridBagConstraints);

        btnAsistencia.setBackground(new java.awt.Color(60, 60, 60));
        btnAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnSubMenu52x36px.png"))); // NOI18N
        btnAsistencia.setText("Asistencia");
        btnAsistencia.setColorHover(new java.awt.Color(82, 158, 202));
        btnAsistencia.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAsistencia.setColorPressed(new java.awt.Color(92, 168, 212));
        btnAsistencia.setFocusPainted(false);
        btnAsistencia.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAsistencia.setMaximumSize(new java.awt.Dimension(250, 45));
        btnAsistencia.setMinimumSize(new java.awt.Dimension(250, 45));
        btnAsistencia.setPreferredSize(new java.awt.Dimension(250, 45));
        btnAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsistenciaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        subRegistros.add(btnAsistencia, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(subRegistros, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 5, 10, 5);
        add(jSeparator1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed
        if(subRegistros.isVisible()!=true){
            subRegistros.setVisible(true);
        }else{
            subRegistros.setVisible(false);
        }
    }//GEN-LAST:event_btnRegistrosActionPerformed

    private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsistenciaActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButton btnAlmacen;
    private modelo.CustomButton btnAsistencia;
    public modelo.CustomButton btnAyuda;
    public modelo.CustomButton btnCerrarSesion;
    public modelo.CustomButton btnCompras;
    public modelo.CustomButton btnConfig;
    public modelo.CustomButton btnEstadisticas;
    public modelo.CustomButton btnMantenimiento;
    public modelo.CustomButton btnRegistros;
    private modelo.CustomButton btnTrabajadores;
    public modelo.CustomButton btnVentas;
    private javax.swing.JSeparator jSeparator1;
    public vista.Perfil_Usuario profileUser;
    private javax.swing.JPanel subRegistros;
    // End of variables declaration//GEN-END:variables
}
