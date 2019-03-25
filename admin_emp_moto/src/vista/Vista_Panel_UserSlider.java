
package vista;

import java.awt.GridBagConstraints;

public class Vista_Panel_UserSlider extends javax.swing.JPanel {

    public Vista_Panel_UserSlider_User user;

    public Vista_Panel_UserSlider() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Paneluser = new vista.Vista_Panel_UserSlider_User();
        btnEstadisticas = new modelo.Modelo_JButton();
        btnMantenimiento = new modelo.Modelo_JButton();
        btnAlmacen = new modelo.Modelo_JButton();
        btnCompras = new modelo.Modelo_JButton();
        btnVentas = new modelo.Modelo_JButton();
        btnTrabajadores = new modelo.Modelo_JButton();
        btnConfig = new modelo.Modelo_JButton();
        btnAyuda = new modelo.Modelo_JButton();
        btnSalir = new modelo.Modelo_JButton();

        setBackground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        add(Paneluser, gridBagConstraints);

        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnEstadisticas.png"))); // NOI18N
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.setColorHover(new java.awt.Color(21, 166, 231));
        btnEstadisticas.setColorNormal(new java.awt.Color(60, 60, 60));
        btnEstadisticas.setColorPressed(new java.awt.Color(0, 152, 215));
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

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/btnSalir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setColorHover(new java.awt.Color(21, 166, 231));
        btnSalir.setColorNormal(new java.awt.Color(60, 60, 60));
        btnSalir.setColorPressed(new java.awt.Color(0, 152, 215));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weighty = 1.0;
        add(btnSalir, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.Vista_Panel_UserSlider_User Paneluser;
    private modelo.Modelo_JButton btnAlmacen;
    private modelo.Modelo_JButton btnAyuda;
    private modelo.Modelo_JButton btnCompras;
    private modelo.Modelo_JButton btnConfig;
    private modelo.Modelo_JButton btnEstadisticas;
    private modelo.Modelo_JButton btnMantenimiento;
    private modelo.Modelo_JButton btnSalir;
    private modelo.Modelo_JButton btnTrabajadores;
    private modelo.Modelo_JButton btnVentas;
    // End of variables declaration//GEN-END:variables
}
