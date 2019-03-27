
package vista;

import java.awt.GridBagConstraints;

public class Vista_Panel_UserSlide extends javax.swing.JPanel {

    public Vista_Panel_UserSlide_User user;

    public Vista_Panel_UserSlide() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Paneluser = new vista.Vista_Panel_UserSlide_User();
        btnEstadisticas = new modelo.JButtonEditable();
        btnMantenimiento = new modelo.JButtonEditable();
        btnAlmacen = new modelo.JButtonEditable();
        btnCompras = new modelo.JButtonEditable();
        btnVentas = new modelo.JButtonEditable();
        btnTrabajadores = new modelo.JButtonEditable();
        btnConfig = new modelo.JButtonEditable();
        btnAyuda = new modelo.JButtonEditable();
        btnCerrarSesion = new modelo.JButtonEditable();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(25, 10, 25, 10);
        add(Paneluser, gridBagConstraints);

        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnEstadisticas.png"))); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.setColorHover(new java.awt.Color(21, 166, 231));
        btnEstadisticas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnEstadisticas.setColorPressed(new java.awt.Color(0, 152, 215));
        btnEstadisticas.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnEstadisticas, gridBagConstraints);

        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnMantenimiento.png"))); // NOI18N
        btnMantenimiento.setText("Mantenimiento");
        btnMantenimiento.setColorHover(new java.awt.Color(21, 166, 231));
        btnMantenimiento.setColorNormal(new java.awt.Color(60, 60, 60));
        btnMantenimiento.setColorPressed(new java.awt.Color(0, 152, 215));
        btnMantenimiento.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnMantenimiento, gridBagConstraints);

        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAlmacen.png"))); // NOI18N
        btnAlmacen.setText("Almacen");
        btnAlmacen.setColorHover(new java.awt.Color(21, 166, 231));
        btnAlmacen.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAlmacen.setColorPressed(new java.awt.Color(0, 152, 215));
        btnAlmacen.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAlmacen, gridBagConstraints);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnCompras.png"))); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setColorHover(new java.awt.Color(21, 166, 231));
        btnCompras.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCompras.setColorPressed(new java.awt.Color(0, 152, 215));
        btnCompras.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnCompras, gridBagConstraints);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnVentas.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setColorHover(new java.awt.Color(21, 166, 231));
        btnVentas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnVentas.setColorPressed(new java.awt.Color(0, 152, 215));
        btnVentas.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnVentas, gridBagConstraints);

        btnTrabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnTrabajadores.png"))); // NOI18N
        btnTrabajadores.setText("Trabajadores");
        btnTrabajadores.setColorHover(new java.awt.Color(21, 166, 231));
        btnTrabajadores.setColorNormal(new java.awt.Color(60, 60, 60));
        btnTrabajadores.setColorPressed(new java.awt.Color(0, 152, 215));
        btnTrabajadores.setFocusable(false);
        btnTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrabajadoresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnTrabajadores, gridBagConstraints);

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAjustes.png"))); // NOI18N
        btnConfig.setText("Configuracion");
        btnConfig.setColorHover(new java.awt.Color(21, 166, 231));
        btnConfig.setColorNormal(new java.awt.Color(60, 60, 60));
        btnConfig.setColorPressed(new java.awt.Color(0, 152, 215));
        btnConfig.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnConfig, gridBagConstraints);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAyuda.png"))); // NOI18N
        btnAyuda.setText("Ayuda");
        btnAyuda.setColorHover(new java.awt.Color(21, 166, 231));
        btnAyuda.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAyuda.setColorPressed(new java.awt.Color(0, 152, 215));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAyuda, gridBagConstraints);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnCerrarSesion.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setColorHover(new java.awt.Color(21, 166, 231));
        btnCerrarSesion.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCerrarSesion.setColorPressed(new java.awt.Color(0, 152, 215));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        add(btnCerrarSesion, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrabajadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTrabajadoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public vista.Vista_Panel_UserSlide_User Paneluser;
    public modelo.JButtonEditable btnAlmacen;
    public modelo.JButtonEditable btnAyuda;
    public modelo.JButtonEditable btnCerrarSesion;
    public modelo.JButtonEditable btnCompras;
    public modelo.JButtonEditable btnConfig;
    public modelo.JButtonEditable btnEstadisticas;
    public modelo.JButtonEditable btnMantenimiento;
    public modelo.JButtonEditable btnTrabajadores;
    public modelo.JButtonEditable btnVentas;
    // End of variables declaration//GEN-END:variables
}
