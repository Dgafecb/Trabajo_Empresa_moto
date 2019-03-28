/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

/**
 *
 * @author Dgafecb
 */
public class Ventana_Trabajador extends javax.swing.JFrame {

    public Menu_Trabajador MenuTrabajador;
    public Menu_Notificaciones menuBar;
    public JScrollPane jsContent;
    
    public Ventana_Trabajador() {
        configFrame();
        initPaneles();
        this.setVisible(true);
    }
    
    private void configFrame(){    
        setMinimumSize(new Dimension(864, 540));
        setMaximumSize(new Dimension(1920, 1080));
        setSize(new Dimension(1600, 900));
        setLocationRelativeTo(null);
        //setResizable(false);
        setBackground(SystemColor.window);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(235,235,235));
        getContentPane().setLayout (new GridBagLayout());
        
    }
    
    private void initPaneles(){
        MenuTrabajador = new Menu_Trabajador();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 1; // El área de texto ocupa dos columnas
        constraints.gridheight = 3; // El área de texto ocupa 2 filas
        constraints.weightx = 0.0; // La columna se estira
        constraints.weighty = 1.0; // La fila se estira
        constraints.fill = GridBagConstraints.VERTICAL;//Estirar los componentes
        constraints.anchor = GridBagConstraints.CENTER;//Poscion que ocupa el componente
        getContentPane().add (MenuTrabajador, constraints);
        
        menuBar = new Menu_Notificaciones();
        menuBar.setPreferredSize(new Dimension(1280,50));
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 1.0; 
        constraints.weighty = 0.0; 
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        getContentPane().add (menuBar, constraints);
        
        jsContent = new JScrollPane();
        jsContent.setBorder(null);
        jsContent.getViewport().setBackground(new Color(255,255,255));
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        constraints.weightx = 1.0; 
        constraints.weighty = 1.0; 
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(10,10,10,10);
        getContentPane().add (jsContent, constraints);
        
    }
    
    public void administrarPanel(JScrollPane contenedor,Component compt){
        contenedor.setViewportView(compt);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
