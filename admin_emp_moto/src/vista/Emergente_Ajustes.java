/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.CustomButtonShaped;
import modelo.Modelo_Ajustes;

/**
 *
 * @author FuryMercury
 */
public class Emergente_Ajustes extends javax.swing.JDialog {

    public Borde_Ventana bordeVentana;
    public CustomButtonShaped btnAceptar,btnSi,btnNo;
    public JLabel descripcion;
    public JTextField dato;
    private int sizex ;
    private int sizey ;
    
    public String cambio;
    public Modelo_Ajustes ajustes;
    
    public Emergente_Ajustes(java.awt.Frame parent, boolean modal,Modelo_Ajustes ajustes) {
        super(parent, modal);
        this.ajustes = ajustes;
        this.descripcion = new JLabel(ajustes.getDescripcion()+ " : ");
        this.descripcion.setForeground(new Color(60,60,60));
        this.descripcion.setFont(new Font("Tahoma",Font.PLAIN,14));
        FontMetrics metrics = getFontMetrics(this.descripcion.getFont());
        sizex = metrics.stringWidth(ajustes.getDescripcion())+250;
        sizey = metrics.getHeight()+150;
        initDialog();
        initPanel();
        llamarComponentes();
    }

    private void initDialog(){
        setMinimumSize(new Dimension(sizex , sizey));
        setMaximumSize(new Dimension(sizex , sizey));
        setSize(new Dimension(sizex , sizey));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        getContentPane().setBackground(new Color(250,250,250));
        getContentPane().setLayout (new GridBagLayout());
        getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(60,60,60)));
    }

    private void initPanel(){
        
        bordeVentana = new Borde_Ventana(this);
        bordeVentana.moverVentana(true);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 3; // El área de texto ocupa dos columnas
        constraints.gridheight = 1; // El área de texto ocupa una fila
        constraints.weightx = 1.0; // La columna se estira
        constraints.weighty = 1.0; // La fila no se estira
        constraints.fill = GridBagConstraints.HORIZONTAL;//Estirar los componentes
        constraints.anchor = GridBagConstraints.NORTH;//Poscion que ocupa el componente
        constraints.insets= new Insets(0,0,0,0);
        getContentPane().add (bordeVentana, constraints);
        
        descripcion.setHorizontalAlignment(JLabel.LEFT);
        constraints.gridx = 0; // El área de texto empieza en la columna cero
        constraints.gridy = 1; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas
        constraints.gridheight = 1; // El área de texto ocupa una fila
        constraints.weightx = 0.0; // La columna se estira
        constraints.weighty = 0.0; // La fila no se estira
        constraints.fill = GridBagConstraints.HORIZONTAL;//Estirar los componentes
        constraints.anchor = GridBagConstraints.CENTER;//Poscion que ocupa el componente
        constraints.insets= new Insets(15,15,15,15);
        getContentPane().add (descripcion, constraints);
        
        dato = new JTextField(ajustes.getValor());
        dato.setSize(100, 30);
        dato.setForeground(new Color(60,60,60));
        dato.setFont(new Font("Tahoma",Font.PLAIN,14));
        constraints.gridx = 2; // El área de texto empieza en la columna cero
        constraints.gridy = 1; // El área de texto empieza en la fila cero
        constraints.gridwidth = 1; // El área de texto ocupa dos columnas
        constraints.gridheight = 1; // El área de texto ocupa una fila
        constraints.weightx = 1.0; // La columna se estira
        constraints.weighty = 0.0; // La fila no se estira
        constraints.fill = GridBagConstraints.HORIZONTAL;//Estirar los componentes
        constraints.anchor = GridBagConstraints.CENTER;//Poscion que ocupa el componente
        constraints.insets= new Insets(15,15,15,15);
        getContentPane().add (dato, constraints);
        
        
        btnAceptar = new CustomButtonShaped();
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setFocusPainted(false);
        constraints.gridx = 0; // El área de texto empieza en la columna cero
        constraints.gridy = 2; // El área de texto empieza en la fila cero
        constraints.gridwidth = 3; // El área de texto ocupa dos columnas
        constraints.gridheight = 1; // El área de texto ocupa una fila
        constraints.weightx = 0.0; // La columna se estira
        constraints.weighty = 0.0; // La fila no se estira
        constraints.fill = GridBagConstraints.NONE;//Estirar los componentes
        constraints.anchor = GridBagConstraints.CENTER;//Poscion que ocupa el componente
        constraints.insets= new Insets(15,15,15,15);
        getContentPane().add (btnAceptar, constraints);
    }
    

    
    private void llamarComponentes(){
         btnAceptar.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae) {
                 cambio = dato.getText();
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
