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
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import modelo.CustomButtonShaped;
import modelo.Modelo_Ajustes;

/**
 *
 * @author FuryMercury
 */
public class Emergente_Ajustes extends javax.swing.JDialog {

    public Borde_Ventana bordeVentana;
    public CustomButtonShaped btnAceptar,btnSi,btnNo;
    public JLabel mensaje;
    private int sizex ;
    private int sizey ;
    
    private String cambio;
    public Modelo_Ajustes ajustes;
    
    public Emergente_Ajustes(java.awt.Frame parent, boolean modal,Modelo_Ajustes ajustes) {
        super(parent, modal);
        this.ajustes = ajustes;
        this.mensaje = new JLabel(ajustes.getDescripcion()+ " : ");
        this.mensaje.setForeground(new Color(60,60,60));
        this.mensaje.setFont(new Font("Tahoma",Font.PLAIN,14));
        FontMetrics metrics = getFontMetrics(this.mensaje.getFont());
        sizex = metrics.stringWidth(ajustes.getDescripcion())+200;
        sizey = metrics.getHeight()+250;
        initDialog();
        initComponents();
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

    public String getCambio() {
        return cambio;
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
