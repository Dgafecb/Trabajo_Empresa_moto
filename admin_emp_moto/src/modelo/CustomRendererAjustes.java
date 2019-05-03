package modelo;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.ListCellRenderer;
import javax.swing.border.EmptyBorder;


public class CustomRendererAjustes extends JPanel implements ListCellRenderer<Modelo_Ajustes> {

    private JLabel lbTitulo = new JLabel();
    private JLabel lbDescripcion = new JLabel();
    private JLabel lbValor = new JLabel();
    
    private JPanel panelPrincipal,panelTitulo,panelContenido;
    private JSeparator separador;

    public CustomRendererAjustes() {
        //this.setBorder(new EmptyBorder(1,10,1,10));
        this.setLayout(new BorderLayout(5, 5));
        //this.setBackground(Cadenas.COLOR_DEFAULT_WHITE);
       
        
        panelTitulo = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelTitulo.setBorder(new EmptyBorder(1,10,1,10));
        panelTitulo.setBackground(Cadenas.COLOR_DEFAULT_WHITE);
        panelTitulo.add(lbTitulo);
        
        panelContenido = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelContenido.setBorder(new EmptyBorder(1,10,1,10));
        panelContenido.setBackground(Cadenas.COLOR_DEFAULT_WHITE);
        panelContenido.add(lbDescripcion);
        panelContenido.add(lbValor);
        
        panelPrincipal = new JPanel(new GridLayout(0, 1));
        panelPrincipal.setBackground(Cadenas.COLOR_DEFAULT_WHITE);
        panelPrincipal.add(panelTitulo);
        panelPrincipal.add(panelContenido);
        
        separador = new JSeparator();
        
        add(panelPrincipal, BorderLayout.CENTER);
        add(separador,BorderLayout.SOUTH);
    }

    
    @Override
    public Component getListCellRendererComponent(JList<? extends Modelo_Ajustes> jlist, Modelo_Ajustes e, int i, boolean isSelected, boolean bln1) {
        lbTitulo.setText(e.getTitulo());
        lbTitulo.setFont(new Font("Monospaced",Font.BOLD,14));
        lbDescripcion.setText(e.getDescripcion()+" : ");
        lbDescripcion.setFont(new Font("Monospaced",Font.PLAIN,12));
        lbValor.setText(e.getValor());
        lbValor.setFont(new Font("Monospaced",Font.PLAIN,12));
        
        // set Opaque to change background color of JLabel
        lbTitulo.setOpaque(true);
        lbDescripcion.setOpaque(true);
        lbValor.setOpaque(true);
        
        // when select item
        if (isSelected) {
        lbTitulo.setForeground(jlist.getSelectionForeground());
        lbDescripcion.setForeground(jlist.getSelectionForeground());
        lbValor.setForeground(jlist.getSelectionForeground());
        
        lbTitulo.setBackground(jlist.getSelectionBackground());
        lbDescripcion.setBackground(jlist.getSelectionBackground());
        lbValor.setBackground(jlist.getSelectionBackground());
        panelPrincipal.setBackground(jlist.getSelectionBackground());
        panelTitulo.setBackground(jlist.getSelectionBackground());
        panelContenido.setBackground(jlist.getSelectionBackground());
        separador.setBackground(jlist.getSelectionBackground());
        setBackground(jlist.getSelectionBackground());
        } else { // when don't select
        lbTitulo.setForeground(jlist.getForeground());
        lbDescripcion.setForeground(jlist.getForeground());
        lbValor.setForeground(jlist.getForeground());
        
        lbTitulo.setBackground(jlist.getBackground());
        lbDescripcion.setBackground(jlist.getBackground());
        lbValor.setBackground(jlist.getBackground());
        panelPrincipal.setBackground(jlist.getBackground());
        panelTitulo.setBackground(jlist.getBackground());
        panelContenido.setBackground(jlist.getBackground());
        separador.setBackground(jlist.getBackground());
        setBackground(jlist.getBackground());
        }
        
        return this;
    }
    
}
