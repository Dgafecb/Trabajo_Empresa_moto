package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import modelo.CustomData;
import modelo.CustomListRenderer;


public class Vista_Panel_Trabajadores extends javax.swing.JPanel {

    public Vista_Panel_Trabajadores() {
        initComponents();
        disenhoPanel.lblTitulo.setText("PANEL DE TRABAJADORES");
        testList();
    }

    private void testList() {
        DefaultListModel model = new DefaultListModel();
        
            model.addElement(new CustomData(new Color(209, 52, 23), 2, "consectetur adipiscing elit"));
            model.addElement(new CustomData(new Color(209, 52, 23), 3, "Aliquam condimentum"));
            model.addElement(new CustomData(new Color(209, 52, 23), 0, "imperdiet justo, vel volutpat "));
            model.addElement(new CustomData(new Color(209, 52, 23), 1, "mauris maximus quis"));
            model.addElement(new CustomData(new Color(209, 52, 23), 2, "Quisque quis ultricies turpis"));
            
        jListTrabajadores.setModel(model);
        jListTrabajadores.setCellRenderer(new CustomListRenderer(jListTrabajadores));
        jListTrabajadores.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        disenhoPanel = new vista.Vista_Disenho_Panel();
        jsListTrabajadores = new javax.swing.JScrollPane();
        jListTrabajadores = new javax.swing.JList<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        add(disenhoPanel, gridBagConstraints);

        jListTrabajadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jsListTrabajadores.setViewportView(jListTrabajadores);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(jsListTrabajadores, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private vista.Vista_Disenho_Panel disenhoPanel;
    public javax.swing.JList<String> jListTrabajadores;
    public javax.swing.JScrollPane jsListTrabajadores;
    // End of variables declaration//GEN-END:variables
}
