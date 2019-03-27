
package vista;

import java.awt.GridBagConstraints;

public class Vista_Panel_MenuTrabajador extends javax.swing.JPanel {

    public Vista_Panel_ProfileUser user;

    public Vista_Panel_MenuTrabajador() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        profileUser = new vista.Vista_Panel_ProfileUser();
        btnMantenimiento = new modelo.JButtonEditable();
        btnAlmacen = new modelo.JButtonEditable();
        btnCompras = new modelo.JButtonEditable();
        btnVentas = new modelo.JButtonEditable();
        btnAyuda = new modelo.JButtonEditable();
        btnCerrarSesion = new modelo.JButtonEditable();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 20, 10);
        add(profileUser, gridBagConstraints);

        btnMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnMantenimiento.png"))); // NOI18N
        btnMantenimiento.setText("Temporal");
        btnMantenimiento.setColorHover(new java.awt.Color(82, 158, 202));
        btnMantenimiento.setColorNormal(new java.awt.Color(60, 60, 60));
        btnMantenimiento.setColorPressed(new java.awt.Color(92, 168, 212));
        btnMantenimiento.setFocusable(false);
        btnMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMantenimientoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnMantenimiento, gridBagConstraints);

        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAlmacen.png"))); // NOI18N
        btnAlmacen.setText("Almacen");
        btnAlmacen.setColorHover(new java.awt.Color(82, 158, 202));
        btnAlmacen.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAlmacen.setColorPressed(new java.awt.Color(92, 168, 212));
        btnAlmacen.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAlmacen, gridBagConstraints);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnCompras.png"))); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setColorHover(new java.awt.Color(82, 158, 202));
        btnCompras.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCompras.setColorPressed(new java.awt.Color(92, 168, 212));
        btnCompras.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnCompras, gridBagConstraints);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnVentas.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setColorHover(new java.awt.Color(82, 158, 202));
        btnVentas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnVentas.setColorPressed(new java.awt.Color(92, 168, 212));
        btnVentas.setFocusable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnVentas, gridBagConstraints);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnAyuda.png"))); // NOI18N
        btnAyuda.setText("Ayuda");
        btnAyuda.setColorHover(new java.awt.Color(82, 158, 202));
        btnAyuda.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAyuda.setColorPressed(new java.awt.Color(92, 168, 212));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAyuda, gridBagConstraints);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnCerrarSesion.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setColorHover(new java.awt.Color(82, 158, 202));
        btnCerrarSesion.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCerrarSesion.setColorPressed(new java.awt.Color(92, 168, 212));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        add(btnCerrarSesion, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMantenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMantenimientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.JButtonEditable btnAlmacen;
    public modelo.JButtonEditable btnAyuda;
    public modelo.JButtonEditable btnCerrarSesion;
    public modelo.JButtonEditable btnCompras;
    private modelo.JButtonEditable btnMantenimiento;
    public modelo.JButtonEditable btnVentas;
    public vista.Vista_Panel_ProfileUser profileUser;
    // End of variables declaration//GEN-END:variables
}
