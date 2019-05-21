package controlador;

import static controlador.Controlador_login.lista_asistencia;
import static controlador.Controlador_login.lista_trabajadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import modelo.Consultas_Asistencia;

import modelo.Consultas_Trabajadores;
import modelo.Linked_List;
import modelo.Modelo_Asistencia;
import modelo.Modelo_Trabajadores;
import vista.Emergente_Aviso;
import vista.Panel_Inventario;
import vista.Panel_Resumen;
import vista.Panel_Ventas;
import vista.Ventana_Login;
import vista.Ventana_Trabajador;

public class Controlador_trabajador implements ActionListener {

    public Ventana_Trabajador ventanaTrabajador;
    public Ventana_Login view_login;
    
    public Modelo_Trabajadores model_user;
    public Modelo_Trabajadores modelo_Trabajador_Actual;
    
    public Consultas_Trabajadores consultas_login;
    
    public Controlador_login ctrl_login;
    public Controlador_Resumen ctrl_resumen;
    public Controlador_Almacen ctrl_almacen;
    public Controlador_Ventas controlador_Ventas;
    
    public Panel_Resumen panel_resumen;
    public Panel_Inventario panel_almacen;
    public Panel_Ventas panel_ventas;
    

    public Controlador_trabajador(Ventana_Trabajador ventanaTrabajador, Modelo_Trabajadores model_user) {// Falta instanciar las demas variables a usar
        this.ventanaTrabajador = ventanaTrabajador;
        this.model_user = model_user;
        this.llamarComponentes();
        limpiarSpContent();
        panel_almacen = new Panel_Inventario();
        ctrl_almacen = new Controlador_Almacen(this, this.ventanaTrabajador);
        ventanaTrabajador.administrarPanel(this.ventanaTrabajador.spContent, panel_almacen);
        
        //temporal
        ventanaTrabajador.menuTrabajador.btnInicio.setVisible(false);
       
    }

    private void llamarComponentes() {
        ventanaTrabajador.menuTrabajador.btnInicio.addActionListener(this);
        ventanaTrabajador.menuTrabajador.btnCerrarSesion.addActionListener(this);
        ventanaTrabajador.menuTrabajador.btnVentas.addActionListener(this);
        ventanaTrabajador.menuTrabajador.btnAlmacen.addActionListener(this);
        ventanaTrabajador.menuNotificaciones.customButtonMarcar2.addActionListener(this);
        ventanaTrabajador.menuNotificaciones.btnConexion.addActionListener(this);
        String dni = this.model_user.getDni();
        String fecha = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
        System.out.println(fecha + " " + dni);
        if (verificacionAsistencia(fecha, dni)) {
            this.ventanaTrabajador.menuNotificaciones.customButtonMarcar2.setMarcarDisp(false);
        } else {
            this.ventanaTrabajador.menuNotificaciones.customButtonMarcar2.setMarcarDisp(true);
        }
        //Agrega el nombre y apellido a la esquina superior derecha
        modelo_Trabajador_Actual = (Modelo_Trabajadores) lista_trabajadores.get(lista_trabajadores.findTrabajador(lista_trabajadores, this.model_user.getDni()));
        String nombre_apellido = ((Modelo_Trabajadores) lista_trabajadores.get(lista_trabajadores.findTrabajador(lista_trabajadores, this.model_user.getDni()))).getNombre();
        nombre_apellido = nombre_apellido + " " + ((Modelo_Trabajadores) lista_trabajadores.get(lista_trabajadores.findTrabajador(lista_trabajadores, this.model_user.getDni()))).getApellido();
        ventanaTrabajador.menuNotificaciones.perfil_Usuario1.lblEditUser.setText(nombre_apellido);
    }

    public Ventana_Trabajador getVentanaTrabajador() {
        return ventanaTrabajador;
    }

    public void setVentanaTrabajador(Ventana_Trabajador ventanaTrabajador) {
        this.ventanaTrabajador = ventanaTrabajador;
    }

    public Modelo_Trabajadores getModel_user() {
        return model_user;
    }

    public void setModel_user(Modelo_Trabajadores model_user) {
        this.model_user = model_user;
    }

    public Ventana_Login getView_login() {
        return view_login;
    }

    public void setView_login(Ventana_Login view_login) {
        this.view_login = view_login;
    }

    public Consultas_Trabajadores getConsultas_login() {
        return consultas_login;
    }

    public void setConsultas_login(Consultas_Trabajadores consultas_login) {
        this.consultas_login = consultas_login;
    }

    public Controlador_login getCtrl_login() {
        return ctrl_login;
    }

    public void setCtrl_login(Controlador_login ctrl_login) {
        this.ctrl_login = ctrl_login;
    }

    public Controlador_Resumen getCtrl_resumen() {
        return ctrl_resumen;
    }

    public void setCtrl_resumen(Controlador_Resumen ctrl_resumen) {
        this.ctrl_resumen = ctrl_resumen;
    }

    public Controlador_Ventas getControlador_Ventas_Trabajador() {
        return controlador_Ventas;
    }

    public void setControlador_Ventas_Trabajador(Controlador_Ventas controlador_Ventas_Trabajador) {
        this.controlador_Ventas = controlador_Ventas_Trabajador;
    }

    public Panel_Resumen getPanel_resumen() {
        return panel_resumen;
    }

    public void setPanel_resumen(Panel_Resumen panel_resumen) {
        this.panel_resumen = panel_resumen;
    }

    public Panel_Ventas getPanel_ventas() {
        return panel_ventas;
    }

    public void setPanel_ventas(Panel_Ventas panel_ventas) {
        this.panel_ventas = panel_ventas;
    }

    public Modelo_Trabajadores getModelo_Trabajador_Actual() {
        return modelo_Trabajador_Actual;
    }

    public void setModelo_Trabajador_Actual(Modelo_Trabajadores modelo_Trabajador_Actual) {
        this.modelo_Trabajador_Actual = modelo_Trabajador_Actual;
    }

    private void limpiarSpContent() {
        this.panel_ventas = null;
        this.panel_resumen = null;
        this.panel_almacen = null;
    }

    private void  marcarAsistencia(){
         String dni = this.model_user.getDni();
            String fecha = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
            if (verificacionAsistencia(fecha, dni)) {
                this.ventanaTrabajador.menuNotificaciones.customButtonMarcar2.setMarcarDisp(false);
            } else {
                Consultas_Asistencia consultas = new Consultas_Asistencia();
                String hora_entrada = new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime());
                Modelo_Asistencia temp_model = new Modelo_Asistencia();
                temp_model.setDni(dni);
                temp_model.setFecha(fecha);
                temp_model.setHora_entrada(hora_entrada);
                if (consultas.create(temp_model)) {
                    lista_asistencia = consultas.readAll();
                    mensaje("SE MARCO ASISTENCIA CON EXITO");
                    this.ventanaTrabajador.menuNotificaciones.customButtonMarcar2.setMarcarDisp(false);
                } else {
                    mensaje("ERROR AL MARCAR ASISTENCIA");
                }
            }
    }
    
    public boolean isInternetAvailable() {
        boolean conexion = false;
        String dirWeb = "www.google.com";
        int puerto = 80;
        Socket s;
        try {
            s = new Socket(dirWeb, puerto);
            if(s.isConnected()){
                conexion = true;
            }
        } catch (IOException ex) {
            conexion = false;
        }
        return conexion;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.ventanaTrabajador.menuNotificaciones.customButtonMarcar2) {
           Thread hilo = new Thread(){
                @Override
                public void run() {
                   marcarAsistencia();
                   return ;
                }
            };
            hilo.start();
        }
        if (e.getSource() == ventanaTrabajador.menuTrabajador.btnVentas) {
            limpiarSpContent();
            panel_ventas = new Panel_Ventas();
            controlador_Ventas = new Controlador_Ventas(this, this.ventanaTrabajador);
            ventanaTrabajador.administrarPanel(this.ventanaTrabajador.spContent, panel_ventas);
        } else if (e.getSource() == ventanaTrabajador.menuTrabajador.btnInicio) {
            limpiarSpContent();
            panel_resumen = new Panel_Resumen();
            ctrl_resumen = new Controlador_Resumen(this.ventanaTrabajador, this);
            ventanaTrabajador.administrarPanel(this.ventanaTrabajador.spContent, panel_resumen);
        }else if (e.getSource() == ventanaTrabajador.menuTrabajador.btnAlmacen) { // Reinstancia la ventana de login, permitiendo otro inicio de sesion
            limpiarSpContent();
            panel_almacen = new Panel_Inventario();
            ctrl_almacen = new Controlador_Almacen(this, this.ventanaTrabajador);
            ventanaTrabajador.administrarPanel(this.ventanaTrabajador.spContent, panel_almacen);
        } else if (e.getSource() == ventanaTrabajador.menuTrabajador.btnCerrarSesion) { // Reinstancia la ventana de login, permitiendo otro inicio de sesion
            limpiarSpContent();
            cerrarSesion();
        }else if(e.getSource() == ventanaTrabajador.menuNotificaciones.btnConexion){
                if(isInternetAvailable()){
                    mensaje("USTED TIENE CONEXION");
                }else{
                    mensaje("USTED NO DISPONE DE CONEXION");
                }
        }

    }

    private boolean verificacionAsistencia(String fecha, String dni) {
        if (lista_asistencia != null) {
            Linked_List.ResultadoDNITrabajador resultado = Controlador_login.lista_trabajadores.findDNI(Controlador_login.lista_trabajadores, dni);
            if (resultado.isResultado()) {
                for (int i = 0; i < lista_asistencia.size(); i++) {
                    if (((Modelo_Asistencia) lista_asistencia.get(i)).getDni().compareTo(dni) == 0 && ((Modelo_Asistencia) lista_asistencia.get(i)).getFecha().equals(fecha)) {
                        return true;
                    }
                }
            } else {
                return false;
            }

        } else {
            return false;
        }
        return false;
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

    public void mensaje(String texto) {
        Emergente_Aviso mensaje = new Emergente_Aviso(this.ventanaTrabajador, true, texto);
        mensaje.setVisible(true);
    }
}
