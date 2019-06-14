package vista;

import java.awt.Dimension;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu_Notificaciones extends javax.swing.JPanel {

    Ventana_Admin ventanaAdmin = null;
    Ventana_Trabajador ventanaTrabajador = null;

    public Menu_Notificaciones() {
        initComponents();
    }

    public Menu_Notificaciones(Ventana_Admin ventanaAdmin) {
        this.ventanaAdmin = ventanaAdmin;
        initComponents();
    }

    public Menu_Notificaciones(Ventana_Trabajador ventanaTrabajador) {
        this.ventanaTrabajador = ventanaTrabajador;
        initComponents();
        this.btnActualizacion.setVisible(false);
    }

    private void mostrarMenuAdmin(boolean mostrar) {
        Dimension dimension = new Dimension();
        if (mostrar != true) {
            ventanaAdmin.menuAdmin.btnAjustes.setText("");
            ventanaAdmin.menuAdmin.btnAlmacen.setText("");
            ventanaAdmin.menuAdmin.btnAyuda.setText("");
            ventanaAdmin.menuAdmin.btnCerrarSesion.setText("");
            //ventanaAdmin.menuAdmin.btnCompras.setText("");
            ventanaAdmin.menuAdmin.btnEstadisticas.setText("");
            ventanaAdmin.menuAdmin.btnRegistros.setText("");
            ventanaAdmin.menuAdmin.btnVentas.setText("");
            dimension.setSize(40, 40);
            ventanaAdmin.menuAdmin.setPreferredSize(dimension.getSize());
            ventanaAdmin.menuAdmin.updateUI();
            ventanaAdmin.menuAdmin.repaint();
        } else {
            ventanaAdmin.menuAdmin.btnAjustes.setText("AJUSTES");
            ventanaAdmin.menuAdmin.btnAlmacen.setText("ALMACEN");
            ventanaAdmin.menuAdmin.btnAyuda.setText("AYUDA");
            ventanaAdmin.menuAdmin.btnCerrarSesion.setText("CERRAR SESION");
            //ventanaAdmin.menuAdmin.btnCompras.setText("COMPRAS");
            ventanaAdmin.menuAdmin.btnEstadisticas.setText("ESTADISTICAS");
            ventanaAdmin.menuAdmin.btnRegistros.setText("REGISTROS");
            ventanaAdmin.menuAdmin.btnVentas.setText("VENTAS");
            dimension.setSize(200, 40);
            ventanaAdmin.menuAdmin.setPreferredSize(dimension.getSize());
            ventanaAdmin.menuAdmin.updateUI();
            ventanaAdmin.menuAdmin.repaint();
        }
    }

    private void mostrarMenuTrabajador(boolean mostrar) {
        Dimension dimension = new Dimension();
        if (mostrar != true) {

            ventanaTrabajador.menuTrabajador.btnAlmacen.setText("");

            ventanaTrabajador.menuTrabajador.btnCerrarSesion.setText("");

            ventanaTrabajador.menuTrabajador.btnInicio.setText("");

            ventanaTrabajador.menuTrabajador.btnVentas.setText("");
            dimension.setSize(40, 40);
            ventanaTrabajador.menuTrabajador.setPreferredSize(dimension.getSize());
            ventanaTrabajador.menuTrabajador.updateUI();
            ventanaTrabajador.menuTrabajador.repaint();
        } else {

            ventanaTrabajador.menuTrabajador.btnAlmacen.setText("ALMACEN");

            ventanaTrabajador.menuTrabajador.btnCerrarSesion.setText("CERRAR SESION");

            ventanaTrabajador.menuTrabajador.btnInicio.setText("INICIO");

            ventanaTrabajador.menuTrabajador.btnVentas.setText("VENTAS");
            dimension.setSize(200, 40);
            ventanaTrabajador.menuTrabajador.setPreferredSize(dimension.getSize());
            ventanaTrabajador.menuTrabajador.updateUI();
            ventanaTrabajador.menuTrabajador.repaint();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnMenu = new javax.swing.JButton();
        perfil_Usuario1 = new vista.Perfil_Usuario();
        customButtonMarcar2 = new custom.CustomButtonMarcar();
        btnActualizacion = new custom.CustomButtonShaped();
        btnConexion = new custom.CustomButtonShaped();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnMenu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setFocusPainted(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        add(btnMenu, gridBagConstraints);

        perfil_Usuario1.setMaximumSize(new java.awt.Dimension(1000, 40));
        perfil_Usuario1.setMinimumSize(new java.awt.Dimension(150, 40));
        perfil_Usuario1.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        add(perfil_Usuario1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        add(customButtonMarcar2, gridBagConstraints);

        btnActualizacion.setBackground(new java.awt.Color(60, 60, 60));
        btnActualizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(40x40px)btnActualizacion.png"))); // NOI18N
        btnActualizacion.setCurve(40);
        btnActualizacion.setMaximumSize(new java.awt.Dimension(40, 40));
        btnActualizacion.setMinimumSize(new java.awt.Dimension(40, 40));
        btnActualizacion.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        add(btnActualizacion, gridBagConstraints);

        btnConexion.setText("C");
        btnConexion.setColorBackground(new java.awt.Color(60, 60, 60));
        btnConexion.setCurve(40);
        btnConexion.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        btnConexion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConexion.setMaximumSize(new java.awt.Dimension(40, 40));
        btnConexion.setMinimumSize(new java.awt.Dimension(40, 40));
        btnConexion.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        add(btnConexion, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if (ventanaAdmin != null) {
            if ("AJUSTES".equals(ventanaAdmin.menuAdmin.btnAjustes.getText())) {
                mostrarMenuAdmin(false);
            } else {
                mostrarMenuAdmin(true);
            }
        }else if (ventanaTrabajador != null) {
            if ("INICIO".equals(ventanaTrabajador.menuTrabajador.btnInicio.getText())) {
                mostrarMenuTrabajador(false);
            } else {
                mostrarMenuTrabajador(true);
            }
        }
    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public custom.CustomButtonShaped btnActualizacion;
    public custom.CustomButtonShaped btnConexion;
    public javax.swing.JButton btnMenu;
    public custom.CustomButtonMarcar customButtonMarcar2;
    public vista.Perfil_Usuario perfil_Usuario1;
    // End of variables declaration//GEN-END:variables
}
