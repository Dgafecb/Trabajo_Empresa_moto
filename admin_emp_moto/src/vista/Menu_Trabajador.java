
package vista;

import java.awt.GridBagConstraints;

public class Menu_Trabajador extends javax.swing.JPanel {

    public Perfil_Usuario user;

    public Menu_Trabajador() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnAlmacen = new modelo.CustomButton();
        btnCompras = new modelo.CustomButton();
        btnVentas = new modelo.CustomButton();
        btnAyuda = new modelo.CustomButton();
        btnCerrarSesion = new modelo.CustomButton();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnAlmacen.png"))); // NOI18N
        btnAlmacen.setText("Almacen");
        btnAlmacen.setToolTipText("");
        btnAlmacen.setColorHover(new java.awt.Color(82, 158, 202));
        btnAlmacen.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAlmacen.setColorPressed(new java.awt.Color(92, 168, 212));
        btnAlmacen.setFocusable(false);
        btnAlmacen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAlmacen, gridBagConstraints);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnCompras.png"))); // NOI18N
        btnCompras.setText("Compras");
        btnCompras.setColorHover(new java.awt.Color(82, 158, 202));
        btnCompras.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCompras.setColorPressed(new java.awt.Color(92, 168, 212));
        btnCompras.setFocusable(false);
        btnCompras.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnCompras, gridBagConstraints);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnVentas.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setColorHover(new java.awt.Color(82, 158, 202));
        btnVentas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnVentas.setColorPressed(new java.awt.Color(92, 168, 212));
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnVentas, gridBagConstraints);

        btnAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnAyuda.png"))); // NOI18N
        btnAyuda.setText("Ayuda");
        btnAyuda.setColorHover(new java.awt.Color(82, 158, 202));
        btnAyuda.setColorNormal(new java.awt.Color(60, 60, 60));
        btnAyuda.setColorPressed(new java.awt.Color(92, 168, 212));
        btnAyuda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(btnAyuda, gridBagConstraints);

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnCerrarSesion.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.setColorHover(new java.awt.Color(82, 158, 202));
        btnCerrarSesion.setColorNormal(new java.awt.Color(60, 60, 60));
        btnCerrarSesion.setColorPressed(new java.awt.Color(92, 168, 212));
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        add(btnCerrarSesion, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public modelo.CustomButton btnAlmacen;
    public modelo.CustomButton btnAyuda;
    public modelo.CustomButton btnCerrarSesion;
    public modelo.CustomButton btnCompras;
    public modelo.CustomButton btnVentas;
    // End of variables declaration//GEN-END:variables
}
