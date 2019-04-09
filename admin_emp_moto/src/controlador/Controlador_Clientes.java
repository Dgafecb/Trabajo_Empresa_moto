package controlador;

import static controlador.Controlador_login.lista_clientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import vista.Ventana_Admin;

public class Controlador_Clientes implements ActionListener{
    
    private LinkedList listaClientes = lista_clientes;
    private Controlador_Admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    
    public Controlador_Clientes(Controlador_Admin controladorAdmin, Ventana_Admin ventanaAdmin) {
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
}
