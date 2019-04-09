package modelo;

import java.util.LinkedList;

public class Linked_List<T> extends LinkedList {

    public int findTrabajador(Linked_List<Modelo_Trabajadores> list, String dni) {
        for (int i = 0; i < list.size(); i++) {
            if (((Modelo_Trabajadores) list.get(i)).getDni().compareTo(dni) == 0) {
                return i;
            }
        }
        System.out.println("No se encontro el dni");
        return 0;
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
