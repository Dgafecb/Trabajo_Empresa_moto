package controlador;

import static controlador.Controlador_login.lista_trabajadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Consultas_Trabajadores;
import modelo.Modelo_Trabajadores;
import vista.Panel_Resumen;
import vista.Panel_Ventas;
import vista.Ventana_Login;
import vista.Ventana_Trabajador;

public class Controlador_trabajador implements ActionListener {

    public Ventana_Trabajador ventanaTrabajador;
    public Modelo_Trabajadores model_user;
    public Ventana_Login view_login;
    public Consultas_Trabajadores consultas_login;
    public Controlador_login ctrl_login;
    public Controlador_Resumen ctrl_resumen;
    public Panel_Resumen panel_resumen;
    
    private Panel_Ventas panel_ventas;
    public Modelo_Trabajadores modelo_Trabajador_Actual;

    public Controlador_trabajador(Ventana_Trabajador ventanaTrabajador, Modelo_Trabajadores model_user) {// Falta instanciar las demas variables a usar
        this.ventanaTrabajador = ventanaTrabajador;
        this.model_user = model_user;
        this.llamarComponentes();
    }

    private void llamarComponentes() {
        ventanaTrabajador.menuTrabajador.btnInicio.addActionListener(this);
        ventanaTrabajador.menuTrabajador.btnCerrarSesion.addActionListener(this);
        ventanaTrabajador.menuTrabajador.btnVentas.addActionListener(this);
        //Agrega el nombre y apellido a la esquina superior derecha
        modelo_Trabajador_Actual = (Modelo_Trabajadores) lista_trabajadores.get(lista_trabajadores.findTrabajador(lista_trabajadores, this.model_user.getDni()));
        String nombre_apellido = ((Modelo_Trabajadores) lista_trabajadores.get(lista_trabajadores.findTrabajador(lista_trabajadores, this.model_user.getDni()))).getNombre();
        nombre_apellido = nombre_apellido + " " + ((Modelo_Trabajadores) lista_trabajadores.get(lista_trabajadores.findTrabajador(lista_trabajadores, this.model_user.getDni()))).getApellido();
        ventanaTrabajador.menuNotificaciones.perfil_Usuario1.lblEditUser.setText(nombre_apellido);
    }
    private void limpiarSpContent(){
        this.panel_ventas = null;
        this.panel_resumen = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaTrabajador.menuTrabajador.btnVentas) {
            limpiarSpContent();
            panel_ventas = new Panel_Ventas();
            ventanaTrabajador.administrarPanel(this.ventanaTrabajador.spContent, panel_ventas);
        }else if(e.getSource() == ventanaTrabajador.menuTrabajador.btnInicio){
            limpiarSpContent();
            panel_resumen = new Panel_Resumen();
            ctrl_resumen = new Controlador_Resumen(this.ventanaTrabajador, this);
            ventanaTrabajador.administrarPanel(this.ventanaTrabajador.spContent, panel_resumen);
        }else if (e.getSource() == ventanaTrabajador.menuTrabajador.btnCerrarSesion) { // Reinstancia la ventana de login, permitiendo otro inicio de sesion
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
