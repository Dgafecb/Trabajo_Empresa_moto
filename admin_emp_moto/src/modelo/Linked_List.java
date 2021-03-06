package modelo;

import java.util.LinkedList;

public class Linked_List<T> extends LinkedList {

    public int findIdVentas(Linked_List<Modelo_Ventas> list, int id) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Ventas) list.get(i)).getId() == id) {
                index = i;
            }
        }

        return index;
    }

    public LinkedList<Integer> findIdVendedor(Linked_List<Modelo_Ventas> list, int id) {
        LinkedList<Integer> temp = null;
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Ventas) list.get(i)).getId_trabajador() == id) {
                temp = new LinkedList();
                temp.add(i);
            }
        }

        return temp;
    }

    public LinkedList<Integer> findIdProducto(Linked_List<Modelo_Ventas> list, String id) {
        LinkedList<Integer> temp = null;
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Ventas) list.get(i)).getId_prod().compareTo(id) == 0) {
                temp = new LinkedList();
                temp.add(i);
            }
        }

        return temp;
    }
    
    

    public LinkedList<Integer> findIdCliente(Linked_List<Modelo_Ventas> list, int id) {
        LinkedList<Integer> temp = null;
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Ventas) list.get(i)).getId_cliente() == id) {
                temp = new LinkedList();
                temp.add(i);
            }
        }

        return temp;
    }

    public funcionaClientes findIdClientes(Linked_List<Modelo_Clientes> list, int id) {
        funcionaClientes temp = new funcionaClientes();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Clientes) list.get(i)).getId() == id) {
                index = i;
            }
        }
        if (index != -1) {
            temp.setI(index);
            temp.setFunciona(true);
            return temp;
        } else {
            temp.setI(index);
            temp.setFunciona(false);
            return temp;
        }
    }

    public funcionaAlmacenado findAlmacenado(Linked_List<Almacenado> list, String id) {

        funcionaAlmacenado temp = new funcionaAlmacenado();
        if (list != null) {
            int index = -1;
            for (int i = 0; i < list.size(); i++) {
                if (((Almacenado) list.get(i)).getId().compareTo(id) == 0) {
                    index = i;
                }
            }

            if (index == -1) {
                temp.setI(0);
                temp.setFunciona(false);
                return temp;

            } else {
                temp.setI(index);
                temp.setFunciona(true);
                return temp;
            }

        } else {
            temp.setFunciona(false);
            temp.setI(0);
            return temp;
        }
    }
    
    public int findIdProductoIndex(Linked_List<Modelo_Almacen> list, Modelo_Almacen miv) {
        int temp  = 0;
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Almacen) list.get(i)).equals(miv)) {
                temp = i;
                
            }
        }

        return temp;
    }
    
    public Modelo_Almacen findIdProductoxID(Linked_List<Modelo_Almacen> list, String id) {
        Modelo_Almacen temp = null;
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Almacen) list.get(i)).getId().equals(id)) {
                temp = ((Modelo_Almacen) list.get(i));
                
            }
        }
        if(temp == null){
            temp = new Modelo_Almacen();
            temp.setNombre_prod("NO DISPONIBLE");
        }

        return temp;
    }
    
    public Modelo_Almacen findIdProductoxDescripcion(Linked_List<Modelo_Almacen> list, String id) {
        Modelo_Almacen temp = null;
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Almacen) list.get(i)).getNombre_prod().equalsIgnoreCase(id)) {
                temp = ((Modelo_Almacen) list.get(i));
                
            }
        }

        return temp;
    }

    public int findTrabajador(Linked_List<Modelo_Trabajadores> list, String dni) {
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Trabajadores) list.get(i)).getDni().compareTo(dni) == 0) {
                return i;
            }
        }
        System.out.println("No se encontro el dni");
        return 0;
    }
    public int findIDTrabajador(Linked_List<Modelo_Trabajadores> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Trabajadores) list.get(i)).getId() == Integer.valueOf(id)) {
                return i;
            }
        }
        System.out.println("No se encontro el dni");
        return -1;
    }
    public int findInventario(Linked_List<Modelo_Almacen> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Almacen) list.get(i)).getId().compareTo(id) == 0) {
                return i;
            }
        }
        return 0;
    }

    public InventarioTEMP findIndexId(Linked_List<Modelo_Almacen> list, String id) {
        InventarioTEMP TEMP = new InventarioTEMP();
        LinkedList<Integer> temp = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Almacen) list.get(i)).getId().equalsIgnoreCase(id) == true) {
                temp.add(i);
            }
        }
        if (!temp.isEmpty()) {
            TEMP.setTemp(temp);
            TEMP.setFunciona(true);
            return TEMP;

        } else {
            System.out.println("No se encontro el id");
            TEMP.setTemp(temp);
            TEMP.setFunciona(false);
            return TEMP;
        }

    }

    public InventarioTEMP findIndexNombre(Linked_List<Modelo_Almacen> list, String nombre) {
        InventarioTEMP TEMP = new InventarioTEMP();
        LinkedList<Integer> temp = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Almacen) list.get(i)).getNombre_prod().equalsIgnoreCase(nombre) == true) {
                temp.add(i);
            }
        }
        if (!temp.isEmpty()) {
            TEMP.setTemp(temp);
            TEMP.setFunciona(true);
            return TEMP;

        } else {
            System.out.println("No se encontro el nombre");
            TEMP.setTemp(temp);
            TEMP.setFunciona(false);
            return TEMP;
        }

    }

    public InventarioTEMP findIndexMarca(Linked_List<Modelo_Almacen> list, String marca) {
        InventarioTEMP TEMP = new InventarioTEMP();
        LinkedList<Integer> temp = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Almacen) list.get(i)).getMarca().equalsIgnoreCase(marca) == true) {
                temp.add(i);
            }
        }
        if (!temp.isEmpty()) {
            TEMP.setTemp(temp);
            TEMP.setFunciona(true);
            return TEMP;

        } else {
            System.out.println("No se encontro la marca");
            TEMP.setTemp(temp);
            TEMP.setFunciona(false);
            return TEMP;
        }

    }

    public ResultadoClientes findClientes(Linked_List<Modelo_Clientes> list, String dni) {
        LinkedList<Integer> temp = new LinkedList<>();
        ResultadoClientes resultado = new ResultadoClientes();
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Clientes) list.get(i)).getDni().compareTo(dni) == 0 || ((Modelo_Clientes) list.get(i)).getDni_2().compareTo(dni) == 0) {
                temp.add(i);
            }
        }
        if (!temp.isEmpty()) {
            resultado.setFunciona(true);
            resultado.setTemp(temp);
            return resultado;
        } else {
            System.out.println("No se encontro el dni");
            resultado.setFunciona(false);
            resultado.setTemp(temp);
            return resultado;
        }
    }

    public ResultadoDNITrabajador findDNI(Linked_List<Modelo_Trabajadores> list, String dni) {
        ResultadoDNITrabajador resultado = new ResultadoDNITrabajador();
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Trabajadores) list.get(i)).getDni().compareTo(dni) == 0) {
                resultado.setI(i);
                resultado.setResultado(true);
                return resultado;
            }
        }
        System.out.println("No se encontro el dni");
        resultado.setI(0);
        resultado.setResultado(false);
        return resultado;
    }

    public int findAsistencia(Linked_List<Modelo_Asistencia> list, String dni) {
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Asistencia) list.get(i)).getDni().compareTo(dni) == 0) {
                return i;
            }
        }
        System.out.println("No se encontro el dni");
        return 0;
    }

    public ResultadoListaAsistenciaDNI findAsistenciaList(Linked_List<Modelo_Asistencia> list, String dni) {//Devuelve todos los indices en que el dni coincide
        LinkedList<Integer> temp = new LinkedList<>();
        ResultadoListaAsistenciaDNI resultado = new ResultadoListaAsistenciaDNI();
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Asistencia) list.get(i)).getDni().compareTo(dni) == 0) {
                temp.add(i);
            }
        }
        if (!temp.isEmpty()) {
            resultado.setFunciona(true);
            resultado.setTemp(temp);
            return resultado;
        } else {
            System.out.println("No se encontro el dni");
            resultado.setFunciona(false);
            resultado.setTemp(temp);
            return resultado;
        }
    }
    
    public int findIndexTrabajador(Linked_List<Modelo_Trabajadores> list, int ID){
        for (int i = 0 ; i<list.size() ;i++){
            if(((Modelo_Trabajadores)list.get(i)).getId()==ID){
                return i;
            }
        }
        return -1;
    }
    
    public int findindexCliente(Linked_List<Modelo_Clientes> list,int ID){
        for (int i = 0 ; i<list.size() ;i++){
            if(((Modelo_Clientes)list.get(i)).getId()==ID){
                return i;
            }
        }
        return -1;
    }

    public int findIndexAlmacen(Linked_List<Modelo_Almacen> list, String id) {
        for (int i = 0 ; i<list.size() ;i++){
            if(((Modelo_Almacen)list.get(i)).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    
    public int findIndexVenta(Linked_List<Modelo_Ventas> list, int id) {
        for (int i = 0 ; i<list.size() ;i++){
            if(((Modelo_Ventas)list.get(i)).getId()==id){
                return i;
            }
        }
        return -1;
    }

    public static class funcionaClientes {

        int i;
        boolean funciona;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public boolean isFunciona() {
            return funciona;
        }

        public void setFunciona(boolean funciona) {
            this.funciona = funciona;
        }

    }

    public static class funcionaAlmacenado {

        int i;
        boolean funciona;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public boolean isFunciona() {
            return funciona;
        }

        public void setFunciona(boolean funciona) {
            this.funciona = funciona;
        }

    }

    public static class Almacenado {

        String id;
        int cantidad;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

    }

    public class ResultadoClientes {

        LinkedList<Integer> temp;
        boolean funciona;

        public LinkedList<Integer> getTemp() {
            return temp;
        }

        public void setTemp(LinkedList<Integer> temp) {
            this.temp = temp;
        }

        public boolean isFunciona() {
            return funciona;
        }

        public void setFunciona(boolean funciona) {
            this.funciona = funciona;
        }

    }

    public class InventarioTEMP {

        LinkedList<Integer> temp;
        boolean funciona;

        public LinkedList<Integer> getTemp() {
            return temp;
        }

        public void setTemp(LinkedList<Integer> temp) {
            this.temp = temp;
        }

        public boolean isFunciona() {
            return funciona;
        }

        public void setFunciona(boolean funciona) {
            this.funciona = funciona;
        }

    }

    public class ResultadoDNITrabajador {

        int i;
        boolean resultado;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public boolean isResultado() {
            return resultado;
        }

        public void setResultado(boolean resultado) {
            this.resultado = resultado;
        }

    }

    public class ResultadoListaAsistenciaDNI {

        LinkedList<Integer> temp;
        boolean funciona;

        public LinkedList<Integer> getTemp() {
            return temp;
        }

        public void setTemp(LinkedList<Integer> temp) {
            this.temp = temp;
        }

        public boolean isFunciona() {
            return funciona;
        }

        public void setFunciona(boolean funciona) {
            this.funciona = funciona;
        }

    }
}
