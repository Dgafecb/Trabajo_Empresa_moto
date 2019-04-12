
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import modelo.Consultas_Ventas;
import modelo.Modelo_Ventas;
import vista.Ventana_Trabajador;



public class Controlador_Resumen implements ActionListener {

    private Ventana_Trabajador ventana_trabajador;
    private Controlador_trabajador controlador_Trabajador;
    private Consultas_Ventas consultas_ventas;
    private Modelo_Ventas modelo_ventas;
    private LinkedList<Modelo_Ventas> lista_ventas;
    
    public Controlador_Resumen(){
        
    }

    public Controlador_Resumen(Ventana_Trabajador ventana_trabajador, Controlador_trabajador controlador_Trabajador) {
        this.ventana_trabajador = ventana_trabajador;
        this.controlador_Trabajador = controlador_Trabajador;
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
       
    }
}
