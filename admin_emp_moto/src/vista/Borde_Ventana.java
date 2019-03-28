package vista;


public class Borde_Ventana extends javax.swing.JPanel {

    public Borde_Ventana() {
        initComponents();
        btnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new modelo.CustomButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setText("x");
        btnCerrar.setColorHover(new java.awt.Color(255, 51, 51));
        btnCerrar.setColorNormal(new java.awt.Color(255, 255, 255));
        btnCerrar.setColorPressed(new java.awt.Color(255, 102, 102));
        btnCerrar.setColorTextNormal(new java.awt.Color(102, 102, 102));
        add(btnCerrar);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private modelo.CustomButton btnCerrar;
    // End of variables declaration//GEN-END:variables
}
