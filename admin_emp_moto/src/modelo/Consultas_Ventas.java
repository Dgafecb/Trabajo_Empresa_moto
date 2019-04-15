package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;


public class Consultas_Ventas extends ConexionSQL {

    public int create(Modelo_Ventas ventas) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO Ventas "
                + "( id, id_factura, id_prod,id_trabajador,id_cliente,fecha_hora,monto_inicial,cuotas,dscto, cantidad, total)"
                + " values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, ventas.getId());
            ps.setString(2, ventas.getId_factura());
            ps.setString(3, ventas.getId_prod());
            ps.setInt(4, ventas.getId_trabajador());
            ps.setInt(5, ventas.getId_cliente());
            ps.setString(6, ventas.getFecha_hora());
            ps.setFloat(7,ventas.getMonto_inicial());
            ps.setInt(8, ventas.getCuotas());
            ps.setInt(9, ventas.getDscto());
            ps.setInt(10, ventas.getCantidad());
            ps.setFloat(11, ventas.getTotal());
            ps.execute();
            ps.close();
            return 2;

        }
        catch(SQLIntegrityConstraintViolationException e){
            System.err.println(e);
            return 0;
        }catch (SQLException e) {
            System.err.println(e);
            return 1;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean read(Modelo_Ventas ventas) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Ventas WHERE id=?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, ventas.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                ventas.setId(rs.getInt("id"));
                ventas.setId_factura(rs.getString("id_factura")); 
                ventas.setId_prod(rs.getString("id_prod"));
                ventas.setId_trabajador(rs.getInt("id_trabajador"));
                ventas.setId_cliente(rs.getInt("id_cliente"));
                ventas.setFecha_hora(rs.getString("fecha_hora"));
                ventas.setMonto_inicial(rs.getFloat("monto_inicial"));
                ventas.setCuotas(rs.getInt("cuotas"));
                ventas.setDscto(rs.getInt("dscto"));
                return true;
            }

            ps.close();
            return false;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean update(Modelo_Ventas ventas) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE Ventas SET "
                + "id_factura= ? , id_prod = ? , id_trabajador = ?,id_cliente = ?,fecha_hora=?,"
                + " monto_inicial = ?, cuotas =?, dscto=? ,cantidad =?, total= ? "
                + "WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            
            ps.setString(1, ventas.getId_factura());
            ps.setString(2, ventas.getId_prod());
            ps.setInt(3, ventas.getId_trabajador());
            ps.setInt(4, ventas.getId_cliente());
            ps.setString(5, ventas.getFecha_hora());
            ps.setFloat(6,ventas.getMonto_inicial());
            ps.setInt(7, ventas.getCuotas());
            ps.setInt(8, ventas.getDscto());
            ps.setInt(9, ventas.getCantidad());
            ps.setFloat(10, ventas.getTotal());
            ps.setInt(11, ventas.getId());
            ps.execute();
            ps.close();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean delete(Modelo_Ventas ventas) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM Ventas WHERE id = ?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, ventas.getId());
            ps.execute();
            ps.close();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public Linked_List readAll() {
        Linked_List<Modelo_Ventas> listVentas = new Linked_List();
        Modelo_Ventas ventas = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Ventas";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                ventas = new Modelo_Ventas();
                ventas.setId(rs.getInt("id"));
                ventas.setId_factura(rs.getString("id_factura")); 
                ventas.setId_prod(rs.getString("id_prod"));
                ventas.setId_trabajador(rs.getInt("id_trabajador"));
                ventas.setId_cliente(rs.getInt("id_cliente"));
                ventas.setFecha_hora(rs.getString("fecha_hora"));
                ventas.setMonto_inicial(rs.getFloat("monto_inicial"));
                ventas.setCuotas(rs.getInt("cuotas"));
                ventas.setDscto(rs.getInt("dscto"));
                ventas.setCantidad(rs.getInt("cantidad"));
                ventas.setTotal(rs.getFloat("total"));
                
                listVentas.add(ventas);

            }

            ps.close();
            return listVentas;

        } catch (SQLException e) {
            System.err.println(e);
            ventas = new Modelo_Ventas();
            listVentas.add(ventas);
            return listVentas;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
