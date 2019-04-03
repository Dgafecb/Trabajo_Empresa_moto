package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JScrollPane;

public class Ventana_Admin extends javax.swing.JFrame{

    public Borde_Ventana bordeVentana;
    public Menu_Admin menuAdmin;
    public Menu_Notificaciones menuNotificaciones;
    public JScrollPane spContent;
    
    public Ventana_Admin() {
        configFrame();
        initPaneles();
    }
    
    private void configFrame(){    
        setMinimumSize(new Dimension(864, 540));//16:9
        setMaximumSize(new Dimension(1920, 1080));//16:9
        setSize(new Dimension(1600, 900));//16:9
        setLocationRelativeTo(null);
        setBackground(SystemColor.window);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH); 
        addWindowListener(new VentanaListener());
        setUndecorated(true);
        getContentPane().setBackground(new Color(235,235,235));
        getContentPane().setLayout (new GridBagLayout());
        
    }
    
    private void initPaneles(){
        bordeVentana = new Borde_Ventana(this);
        bordeVentana.moverVentana(false);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas
        constraints.gridheight = 1; // El área de texto ocupa una fila
        constraints.weightx = 1.0; // La columna se estira
        constraints.weighty = 0.0; // La fila no se estira
        constraints.fill = GridBagConstraints.HORIZONTAL;//Estirar los componentes
        constraints.anchor = GridBagConstraints.CENTER;//Poscion que ocupa el componente
        getContentPane().add (bordeVentana, constraints);
        
        menuNotificaciones = new Menu_Notificaciones();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 1.0; 
        constraints.weighty = 0.0; 
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        getContentPane().add (menuNotificaciones, constraints);
        
        menuAdmin = new Menu_Admin();
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 0.0; 
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.anchor = GridBagConstraints.CENTER;
        getContentPane().add (menuAdmin, constraints);
        
        
        
        spContent = new JScrollPane();
        spContent.setBorder(null);
        spContent.getViewport().setBackground(new Color(255,255,255));
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0; 
        constraints.weighty = 1.0; 
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(0,0,0,0);
        getContentPane().add (spContent, constraints);
        
    }
    
    public void administrarPanel(JScrollPane contenedor,Component compt){
        contenedor.setViewportView(compt);       
    }

    private class VentanaListener extends WindowAdapter {

    public void windowDeiconified(WindowEvent e) {
    setExtendedState(MAXIMIZED_BOTH);
        }
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

