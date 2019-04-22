package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import modelo.CustomButtonShaped;


public class Emergente_Panel_RVentas extends javax.swing.JDialog {

    private Dimension resolucionDialogo = new Dimension (500,530);
    public Borde_Ventana bordeVentana;
    public CustomButtonShaped btnAceptar,btnCancelar;
    public Panel_Registro_Ventas_Agregar pRegistrosVentasAgregar;
    public LinkedList<String> ventas;
    
    public Emergente_Panel_RVentas(java.awt.Frame parent, boolean modal) {
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
        
        pRegistrosVentasAgregar = new Panel_Registro_Ventas_Agregar();
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0; 
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(15,15,15,15);
        getContentPane().add (pRegistrosVentasAgregar, constraints);
        
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
        ventas = new LinkedList<String>();
        btnAceptar.addActionListener((ActionEvent ae) -> {
            String temp = null;
            temp = (pRegistrosVentasAgregar.txfVProducto.getText().compareTo("")!=0)?pRegistrosVentasAgregar.txfVProducto.getText().toUpperCase():"";
            ventas.add(temp);
            temp = (pRegistrosVentasAgregar.txfCNombre2.getText().compareTo("")!=0)?pRegistrosVentasAgregar.txfCNombre2.getText().toUpperCase():"";
            ventas.add(temp);
            temp = (pRegistrosVentasAgregar.txfCNombre3.getText().compareTo("")!=0)?pRegistrosVentasAgregar.txfCNombre3.getText().toUpperCase():"";
            ventas.add(temp);
            
            if(pRegistrosVentasAgregar.datePicker1.getText().compareTo("")!=0){
                LocalDate date =pRegistrosVentasAgregar.datePicker1.getDate();
                String Dia = String.valueOf(date.getDayOfMonth());
                String Mes = String.valueOf(date.getMonthValue());
                String Anho = String.valueOf(date.getYear());
                if(Dia.length()!=2) Dia="0"+Dia;
                if(Mes.length()!=2) Mes="0"+Mes;
                temp = Dia+Mes+Anho; 
                ventas.add(temp);
            }else{
                temp = "31121997";
                ventas.add(temp);
            }
            
            if(pRegistrosVentasAgregar.timePicker1.getText().compareTo("")!=0){
                LocalTime time =pRegistrosVentasAgregar.timePicker1.getTime();
                String Hora = String.valueOf(time.getHour());
                String Minuto = String.valueOf(time.getMinute());
                String Segundo = String.valueOf(time.getSecond());
                if(Hora.length()!=2) Hora="0"+Hora;
                if(Minuto.length()!=2) Minuto="0"+Minuto;
                if(Segundo.length()!=2) Segundo="00";
                temp = Hora+Minuto+Segundo; 
                ventas.add(temp);
            }else{
                temp = "235959";
                ventas.add(temp);
            }
            
            temp = (pRegistrosVentasAgregar.txfCNombre4.getText().compareTo("")!=0)?pRegistrosVentasAgregar.txfCNombre4.getText().toUpperCase():"";
            ventas.add(temp);
            temp = (pRegistrosVentasAgregar.txfCNombre5.getText().compareTo("")!=0)?pRegistrosVentasAgregar.txfCNombre5.getText().toUpperCase():"";
            ventas.add(temp);
            temp = (pRegistrosVentasAgregar.txfCNombre6.getText().compareTo("")!=0)?pRegistrosVentasAgregar.txfCNombre6.getText().toUpperCase():"";
            ventas.add(temp);
            temp = (pRegistrosVentasAgregar.txfCNombre7.getText().compareTo("")!=0)?pRegistrosVentasAgregar.txfCNombre7.getText().toUpperCase():"";
            ventas.add(temp);
            temp = (pRegistrosVentasAgregar.txfCNombre8.getText().compareTo("")!=0)?pRegistrosVentasAgregar.txfCNombre8.getText().toUpperCase():"";
            ventas.add(temp);
            dispose();
        });
        
        btnCancelar.addActionListener((ActionEvent ae) -> {
            ventas = null;
            dispose();
        });
        
        bordeVentana.btnCerrar.addActionListener((ActionEvent ae) -> {
            ventas = null;
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
