package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import modelo.CustomButtonShaped;
import modelo.Modelo_Inventario_Repuestos;


public class Emergente_Panel extends javax.swing.JDialog {

    private Dimension resolucionDialogo = new Dimension (500,650);
    public Borde_Ventana bordeVentana;
    public CustomButtonShaped btnAceptar,btnCancelar;
    public Panel_Inventario_Ingresar pInventarioAgregar;
    public LinkedList<String> inventario;
    
    
    public Emergente_Panel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initDialog();
        initPanel(); 
        llamarComponentes();
    }
    
    private void initDialog(){
        setMinimumSize(new Dimension(resolucionDialogo));
        setMaximumSize(new Dimension(resolucionDialogo));
        setSize(new Dimension(resolucionDialogo));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        getContentPane().setBackground(new Color(250,250,250));
        getContentPane().setLayout (new GridBagLayout());
        pack();
    }
    
    private void initPanel(){
        
        bordeVentana = new Borde_Ventana(this);
        bordeVentana.moverVentana(true);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas
        constraints.gridheight = 1; // El área de texto ocupa una fila
        constraints.weightx = 1.0; // La columna se estira
        constraints.weighty = 1.0; // La fila no se estira
        constraints.fill = GridBagConstraints.HORIZONTAL;//Estirar los componentes
        constraints.anchor = GridBagConstraints.NORTH;//Poscion que ocupa el componente
        constraints.insets= new Insets(0,0,0,0);
        getContentPane().add (bordeVentana, constraints);
        
        pInventarioAgregar = new Panel_Inventario_Ingresar();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0; 
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(15,15,15,15);
        getContentPane().add (pInventarioAgregar, constraints);
        
        btnAceptar = new CustomButtonShaped();
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setFocusPainted(false);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 0.0; 
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(15,15,15,15);
        getContentPane().add (btnAceptar, constraints);
        
        btnCancelar = new CustomButtonShaped();
        btnCancelar.setText("CANCELAR");
        btnCancelar.setFocusPainted(false);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 0.0; 
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(15,15,15,15);
        getContentPane().add (btnCancelar, constraints);
        
        
    }
    
    private void llamarComponentes(){
        inventario = new LinkedList<String>();
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String temp = null;
                temp = ( pInventarioAgregar.txfID != null) ? pInventarioAgregar.txfID.getText() : null;
                inventario.add(temp);
                temp = ( pInventarioAgregar.cbxVehiculo.getSelectedItem().equals("Vehiculo")) ? "Vehiculo" : "Repuestos";
                inventario.add(temp);
                temp = ( pInventarioAgregar.txfDescripicion != null) ? pInventarioAgregar.txfDescripicion.getText() : null;
                inventario.add(temp);
                temp = ( pInventarioAgregar.txfMarca != null) ? pInventarioAgregar.txfMarca.getText() : null;
                inventario.add(temp);
                temp = ( pInventarioAgregar.txfModelo != null) ? pInventarioAgregar.txfModelo.getText() : null;
                inventario.add(temp);
                temp = ( pInventarioAgregar.txfColor != null) ? pInventarioAgregar.txfColor.getText() : null;
                inventario.add(temp);
                temp = ( pInventarioAgregar.txfMotor != null) ? pInventarioAgregar.txfMotor.getText() : null;
                inventario.add(temp);
                temp = ( pInventarioAgregar.txfChasis != null) ? pInventarioAgregar.txfChasis.getText() : null;
                inventario.add(temp);
                temp = ( pInventarioAgregar.txfFab != null) ? pInventarioAgregar.txfFab.getText() : null;
                inventario.add(temp);
                temp = ( pInventarioAgregar.txfGarantia != null) ? pInventarioAgregar.txfGarantia.getText() : null;
                inventario.add(temp);
                temp = ( pInventarioAgregar.txfPrecio != null) ? pInventarioAgregar.txfPrecio.getText() : null;
                inventario.add(temp);
                temp = ( pInventarioAgregar.txfCantidad != null) ? pInventarioAgregar.txfCantidad.getText() : null;
                inventario.add(temp);
                temp = ( pInventarioAgregar.txfAdvertencia != null) ? pInventarioAgregar.txfAdvertencia.getText() : null;
                inventario.add(temp);
                dispose();
            }
        });
        
        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                inventario = null;
                dispose();
            }
        });
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
