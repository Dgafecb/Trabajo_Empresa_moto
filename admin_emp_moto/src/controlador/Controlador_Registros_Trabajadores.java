package controlador;

import static controlador.Controlador_login.lista_asistencia;
import static controlador.Controlador_login.lista_trabajadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.Consultas_Asistencia;
import modelo.Consultas_Trabajadores;
import modelo.Linked_List;
import modelo.Modelo_Asistencia;
import modelo.Modelo_Trabajadores;
import vista.Emergente_Aviso;
import vista.Panel_Registros_Trabajadores;
import vista.Ventana_Admin;


public class Controlador_Registros_Trabajadores implements ActionListener{
    
    
    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Registros_Trabajadores panelRegistrosTrabajadores;
    private LinkedList<Modelo_Trabajadores> trabajadores;
    private LinkedList<Modelo_Asistencia> asistencia;

    public Controlador_Registros_Trabajadores(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin, Panel_Registros_Trabajadores panelRegistrosTrabajadores) {
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
        this.panelRegistrosTrabajadores = panelRegistrosTrabajadores;
        iniciarComponentes();
        updateComp();
        llamarComponentes();
    }
    
    
    private void iniciarComponentes() {
        trabajadores = lista_trabajadores;
        asistencia = lista_asistencia;

    }
    
    private void updateComp(){
        fillTablelAsistencia(asistencia);
        fillTableTrabajadores(trabajadores);
    }

    private void llamarComponentes() {
        panelRegistrosTrabajadores.btnTrabajadorAgregar.addActionListener(this);
        panelRegistrosTrabajadores.btnTrabajadorModificar.addActionListener(this);
        panelRegistrosTrabajadores.btnTrabajadorBorrar.addActionListener(this);
        panelRegistrosTrabajadores.btnAsistenciaAgregar.addActionListener(this);
        panelRegistrosTrabajadores.btnAsistenciaModificar.addActionListener(this);
        panelRegistrosTrabajadores.btnAsistenciaBuscar.addActionListener(this);
        panelRegistrosTrabajadores.btnAsistenciaBorrar.addActionListener(this);
        
    }
    
    private boolean agregarTrabajador(){
        return false;
    }
    
    private boolean modificarTrabajador(){
        return false;
    }
    
    private boolean eliminarTrabajador(){
        return false;
    }
    
    private void buscarTrabajador(String referencia, int i){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorAgregar) { // boton Agregar del Panel Registro Trabajadores

        }else if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorModificar) { // boton Actualizar del Panel Registro Trabajadores
            
        }else if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorBorrar) {//boton elimnar del panel Registro trabajadores

        }
        
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnAsistenciaAgregar) {// boton agregar del panel Registro asistencia
            Consultas_Asistencia consultasAsistencia = new Consultas_Asistencia();
            Modelo_Asistencia temp_model = this.PanelRegistroAsistencia();
            if (consultasAsistencia.create(temp_model) == true) {
                System.out.println("Se agrego el registro de asistencia");
            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo agregar al registro");
                mensaje.setVisible(true);
            }
            lista_asistencia = consultasAsistencia.readAll();
            updateComp();

        }
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnAsistenciaModificar) {// boton eliminar del panel Registro asistencia
            if (this.panelRegistrosTrabajadores.jTable1.getSelectionModel().isSelectionEmpty() == false) {
                Modelo_Asistencia temp_model = this.PanelRegistroAsistencia();
                String tempdni = (String) this.panelRegistrosTrabajadores.jTable1.getValueAt(this.panelRegistrosTrabajadores.jTable1.getSelectedRow(), 1);   //             
                Consultas_Asistencia consultasAsistencia = new Consultas_Asistencia();
                int index_seleccionado = lista_asistencia.findAsistencia(lista_asistencia, tempdni);//consigo el indice del id
                temp_model.setId(((Modelo_Asistencia) lista_asistencia.get(index_seleccionado)).getId());

                if (consultasAsistencia.update(temp_model)) {
                    System.out.println("Se actualizo el registro");
                    lista_asistencia.remove(index_seleccionado);
                    lista_asistencia.add(index_seleccionado, temp_model);
                    updateComp();

                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo actualizar el registro");
                    mensaje.setVisible(true);
                }

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Selecciona una fila de la tabla asistencia para modificar");
                mensaje.setVisible(true);
            }
        }
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnAsistenciaBuscar) {//boton buscar panel Registro asistencia

            String temp_dni = this.panelRegistrosTrabajadores.jTextField4.getText();
            Linked_List<Modelo_Asistencia> temp_model = new Linked_List<>();
            Linked_List.ResultadoListaAsistenciaDNI resultadoBusqueda = lista_asistencia.findAsistenciaList(lista_asistencia, temp_dni);
            LinkedList<Integer> dnis = resultadoBusqueda.getTemp();//obtiene la lista de indices donde el dni coincide
            boolean dni_encontrado = resultadoBusqueda.isFunciona();
            if (dni_encontrado) {
                for (int i = 0; i < dnis.size(); i++) {
                    temp_model.add((Modelo_Asistencia) lista_asistencia.get(dnis.get(i)));
                }
                DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "DNI", "Fecha", "Hora de Entrada"}, 0);
                int id;
                String dni;
                String fecha;
                String hora_entrada;
                for (int i = 0; i < temp_model.size(); i++) {
                    id = ((Modelo_Asistencia) temp_model.get(i)).getId();
                    dni = ((Modelo_Asistencia) temp_model.get(i)).getDni();
                    fecha = ((Modelo_Asistencia) temp_model.get(i)).getFecha();
                    hora_entrada = ((Modelo_Asistencia) temp_model.get(i)).getHora_entrada();
                    model.addRow(new Object[]{id, dni, fecha, hora_entrada});
                }

                this.panelRegistrosTrabajadores.jTable1.setModel(model);
            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontr・el DNI");
                mensaje.setVisible(true);
            }

        }
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnAsistenciaBorrar) {//boton eliminar del panel Registro asistencia
            if (this.panelRegistrosTrabajadores.jTable1.getSelectionModel().isSelectionEmpty() == false) {
                Modelo_Asistencia temp_model = new Modelo_Asistencia();
                String tempdni = (String) this.panelRegistrosTrabajadores.jTable1.getValueAt(this.panelRegistrosTrabajadores.jTable1.getSelectedRow(), 1);   //             
                Consultas_Asistencia consultaEliminar = new Consultas_Asistencia();
                int index_seleccionado = lista_asistencia.findAsistencia(lista_asistencia, tempdni);//consigo el indice del id

                temp_model.setId(((Modelo_Asistencia) lista_asistencia.get(index_seleccionado)).getId());

                Thread hilo_consulta_tabla = new Thread() {
                    @Override
                    public void run() {
                        if (consultaEliminar.delete(temp_model)) {
                            System.out.println("Se elimino el registro");
                        } else {
                            Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo eliminar el registro");
                            mensaje.setVisible(true);
                        }

                    }
                };
                lista_asistencia.remove(index_seleccionado);
                hilo_consulta_tabla.start();
                updateComp();

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Selecciona una fila a eliminar de la tabla asistencia");
                mensaje.setVisible(true);
            }
        }
    }
    
    public Modelo_Asistencia PanelRegistroAsistencia() {
        Modelo_Asistencia modelo_asistencia = new Modelo_Asistencia();
        if (this.panelRegistrosTrabajadores.txfDatosDNI.getText().length() == 8) {
            modelo_asistencia.setDni(this.panelRegistrosTrabajadores.txfDatosDNI.getText());
            }
        String[] temp_fecha = this.panelRegistrosTrabajadores.txfDatosFecha.getText().split("/");
        modelo_asistencia.setFecha(temp_fecha[0] + temp_fecha[1] + temp_fecha[2]);
        String[] temp_hora = this.panelRegistrosTrabajadores.txfDatosHora.getText().split(":");
        modelo_asistencia.setHora_entrada(temp_hora[0] + temp_hora[1] + temp_hora[2]);
        return modelo_asistencia;
    }
    
    
    
    public void fillTablelAsistencia(LinkedList<Modelo_Asistencia> listaAsistencia) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "DNI TRABAJADOR", "FECHA", "HORA REGISTRADA"}, 0){
            
            @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    case 0: return false;
                    case 1: return false;
                    default:return true;
                }
            }
        };
        for (int i = 0; i < listaAsistencia.size(); i++) {
            int id = listaAsistencia.get(i).getId();
            String dni = listaAsistencia.get(i).getDni();
            String fecha = listaAsistencia.get(i).getFecha();
            fecha = fecha.substring(0, 2) + "/" + fecha.substring(2, 4) + "/" + fecha.substring(4, fecha.length());
            String hora_entrada = listaAsistencia.get(i).getHora_entrada();
            hora_entrada = hora_entrada.substring(0, 2) + ":" + hora_entrada.substring(2, 4) + ":" + hora_entrada.substring(4, hora_entrada.length());
            model.addRow(new Object[]{id, dni, fecha, hora_entrada});
        }
        
        panelRegistrosTrabajadores.jTable1.setModel(model);
        
        //CONFIGURACION DE TABLA
        JTableHeader jtableHeader = new JTableHeader();
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) panelRegistrosTrabajadores.jTable1.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        jtableHeader.setDefaultRenderer(render);
        
        DefaultTableCellRenderer tcrCenter = new DefaultTableCellRenderer();
        tcrCenter.setHorizontalAlignment(SwingConstants.CENTER);
        panelRegistrosTrabajadores.jTable1.getColumnModel().getColumn(0).setCellRenderer(tcrCenter);
        panelRegistrosTrabajadores.jTable1.getColumnModel().getColumn(1).setCellRenderer(tcrCenter);
        panelRegistrosTrabajadores.jTable1.getColumnModel().getColumn(2).setCellRenderer(tcrCenter);
        panelRegistrosTrabajadores.jTable1.getColumnModel().getColumn(3).setCellRenderer(tcrCenter);
        
        panelRegistrosTrabajadores.jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        panelRegistrosTrabajadores.jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        panelRegistrosTrabajadores.jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        panelRegistrosTrabajadores.jTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        
        
        
    }

    public void fillTableTrabajadores(LinkedList<Modelo_Trabajadores> listaTrabajadores) { // devuelve un modelo para el Jtable Trabajadores
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID","DNI","PASSWORD","NOMBRES",
            "APELLIDOS", "PRIVILEGIO","FECHA DE CREACION" ,"SUELDO"}, 0);
        for (int i = 0; i < listaTrabajadores.size(); i++) {
            String ID = String.valueOf(listaTrabajadores.get(i).getId()).toUpperCase();
            String DNI = listaTrabajadores.get(i).getDni().toUpperCase();
            String password = listaTrabajadores.get(i).getPassword();
            String nombres = listaTrabajadores.get(i).getNombre().toUpperCase();
            String apellidos = listaTrabajadores.get(i).getApellido().toUpperCase();
            int privilege = listaTrabajadores.get(i).getPrivilege();
            String privilegio;
            if (privilege == 0) {
                privilegio = "TRABAJADOR";
            } else {
                privilegio = "ADMIN";
            }
            String fecha = listaTrabajadores.get(i).getFecha_creacion();
            
            Float sueldo = listaTrabajadores.get(i).getSueldo();
            model.addRow(new Object[]{ID, DNI,password,nombres,apellidos, privilegio,fecha, sueldo});
        }
        panelRegistrosTrabajadores.jTable2.setModel(model);
    }
    
    private void message(String msg){
        Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, msg);
        mensaje.setVisible(true);
    }
    
}
