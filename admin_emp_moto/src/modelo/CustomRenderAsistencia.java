package modelo;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class CustomRenderAsistencia extends DefaultTableCellRenderer{
    public Component getTableCellRendererComponent(JTable table,
      Object value,
      boolean isSelected,
      boolean hasFocus,
      int row,
      int column)
   {
      super.getTableCellRendererComponent (table, value, isSelected, hasFocus, row, column);
      int cantidad = Integer.parseInt(table.getModel().getValueAt(row,3).toString());
      int advertencia = Integer.parseInt(table.getModel().getValueAt(row,12).toString());
      if ( cantidad == advertencia ){
         this.setOpaque(true);
         this.setBackground(Cadenas.COLOR_DEFAULT_RED);
         this.setForeground(Color.WHITE);
      }else if ( cantidad - advertencia < 3){
         this.setOpaque(true);
         this.setBackground(Cadenas.COLOR_DEFAULT_YELLOW);
         this.setForeground(Cadenas.COLOR_DEFAULT_BLACK);
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
