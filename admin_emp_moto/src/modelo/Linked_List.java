package modelo;

import java.util.LinkedList;

public class Linked_List<T> extends LinkedList {

    public int findTrabajador(Linked_List<Modelo_Trabajadores> list, String dni) {
        for(int i = 0; i<list.size();i++){
            if( ( (Modelo_Trabajadores)list.get(i) ).getDni().compareTo(dni) ==0){
                return i;
            }
        }    
        System.out.println("No se encontro el dni");
        return 0;
    }
    public int findAsistencia(Linked_List<Modelo_Asistencia> list, String dni) {
        for(int i = 0; i<list.size();i++){
            if( ( (Modelo_Asistencia)list.get(i) ).getDni().compareTo(dni) ==0){
                return i;
            }
        }    
        System.out.println("No se encontro el dni");
        return 0;
    }
    
}