package controlador;

import static controlador.Controlador_login.lista_ajustes;
import static controlador.Controlador_login.lista_asistencia;
import static controlador.Controlador_login.lista_clientes;
import static controlador.Controlador_login.lista_trabajadores;
import static controlador.Controlador_login.lista_ventas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import modelo.Consultas_Asistencia;
import modelo.Consultas_Clientes;
import modelo.Consultas_Trabajadores;
import modelo.Consultas_Ventas;
import modelo.Exporter;
import modelo.Linked_List;
import modelo.Modelo_Ajustes;
import modelo.Modelo_Asistencia;
import modelo.Modelo_Trabajadores;
import modelo.Modelo_Ventas;
import vista.Emergente_Aviso;
import vista.Emergente_Panel_RClientes;
import vista.Emergente_Panel_RTrabajador;
import vista.Panel_Registros_Trabajadores;
import vista.Ventana_Admin;

public class Controlador_Registros_Trabajadores implements ActionListener, MouseListener {

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
        panelRegistrosTrabajadores.btnAsistenciaModificar.setVisible(false);
        panelRegistrosTrabajadores.btnAsistenciaBorrar.setVisible(false);

    }

    private void updateComp() {
        fillTableAsistencia(asistencia);
        fillTableTrabajadores(trabajadores);
    }

    private void llamarComponentes() {
        panelRegistrosTrabajadores.btnClienteBuscar.addActionListener(this);
        panelRegistrosTrabajadores.btnTrabajadorAgregar.addActionListener(this);
        panelRegistrosTrabajadores.btnTrabajadorModificar.addActionListener(this);
        panelRegistrosTrabajadores.btnTrabajadorBorrar.addActionListener(this);
        panelRegistrosTrabajadores.btnAsistenciaModificar.addActionListener(this);
        panelRegistrosTrabajadores.btnAsistenciaBorrar.addActionListener(this);
        panelRegistrosTrabajadores.btnTrabajadorAgregar1.addActionListener(this);
        panelRegistrosTrabajadores.btnTrabajadorAgregar2.addActionListener(this);
        panelRegistrosTrabajadores.jTable2.addMouseListener(this);

        //TEMPORAL
    }

    public void fillTableTrabajadores(LinkedList<Modelo_Trabajadores> listaTrabajadores) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "DNI", "PASSWORD", "NOMBRES",
            "APELLIDOS", "PRIVILEGIO", "FECHA DE CREACION", "SUELDO"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    case 0:
                        return false;
                    case 1:
                        return false;
                    case 5:
                        return false;
                    case 6:
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
            model.addRow(new Object[]{ID, DNI, password, nombres, apellidos, privilegio, fecha, sueldo});
        }
        panelRegistrosTrabajadores.jTable2.setModel(model);
    }

    public void fillTableAsistencia(LinkedList<Modelo_Asistencia> listaAsistencia) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "DNI TRABAJADOR", "FECHA", "HORA REGISTRADA"}, 0) {

            @Override
            public boolean isCellEditable(int row, int column) {
                switch (column) {
                    case 0:
                        return false;
                    case 1:
                        return false;
                    case 2:
                        return false;
                    case 3:
                        return false;
                    default:
                        return true;
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

    private boolean agregarTrabajador() {
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
            String temp_privilegio = panel.listatrabajadores.get(5);
            Integer privilegio;
            if (temp_privilegio.compareToIgnoreCase("ADMIN") == 0) {
                privilegio = 2;
            } else {
                privilegio = 0;
            }

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

            if (lista_trabajadores.findTrabajador(lista_trabajadores, DNI) != 0) {
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

    private boolean modificarTrabajador() {
        if (this.panelRegistrosTrabajadores.jTable2.getSelectionModel().isSelectionEmpty() == false) {
            if (this.panelRegistrosTrabajadores.jTable2.isEditing()) {
                this.panelRegistrosTrabajadores.jTable2.getCellEditor().stopCellEditing();
                Modelo_Trabajadores modelo = new Modelo_Trabajadores();

                Integer id = Integer.valueOf(this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 0).toString());
                String DNI = (String) this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 1);
                String password = (String) this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 2);
                String nombre = (String) this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 3);
                String apellidos = (String) this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 4);
                Integer privilegio;
                String temp_privilegio = this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 5).toString();
                if (temp_privilegio.compareToIgnoreCase("ADMIN") == 0) {
                    privilegio = 2;
                } else {
                    privilegio = 0;
                }
                String fechaCreacion = (String) this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 6);
                Float sueldo = Float.valueOf(this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 7).toString());

                modelo.setId(id);
                modelo.setDni(DNI);
                modelo.setPassword(password);
                modelo.setNombre(nombre);
                modelo.setApellido(apellidos);
                modelo.setPrivilege(privilegio);
                modelo.setSueldo(sueldo);
                modelo.setFecha_creacion(fechaCreacion);
                Consultas_Trabajadores consultas = new Consultas_Trabajadores();
                if (consultas.update(modelo)) {
                    lista_trabajadores.add(modelo);
                    int index = (lista_trabajadores.findIDTrabajador(lista_trabajadores, String.valueOf(id)));
                    lista_trabajadores.remove(index);
                    lista_trabajadores.add(index, modelo);
                    fillTableTrabajadores(lista_trabajadores);
                    return true;
                } else {
                    mensaje("NO SE PUEDE ACTUALIZAR TRABAJADOR");

                }
            }
        }
        return false;
    }

    private boolean eliminarTrabajador() {

        if (panelRegistrosTrabajadores.jTable2.getSelectionModel().isSelectionEmpty() == false) {
            String temp_id = (String) this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 0);
            int index = lista_trabajadores.findIDTrabajador(lista_trabajadores, temp_id);
            if (index == -1) {
                return false;
            } else {
                Modelo_Trabajadores temp_model = new Modelo_Trabajadores();
                temp_model.setId(((Modelo_Trabajadores) lista_trabajadores.get(index)).getId());
                Consultas_Trabajadores consultas = new Consultas_Trabajadores();
                if (consultas.delete(temp_model)) {
                    lista_trabajadores.remove(index);
                    fillTableTrabajadores(lista_trabajadores);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    private void buscarTrabajador(String referencia, int numero) {
        switch (numero) {
            case 1: {
                Linked_List<Modelo_Trabajadores> listaBusqueda = new Linked_List<Modelo_Trabajadores>();
                int tamanho = trabajadores.size();
                for (int i = 0; i < tamanho; i++) {
                    int tamanhoRef = trabajadores.get(i).getDni().length() + 1;
                    String palabra = trabajadores.get(i).getDni();
                    for (int j = 1; j < tamanhoRef; j++) {
                        if (referencia.equalsIgnoreCase(palabra)) {
                            // BUSQUEDA PERFECTA CODIGO AQUI
                            System.out.print("perfecto");
                            listaBusqueda.add(trabajadores.get(i));
                            break;
                        } else if (referencia.equalsIgnoreCase(palabra.substring(0, j))) {
                            listaBusqueda.add(trabajadores.get(i));
                            break;
                        }
                    }
                }
                if (listaBusqueda.size() > 0) {
                    fillTableTrabajadores(listaBusqueda);
                } else {
                    mensaje("NO SE ENCONTRARON COINCIDENCIAS");
                    panelRegistrosTrabajadores.txfBuscar1.setText("");
                    fillTableTrabajadores(trabajadores);
                }

                break;
            }
            default:
                break;
        }
    }

    private void exportar(JTable jTable1) {
        if (jTable1.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List tb = new ArrayList();
                List nom = new ArrayList();
                tb.add(jTable1);
                nom.add("Compras por factura");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    Exporter e = new Exporter(new File(file), tb, nom);
                    if (e.export()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel en el directorio seleccionado", "Mensaje de Informacion", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Hubo un error " + e.getMessage(), " Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(ventanaAdmin, "No hay datos para exportar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorAgregar) {
            Thread hilo = new Thread() {
                @Override
                public void run() {
                    if (agregarTrabajador()) {
                        mensaje("OPERACION REALIZADA");
                    } else {
                        mensaje("OPERACION FALLIDA");
                    }
                    return;
                }
            };
            hilo.start();
        } else if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorModificar) {
            Thread hilo = new Thread() {
                @Override
                public void run() {
                    if (modificarTrabajador()) {
                        mensaje("OPERACION REALIZADA");
                    } else {
                        mensaje("OPERACION FALLIDA");
                    }
                    return;
                }
            };
            hilo.start();
        } else if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorBorrar) {
            Thread hilo = new Thread() {
                @Override
                public void run() {
                    if (eliminarTrabajador()) {
                        mensaje("OPERACION REALIZADA");
                    } else {
                        mensaje("OPERACION FALLIDA");
                    }
                    return;
                }
            };
            hilo.start();

        } else if (ae.getSource() == this.panelRegistrosTrabajadores.btnClienteBuscar) {
            buscarTrabajador(panelRegistrosTrabajadores.txfBuscar1.getText(), 1);

        } else if (ae.getSource() == this.panelRegistrosTrabajadores.btnAsistenciaModificar) {// boton editar del panel Registro asistencia

        } else if (ae.getSource() == this.panelRegistrosTrabajadores.btnAsistenciaBorrar) {//boton eliminar del panel Registro asistencia

        } else if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorAgregar2) {
            Thread hilo = new Thread() {
                @Override
                public void run() {
                    Consultas_Trabajadores consulta1 = new Consultas_Trabajadores();
                    Consultas_Asistencia consulta2 = new Consultas_Asistencia();
                    lista_trabajadores = consulta1.readAll();
                    lista_asistencia = consulta2.readAll();
                    fillTableTrabajadores(lista_trabajadores);
                    fillTableAsistencia(lista_asistencia);
                    mensaje("OPERACION REALIZADA");
                    return;
                }
            };
            hilo.start();

        } else if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorAgregar1) {
            exportar(panelRegistrosTrabajadores.jTable2);
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (me.getSource() == this.panelRegistrosTrabajadores.jTable2) {
            if (me.getClickCount() == 2) {
                String temp_id = (String) this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 1);
                Linked_List<Modelo_Asistencia> ATrabajador = new Linked_List<Modelo_Asistencia>();
                int tamanho = lista_asistencia.size();
                Calendar c = Calendar.getInstance();
                int mesActual = c.get(Calendar.MONTH) + 1;
                for (int i = 0; i < tamanho; i++) {
                    int mesAsistencia = Integer.valueOf(((Modelo_Asistencia) lista_asistencia.get(i)).getFecha().substring(2, 4));
                    if (((Modelo_Asistencia) lista_asistencia.get(i)).getDni().equals(temp_id)
                            && mesActual == mesAsistencia) {
                        ATrabajador.add(lista_asistencia.get(i));
                    }
                }
                if (ATrabajador.size() > 0) {
                    fillTableAsistencia(ATrabajador);
                    LinkedList<Integer> segundosTardanza = new LinkedList<Integer>();
                    int tamanho2 = ATrabajador.size();
                    int horasMax = Integer.valueOf(((Modelo_Ajustes) lista_ajustes.get(13)).getValor().substring(0, 2));
                    int minMax = Integer.valueOf(((Modelo_Ajustes) lista_ajustes.get(13)).getValor().substring(3, 5));
                    int segMax = Integer.valueOf(((Modelo_Ajustes) lista_ajustes.get(13)).getValor().substring(6, 8));
                    int ssMaxTotal = horasMax * 60 * 60 + minMax * 60 + segMax;
                    for (int i = 0; i < tamanho2; i++) {

                        int horasT = Integer.valueOf(((Modelo_Asistencia) ATrabajador.get(i)).getHora_entrada().substring(0, 2));
                        int minT = Integer.valueOf(((Modelo_Asistencia) ATrabajador.get(i)).getHora_entrada().substring(2, 4));
                        int segT = Integer.valueOf(((Modelo_Asistencia) ATrabajador.get(i)).getHora_entrada().substring(4, 6));
                        int ssTTotal = horasT * 60 * 60 + minT * 60 + segT;

                        if (ssTTotal - ssMaxTotal > 0) {
                            //TARDANZA
                            segundosTardanza.add(ssTTotal - ssMaxTotal);
                        } else {
                            //TEMPRANO
                        }

                    }
                    if (segundosTardanza.size() > 0) {

                        int tamanho3 = segundosTardanza.size();
                        int suma = 0;
                        for (int i = 0; i < tamanho3; i++) {
                            suma += segundosTardanza.get(i);
                        }
                        int index = lista_trabajadores.findTrabajador(lista_trabajadores, temp_id);
                        Float sueldo = ((Modelo_Trabajadores) lista_trabajadores.get(index)).getSueldo();
                        Float descuentoCal = (suma * sueldo) / 691200;
                        DecimalFormat numberFormat = new DecimalFormat("0.00");
                        String descuento = String.valueOf(suma);
                        int hh = suma / 3600;
                        int mm = (suma - (3600 * hh)) / 60;
                        int ss = suma - ((hh * 3600) + (mm * 60));
                        String hora = String.valueOf(hh);
                        if (hora.length() < 2) {
                            hora = "0" + hora;
                        }
                        String minuto = String.valueOf(mm);
                        if (hora.length() < 2) {
                            minuto = "0" + minuto;
                        }
                        String segundo = String.valueOf(ss);
                        if (hora.length() < 2) {
                            segundo = "0" + segundo;
                        }

                        this.panelRegistrosTrabajadores.txfTiempo.setText(hora + ":" + minuto + ":" + segundo);
                        this.panelRegistrosTrabajadores.txfTardanza.setText(String.valueOf(segundosTardanza.size()));
                        this.panelRegistrosTrabajadores.txfDescuento.setText(numberFormat.format(descuentoCal));

                    } else {
                        this.panelRegistrosTrabajadores.txfDescuento.setText("0,00");
                        this.panelRegistrosTrabajadores.txfTiempo.setText("00:00:00");
                        this.panelRegistrosTrabajadores.txfTardanza.setText("0");
                    }

                } else {
                    fillTableAsistencia(lista_asistencia);
                    mensaje("SIN REGISTROS DE TRABAJADOR");
                    this.panelRegistrosTrabajadores.txfDescuento.setText("0,00");
                    this.panelRegistrosTrabajadores.txfTiempo.setText("00:00:00");
                    this.panelRegistrosTrabajadores.txfTardanza.setText("0");
                }

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

    private void mensaje(String msg) {
        Emergente_Aviso message = new Emergente_Aviso(ventanaAdmin, true, msg);
        message.setVisible(true);
    }
}
