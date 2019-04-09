package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Consultas_Inventario_Repuestos extends ConexionSQL {

    public boolean create(Modelo_Inventario_Repuestos user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO Inventario_repuestos "
                + "( id,nombre_prod, marca,modelo,cantidad,precio,limite_advertencia)"
                + "values ( ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getId());
            ps.setString(2, user.getNombre_prod());
            
            ps.setString(3, user.getMarca());
            ps.setString(4, user.getModelo());
            
            ps.setInt(5, user.getCantidad());
            ps.setFloat(6, user.getPrecio());
            ps.setInt(7, user.getLimite_advertencia());
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

    public boolean read(Modelo_Inventario_Repuestos user) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Inventario_repuestos WHERE id=?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                user.setNombre_prod(rs.getString("nombre_prod"));
                user.setCantidad(rs.getInt("cantidad"));
                user.setLimite_advertencia(rs.getInt("limite_advertencia"));
                user.setMarca(rs.getString("marca"));
                user.setModelo(rs.getString("modelo"));
                user.setPrecio(rs.getFloat("precio"));
                

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

    public boolean update(Modelo_Inventario_Repuestos user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE Inventario_repuestos SET "
                + "nombre_prod = ?, marca = ?,modelo= ?,cantidad = ?, precio = ?, limite_advertencia = ? "
                + "WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getNombre_prod());
            
            ps.setString(2, user.getMarca());
            ps.setString(3, user.getModelo());
            
            ps.setInt(4, user.getCantidad());
            ps.setFloat(5, user.getPrecio());
            ps.setInt(6, user.getLimite_advertencia());
            ps.setInt(7, user.getId());
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

    public boolean delete(Modelo_Inventario_Repuestos user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM Inventario_repuestos WHERE id = ?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getId());
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
        Linked_List<Modelo_Inventario_Repuestos> listaVehiculos = new Linked_List();
        Modelo_Inventario_Repuestos vehiculo = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Inventario_repuestos";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                vehiculo = new Modelo_Inventario_Repuestos();
                
                
                vehiculo.setCantidad(rs.getInt("cantidad"));
                vehiculo.setNombre_prod(rs.getString("nombre_prod"));
                vehiculo.setId(rs.getInt("id"));
                vehiculo.setLimite_advertencia(rs.getInt("limite_advertencia"));
                vehiculo.setMarca(rs.getString("marca"));
                vehiculo.setModelo(rs.getString("modelo"));
                vehiculo.setPrecio(rs.getFloat("precio")); 
                listaVehiculos.add(vehiculo);

            }

            ps.close();
            return listaVehiculos;

        } catch (SQLException e) {
            System.err.println(e);
            vehiculo = new Modelo_Inventario_Repuestos();
            vehiculo.setNombre_prod("0");

            listaVehiculos.add(vehiculo);
            return listaVehiculos;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
