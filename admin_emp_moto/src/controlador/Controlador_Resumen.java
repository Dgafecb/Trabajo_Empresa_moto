package controlador;

import static controlador.Controlador_login.lista_asistencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Consultas_Asistencia;
import modelo.Consultas_Ventas;
import modelo.Linked_List;
import modelo.Modelo_Asistencia;
import modelo.Modelo_Trabajadores;
import modelo.Modelo_Ventas;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import vista.Emergente_Aviso;
import vista.Panel_Resumen;
import vista.Ventana_Trabajador;

public class Controlador_Resumen implements ActionListener {

    private Ventana_Trabajador ventana_trabajador;
    private Controlador_trabajador controlador_Trabajador;
    private Consultas_Ventas consultas_ventas;
    private Modelo_Ventas modelo_Ventas;
    private Panel_Resumen panel_Resumen;
    private LinkedList<Modelo_Ventas> lista_Ventas;
    private LinkedList<Modelo_Ventas> listaVentasTrabajador;

    public Controlador_Resumen() {

    }

    public Controlador_Resumen(Ventana_Trabajador ventana_trabajador, Controlador_trabajador controlador_Trabajador) {
        this.ventana_trabajador = ventana_trabajador;
        this.controlador_Trabajador = controlador_Trabajador;
        iniciarComponentes();
        llamarComponentes();
        iniciarGrafica();
        iniciarTabla();
    }

    private void iniciarComponentes() {
        this.panel_Resumen = this.controlador_Trabajador.panel_resumen;
        int id_trabajador = Integer.parseInt(controlador_Trabajador.modelo_Trabajador_Actual.getDni());
        this.listaVentasTrabajador = crearListaTrabajadores(this.lista_Ventas, id_trabajador);
        String dni = this.controlador_Trabajador.model_user.getDni();
        String fecha = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
        if (verificacionAsistencia(fecha, dni)) {
            this.panel_Resumen.customButtonShaped1.setEnabled(false);
        }
    }

    private void llamarComponentes() {
        this.panel_Resumen.customButtonShaped1.addActionListener(this);
        System.out.println("bandera0");
    }

    private void iniciarGrafica() {

    }

    private LinkedList<Modelo_Ventas> crearListaTrabajadores(LinkedList<Modelo_Ventas> listaVentas, int id_trabajador) {
        LinkedList<Modelo_Ventas> listaxTrabajador = new LinkedList<Modelo_Ventas>();
        if (listaVentasTrabajador != null) {
            for (int i = 0; i < listaVentas.size(); i++) {
                if (listaVentas.get(i).getId_trabajador() == id_trabajador) {
                    listaVentasTrabajador.add(listaVentas.get(i));
                }
            }
        } else {
            listaxTrabajador = null;
        }

        return listaxTrabajador;
    }

    private void actualizarGrafica(LinkedList<Modelo_Ventas> listaVentasTrabajador) {
        if (listaVentasTrabajador != null) {
            TimeSeriesCollection dataset = new TimeSeriesCollection();
            TimeSeries series1 = new TimeSeries("Linea de Venta");
            SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            Double valortemp = 0.0;

            Date date = null;
            for (int i = 0; i < listaVentasTrabajador.size(); i++) {
                String dia = listaVentasTrabajador.get(i).getFecha_hora().substring(0, 2);
                String mes = listaVentasTrabajador.get(i).getFecha_hora().substring(2, 4);
                String anho = listaVentasTrabajador.get(i).getFecha_hora().substring(4, 8);
                String hora = listaVentasTrabajador.get(i).getFecha_hora().substring(9, 11);
                String min = listaVentasTrabajador.get(i).getFecha_hora().substring(11, 13);
                String seg = listaVentasTrabajador.get(i).getFecha_hora().substring(13, 15);
                String fecha = dia + "/" + mes + "/" + anho + " " + hora + ":" + min + ":" + seg;
                try {
                    date = dateformat.parse(fecha);
                } catch (ParseException ex) {
                    Logger.getLogger(Panel_Resumen.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (series1.getValue(new Day(date)) != null) {
                    valortemp = (Double) series1.getValue(new Day(date)) + 1.0;
                } else {
                    valortemp = (Double) 1.0;
                }

                series1.addOrUpdate(new Day(date), valortemp);
            }
            dataset.addSeries(series1);
            panel_Resumen.database = dataset;
        } else {
            //DEFAULT
        }

    }

    private void iniciarTabla() {

    }

    private void actualizarTabla() {

    }

    private boolean verificacionAsistencia(String fecha, String dni) {

       

        if (lista_asistencia != null) {
            Linked_List.ResultadoDNITrabajador resultado = Controlador_login.lista_trabajadores.findDNI(Controlador_login.lista_trabajadores, dni);
            if (resultado.isResultado()) {
                for (int i = 0; i < lista_asistencia.size(); i++) {
                    if (((Modelo_Asistencia) lista_asistencia.get(i)).getDni().compareTo(dni)==0 && ((Modelo_Asistencia) lista_asistencia.get(i)).getFecha().equals(fecha)) {
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

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.panel_Resumen.customButtonShaped1) {//Boton marcar asistencia
            String dni = this.controlador_Trabajador.model_user.getDni();
            String fecha = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());
            System.out.println(fecha+" "+dni);
            if (verificacionAsistencia(fecha, dni)) {
                this.panel_Resumen.customButtonShaped1.setEnabled(false);
                mensaje("Ya marcó asistencia");
                System.out.println("bandera2");
            } else {
                Consultas_Asistencia consultas = new Consultas_Asistencia();
                String hora_entrada = new SimpleDateFormat("HHmmss").format(Calendar.getInstance().getTime());
                Modelo_Asistencia temp_model = new Modelo_Asistencia();
                temp_model.setDni(dni);
                temp_model.setFecha(fecha);
                temp_model.setHora_entrada(hora_entrada);
                if (consultas.create(temp_model)) {
                    lista_asistencia = consultas.readAll();
                    mensaje("Logró marcar asistencia");
                    this.panel_Resumen.customButtonShaped1.setEnabled(false);
                    System.out.println("bandera3");
                } else {
                    mensaje("No pudo marcar asistencia");
                    System.out.println("bandera4");
                }

            }

        }
    }

    public void mensaje(String texto) {
        Emergente_Aviso mensaje = new Emergente_Aviso(ventana_trabajador, true, texto);
        mensaje.setVisible(true);
    }
}
