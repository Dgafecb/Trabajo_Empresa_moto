package controlador;

import static controlador.Controlador_login.lista_trabajadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Consultas_Trabajadores;
import modelo.Modelo_Trabajadores;
import vista.Panel_Ventas;
import vista.Ventana_Login;
import vista.Ventana_Trabajador;

public class Controlador_trabajador implements ActionListener {

    private Ventana_Trabajador ventanaTrabajador;
    private Modelo_Trabajadores model_user;
    private Ventana_Login view_login;
    private Consultas_Trabajadores consultas_login;
    private Controlador_login ctrl_login;
    
    private Panel_Ventas panel_ventas;

    public Controlador_trabajador(Ventana_Trabajador ventanaTrabajador, Modelo_Trabajadores model_user) {// Falta instanciar las demas variables a usar
        this.ventanaTrabajador = ventanaTrabajador;
        this.model_user = model_user;
        this.llamarComponentes();
    }

    private void llamarComponentes() {

        ventanaTrabajador.menuTrabajador.btnCerrarSesion.addActionListener(this);
        ventanaTrabajador.menuTrabajador.btnVentas.addActionListener(this);
        //Agrega el nombre y apellido a la esquina superior derecha
        String nombre_apellido = ((Modelo_Trabajadores) lista_trabajadores.get(lista_trabajadores.findTrabajador(lista_trabajadores, this.model_user.getDni()))).getNombre();
        nombre_apellido = nombre_apellido + " " + ((Modelo_Trabajadores) lista_trabajadores.get(lista_trabajadores.findTrabajador(lista_trabajadores, this.model_user.getDni()))).getApellido();
        ventanaTrabajador.menuNotificaciones.perfil_Usuario1.lblEditUser.setText(nombre_apellido);
    }
    private void limpiarSpContent(){
        this.panel_ventas = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaTrabajador.menuTrabajador.btnVentas) {
            limpiarSpContent();
            panel_ventas = new Panel_Ventas();
            ventanaTrabajador.administrarPanel(this.ventanaTrabajador.spContent, panel_ventas);
        }
        if (e.getSource() == ventanaTrabajador.menuTrabajador.btnCerrarSesion) { // Reinstancia la ventana de login, permitiendo otro inicio de sesion
            cerrarSesion();
        }

    }

    public void cerrarSesion() {
        ventanaTrabajador.setVisible(false);
        ventanaTrabajador.dispose();
        view_login = new Ventana_Login();
        consultas_login = new Consultas_Trabajadores();
        Modelo_Trabajadores new_user = new Modelo_Trabajadores();
        view_login.setVisible(true);
        ctrl_login = new Controlador_login(view_login, new_user, consultas_login);
    }
}
