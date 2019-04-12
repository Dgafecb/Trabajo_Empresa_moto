
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import modelo.Consultas_Ventas;
import modelo.Modelo_Ventas;
import vista.Panel_Resumen;
import vista.Ventana_Trabajador;



public class Controlador_Resumen implements ActionListener {

    private Ventana_Trabajador ventana_trabajador;
    private Controlador_trabajador controlador_Trabajador;
    private Consultas_Ventas consultas_ventas;
    private Modelo_Ventas modelo_ventas;
    private Panel_Resumen panel_Resumen;
    private LinkedList<Modelo_Ventas> lista_ventas;
    
    public Controlador_Resumen(){
        
    }

    public Controlador_Resumen(Ventana_Trabajador ventana_trabajador, Controlador_trabajador controlador_Trabajador) {
        this.ventana_trabajador = ventana_trabajador;
        this.controlador_Trabajador = controlador_Trabajador;
        iniciarComponentes();
        iniciarGrafica();
        iniciarTabla();
    }
    
    private void iniciarComponentes(){
         this.panel_Resumen = this.controlador_Trabajador.panel_resumen;      
    }
    
    private void llamarComponentes(){
        
    }
    
    private void iniciarGrafica(){
        
    }
    
    private void actualizarGrafica(){
        
    }
    
    private void iniciarTabla(){
        
    }
    
    private void actualizarTabla(){
        
    }
    
    private boolean verificacionAsistencia(){
        return false;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }
}
