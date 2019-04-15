package controlador;

import static controlador.Controlador_login.lista_ajustes;
import static controlador.Controlador_login.lista_clientes;
import static controlador.Controlador_login.lista_repuestos;
import static controlador.Controlador_login.lista_trabajadores;
import static controlador.Controlador_login.lista_vehiculos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Consultas_Clientes;
import modelo.Consultas_Inventario_Vehiculos;
import modelo.Consultas_Ventas;
import modelo.Linked_List;
import modelo.Modelo_Ajustes;
import modelo.Modelo_Clientes;
import modelo.Modelo_Inventario_Vehiculos;
import modelo.Modelo_Trabajadores;
import modelo.Modelo_Ventas;
import vista.Emergente_Aviso;
import vista.Emergente_Panel_Clientes;
import vista.Emergente_Panel_Ventas;
import vista.Panel_Ventas;

import vista.Ventana_Admin;

public class Controlador_Ventas implements ActionListener {

    private Controlador_admin controladorAdmin;
    private Ventana_Admin ventanaAdmin;
    private Panel_Ventas panelVentas;
    private Modelo_Inventario_Vehiculos modeloInventario = null;
    private Modelo_Clientes modeloClientes = null;
    private Linked_List<Modelo_Inventario_Vehiculos> objetosAgregados = null;//lista que va a guardar los objetos agregados antes de venderlos
    private DefaultTableModel modeloTablaVentas;
    private float total_ventas = 0.00f;
    private float sin_igv = 0.00f;
    private float con_igv = 0.00f;
    private float sin_dscto = 0.00f;
    private float con_dscto = 0.00f;
    private float cuota_mensual = 0.00f;
    private int dscto = 1;
    private int cuotas = 1;

    public Controlador_Ventas(Controlador_admin controladorAdmin, Ventana_Admin ventanaAdmin) {
        this.controladorAdmin = controladorAdmin;
        this.ventanaAdmin = ventanaAdmin;
        this.iniciarComponentes();
        this.llamarComponentes();

    }

    private void iniciarComponentes() {
        this.ventanaAdmin = controladorAdmin.getVentanaAdmin();
        this.panelVentas = controladorAdmin.getPanelVentas();

    }

    private void llamarComponentes() {

        String nombre_trabajador = controladorAdmin.getModel_user().getNombre();
        nombre_trabajador = "SELLER: " + nombre_trabajador + " " + controladorAdmin.getModel_user().getApellido();
        this.panelVentas.lblNombreTrabajador.setText(nombre_trabajador);
        this.llenarTablaAlmacen();
        this.llenarTablaClientes();
        this.iniciarTablaVentas();
        this.panelVentas.btnAlmacenBuscar.addActionListener(this);
        this.panelVentas.btnClienteBuscar.addActionListener(this);
        this.panelVentas.btnClienteAgregar.addActionListener(this);
        this.panelVentas.customButtonShaped1.addActionListener(this);
        this.panelVentas.customButtonShaped2.addActionListener(this);
        this.panelVentas.customButtonShaped5.addActionListener(this);
        this.panelVentas.customButtonShaped3.addActionListener(this);
        this.panelVentas.tAlmacen.getSelectionModel().addListSelectionListener(new ListSelectionListener() {// rellena los datos de abajo con la fila seleccionada de la tabla almacen
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting() && panelVentas.tAlmacen.getSelectedRow() != -1) {
                    System.out.println(panelVentas.tAlmacen.getValueAt(panelVentas.tAlmacen.getSelectedRow(), 0).toString());
                    String selected_id = (String) panelVentas.tAlmacen.getValueAt(panelVentas.tAlmacen.getSelectedRow(), 0);

                    Linked_List.InventarioTEMP temp = lista_vehiculos.findIndexId(lista_vehiculos, selected_id);

                    int index = (int) ((temp.getTemp()).peek());

                    String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getId();
                    String categoria = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getTipo_vehiculo();
                    String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getNombre_prod();
                    int cantidad = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getCantidad();
                    float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getPrecio();
                    String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getMarca();
                    String modelo = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getModelo();
                    String color = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getColor();
                    String motor = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getMotor();
                    String chasis = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getChasis();
                    String anho_fab = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getAnho_fab();
                    String anhos_garantia = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getAnhos_garantia();
                    int advertencia = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getLimite_advertencia();

                    panelVentas.txfMarca.setText(marca);
                    panelVentas.txfModelo.setText(modelo);
                    panelVentas.txfPrecioUnidad.setText(Float.toString(precio));
                    panelVentas.txfProductoID.setText(id);
                    panelVentas.txfDescripcion.setText(descripcion);
                    panelVentas.txfCategoria.setText(categoria);
                    panelVentas.txfAnhoFab.setText(anho_fab);
                    panelVentas.txfCantidad.setText(Integer.toString(cantidad));
                    String dsctoMayor = ((Modelo_Ajustes) (lista_ajustes.get(5))).getValor();// 
                    if (dsctoMayor.endsWith("%")) {
                        dsctoMayor = dsctoMayor.substring(0, dsctoMayor.length() - 1);

                    }
                    float precioMayor = (Integer.valueOf(dsctoMayor) / 100.f) * precio;
                    panelVentas.txfPrecioMayor.setText(Float.toString(precioMayor));
                    modeloInventario = new Modelo_Inventario_Vehiculos();
                    modeloInventario.setId(id);
                    modeloInventario.setCantidad(cantidad);
                    modeloInventario.setAnho_fab(anho_fab);
                    modeloInventario.setAnhos_garantia(anhos_garantia);
                    modeloInventario.setChasis(chasis);
                    modeloInventario.setColor(color);
                    modeloInventario.setLimite_advertencia(advertencia);
                    modeloInventario.setMarca(marca);
                    modeloInventario.setTipo_vehiculo(categoria);
                    modeloInventario.setPrecio(precio);
                    modeloInventario.setNombre_prod(descripcion);
                    modeloInventario.setMotor(motor);
                }
            }
        });
        this.panelVentas.jTable1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {// crea un modelo clientes que sera verificado para la venta al registrar
            @Override
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting() && panelVentas.jTable1.getSelectedRow() != -1) {
                    modeloClientes = new Modelo_Clientes();
                    String dni_leido = (String) panelVentas.jTable1.getValueAt(panelVentas.jTable1.getSelectedRow(), 0);
                    Linked_List.ResultadoClientes resultado = lista_clientes.findClientes(lista_clientes, dni_leido);

                    int i = (int) resultado.getTemp().peek();
                    int id = ((Modelo_Clientes) lista_clientes.get(i)).getId();
                    String dni = ((Modelo_Clientes) lista_clientes.get(i)).getDni();
                    String nombres_apellido = ((Modelo_Clientes) lista_clientes.get(i)).getNombre_apellido();
                    String dni_2 = ((Modelo_Clientes) lista_clientes.get(i)).getDni_2();
                    String nombres_apellido_2 = ((Modelo_Clientes) lista_clientes.get(i)).getNombre_apellido_2();
                    String correo = ((Modelo_Clientes) lista_clientes.get(i)).getCorreo();
                    String direccion = ((Modelo_Clientes) lista_clientes.get(i)).getDireccion();
                    String ciudad = ((Modelo_Clientes) lista_clientes.get(i)).getCiudad();
                    String pais = ((Modelo_Clientes) lista_clientes.get(i)).getPais();

                    modeloClientes.setCiudad(ciudad);
                    modeloClientes.setCorreo(correo);
                    modeloClientes.setDireccion(direccion);
                    modeloClientes.setDni(dni);
                    modeloClientes.setNombre_apellido(nombres_apellido);
                    modeloClientes.setNombre_apellido_2(nombres_apellido_2);
                    modeloClientes.setDni_2(dni_2);
                    modeloClientes.setPais(pais);
                    modeloClientes.setId(id);
                }
            }
        });
    }

    private void iniciarTablaVentas() {
        modeloTablaVentas = new DefaultTableModel(new String[]{"Id", "Descripcion", "Cantidad", "Precio unitario", "Precio Total"}, 0);
        this.panelVentas.tDatosVentas.setModel(modeloTablaVentas);

    }

    private void llenarTablaClientes() {
        DefaultTableModel model = new DefaultTableModel(new String[]{"DNI", "Nombres y Apellidos", "DNI", "Nombres y Apellidos"}, 0);
        for (int i = 0; i < lista_clientes.size(); i++) {
            String dni = ((Modelo_Clientes) lista_clientes.get(i)).getDni();
            String nombres_apellido = ((Modelo_Clientes) lista_clientes.get(i)).getNombre_apellido();
            String dni_2 = ((Modelo_Clientes) lista_clientes.get(i)).getDni_2();
            String nombres_apellido_2 = ((Modelo_Clientes) lista_clientes.get(i)).getNombre_apellido_2();

            model.addRow(new Object[]{dni, nombres_apellido, dni_2, nombres_apellido_2});
        }
        this.panelVentas.jTable1.setModel(model);
    }

    private void llenarTablaAlmacen() {

        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Descripcion", "Marca", "Precio",}, 0);
        for (int i = 0; i < lista_vehiculos.size(); i++) {
            String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getId();

            String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getNombre_prod();

            float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getPrecio();
            String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getMarca();

            model.addRow(new Object[]{id, descripcion, marca, precio});
        }
        this.panelVentas.tAlmacen.setModel(model);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.panelVentas.customButtonShaped3) {// Boton registrar
            if (!this.panelVentas.txfVCuotaInicial.getText().isEmpty()) {
                if (this.panelVentas.tDatosVentas.getRowCount() != 0) {
                    if (this.modeloClientes != null) {
                        // actualizar inventario y crear registro de la venta

                        Consultas_Inventario_Vehiculos consultas_inventario = new Consultas_Inventario_Vehiculos();
                        Thread hilo = new Thread() {// hilo para actualizar la cantidad de cada elemento del inventario
                            @Override
                            public void run() {
                                for (int i = 0; i < panelVentas.tDatosVentas.getRowCount(); i++) {//Recorre toda la tabla de ventas
                                    //actualizamos el inventario
                                    Modelo_Inventario_Vehiculos temp_model_vehiculos;
                                    String id_prod = (String) panelVentas.tDatosVentas.getValueAt(i, 0);
                                    String cantidad = (String) panelVentas.tDatosVentas.getValueAt(i, 2);
                                    int index = lista_vehiculos.findInventario(lista_vehiculos, id_prod);
                                    temp_model_vehiculos = (Modelo_Inventario_Vehiculos) lista_vehiculos.get(index);
                                    temp_model_vehiculos.setCantidad(temp_model_vehiculos.getCantidad() - Integer.valueOf(cantidad));

                                    if (consultas_inventario.update(temp_model_vehiculos)) {

                                    } else {
                                        Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se logro actualizar el inventario");
                                        mensaje.setVisible(true);
                                    }

                                }
                                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Se actualizó el inventario");
                                mensaje.setVisible(true);
                                return;
                            }

                        };
                        hilo.start();

                        Modelo_Ventas temp_model = new Modelo_Ventas();
                        Consultas_Ventas consulta_venta = new Consultas_Ventas();
                        int id_trabajador = this.controladorAdmin.getModel_user().getId();
                        int index = lista_clientes.findClientes(lista_clientes, (String) this.panelVentas.jTable1.getValueAt(0, 0)).getTemp().peek();
                        int id_cliente = ((Modelo_Clientes) lista_clientes.get(index)).getId();
                        for (int i = 0; i < this.panelVentas.tDatosVentas.getRowCount(); i++) {//Recorre toda la tabla de ventas
                            // creamos el registro de ventas para cada producto distinto

                            String id_prod = (String) this.panelVentas.tDatosVentas.getValueAt(i, 0);
                            String cantidad = (String) this.panelVentas.tDatosVentas.getValueAt(i, 2);
                            float total = (float) this.panelVentas.tDatosVentas.getValueAt(i, 4);
                            String id_factura = id_prod + Integer.toString(id_trabajador) + Integer.toString(id_cliente);
                            String fecha_hora = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime());
                            float monto_inicial = Float.valueOf(this.panelVentas.txfVCuotaInicial.getText());
                            temp_model.setId_prod(id_prod);
                            temp_model.setId_factura(id_factura);
                            temp_model.setId_prod(id_prod);
                            temp_model.setId_trabajador(id_trabajador);
                            temp_model.setId_cliente(id_cliente);
                            temp_model.setFecha_hora(fecha_hora);
                            temp_model.setMonto_inicial(monto_inicial);
                            temp_model.setCantidad(Integer.valueOf(cantidad));
                            temp_model.setTotal(total);
                            temp_model.setDscto(this.dscto);
                            temp_model.setCuotas(this.cuotas);
                            if (consulta_venta.create(temp_model)) {
                                System.out.println("Se agrego al registro");
                            } else {
                                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se pudo agregar al registro de ventas");
                                mensaje.setVisible(true);
                            }

                        }
                        // Actualizar listas almacen y ventas
                        // Actualizar tabla almacen
                        Thread hilo2 = new Thread() {// hilo para actualizar las listas y volver a llenar las tablas
                            @Override
                            public void run() {
                                Consultas_Inventario_Vehiculos consulta_vehiculo = new Consultas_Inventario_Vehiculos();
                                Consultas_Clientes consulta_cliente = new Consultas_Clientes();
                                lista_clientes = consulta_cliente.readAll();
                                lista_vehiculos = consulta_vehiculo.readAll();
                                llenarTablaAlmacen();
                                llenarTablaClientes();
                                return;
                            }

                        };
                        hilo2.start();
                    } else {
                        Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Seleccione a un cliente de la tabla");
                        mensaje.setVisible(true);
                    }
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Agregue un elemento a la tabla antes de registrarlo");
                    mensaje.setVisible(true);
                }
            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Escriba el monto inicial");
                mensaje.setVisible(true);

            }
        }
        if (e.getSource() == this.panelVentas.customButtonShaped1) {// boton agregar

            if (modeloInventario == null) {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Seleccione la fila de la tabla almacen a agregar");
                mensaje.setVisible(true);
            } else {
                //chequear si el string atributo de el boton agregar, la cantidad es distinto de nulo
//                String max = ((Modelo_Ajustes)lista_ajustes.get(14)).getValor();
//                if(max.endsWith("%")){
//                    max = max.substring(0,max.length()-1);
//                }
//                int dscto_maximo = Integer.valueOf(max);
                int cantidad_maxima = this.modeloInventario.getCantidad();
                Emergente_Panel_Ventas panel = new Emergente_Panel_Ventas(this.ventanaAdmin, true, cantidad_maxima);
                panel.setVisible(true);
                String cantidad = panel.mensaje.getText();

                String id = modeloInventario.getId();
                String descripcion = modeloInventario.getNombre_prod();

                float precio_unitario = modeloInventario.getPrecio();//Falta verificar si la lista_ajustes(10) es distinto de 1 para cambiar ese valor
                float precio_total = precio_unitario * Integer.valueOf(cantidad);

                modeloTablaVentas.addRow(new Object[]{id, descripcion, cantidad, precio_unitario, precio_total});

                this.panelVentas.tDatosVentas.setModel(modeloTablaVentas);
//                System.out.println(this.panelVentas.tDatosVentas.getRowCount());//
                this.sin_dscto += precio_total;
                this.con_dscto = this.sin_dscto * this.dscto;
                this.sin_igv = this.con_dscto;
                this.con_igv = 1.18f * this.sin_igv;
                this.total_ventas = this.con_igv;
                this.cuota_mensual = this.total_ventas / (float) cuotas;
                DecimalFormat numberFormat = new DecimalFormat("#.00");
                this.panelVentas.jLabel22.setText(numberFormat.format(sin_igv));
                this.panelVentas.jLabel23.setText(numberFormat.format(con_igv));
                this.panelVentas.jLabel25.setText(numberFormat.format(sin_dscto));
                this.panelVentas.jLabel26.setText(numberFormat.format(con_dscto));
                this.panelVentas.jLabel27.setText(numberFormat.format(cuota_mensual));
                this.panelVentas.jLabel28.setText(numberFormat.format(this.total_ventas));

            }

        }
        if (e.getSource() == this.panelVentas.customButtonShaped2) {// boton quitar 

            if (this.panelVentas.tDatosVentas.getSelectionModel().isSelectionEmpty() == false) {
                float temp_total = (float) this.panelVentas.tDatosVentas.getValueAt(this.panelVentas.tDatosVentas.getSelectedRow(), 4);
                int[] rows = this.panelVentas.tDatosVentas.getSelectedRows();
                for (int i = 0; i < rows.length; i++) {
                    modeloTablaVentas.removeRow(rows[i] - i);
                }
                this.sin_dscto = this.sin_dscto - temp_total;
                this.con_dscto = this.sin_dscto * this.dscto;
                this.sin_igv = this.con_dscto;
                this.con_igv = 1.18f * this.sin_igv;
                this.total_ventas = this.con_igv;
                this.cuota_mensual = this.total_ventas / (float) cuotas;
                DecimalFormat numberFormat = new DecimalFormat("#.00");
                this.panelVentas.jLabel22.setText(numberFormat.format(sin_igv));
                this.panelVentas.jLabel23.setText(numberFormat.format(con_igv));
                this.panelVentas.jLabel25.setText(numberFormat.format(sin_dscto));
                this.panelVentas.jLabel26.setText(numberFormat.format(con_dscto));
                this.panelVentas.jLabel27.setText(numberFormat.format(cuota_mensual));
                this.panelVentas.jLabel28.setText(numberFormat.format(this.total_ventas));
//                System.out.println(this.panelVentas.tDatosVentas.getRowCount());
            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Seleccione la fila que desea quitar");
                mensaje.setVisible(true);

            }

        }
        if (e.getSource() == this.panelVentas.customButtonShaped5) {//boton limpiar
            this.iniciarTablaVentas();
            total_ventas = 0.00f;
            sin_igv = 0.00f;
            con_igv = 0.00f;
            sin_dscto = 0.00f;
            con_dscto = 0.00f;
            cuota_mensual = 0.00f;
            DecimalFormat numberFormat = new DecimalFormat("#.00");
            this.panelVentas.jLabel22.setText(numberFormat.format(sin_igv));
            this.panelVentas.jLabel23.setText(numberFormat.format(con_igv));
            this.panelVentas.jLabel25.setText(numberFormat.format(sin_dscto));
            this.panelVentas.jLabel26.setText(numberFormat.format(con_dscto));
            this.panelVentas.jLabel27.setText(numberFormat.format(cuota_mensual));
            this.panelVentas.jLabel28.setText(numberFormat.format(this.total_ventas));
//            System.out.println(this.panelVentas.tDatosVentas.getRowCount()); 
        }

        if (e.getSource() == this.panelVentas.btnClienteAgregar) {
            Emergente_Panel_Clientes panel = new Emergente_Panel_Clientes(ventanaAdmin, true);
            panel.setVisible(true);
            LinkedList<String> lista_agregada = panel.clientes;
            if (lista_agregada == null) {
                //Si se apreto el boton cancelar

            } else {
                Modelo_Clientes temp_model = new Modelo_Clientes();
                String temp_nombre = (String) lista_agregada.get(0);
                String temp_nombre_2 = (String) lista_agregada.get(1);
                String temp_dni = (String) lista_agregada.get(2);
                String temp_dni_2 = (String) lista_agregada.get(3);
                String temp_correo = (String) lista_agregada.get(4);
                String temp_direccion = (String) lista_agregada.get(5);
                String temp_telefono = (String) lista_agregada.get(6);
                String temp_ciudad = (String) lista_agregada.get(7);
                String temp_pais = (String) lista_agregada.get(8);
                temp_model.setNombre_apellido(temp_nombre);
                temp_model.setNombre_apellido_2(temp_nombre_2);
                temp_model.setDni(temp_dni);
                temp_model.setDni_2(temp_dni_2);
                temp_model.setDireccion(temp_direccion);
                temp_model.setTelefono(temp_telefono);
                temp_model.setPais(temp_pais);
                temp_model.setCiudad(temp_ciudad);
                temp_model.setCorreo(temp_correo);
                Consultas_Clientes consultas = new Consultas_Clientes();
                if (consultas.create(temp_model)) {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "Se agregó al trabajador");
                    mensaje.setVisible(true);
                    lista_clientes.add(temp_model);
                    //Coloca el cliente agregado como unico en el modelo de tabla
                    DefaultTableModel model = new DefaultTableModel(new String[]{"DNI", "Nombres y Apellidos", "DNI", "Nombres y Apellidos"}, 0);
                    int i = (int) lista_clientes.findClientes(lista_clientes, temp_dni).getTemp().peek();
                    String dni = ((Modelo_Clientes) lista_clientes.get(i)).getDni();
                    String nombres_apellido = ((Modelo_Clientes) lista_clientes.get(i)).getNombre_apellido();
                    String dni_2 = ((Modelo_Clientes) lista_clientes.get(i)).getDni_2();
                    String nombres_apellido_2 = ((Modelo_Clientes) lista_clientes.get(i)).getNombre_apellido_2();

                    model.addRow(new Object[]{dni, nombres_apellido, dni_2, nombres_apellido_2});

                    this.panelVentas.jTable1.setModel(model);

                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se agrego al trabajador");
                    mensaje.setVisible(true);

                }

            }

        }

        if (e.getSource() == this.panelVentas.btnClienteBuscar) {

            String dni_leido = this.panelVentas.txfBuscar.getText();
            Linked_List.ResultadoClientes resultado = lista_clientes.findClientes(lista_clientes, dni_leido);
            if (resultado.isFunciona()) {
                DefaultTableModel model = new DefaultTableModel(new String[]{"DNI", "Nombres y Apellidos", "DNI", "Nombres y Apellidos"}, 0);
                for (int i = 0; i < resultado.getTemp().size(); i++) {

                    String dni = ((Modelo_Clientes) lista_clientes.get(i)).getDni();
                    String nombres_apellido = ((Modelo_Clientes) lista_clientes.get(i)).getNombre_apellido();
                    String dni_2 = ((Modelo_Clientes) lista_clientes.get(i)).getDni_2();
                    String nombres_apellido_2 = ((Modelo_Clientes) lista_clientes.get(i)).getNombre_apellido_2();
                    String correo = ((Modelo_Clientes) lista_clientes.get(i)).getCorreo();
                    String direccion = ((Modelo_Clientes) lista_clientes.get(i)).getDireccion();
                    String ciudad = ((Modelo_Clientes) lista_clientes.get(i)).getCiudad();
                    String pais = ((Modelo_Clientes) lista_clientes.get(i)).getPais();

                    model.addRow(new Object[]{dni, nombres_apellido, dni_2, nombres_apellido_2});

                }
                this.panelVentas.jTable1.setModel(model);

            } else {
                Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el DNI");
                mensaje.setVisible(true);
            }
        }

        if (e.getSource() == this.panelVentas.btnAlmacenBuscar) {//boton buscar del almacen
            this.panelVentas.jTable1.clearSelection();
            if (this.panelVentas.rbCodigo.isSelected()) {// UNICO ID
                String temp_id = this.panelVentas.txfAlmacenBuscar.getText();
                Linked_List.InventarioTEMP temp = lista_vehiculos.findIndexId(lista_vehiculos, temp_id);
                if (temp.isFunciona()) {
                    int index = (int) ((temp.getTemp()).peek());

                    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Descripcion", "Marca", "Precio",}, 0);
                    String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getId();

                    String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getNombre_prod();

                    float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getPrecio();
                    String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(index)).getMarca();

                    model.addRow(new Object[]{id, descripcion, marca, precio});

                    this.panelVentas.tAlmacen.setModel(model);

                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el articulo con ese ID");
                    mensaje.setVisible(true);
                }
            }
            if (this.panelVentas.rbDescripcion.isSelected()) { // DESCRIPCION
                String temp_id = this.panelVentas.txfAlmacenBuscar.getText();
                Linked_List.InventarioTEMP temp = lista_vehiculos.findIndexNombre(lista_vehiculos, temp_id);
                if (temp.isFunciona()) {

                    LinkedList<Integer> temp_list = temp.getTemp();
                    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Descripcion", "Marca", "Precio",}, 0);
                    for (int j = 0; j < temp_list.size(); j++) {
                        int i = (int) temp.getTemp().get(j);
                        String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getId();

                        String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getNombre_prod();

                        float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getPrecio();
                        String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getMarca();

                        model.addRow(new Object[]{id, descripcion, marca, precio});

                    }

                    this.panelVentas.tAlmacen.setModel(model);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el articulo con esa descripción");
                    mensaje.setVisible(true);
                }
            }
            if (this.panelVentas.rbMarca.isSelected()) { // MARCA
                String temp_id = this.panelVentas.txfAlmacenBuscar.getText();
                Linked_List.InventarioTEMP temp = lista_vehiculos.findIndexMarca(lista_vehiculos, temp_id);
                if (temp.isFunciona()) {

                    LinkedList<Integer> temp_list = temp.getTemp();
                    DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Descripcion", "Marca", "Precio",}, 0);
                    for (int j = 0; j < temp_list.size(); j++) {
                        int i = (int) temp.getTemp().get(j);
                        String id = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getId();

                        String descripcion = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getNombre_prod();

                        float precio = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getPrecio();
                        String marca = ((Modelo_Inventario_Vehiculos) lista_vehiculos.get(i)).getMarca();

                        model.addRow(new Object[]{id, descripcion, marca, precio});

                    }
                    this.panelVentas.tAlmacen.setModel(model);
                } else {
                    Emergente_Aviso mensaje = new Emergente_Aviso(ventanaAdmin, true, "No se encontro el articulo con esa marca");
                    mensaje.setVisible(true);
                }
            }

        }

    }
}
