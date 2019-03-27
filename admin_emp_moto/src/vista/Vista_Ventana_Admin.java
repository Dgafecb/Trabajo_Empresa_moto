package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.util.Locale;
import javax.swing.JScrollPane;
import modelo.SlidingPanel;

public class Vista_Ventana_Admin extends javax.swing.JFrame {

    public Vista_Panel_MenuAdmin MenuAdmin;
    public Vista_Panel_MenuBar menuBar;
    public JScrollPane jsContent;
    
    public Vista_Ventana_Admin() {
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
        MenuAdmin = new Vista_Panel_MenuAdmin();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 1; // El área de texto ocupa dos columnas
        constraints.gridheight = 3; // El área de texto ocupa 2 filas
        constraints.weightx = 0.0; // La columna se estira
        constraints.weighty = 1.0; // La fila se estira
        constraints.fill = GridBagConstraints.VERTICAL;//Estirar los componentes
        constraints.anchor = GridBagConstraints.CENTER;//Poscion que ocupa el componente
        getContentPane().add (MenuAdmin, constraints);
        
        menuBar = new Vista_Panel_MenuBar();
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
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
