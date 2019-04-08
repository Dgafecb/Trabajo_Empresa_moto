package controlador;

import static controlador.Controlador_login.lista_trabajadores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import modelo.Consultas_Trabajadores;
import modelo.Modelo_Trabajadores;
import vista.Panel_Registros;
import vista.Panel_Registros_Trabajadores;
import vista.Ventana_Admin;

public class Controlador_Registros implements ActionListener {

    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Registros panelRegistros;
    private Panel_Registros_Trabajadores panelRegistrosTrabajadores;
    private Consultas_Trabajadores consultasTrabajadores;
    //private static LinkedList<Modelo_Trabajadores> listaTrabajadores = lista_trabajadores;

    public Controlador_Registros(Controlador_admin controladorAdmin) {
        this.controladorAdmin = controladorAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();
    }

    private void iniciarComponentes() {
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelRegistros = controladorAdmin.getPanelRegistros();
    }

    private void llamarComponentes() {
        panelRegistros.subBtnTrabajadores.addActionListener(this);
    }

    private void limpiarSpContenido() {
        panelRegistrosTrabajadores = null;
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == panelRegistros.subBtnTrabajadores) {
            limpiarSpContenido();
            panelRegistrosTrabajadores = new Panel_Registros_Trabajadores();
            panelRegistros.administrarPanel(panelRegistros.spContenidoRegistros, panelRegistrosTrabajadores);
            panelRegistrosTrabajadores.btnTrabajadoresAgregar.addActionListener(this);
            panelRegistrosTrabajadores.btnTrabajadoresActualizar.addActionListener(this);
            panelRegistrosTrabajadores.btnTrabajadoresEliminar.addActionListener(this);
            panelRegistrosTrabajadores.btnBuscar.addActionListener(this);
            panelRegistrosTrabajadores.jTable2.setModel(this.tableModelTrabajadores(lista_trabajadores));// Inicializa tabla trabajadores
        }
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadoresAgregar) { // boton Agregar del Panel Registro Trabajadores
            consultasTrabajadores = new Consultas_Trabajadores();
            Modelo_Trabajadores temp_model = this.PanelRegistroTrabajadores();
            if (consultasTrabajadores.create(temp_model) == true) {
                System.out.println("Se agrego al trabajador");
            } else {
                System.out.println("No se pudo agregar al trabajador");
            }

        }
        
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadoresActualizar) { // boton Actualizar del Panel Registro Trabajadores
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
                            System.out.println("No se pudo actualizar al trabajador");
                        }

                    }
                };
                lista_trabajadores.remove(index_seleccionado);
                lista_trabajadores.add(index_seleccionado, temp_model);
                hilo_consulta_tabla.start();
                this.panelRegistrosTrabajadores.jTable2.setModel(this.tableModelTrabajadores(lista_trabajadores));

            } else {
                // Agregar advertencia
                System.out.println("Selecciona una fila a modificar de la tabla trabajadores");
            }
        }
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnTrabajadoresEliminar) {
            if (this.panelRegistrosTrabajadores.jTable2.getSelectionModel().isSelectionEmpty() == false) {
                Modelo_Trabajadores temp_model = new Modelo_Trabajadores();
                String tempdni = (String) this.panelRegistrosTrabajadores.jTable2.getValueAt(this.panelRegistrosTrabajadores.jTable2.getSelectedRow(), 1);   //             
                Consultas_Trabajadores consultaActualizar = new Consultas_Trabajadores();
                int index_seleccionado = lista_trabajadores.findTrabajador(lista_trabajadores, tempdni);//consigo el indice del id

                temp_model.setId(((Modelo_Trabajadores) lista_trabajadores.get(index_seleccionado)).getId());

                Thread hilo_consulta_tabla = new Thread() {
                    @Override
                    public void run() {
                        if (consultaActualizar.delete(temp_model)) {
                            System.out.println("Se elimino al trabajador");
                        } else {
                            System.out.println("No se pudo eliminar al trabajador");
                        }

                    }
                };
                lista_trabajadores.remove(index_seleccionado);
                hilo_consulta_tabla.start();
                this.panelRegistrosTrabajadores.jTable2.setModel(this.tableModelTrabajadores(lista_trabajadores));

            } else {
                // Agregar advertencia
                System.out.println("Selecciona una fila a eliminar de la tabla trabajadores");
            }

        }
        if (ae.getSource() == this.panelRegistrosTrabajadores.btnBuscar) {
            Consultas_Trabajadores consultas = new Consultas_Trabajadores();
            String temp_dni = this.panelRegistrosTrabajadores.txfBuscar.getText();
            Modelo_Trabajadores temp_model = new Modelo_Trabajadores();
            temp_model.setDni(temp_dni);
            if (consultas.read(temp_model)) {
                System.out.println("Se pudo realizar la busqueda");
            } else {
                System.out.println("No se encontro a un Trabajador con ese DNI");// Agregar JDialog
            }
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
        }
    }

    public Modelo_Trabajadores PanelRegistroTrabajadores() { // Devuelve un modelo con los valores rellenados en el panel registro trabajadores
        Modelo_Trabajadores modelo_trabajadores = new Modelo_Trabajadores();
        modelo_trabajadores.setDni(this.panelRegistrosTrabajadores.txfDNI.getText());
        if (this.panelRegistrosTrabajadores.txfDNI.getText().length() == 8) {
            modelo_trabajadores.setDni(this.panelRegistrosTrabajadores.txfDNI.getText());
        } else {
            // Panel para el mensaje que la longitud del dni no es correcta
            System.out.println("Longitud del dni incorrecta");
        }

        modelo_trabajadores.setNombre(this.panelRegistrosTrabajadores.txfNombre.getText());
        modelo_trabajadores.setApellido(this.panelRegistrosTrabajadores.txfApellidos.getText());
        if (this.panelRegistrosTrabajadores.txfPassword.getText().compareTo(this.panelRegistrosTrabajadores.txfValidatePassword.getText()) == 0 
                && this.panelRegistrosTrabajadores.txfPassword.getText().length() > 5) {
            modelo_trabajadores.setPassword(this.panelRegistrosTrabajadores.txfPassword.getText());

        } else {
            // Crea un panel que avise que la "password" no coincide o es muy corta
            System.out.println("La contrasenha no coincide o la longitud es muy corta");
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