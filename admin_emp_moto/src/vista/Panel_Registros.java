
package vista;


public class Panel_Registros extends javax.swing.JPanel {


    public Panel_Registros() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pSubMenuRegistros = new javax.swing.JPanel();
        subBtnAsistencia = new modelo.CustomButton();
        subBtnClientes = new modelo.CustomButton();
        subBtnCompras = new modelo.CustomButton();
        subBtnTrabajadores = new modelo.CustomButton();
        subBtnVentas = new modelo.CustomButton();
        jSeparator4 = new javax.swing.JSeparator();
        spContenidoRegistros = new javax.swing.JScrollPane();

        setLayout(new java.awt.GridBagLayout());

        pSubMenuRegistros.setBackground(new java.awt.Color(60, 60, 60));
        pSubMenuRegistros.setMaximumSize(new java.awt.Dimension(4000, 40));
        pSubMenuRegistros.setMinimumSize(new java.awt.Dimension(400, 40));
        pSubMenuRegistros.setPreferredSize(new java.awt.Dimension(770, 40));
        pSubMenuRegistros.setLayout(new java.awt.GridBagLayout());

        subBtnAsistencia.setText("ASISTENCIA");
        subBtnAsistencia.setColorHover(new java.awt.Color(90, 90, 90));
        subBtnAsistencia.setColorNormal(new java.awt.Color(60, 60, 60));
        subBtnAsistencia.setColorPressed(new java.awt.Color(70, 70, 70));
        subBtnAsistencia.setFocusPainted(false);
        subBtnAsistencia.setMaximumSize(new java.awt.Dimension(140, 40));
        subBtnAsistencia.setMinimumSize(new java.awt.Dimension(140, 40));
        subBtnAsistencia.setPreferredSize(new java.awt.Dimension(140, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        pSubMenuRegistros.add(subBtnAsistencia, gridBagConstraints);

        subBtnClientes.setText("CLIENTES");
        subBtnClientes.setColorHover(new java.awt.Color(90, 90, 90));
        subBtnClientes.setColorNormal(new java.awt.Color(60, 60, 60));
        subBtnClientes.setColorPressed(new java.awt.Color(70, 70, 70));
        subBtnClientes.setFocusPainted(false);
        subBtnClientes.setMaximumSize(new java.awt.Dimension(127, 40));
        subBtnClientes.setMinimumSize(new java.awt.Dimension(127, 40));
        subBtnClientes.setPreferredSize(new java.awt.Dimension(127, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        pSubMenuRegistros.add(subBtnClientes, gridBagConstraints);

        subBtnCompras.setText("COMPRAS");
        subBtnCompras.setColorHover(new java.awt.Color(90, 90, 90));
        subBtnCompras.setColorNormal(new java.awt.Color(60, 60, 60));
        subBtnCompras.setColorPressed(new java.awt.Color(70, 70, 70));
        subBtnCompras.setFocusPainted(false);
        subBtnCompras.setMaximumSize(new java.awt.Dimension(128, 40));
        subBtnCompras.setMinimumSize(new java.awt.Dimension(128, 40));
        subBtnCompras.setPreferredSize(new java.awt.Dimension(128, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        pSubMenuRegistros.add(subBtnCompras, gridBagConstraints);

        subBtnTrabajadores.setText("TRABAJADORES");
        subBtnTrabajadores.setColorHover(new java.awt.Color(90, 90, 90));
        subBtnTrabajadores.setColorNormal(new java.awt.Color(60, 60, 60));
        subBtnTrabajadores.setColorPressed(new java.awt.Color(70, 70, 70));
        subBtnTrabajadores.setFocusPainted(false);
        subBtnTrabajadores.setMaximumSize(new java.awt.Dimension(166, 40));
        subBtnTrabajadores.setMinimumSize(new java.awt.Dimension(166, 40));
        subBtnTrabajadores.setPreferredSize(new java.awt.Dimension(166, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        pSubMenuRegistros.add(subBtnTrabajadores, gridBagConstraints);

        subBtnVentas.setText("VENTAS");
        subBtnVentas.setColorHover(new java.awt.Color(90, 90, 90));
        subBtnVentas.setColorNormal(new java.awt.Color(60, 60, 60));
        subBtnVentas.setColorPressed(new java.awt.Color(70, 70, 70));
        subBtnVentas.setFocusPainted(false);
        subBtnVentas.setMaximumSize(new java.awt.Dimension(115, 40));
        subBtnVentas.setMinimumSize(new java.awt.Dimension(115, 40));
        subBtnVentas.setPreferredSize(new java.awt.Dimension(115, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        pSubMenuRegistros.add(subBtnVentas, gridBagConstraints);

        jSeparator4.setBackground(new java.awt.Color(60, 60, 60));
        jSeparator4.setForeground(new java.awt.Color(60, 60, 60));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        pSubMenuRegistros.add(jSeparator4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        add(pSubMenuRegistros, gridBagConstraints);

        spContenidoRegistros.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(spContenidoRegistros, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JPanel pSubMenuRegistros;
    public javax.swing.JScrollPane spContenidoRegistros;
    public modelo.CustomButton subBtnAsistencia;
    public modelo.CustomButton subBtnClientes;
    public modelo.CustomButton subBtnCompras;
    public modelo.CustomButton subBtnTrabajadores;
    public modelo.CustomButton subBtnVentas;
    // End of variables declaration//GEN-END:variables
}
