package modelo;

import static controlador.Controlador_login.lista_vehiculos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;


public class CustomRendererVentas extends JPanel implements ListCellRenderer<LinkedList<Modelo_Ventas>>{
    
    
    private JLabel lblID;
    private JLabel txtTotal;
    private JLabel lblTotal;
    private JLabel txtGanancia;
    private JLabel lblGanancia;
    
    private JPanel pInfo;
    private JPanel pDetalles;
    
    private GridBagLayout gblPrincipal;
    private GridBagLayout gblInfo;
    private JList lDetalles;
    
    
    public CustomRendererVentas(){
        gblPrincipal = new GridBagLayout();
        
        lblID = new JLabel();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; 
        constraints.gridy = 0; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0; 
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.insets= new Insets(0,0,0,0);
        this.add(lblID, constraints);
        
        pInfo = new JPanel();
        constraints.gridx = 1; 
        constraints.gridy = 0; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0; 
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.insets= new Insets(0,0,0,0);
        this.add(pInfo , constraints);
        
        pDetalles = new JPanel();
        constraints.gridx = 1; 
        constraints.gridy = 1; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0; 
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.insets= new Insets(0,0,0,0);
        this.add(pDetalles , constraints);
        
        this.setLayout(gblPrincipal);
        initpInfo();
    }
    
    private void initpInfo(){
        gblInfo = gblPrincipal = new GridBagLayout();
        pInfo.setLayout(gblInfo);
        
        txtGanancia= new JLabel("Ganancias: ");
        txtGanancia.setForeground(Color.GREEN);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; 
        constraints.gridy = 0; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0; 
        constraints.ipadx = 0;
        constraints.ipady = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.insets= new Insets(0,0,0,0);
        this.add(txtGanancia, constraints);
        
        lblGanancia= new JLabel();
        constraints.gridx = 0; 
        constraints.gridy = 1; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0; 
        constraints.ipadx = 0;
        constraints.ipady = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.insets= new Insets(0,0,0,0);
        this.add(lblGanancia, constraints);
        
        txtTotal= new JLabel("Total: ");
        constraints.gridx = 0; 
        constraints.gridy = 2; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0; 
        constraints.ipadx = 0;
        constraints.ipady = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.insets= new Insets(0,0,0,0);
        this.add(txtTotal, constraints);
        
        lblTotal= new JLabel();
        lblTotal.setForeground(Color.BLUE);
        constraints.gridx = 0; 
        constraints.gridy = 3; 
        constraints.gridwidth = 1; 
        constraints.gridheight = 1;
        constraints.weightx = 0.0;
        constraints.weighty = 0.0; 
        constraints.ipadx = 0;
        constraints.ipady = 0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.insets= new Insets(0,0,0,0);
        this.add(lblTotal, constraints);
        
        
    }
    
    @Override
    public Component getListCellRendererComponent(JList<? extends LinkedList<Modelo_Ventas>> jlist, LinkedList<Modelo_Ventas> e, int i, boolean bln, boolean bln1) {
        Modelo_Inventario_Vehiculos miv;
        Double montoTotal = 0.0;
        Double ganancia = 0.0;
        String idProducto;
        for (Modelo_Ventas mv : e) {
            idProducto = mv.getId_prod();
            miv = lista_vehiculos.findIdProductoxID(lista_vehiculos, idProducto);

            //Calcula la ganancia y total
            ganancia = ganancia + (miv.getPrecio()-miv.getPrecio_compra())*mv.getCantidad();
            montoTotal += mv.getTotal();
        }
        return this;
    }
    
}
