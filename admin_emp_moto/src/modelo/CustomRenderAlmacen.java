package modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class CustomRenderAlmacen extends DefaultTableCellRenderer{
    public Component getTableCellRendererComponent(JTable table,
      Object value,
      boolean isSelected,
      boolean hasFocus,
      int row,
      int column)
   {
      super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
      int cantidad = Integer.parseInt(table.getModel().getValueAt(row,10).toString());
      int advertencia = Integer.parseInt(table.getModel().getValueAt(row,11).toString());
      if ( cantidad - advertencia == 0 ){
         this.setOpaque(true);
         this.setBackground(Cadenas.COLOR_DEFAULT_YELLOW);
         this.setForeground(Cadenas.COLOR_DEFAULT_BLACK);
      }else if ( cantidad - advertencia <0){
         this.setOpaque(true);
         this.setBackground(Cadenas.COLOR_DEFAULT_RED);
         this.setForeground(Color.WHITE);
        }else {
         this.setOpaque(false);
         this.setBackground(Color.WHITE);
         this.setForeground(Cadenas.COLOR_DEFAULT_BLACK);
      }
      
      if(isSelected){
         this.setOpaque(true);
         this.setBackground(Cadenas.COLOR_DEFAULT_BLACK);
         this.setForeground(Color.WHITE); 
      }

      return this;
   }
}
