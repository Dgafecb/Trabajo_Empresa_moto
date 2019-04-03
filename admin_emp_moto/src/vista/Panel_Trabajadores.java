package vista;

import java.awt.Color;
import java.util.LinkedList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import modelo.Consultas_Trabajadores_meta;
import modelo.CustomListData;
import modelo.CustomListRenderer;
import modelo.Modelo_Trabajadores_meta;


public class Panel_Trabajadores extends javax.swing.JPanel {

    public Panel_Trabajadores() {
        initComponents();
        //testList();
    }
/* Lo deshabilite hasta que cambie todas las consultas
    private void testList() {
        
        Consultas_Trabajadores_meta consulta = new Consultas_Trabajadores_meta();
        LinkedList<Modelo_Trabajadores_meta> lista = consulta.readAll();
        
        DefaultListModel model = new DefaultListModel();
        for(int i=0;i<lista.size();i++){
                model.addElement(new CustomListData(new Color(82, 158, 202),i,lista.get(i).getNombre()+" "
                        +lista.get(i).getApellido_paterno()+" "+lista.get(i).getApellido_materno()+" : "
                        +lista.get(i).getEmail()));
            }      
        jListTrabajadores.setModel(model);
        jListTrabajadores.setCellRenderer(new CustomListRenderer(jListTrabajadores));
        jListTrabajadores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }
*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jsListTrabajadores = new javax.swing.JScrollPane();
        jListTrabajadores = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jsListTrabajadores.setBorder(null);

        jListTrabajadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jsListTrabajadores.setViewportView(jListTrabajadores);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        add(jsListTrabajadores, gridBagConstraints);

        jButton1.setText("jButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jButton1, gridBagConstraints);

        jButton2.setText("jButton2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jButton2, gridBagConstraints);

        jButton3.setText("jButton3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jButton3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JList<String> jListTrabajadores;
    public javax.swing.JScrollPane jsListTrabajadores;
    // End of variables declaration//GEN-END:variables
}
