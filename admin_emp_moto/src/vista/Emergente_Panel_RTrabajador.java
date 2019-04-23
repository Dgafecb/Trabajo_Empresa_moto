package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import modelo.CustomButtonShaped;


public class Emergente_Panel_RTrabajador extends javax.swing.JDialog {

    public Borde_Ventana bordeVentana;
    public CustomButtonShaped btnAceptar,btnCancelar;
    public Panel_Registro_Trabajadores_Agregar pRTrabajadoresAgregar;
    public LinkedList<String> listatrabajadores; 
    private Dimension resolucionDialogo = new Dimension (500,450);
   
    public Emergente_Panel_RTrabajador(java.awt.Frame parent, boolean modal) {
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
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,60,60)));
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
        
        pRTrabajadoresAgregar = new Panel_Registro_Trabajadores_Agregar();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0; 
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(15,15,15,15);
        getContentPane().add (pRTrabajadoresAgregar, constraints);
        
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
    
    private void llamarComponentes() {
        listatrabajadores = new LinkedList<String>();
        btnAceptar.addActionListener((ActionEvent ae) -> {
            String temp = null;
            temp = (!pRTrabajadoresAgregar.txfCNombre1.getText().equals(""))?pRTrabajadoresAgregar.txfCNombre1.getText().toUpperCase():"";
            listatrabajadores.add(temp);
            temp = (!pRTrabajadoresAgregar.txfCNombre2.getText().equals(""))?pRTrabajadoresAgregar.txfCNombre2.getText():"";
            listatrabajadores.add(temp);
            temp = (!pRTrabajadoresAgregar.txfCNombre3.getText().equals(""))?pRTrabajadoresAgregar.txfCNombre3.getText().toUpperCase():"";
            listatrabajadores.add(temp);
            temp = (!pRTrabajadoresAgregar.txfCNombre4.getText().equals(""))?pRTrabajadoresAgregar.txfCNombre4.getText().toUpperCase():"";
            listatrabajadores.add(temp);
            temp = (!pRTrabajadoresAgregar.txfCNombre5.getText().equals(""))?pRTrabajadoresAgregar.txfCNombre5.getText().toUpperCase():"";
            listatrabajadores.add(temp);
            temp = (pRTrabajadoresAgregar.cbPrivilegio.getSelectedIndex()!=0)?"0":"2";
            listatrabajadores.add(temp);
            
            dispose();
        });
        
        btnCancelar.addActionListener((ActionEvent ae) -> {
            listatrabajadores = null;
            dispose();
        });
        
        bordeVentana.btnCerrar.addActionListener((ActionEvent ae) -> {
            listatrabajadores = null;
            dispose();
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
