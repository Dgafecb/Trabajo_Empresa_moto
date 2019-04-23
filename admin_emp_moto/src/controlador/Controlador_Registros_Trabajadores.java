package controlador;

import static controlador.Controlador_login.lista_asistencia;
import static controlador.Controlador_login.lista_clientes;
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
import modelo.Consultas_Clientes;
import modelo.Consultas_Trabajadores;
import modelo.Linked_List;
import modelo.Modelo_Asistencia;
import modelo.Modelo_Trabajadores;
import vista.Emergente_Aviso;
import vista.Emergente_Panel_RClientes;
import vista.Emergente_Panel_RTrabajador;
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
        panelRegistrosTrabajadores.btnClienteBuscar.addActionListener(this);
        panelRegistrosTrabajadores.btnTrabajadorAgregar.addActionListener(this);
        panelRegistrosTrabajadores.btnTrabajadorModificar.addActionListener(this);
        panelRegistrosTrabajadores.btnTrabajadorBorrar.addActionListener(this);
        panelRegistrosTrabajadores.btnAsistenciaModificar.addActionListener(this);
        panelRegistrosTrabajadores.btnAsistenciaBorrar.addActionListener(this);
        
        
    }
    
    public void fillTableTrabajadores(LinkedList<Modelo_Trabajadores> listaTrabajadores) { 
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID","DNI","PASSWORD","NOMBRES",
            "APELLIDOS", "PRIVILEGIO","FECHA DE CREACION" ,"SUELDO"}, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    case 0:
                        return false;
                    default:
                        return true;
                }
            }
        };
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
    
    private boolean agregarTrabajador(){
        Emergente_Panel_RTrabajador panel = new Emergente_Panel_RTrabajador(ventanaAdmin, true);
        panel.setVisible(true);
        LinkedList<String> lista_agregada = panel.listatrabajadores;
        if (lista_agregada != null) {
            Modelo_Trabajadores modelo = new Modelo_Trabajadores();
            String DNI = panel.listatrabajadores.get(0).toUpperCase();
            String password = panel.listatrabajadores.get(1);
            String nombre = panel.listatrabajadores.get(2);
            String apellidos = panel.listatrabajadores.get(3);
            Float sueldo = Float.valueOf(panel.listatrabajadores.get(4));
            Integer privilegio = Integer.valueOf(panel.listatrabajadores.get(5));
            
            Calendar c = Calendar.getInstance();
            SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
            String fechaCreacion = dateformat.format(c.getTime());
            System.out.println(fechaCreacion);
            
            modelo.setDni(DNI);
            modelo.setPassword(password);
            modelo.setNombre(nombre);
            modelo.setApellido(apellidos);
            modelo.setPrivilege(privilegio);
            modelo.setSueldo(sueldo);
            modelo.setFecha_creacion(fechaCreacion);
            
            if(lista_trabajadores.findTrabajador(lista_trabajadores, DNI)!=0){
                mensaje("EL DNI DEL USUARIO YA ESTA EN USO");
                return false;
                
            }
            Consultas_Trabajadores consultas = new Consultas_Trabajadores();
            if (consultas.create(modelo)) {
                lista_trabajadores.add(modelo);
                fillTableTrabajadores(lista_trabajadores);
                return true;
            } else {
                mensaje("NO SE PUEDO CREAR UN NUEVO USUARIO");

            }
        }
        return false;
    }
    
    private boolean modificarTrabajador(){
        
        
        
        
        return false;
    }
    
    private boolean eliminarTrabajador(){
        return false;
    }
    
    private void buscarTrabajador(String referencia, int numero){
        switch(numero){
            case 1 :{
                Linked_List<Modelo_Trabajadores> listaBusqueda = new Linked_List<Modelo_Trabajadores> (); 
                int tamanho = trabajadores.size();
                for (int i = 0 ; i < tamanho ; i++){
                    int tamanhoRef = trabajadores.get(i).getDni().length()+1;
                    String palabra = trabajadores.get(i).getDni();
                    for(int j = 1 ; j<tamanhoRef ;j++){
                        if(referencia.equalsIgnoreCase(palabra)){
                            // BUSQUEDA PERFECTA CODIGO AQUI
                            System.out.print("perfecto");
                            listaBusqueda.add(trabajadores.get(i));
                            break;
                        }else if(referencia.equalsIgnoreCase(palabra.substring(0, j))){
                            listaBusqueda.add(trabajadores.get(i));
                            break;
                        }
                    }
                }
                if(listaBusqueda.size()>0){
                    fillTableTrabajadores(listaBusqueda);
                }else{
                    mensaje("NO SE ENCONTRARON COINCIDENCIAS");
                    panelRegistrosTrabajadores.txfBuscar1.setText("");
                    fillTableTrabajadores(trabajadores);
                }
                
                break;
            }
            default : break;
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorAgregar) { 
            Thread hilo = new Thread(){
                @Override
                public void run() {
                   if(agregarTrabajador()) mensaje("OPERACION REALIZADA");
                   else mensaje("OPERACION FALLIDA");
                    return ;
                }
            };
            hilo.start();
        }else if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorModificar) { 
            
        }else if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorBorrar) {

        }else if (ae.getSource() == this.panelRegistrosTrabajadores.btnClienteBuscar){
            buscarTrabajador(panelRegistrosTrabajadores.txfBuscar1.getText(),1);
            
        }else if (ae.getSource() == this.panelRegistrosTrabajadores.btnAsistenciaModificar) {// boton editar del panel Registro asistencia
            
        }else if (ae.getSource() == this.panelRegistrosTrabajadores.btnAsistenciaBorrar) {//boton eliminar del panel Registro asistencia
            
        }
    }
    

    
    


    
    private void mensaje(String msg){
        Emergente_Aviso message = new Emergente_Aviso(ventanaAdmin, true, msg);
        message.setVisible(true);
    }
    
}
