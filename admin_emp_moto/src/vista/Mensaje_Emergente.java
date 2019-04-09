
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import modelo.CustomButtonShaped;


public class Mensaje_Emergente extends javax.swing.JDialog {

    public Borde_Ventana bordeVentana;
    public CustomButtonShaped btnAceptar,btnSi,btnNo;
    public JLabel mensaje;
    private int sizex ;
    private int sizey ;
    

    public Mensaje_Emergente(java.awt.Frame parent, boolean modal,String mensaje) {
        super(parent, modal);
        this.mensaje = new JLabel(mensaje);
        this.mensaje.setForeground(new Color(60,60,60));
        this.mensaje.setFont(new Font("Tahoma",Font.PLAIN,14));
        FontMetrics metrics = getFontMetrics(this.mensaje.getFont());
        sizex = metrics.stringWidth(mensaje)+100;
        sizey = metrics.getHeight()+150;
        this.initDialog();
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
        
        mensaje.setHorizontalAlignment(JLabel.CENTER);
        constraints.gridx = 0; // El área de texto empieza en la columna cero
        constraints.gridy = 1; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas
        constraints.gridheight = 1; // El área de texto ocupa una fila
        constraints.weightx = 1.0; // La columna se estira
        constraints.weighty = 0.0; // La fila no se estira
        constraints.fill = GridBagConstraints.HORIZONTAL;//Estirar los componentes
        constraints.anchor = GridBagConstraints.CENTER;//Poscion que ocupa el componente
        constraints.insets= new Insets(15,15,15,15);
        getContentPane().add (mensaje, constraints);
        
        
        btnAceptar = new CustomButtonShaped();
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setFocusPainted(false);
        constraints.gridx = 0; // El área de texto empieza en la columna cero
        constraints.gridy = 2; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas
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
