
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import modelo.Cadenas;
import modelo.CustomButtonShaped;


public class Emergente_Actualizaciones extends javax.swing.JDialog {
    
    private Dimension res = new Dimension (500,500);
    private Borde_Ventana bordeVentana;
    private CustomButtonShaped btnCerrar;
    private JScrollPane spanel;
    private JEditorPane epanel ;

    public Emergente_Actualizaciones(java.awt.Frame parent, boolean modal) throws IOException {
        super(parent, modal);
        initDialog();
        initPanel();
        conexHtml();
        initCallComp();
    }
    
    private void initDialog(){
        setMinimumSize(new Dimension(res));
        setMaximumSize(new Dimension(res));
        setSize(new Dimension(res));
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
        constraints.gridwidth = 1; // El área de texto ocupa dos columnas
        constraints.gridheight = 1; // El área de texto ocupa una fila
        constraints.weightx = 1.0; // La columna se estira
        constraints.weighty = 0.0; // La fila no se estira
        constraints.fill = GridBagConstraints.HORIZONTAL;//Estirar los componentes
        constraints.anchor = GridBagConstraints.NORTH;//Poscion que ocupa el componente
        constraints.insets= new Insets(0,0,0,0);
        getContentPane().add (bordeVentana, constraints);
        
        spanel = new JScrollPane();
        spanel.setBorder(new EmptyBorder(0,0,0,0));
        spanel.setBackground(Cadenas.COLOR_DEFAULT_WHITE);
        spanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0; 
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(15,15,0,15);
        getContentPane().add (spanel, constraints);
        
        
        btnCerrar = new CustomButtonShaped();
        btnCerrar.setText("CERRAR");
        btnCerrar.setFocusPainted(false);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 0.0; 
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(15,15,15,15);
        getContentPane().add (btnCerrar, constraints);
           
    }
    
    private void conexHtml() throws IOException{
        epanel = new JEditorPane();
        epanel.setBackground(Cadenas.COLOR_DEFAULT_WHITE);
        spanel.setViewportView(epanel);
        /*URL url = getClass().getResource("/recursos/Actualizacion.html");
        File rec = new File(url.getPath());*/
        String url = System.getProperty("user.dir")+"\\update\\Actualizacion.html";
        File rec = new File(url);
        epanel.setEditable(false);
        try {
            epanel.setPage(rec.toURI().toURL());
        } catch (MalformedURLException ex) {
            Logger.getLogger(Emergente_Actualizaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initCallComp(){
        bordeVentana.btnCerrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
            
        });
        this.btnCerrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
            
        });
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
