package controlador;

import static controlador.Controlador_login.lista_trabajadores;
import static controlador.Controlador_login.lista_asistencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import modelo.Consultas_Asistencia;
import modelo.Consultas_Trabajadores;
import modelo.Linked_List;
import modelo.Modelo_Asistencia;
import modelo.Modelo_Trabajadores;
import vista.Emergente_Aviso;
import vista.Panel_Registros;
import vista.Panel_Registros_Clientes;
import vista.Panel_Registros_Trabajadores;
import vista.Ventana_Admin;

public class Controlador_Registros implements ActionListener {

    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Registros panelRegistros;
    private Panel_Registros_Trabajadores panelRegistrosTrabajadores;
    private Panel_Registros_Clientes panelRegistrosClientes;
    private Consultas_Trabajadores consultasTrabajadores;

    public Controlador_Registros(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin) {
        this.controladorAdmin = controladorAdmin;
        
        this.ventanaAdmin = ventanaAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();
    }

    public Panel_Registros getPanelRegistros() {
        return panelRegistros;
    }

    public void setPanelRegistros(Panel_Registros panelRegistros) {
        this.panelRegistros = panelRegistros;
    }

    private void iniciarComponentes() {
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelRegistros = controladorAdmin.getPanelRegistros();

    }

    private void llamarComponentes() {
        this.panelRegistros.subBtnTrabajadores.addActionListener(this);
        
        this.panelRegistros.subBtnClientes.addActionListener(this);

    }

    private void limpiarSpContenido() {
        this.panelRegistrosTrabajadores = null;
        this.panelRegistrosClientes = null;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == panelRegistros.subBtnClientes) {
            limpiarSpContenido();
            panelRegistrosClientes = new Panel_Registros_Clientes();
            Controlador_Clientes ctrl_clientes = new Controlador_Clientes(this.controladorAdmin, this.ventanaAdmin, this.panelRegistrosClientes);
            panelRegistros.administrarPanel(panelRegistros.spContenidoRegistros, ctrl_clientes.getPanelClientes());

        }
        if (ae.getSource() == panelRegistros.subBtnTrabajadores) {
            limpiarSpContenido();
            panelRegistrosTrabajadores = new Panel_Registros_Trabajadores();
            panelRegistros.administrarPanel(panelRegistros.spContenidoRegistros, panelRegistrosTrabajadores);
            panelRegistrosTrabajadores.btnTrabajadorAgregar.addActionListener(this);
            panelRegistrosTrabajadores.btnTrabajadorModificar.addActionListener(this);
            panelRegistrosTrabajadores.btnTrabajadorBorrar.addActionListener(this);
            panelRegistrosTrabajadores.btnTrabajadoresBuscar.addActionListener(this);
            panelRegistrosTrabajadores.btnAsistenciaAgregar.addActionListener(this);
            panelRegistrosTrabajadores.btnAsistenciaModificar.addActionListener(this);
            panelRegistrosTrabajadores.btnAsistenciaBuscar.addActionListener(this);
            panelRegistrosTrabajadores.btnAsistenciaBorrar.addActionListener(this);
            panelRegistrosTrabajadores.jTable2.setModel(this.tableModelTrabajadores(lista_trabajadores));// Inicializa tabla trabajadores
            panelRegistrosTrabajadores.jTable1.setModel(this.tableModelAsistencia(lista_asistencia));// Inicializa tabla asistencia

        }
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorAgregar) { // boton Agregar del Panel Registro Trabajadores
            consultasTrabajadores = new Consultas_Trabajadores();
            Modelo_Trabajadores temp_model = this.PanelRegistroTrabajadores();
            int resultadoConsulta = consultasTrabajadores.create(temp_model);
            if (resultadoConsulta == 2) {
                System.out.println("Se agrego al trabajador");
            } else {
                if (resultadoConsulta == 1) {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Ya existe ese DNI");
                    mensaje.setVisible(true);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo agregar al trabajador");
                    mensaje.setVisible(true);
                }

            }
            lista_trabajadores = consultasTrabajadores.readAll();
            this.panelRegistrosTrabajadores.jTable2.setModel(this.tableModelTrabajadores(lista_trabajadores));
            this.panelRegistrosTrabajadores.jTable1.setModel(this.tableModelAsistencia(lista_asistencia));

        }

        if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorModificar) { // boton Actualizar del Panel Registro Trabajadores
            if (this.panelRegistrosTrabajadores.jTable2.getSelectionModel().isSelectionEmpty() == false) {
                Modelo_Trabajadores temp_model = this.PanelRegistroTrabajadores();
                String tempdni = (String) this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 1);   //             
                Consultas_Trabajadores consultaActualizar = new Consultas_Trabajadores();
                int index_seleccionado = lista_trabajadores.findTrabajador(lista_trabajadores, tempdni);//consigo el indice del id
                temp_model.setId(((Modelo_Trabajadores) lista_trabajadores.get(index_seleccionado)).getId());
                Thread hilo_consulta_tabla = new Thread() {
                    @Override
                    public void run() {
                        if (consultaActualizar.update(temp_model)) {
                            System.out.println("Se actualizo al trabajador");
                        } else {
                            Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo actualizar al trabajador");
                            mensaje.setVisible(true);
                        }

                    }
                };
                lista_trabajadores.remove(index_seleccionado);
                lista_trabajadores.add(index_seleccionado, temp_model);
                hilo_consulta_tabla.start();
                this.panelRegistrosTrabajadores.jTable2.setModel(this.tableModelTrabajadores(lista_trabajadores));

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Selecciona una fila de la tabla trabajadores a modificar");
                mensaje.setVisible(true);
            }
        }
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadorBorrar) {//boton elimnar del panel Registro trabajadores
            if (this.panelRegistrosTrabajadores.jTable2.getSelectionModel().isSelectionEmpty() == false) {
                Modelo_Trabajadores temp_model = new Modelo_Trabajadores();
                String tempdni = (String) this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 1);   //             
                Consultas_Trabajadores consultaEliminar = new Consultas_Trabajadores();
                int index_seleccionado = lista_trabajadores.findTrabajador(lista_trabajadores, tempdni);//consigo el indice del id

                temp_model.setId(((Modelo_Trabajadores) lista_trabajadores.get(index_seleccionado)).getId());

                Thread hilo_consulta_tabla = new Thread() {
                    @Override
                    public void run() {
                        if (consultaEliminar.delete(temp_model)) {
                            System.out.println("Se elimino al trabajador");
                        } else {
                            Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo eliminar al trabajador");
                            mensaje.setVisible(true);
                        }

                    }
                };
                lista_trabajadores.remove(index_seleccionado);
                hilo_consulta_tabla.start();
                this.panelRegistrosTrabajadores.jTable2.setModel(this.tableModelTrabajadores(lista_trabajadores));

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Selecciona una fila a eliminar de la tabla trabajadores");
                mensaje.setVisible(true);
            }

        }
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadoresBuscar) {//boton buscar del panel Registro trabajadores

            String temp_dni = this.panelRegistrosTrabajadores.txfBuscar.getText();
            Modelo_Trabajadores temp_model;
            Linked_List.ResultadoDNITrabajador temp_resultado = lista_trabajadores.findDNI(lista_trabajadores, temp_dni);
            if (temp_resultado.isResultado()) {
                temp_model = (Modelo_Trabajadores) lista_trabajadores.get(temp_resultado.getI());

                DefaultTableModel model = new DefaultTableModel(new String[]{"Nombres y Apellidos", "dni", "Privilegio", "Sueldo"}, 0);
                String nombre = temp_model.getNombre();
                String apellido = temp_model.getApellido();
                String nombreyApellido = nombre + " " + apellido;
                String dni = temp_model.getDni();
                int privilege = temp_model.getPrivilege();
                String privilegio;
                if (privilege == 0) {
                    privilegio = "Trabajador";
                } else {
                    privilegio = "Administrador";
                }

                Float sueldo = temp_model.getSueldo();
                model.addRow(new Object[]{nombreyApellido, dni, privilegio, sueldo});
                this.panelRegistrosTrabajadores.jTable2.setModel(model);
            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el DNI");
                mensaje.setVisible(true);
            }
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
            this.panelRegistrosTrabajadores.jTable1.setModel(this.tableModelAsistencia(lista_asistencia));

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
                    this.panelRegistrosTrabajadores.jTable1.setModel(this.tableModelAsistencia(lista_asistencia));

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
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontró el DNI");
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
                this.panelRegistrosTrabajadores.jTable1.setModel(this.tableModelAsistencia(lista_asistencia));

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Selecciona una fila a eliminar de la tabla asistencia");
                mensaje.setVisible(true);
            }
        }
    }

    public Modelo_Asistencia PanelRegistroAsistencia() { // Devuelve un modelo para el panel registro asistencia
        Modelo_Asistencia modelo_asistencia = new Modelo_Asistencia();
        if (this.panelRegistrosTrabajadores.txfDNI.getText().length() == 8) {
            modelo_asistencia.setDni(this.panelRegistrosTrabajadores.txfDatosDNI.getText());
        } else {
            // Panel para el mensaje que la longitud del dni no es correcta
            Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Longitud del DNI incorrecta");
            mensaje.setVisible(true);
        }
        String[] temp_fecha = this.panelRegistrosTrabajadores.txfDatosFecha.getText().split("/");
        modelo_asistencia.setFecha(temp_fecha[0] + temp_fecha[1] + temp_fecha[2]);
        String[] temp_hora = this.panelRegistrosTrabajadores.txfDatosHora.getText().split(":");
        modelo_asistencia.setHora_entrada(temp_hora[0] + temp_hora[1] + temp_hora[2]);
        return modelo_asistencia;
    }

    public Modelo_Trabajadores PanelRegistroTrabajadores() { // Devuelve un modelo con los valores rellenados en el panel registro trabajadores
        Modelo_Trabajadores modelo_trabajadores = new Modelo_Trabajadores();

        if (this.panelRegistrosTrabajadores.txfDNI.getText().length() == 8) {
            modelo_trabajadores.setDni(this.panelRegistrosTrabajadores.txfDNI.getText());
        } else {
            // Panel para el mensaje que la longitud del dni no es correcta
            Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Longitud del DNI incorrecta");
            mensaje.setVisible(true);
        }

        modelo_trabajadores.setNombre(this.panelRegistrosTrabajadores.txfNombre.getText());
        modelo_trabajadores.setApellido(this.panelRegistrosTrabajadores.txfApellidos.getText());
        if (this.panelRegistrosTrabajadores.txfPassword.getText().compareTo(this.panelRegistrosTrabajadores.txfValidatePassword.getText()) == 0
                && this.panelRegistrosTrabajadores.txfPassword.getText().length() > 5) {
            modelo_trabajadores.setPassword(this.panelRegistrosTrabajadores.txfPassword.getText());

        } else {
            if (this.panelRegistrosTrabajadores.txfPassword.getText().compareTo(this.panelRegistrosTrabajadores.txfValidatePassword.getText()) == 0) {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "La contraseña es muy corta");
                mensaje.setVisible(true);
            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Las contraseñas no coinciden");
                mensaje.setVisible(true);
            }

        }
        if (this.panelRegistrosTrabajadores.cbPrivilegio.getSelectedItem().toString().compareTo("Admin") == 0) {
            modelo_trabajadores.setPrivilege(2);
        } else {
            modelo_trabajadores.setPrivilege(0);
        }
        try {
            if (Float.valueOf(this.panelRegistrosTrabajadores.txfSueldo.getText()) < 930.00) {
                modelo_trabajadores.setSueldo(930.00f);
            } else {
                modelo_trabajadores.setSueldo(Float.valueOf(this.panelRegistrosTrabajadores.txfSueldo.getText()));
            }
        } catch (NumberFormatException e) {
            System.out.println(" " + e.getMessage());
        }

        String time_date = new SimpleDateFormat("ddMMyyyy").format(Calendar.getInstance().getTime());//ddMMyyyy_HHmmss cambiar a este string para mas informacion
        modelo_trabajadores.setFecha_creacion(time_date);
        return modelo_trabajadores;

    }

    public DefaultTableModel tableModelAsistencia(LinkedList<Modelo_Asistencia> listaAsistencia) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "DNI", "Fecha", "Hora de Entrada"}, 0);
        for (int i = 0; i < listaAsistencia.size(); i++) {
            int id = listaAsistencia.get(i).getId();
            String dni = listaAsistencia.get(i).getDni();
            String fecha = listaAsistencia.get(i).getFecha();
            fecha = fecha.substring(0, 2) + "/" + fecha.substring(2, 4) + "/" + fecha.substring(4, fecha.length());
            String hora_entrada = listaAsistencia.get(i).getHora_entrada();
            hora_entrada = hora_entrada.substring(0, 2) + ":" + hora_entrada.substring(2, 4) + ":" + hora_entrada.substring(4, hora_entrada.length());
            model.addRow(new Object[]{id, dni, fecha, hora_entrada});
        }

        return model;
    }

    public DefaultTableModel tableModelTrabajadores(LinkedList<Modelo_Trabajadores> listaTrabajadores) { // devuelve un modelo para el Jtable Trabajadores
        DefaultTableModel model = new DefaultTableModel(new String[]{"Nombres y Apellidos", "dni", "Privilegio", "Sueldo"}, 0);
        for (int i = 0; i < listaTrabajadores.size(); i++) {
            String nombre = listaTrabajadores.get(i).getNombre();
            String apellido = listaTrabajadores.get(i).getApellido();
            String nombreyApellido = nombre + " " + apellido;
            String dni = listaTrabajadores.get(i).getDni();
            int privilege = listaTrabajadores.get(i).getPrivilege();
            String privilegio;
            if (privilege == 0) {
                privilegio = "Trabajador";
            } else {
                privilegio = "Administrador";
            }
            Float sueldo = listaTrabajadores.get(i).getSueldo();
            model.addRow(new Object[]{nombreyApellido, dni, privilegio, sueldo});
        }

        return model;
    }
}