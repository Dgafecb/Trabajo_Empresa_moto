package vista;

import java.awt.Dimension;

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
    public Menu_Notificaciones(Ventana_Trabajador ventanaTrabajador){
        this.ventanaTrabajador = ventanaTrabajador;
        initComponents();
    }
    private void mostrarMenuAdmin(boolean mostrar){
        Dimension dimension = new Dimension();
        if(mostrar!=true){
            ventanaAdmin.menuAdmin.btnAjustes.setText("");
            ventanaAdmin.menuAdmin.btnAlmacen.setText("");
            ventanaAdmin.menuAdmin.btnAyuda.setText("");
            ventanaAdmin.menuAdmin.btnCerrarSesion.setText("");
            ventanaAdmin.menuAdmin.btnCompras.setText("");
            ventanaAdmin.menuAdmin.btnEstadisticas.setText("");
            ventanaAdmin.menuAdmin.btnRegistros.setText("");
            ventanaAdmin.menuAdmin.btnVentas.setText("");
            dimension.setSize(40, 40);
            ventanaAdmin.menuAdmin.setPreferredSize(dimension.getSize());
            ventanaAdmin.menuAdmin.updateUI();
            ventanaAdmin.menuAdmin.repaint();
        }else{
            ventanaAdmin.menuAdmin.btnAjustes.setText("AJUSTES");
            ventanaAdmin.menuAdmin.btnAlmacen.setText("ALMACEN");
            ventanaAdmin.menuAdmin.btnAyuda.setText("AYUDA");
            ventanaAdmin.menuAdmin.btnCerrarSesion.setText("CERRAR SESION");
            ventanaAdmin.menuAdmin.btnCompras.setText("COMPRAS");
            ventanaAdmin.menuAdmin.btnEstadisticas.setText("ESTADISTICAS");
            ventanaAdmin.menuAdmin.btnRegistros.setText("REGISTROS");
            ventanaAdmin.menuAdmin.btnVentas.setText("VENTAS");
            dimension.setSize(200, 40);
            ventanaAdmin.menuAdmin.setPreferredSize(dimension.getSize());
            ventanaAdmin.menuAdmin.updateUI();
            ventanaAdmin.menuAdmin.repaint();
        }
    }
    private void mostrarMenuTrabajador(boolean mostrar){
        Dimension dimension = new Dimension();
        if(mostrar!=true){
            ventanaTrabajador.menuTrabajador.btnAjustes.setText("");
            ventanaTrabajador.menuTrabajador.btnAlmacen.setText("");
            ventanaTrabajador.menuTrabajador.btnAyuda.setText("");
            ventanaTrabajador.menuTrabajador.btnCerrarSesion.setText("");
            
            ventanaTrabajador.menuTrabajador.btnEstadisticas.setText("");
            ventanaTrabajador.menuTrabajador.btnRegistros.setText("");
            ventanaTrabajador.menuTrabajador.btnVentas.setText("");
            dimension.setSize(40, 40);
            ventanaTrabajador.menuTrabajador.setPreferredSize(dimension.getSize());
            ventanaTrabajador.menuTrabajador.updateUI();
            ventanaTrabajador.menuTrabajador.repaint();
        }else{
            ventanaTrabajador.menuTrabajador.btnAjustes.setText("AJUSTES");
            ventanaTrabajador.menuTrabajador.btnAlmacen.setText("ALMACEN");
            ventanaTrabajador.menuTrabajador.btnAyuda.setText("AYUDA");
            ventanaTrabajador.menuTrabajador.btnCerrarSesion.setText("CERRAR SESION");
            
            ventanaTrabajador.menuTrabajador.btnEstadisticas.setText("ESTADISTICAS");
            ventanaTrabajador.menuTrabajador.btnRegistros.setText("REGISTROS");
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
        add(btnMenu, new java.awt.GridBagConstraints());

        perfil_Usuario1.setMaximumSize(new java.awt.Dimension(1000, 40));
        perfil_Usuario1.setMinimumSize(new java.awt.Dimension(150, 40));
        perfil_Usuario1.setPreferredSize(new java.awt.Dimension(200, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        add(perfil_Usuario1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
       if(ventanaAdmin != null){
          if("AJUSTES".equals(ventanaAdmin.menuAdmin.btnAjustes.getText())){
               mostrarMenuAdmin(false);
          }else{
               mostrarMenuAdmin(true);
          }
        }
       if(ventanaTrabajador!=null){
           if("AJUSTES".equals(ventanaTrabajador.menuTrabajador.btnAjustes.getText())){
               mostrarMenuTrabajador(false);
          }else{
               mostrarMenuTrabajador(true);
          }
       }
    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnMenu;
    private vista.Perfil_Usuario perfil_Usuario1;
    // End of variables declaration//GEN-END:variables
}
