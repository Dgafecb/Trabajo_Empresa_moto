
package vista;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import static com.github.lgooddatepicker.durationpicker_underconstruction.DurationUnit.Day;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import modelo.Cadenas;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;


public class Panel_Resumen extends javax.swing.JPanel {

    public JFreeChart grafica;
    public ChartPanel panelGrafica;
    public XYDataset database;
    
    public Panel_Resumen() {
        initComponents();
        this.jScrollPane1.getViewport().setBackground(Color.WHITE);
        configPicker(datePicker1);
        crearGraficaDeafult();
        this.updateUI();
    }
    
    private void configPicker(DatePicker datePicker){
        Font font = new Font("Tahoma",Font.PLAIN,14);
        Color color = new Color(60,60,60);
        datePicker.getSettings().setFontInvalidDate(font);
        datePicker.getSettings().setFontClearLabel(font);
        datePicker.getSettings().setFontValidDate(font);
        datePicker.getSettings().setSizeTextFieldMinimumWidth(80);
        
        datePicker.getSettings().setColor(DatePickerSettings.DateArea.DatePickerTextInvalidDate,color);
        datePicker.getSettings().setColor(DatePickerSettings.DateArea.DatePickerTextValidDate,color);
        //datePicker.getSettings().getParentCalendarPanel().getNextMonthButton();
        datePicker.getSettings();
    }
    
    private void crearGraficaDeafult(){
        database = createDatasetDeafult();
        grafica = ChartFactory.createTimeSeriesChart("Grafico de Ventas", "Fecha", "Ventas realizadas", database, true, true, false);
        panelGrafica= new ChartPanel(grafica);
        panelGrafica.setPreferredSize(new Dimension(100,400));
        //GridBagLayout layout = (GridBagLayout) this.customPanel2.getLayout();
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0; 
        constraints.weighty = 1.0; 
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.insets= new Insets(5,5,5,5);
        customPanel2.add (panelGrafica, constraints);
        
    }

    private XYDataset createDatasetDeafult() {
        LinkedList<String> string = new LinkedList<String>();
        LinkedList<Integer> valor = new LinkedList<Integer>();
        Double valortemp = 0.0 ; 
        string.add("18062019_105060");
        string.add("18072019_105060");
        string.add("19072019_105060");
        valor.add(5);
        valor.add(5);
        valor.add(5);
        
        TimeSeriesCollection dataset = new TimeSeriesCollection();
        TimeSeries series1 = new TimeSeries("Linea de Venta");
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        if(string!=null){
            Date date = null;
            for(int i = 0;i<string.size();i++){
                String dia = string.get(i).substring(0, 2);
                String mes = string.get(i).substring(2, 4);
                String anho = string.get(i).substring(4, 8);
                String hora = string.get(i).substring(9, 11);
                String min = string.get(i).substring(11, 13);
                String seg = string.get(i).substring(13, 15);
                String fecha = dia+"/"+mes+"/"+anho+" "+hora+":"+min+":"+seg;
                System.out.print(fecha);
                try {
                date = dateformat.parse(fecha);
                } catch (ParseException ex) {
                Logger.getLogger(Panel_Resumen.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(series1.getValue(new Day(date))!=null){
                    valortemp = (Double)series1.getValue(new Day(date)) + valor.get(i).doubleValue();
                }else{
                    valortemp = (Double)valor.get(i).doubleValue();
                }
                
                series1.addOrUpdate(new Day(date),valortemp);
            }  
            dataset.addSeries(series1);
        }else{
            //DEFAULT
        }
        return  dataset;
    }


    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        customPanel1 = new custom.CustomPanel();
        customButtonShaped1 = new custom.CustomButtonShaped();
        customPanel2 = new custom.CustomPanel();
        customPanel3 = new custom.CustomPanel();
        pBuscar = new javax.swing.JPanel();
        txfBuscar = new modelo.CustomTextField();
        btnBuscar = new custom.CustomButtonShaped();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();

        setBackground(new java.awt.Color(60, 60, 60));
        setForeground(new java.awt.Color(60, 60, 60));
        setLayout(new java.awt.GridBagLayout());

        customPanel1.setBackground(new java.awt.Color(250, 250, 250));
        customPanel1.setForeground(new java.awt.Color(60, 60, 60));
        customPanel1.setOpaque(false);
        customPanel1.setLayout(new java.awt.GridBagLayout());

        customButtonShaped1.setText("MARCAR ASISTENCIA");
        customButtonShaped1.setColorNormalGrad2(new java.awt.Color(20, 20, 20));
        customButtonShaped1.setColorPressedGrad1(new java.awt.Color(20, 20, 20));
        customButtonShaped1.setColorPressedGrad2(new java.awt.Color(60, 60, 60));
        customButtonShaped1.setColorTextPressed(new java.awt.Color(153, 153, 153));
        customButtonShaped1.setCurve(50);
        customButtonShaped1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        customButtonShaped1.setMaximumSize(new java.awt.Dimension(300, 50));
        customButtonShaped1.setMinimumSize(new java.awt.Dimension(300, 50));
        customButtonShaped1.setPreferredSize(new java.awt.Dimension(300, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 50, 50, 50);
        customPanel1.add(customButtonShaped1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel1, gridBagConstraints);

        customPanel2.setBackground(new java.awt.Color(250, 250, 250));
        customPanel2.setForeground(new java.awt.Color(60, 60, 60));
        customPanel2.setOpaque(false);
        customPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel2, gridBagConstraints);

        customPanel3.setOpaque(false);
        customPanel3.setLayout(new java.awt.GridBagLayout());

        pBuscar.setBackground(new java.awt.Color(255, 255, 255));
        pBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
        pBuscar.setMinimumSize(new java.awt.Dimension(522, 40));
        pBuscar.setPreferredSize(new java.awt.Dimension(522, 40));
        pBuscar.setLayout(new java.awt.GridBagLayout());

        txfBuscar.setBorder(null);
        txfBuscar.setForeground(new java.awt.Color(60, 60, 60));
        txfBuscar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txfBuscar.setMaximumSize(new java.awt.Dimension(500, 38));
        txfBuscar.setMinimumSize(new java.awt.Dimension(500, 38));
        txfBuscar.setPhColor(new java.awt.Color(60, 60, 60));
        txfBuscar.setPreferredSize(new java.awt.Dimension(500, 38));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        pBuscar.add(txfBuscar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 5, 0);
        customPanel3.add(pBuscar, gridBagConstraints);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/(35x35)btnBuscar.png"))); // NOI18N
        btnBuscar.setCurve(0);
        btnBuscar.setMaximumSize(new java.awt.Dimension(40, 40));
        btnBuscar.setMinimumSize(new java.awt.Dimension(40, 40));
        btnBuscar.setPreferredSize(new java.awt.Dimension(40, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 5, 20);
        customPanel3.add(btnBuscar, gridBagConstraints);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 20, 20);
        customPanel3.add(jScrollPane1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 60, 60));
        jLabel1.setText("Buscar por fecha :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(60, 60, 60));
        jLabel2.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel1.add(jLabel2, gridBagConstraints);

        datePicker1.setMinimumSize(new java.awt.Dimension(250, 40));
        datePicker1.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel1.add(datePicker1, gridBagConstraints);

        datePicker2.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        datePicker2.setMinimumSize(new java.awt.Dimension(250, 40));
        datePicker2.setPreferredSize(new java.awt.Dimension(250, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(datePicker2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 5, 20);
        customPanel3.add(jPanel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        add(customPanel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private custom.CustomButtonShaped btnBuscar;
    public custom.CustomButtonShaped customButtonShaped1;
    private custom.CustomPanel customPanel1;
    private custom.CustomPanel customPanel2;
    private custom.CustomPanel customPanel3;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pBuscar;
    public modelo.CustomTextField txfBuscar;
    // End of variables declaration//GEN-END:variables

    
}
