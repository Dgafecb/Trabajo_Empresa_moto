
package modelo;


public class Modelo_Ventas {
    
    private int id;
    private int id_factura;  
    private int id_prod;
    private int id_trabajador;
    private int id_cliente;
    private String fecha_hora;
    private float monto_inicial;
    private int cuotas ;
    private int dscto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public float getMonto_inicial() {
        return monto_inicial;
    }

    public void setMonto_inicial(float monto_inicial) {
        this.monto_inicial = monto_inicial;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public int getDscto() {
        return dscto;
    }

    public void setDscto(int dscto) {
        this.dscto = dscto;
    }

    public int getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(int id_trabajador) {
        this.id_trabajador = id_trabajador;
    }
    
    
}
