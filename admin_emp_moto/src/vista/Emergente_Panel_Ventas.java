package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import modelo.Cadenas;
import modelo.CustomButtonShaped;


public class Emergente_Panel_Ventas extends javax.swing.JDialog {

    public Borde_Ventana bordeVentana;
    public CustomButtonShaped btnAceptar,btnSi,btnNo;
    public JLabel mensaje;
    public Dimension dmsn  = new Dimension (400,150);
    public JSlider slider ;
    private int maximo;
    

    public Emergente_Panel_Ventas(java.awt.Frame parent, boolean modal,int maximo) {
        super(parent, modal);
        this.maximo = maximo;
        initDialog();
        initPanel();
        llamarComponentes();
    }

    private void initDialog(){
        setMinimumSize(dmsn);
        setMaximumSize(dmsn);
        setSize(dmsn);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setUndecorated(true);
        getContentPane().setBackground(new Color(250,250,250));
        getContentPane().setLayout (new GridBagLayout());
    }
    
    private void initPanel(){
        
        bordeVentana = new Borde_Ventana(this);
        bordeVentana.moverVentana(true);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El 疵ea de texto empieza en la columna cero
        constraints.gridy = 0; // El 疵ea de texto empieza en la fila cero
        constraints.gridwidth = 2; // El 疵ea de texto ocupa dos columnas
        constraints.gridheight = 1; // El 疵ea de texto ocupa una fila
        constraints.weightx = 1.0; // La columna se estira
        constraints.weighty = 1.0; // La fila no se estira
        constraints.fill = GridBagConstraints.HORIZONTAL;//Estirar los componentes
        constraints.anchor = GridBagConstraints.NORTH;//Poscion que ocupa el componente
        constraints.insets= new Insets(0,0,0,0);
        getContentPane().add (bordeVentana, constraints);
        
        slider = new JSlider();
        slider.setFocusable(false);
        slider.setBackground(Cadenas.COLOR_DEFAULT_WHITE);
        slider.setMaximum(this.maximo);
        slider.setMinimum(0);
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(1);
        slider.setSnapToTicks(true);
        slider.setMajorTickSpacing(1);
        constraints.gridx = 0; 
        constraints.gridy = 1;
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(15,25,15,15);
        getContentPane().add (slider, constraints);
        
        
        mensaje = new JLabel();
        mensaje.setText(String.valueOf(slider.getValue()));
        constraints.gridx = 1; 
        constraints.gridy = 1;
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(15,15,15,25);
        getContentPane().add (mensaje, constraints);
        
        
        
        
        btnAceptar = new CustomButtonShaped();
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setFocusPainted(false);
        constraints.gridx = 0; // El 疵ea de texto empieza en la columna cero
        constraints.gridy = 2; // El 疵ea de texto empieza en la fila cero
        constraints.gridwidth = 2; // El 疵ea de texto ocupa dos columnas
        constraints.gridheight = 1; // El 疵ea de texto ocupa una fila
        constraints.weightx = 0.0; // La columna se estira
        constraints.weighty = 0.0; // La fila no se estira
        constraints.fill = GridBagConstraints.NONE;//Estirar los componentes
        constraints.anchor = GridBagConstraints.CENTER;//Poscion que ocupa el componente
        constraints.insets= new Insets(15,15,15,15);
        getContentPane().add (btnAceptar, constraints);
    }
    
    private void llamarComponentes(){
    slider.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent ce) {
                   mensaje.setText(String.valueOf(slider.getValue())); 
            }
        });
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    // End of variables declaration                   
}
