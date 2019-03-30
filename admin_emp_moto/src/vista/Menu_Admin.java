
package vista;


public class Menu_Admin extends javax.swing.JPanel {

    public Perfil_Usuario user;

    public Menu_Admin() {
        initComponents();
        subConsultas.setVisible(false);
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
        btnConsultas = new modelo.CustomButton();
        btnConfig = new modelo.CustomButton();
        btnAyuda = new modelo.CustomButton();
        btnCerrarSesion = new modelo.CustomButton();
        subConsultas = new javax.swing.JPanel();
        btnTrabajadores = new modelo.CustomButton();
        btnTrabajadores1 = new modelo.CustomButton();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 20, 10);
        add(profileUser, gridBagConstraints);

        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnEstadisticas36x36px.png"))); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.setColorHover(new java.awt.Color(82, 158, 202));
        btnEstadisticas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnEstadisticas.setColorPressed(new java.awt.Color(92, 168, 212));
        btnEstadisticas.setFocusPainted(false);
        btnEstadisticas.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnEstadisticas, gridBagConstraints);

        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnMantenimiento36x36px.png"))); // NOI18N
        btnMantenimiento.setText("Mantenimiento");
        btnMantenimiento.setColorHover(new java.awt.Color(82, 158, 202));
        btnMantenimiento.setColorNormal(new java.awt.Color(60, 60, 60));
        btnMantenimiento.setColorPressed(new java.awt.Color(92, 168, 212));
        btnMantenimiento.setFocusPainted(false);
        btnMantenimiento.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnMantenimiento, gridBagConstraints);

        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAlmacen36x36px.png"))); // NOI18N
        btnAlmacen.setText("Almacen");
        btnAlmacen.setColorHover(new java.awt.Color(82, 158, 202));
        btnAlmacen.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAlmacen.setColorPressed(new java.awt.Color(92, 168, 212));
        btnAlmacen.setFocusPainted(false);
        btnAlmacen.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAlmacen, gridBagConstraints);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnCompras36x36px.png"))); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setColorHover(new java.awt.Color(82, 158, 202));
        btnCompras.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCompras.setColorPressed(new java.awt.Color(92, 168, 212));
        btnCompras.setFocusPainted(false);
        btnCompras.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnCompras, gridBagConstraints);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnVentas36x36px.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setColorHover(new java.awt.Color(82, 158, 202));
        btnVentas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnVentas.setColorPressed(new java.awt.Color(92, 168, 212));
        btnVentas.setFocusPainted(false);
        btnVentas.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnVentas, gridBagConstraints);

        btnConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnConsultas36x36px.png"))); // NOI18N
        btnConsultas.setText("Consultas");
        btnConsultas.setColorHover(new java.awt.Color(82, 158, 202));
        btnConsultas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnConsultas.setColorPressed(new java.awt.Color(92, 168, 212));
        btnConsultas.setFocusPainted(false);
        btnConsultas.setFocusable(false);
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnConsultas, gridBagConstraints);

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAjustes36x36px.png"))); // NOI18N
        btnConfig.setText("Configuracion");
        btnConfig.setColorHover(new java.awt.Color(82, 158, 202));
        btnConfig.setColorNormal(new java.awt.Color(60, 60, 60));
        btnConfig.setColorPressed(new java.awt.Color(92, 168, 212));
        btnConfig.setFocusPainted(false);
        btnConfig.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnConfig, gridBagConstraints);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAyuda36x36px.png"))); // NOI18N
        btnAyuda.setText("Ayuda");
        btnAyuda.setColorHover(new java.awt.Color(82, 158, 202));
        btnAyuda.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAyuda.setColorPressed(new java.awt.Color(92, 168, 212));
        btnAyuda.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAyuda, gridBagConstraints);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnCerrarSesion36x36px.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setColorHover(new java.awt.Color(82, 158, 202));
        btnCerrarSesion.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCerrarSesion.setColorPressed(new java.awt.Color(92, 168, 212));
        btnCerrarSesion.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        add(btnCerrarSesion, gridBagConstraints);

        subConsultas.setLayout(new java.awt.GridBagLayout());

        btnTrabajadores.setBackground(new java.awt.Color(90, 90, 90));
        btnTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnSubMenu52x36px.png"))); // NOI18N
        btnTrabajadores.setText("Trabajadores");
        btnTrabajadores.setColorHover(new java.awt.Color(82, 158, 202));
        btnTrabajadores.setColorNormal(new java.awt.Color(90, 90, 90));
        btnTrabajadores.setColorPressed(new java.awt.Color(92, 168, 212));
        btnTrabajadores.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        subConsultas.add(btnTrabajadores, gridBagConstraints);

        btnTrabajadores1.setBackground(new java.awt.Color(90, 90, 90));
        btnTrabajadores1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnSubMenu52x36px.png"))); // NOI18N
        btnTrabajadores1.setText("Entrada");
        btnTrabajadores1.setColorHover(new java.awt.Color(82, 158, 202));
        btnTrabajadores1.setColorNormal(new java.awt.Color(90, 90, 90));
        btnTrabajadores1.setColorPressed(new java.awt.Color(92, 168, 212));
        btnTrabajadores1.setFocusPainted(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        subConsultas.add(btnTrabajadores1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(subConsultas, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        if(subConsultas.isVisible()!=true){
            subConsultas.setVisible(true);
        }else{
            subConsultas.setVisible(false);
        }
    }//GEN-LAST:event_btnConsultasActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButton btnAlmacen;
    public modelo.CustomButton btnAyuda;
    public modelo.CustomButton btnCerrarSesion;
    public modelo.CustomButton btnCompras;
    public modelo.CustomButton btnConfig;
    public modelo.CustomButton btnConsultas;
    public modelo.CustomButton btnEstadisticas;
    public modelo.CustomButton btnMantenimiento;
    private modelo.CustomButton btnTrabajadores;
    private modelo.CustomButton btnTrabajadores1;
    public modelo.CustomButton btnVentas;
    public vista.Perfil_Usuario profileUser;
    private javax.swing.JPanel subConsultas;
    // End of variables declaration//GEN-END:variables
}
