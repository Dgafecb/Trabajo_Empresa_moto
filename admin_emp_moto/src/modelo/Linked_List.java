/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author Dgafecb
 * @param <T>
 */
public class Linked_List<T> extends LinkedList {

    public int findTrabajador(Linked_List<Modelo_Trabajadores> list, String dni) {
        for(int i = 0; i<list.size();i++){
            if(((Modelo_Trabajadores)list.get(i)).getDni().compareTo(dni) ==0){
                return i;
            }
        }    
        System.out.println("No se encontro el dni");
        return 0;
    }
    
}