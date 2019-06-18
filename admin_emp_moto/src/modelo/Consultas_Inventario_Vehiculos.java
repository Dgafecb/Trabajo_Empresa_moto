package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

public class Consultas_Inventario_Vehiculos extends ConexionSQL {

    public boolean create(Modelo_Almacen user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO Inventario_vehiculos "
                + "( id,nombre_prod, tipo_vehiculo, marca,modelo,color,motor,chasis,"
                + "anho_fab,anhos_garantia,cantidad,precio,limite_advertencia,precio_costo,comision)"
                + "values ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?)";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getId());
            ps.setString(2, user.getNombre_prod());
            ps.setString(3, user.getTipo_vehiculo());
            ps.setString(4, user.getMarca());
            ps.setString(5, user.getModelo());
            ps.setString(6, user.getColor());
            ps.setString(7, user.getMotor());
            ps.setString(8, user.getChasis());
            ps.setString(9, user.getAnho_fab());
            ps.setString(10, user.getAnhos_garantia());
            ps.setInt(11, user.getCantidad());
            ps.setFloat(12, user.getPrecio());
            ps.setInt(13, user.getLimite_advertencia());
            ps.setFloat(14, user.getPrecio_compra());
            ps.setInt(15, user.getComision());

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

    public boolean read(Modelo_Almacen user) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Inventario_vehiculos WHERE id=?";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                user.setNombre_prod(rs.getString("nombre_prod"));
                user.setAnho_fab(rs.getString("anho_fab"));
                user.setAnhos_garantia(rs.getString("anhos_garantia"));
                user.setCantidad(rs.getInt("cantidad"));
                user.setChasis(rs.getString("chasis"));
                user.setColor(rs.getString("color"));
                user.setLimite_advertencia(rs.getInt("limite_advertencia"));
                user.setMarca(rs.getString("marca"));
                user.setModelo(rs.getString("modelo"));
                user.setMotor(rs.getString("motor"));
                user.setPrecio(rs.getFloat("precio"));
                user.setTipo_vehiculo(rs.getString("tipo_vehiculo"));
                user.setPrecio_compra(rs.getFloat("precio_costo"));
                user.setComision(rs.getInt("comision"));
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

    public boolean update(Modelo_Almacen user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE Inventario_vehiculos SET "
                + "nombre_prod = ?,tipo_vehiculo = ?, marca = ?,modelo= ?, color= ?,"
                + "motor= ?, chasis = ?,anho_fab = ?,anhos_garantia = ?,cantidad = ?,"
                + "precio = ?, limite_advertencia = ?,precio_costo=? , comision = ? "
                + " WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getNombre_prod());
            ps.setString(2, user.getTipo_vehiculo());
            ps.setString(3, user.getMarca());
            ps.setString(4, user.getModelo());
            ps.setString(5, user.getColor());
            ps.setString(6, user.getMotor());
            ps.setString(7, user.getChasis());
            ps.setString(8, user.getAnho_fab());
            ps.setString(9, user.getAnhos_garantia());
            ps.setInt(10, user.getCantidad());
            ps.setFloat(11, user.getPrecio());
            ps.setInt(12, user.getLimite_advertencia());
            ps.setFloat(13, user.getPrecio_compra());
            ps.setInt(14, user.getComision());
            ps.setString(15, user.getId());

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

    public boolean delete(Modelo_Almacen user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM Inventario_vehiculos WHERE id = ?";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getId());
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
        Linked_List<Modelo_Almacen> listaVehiculos = new Linked_List();
        Modelo_Almacen vehiculo = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Inventario_vehiculos";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                vehiculo = new Modelo_Almacen();

                vehiculo.setAnho_fab(rs.getString("anho_fab"));
                vehiculo.setAnhos_garantia(rs.getString("anhos_garantia"));
                vehiculo.setCantidad(rs.getInt("cantidad"));
                vehiculo.setChasis(rs.getString("chasis"));
                vehiculo.setColor(rs.getString("color"));
                vehiculo.setNombre_prod(rs.getString("nombre_prod"));
                vehiculo.setId(rs.getString("id"));
                vehiculo.setLimite_advertencia(rs.getInt("limite_advertencia"));
                vehiculo.setMarca(rs.getString("marca"));
                vehiculo.setModelo(rs.getString("modelo"));
                vehiculo.setMotor(rs.getString("motor"));
                vehiculo.setPrecio(rs.getFloat("precio"));
                vehiculo.setTipo_vehiculo(rs.getString("tipo_vehiculo"));
                vehiculo.setPrecio_compra(rs.getFloat("precio_costo"));
                vehiculo.setComision(rs.getInt("comision"));

                listaVehiculos.add(vehiculo);

            }

            ps.close();
            return listaVehiculos;

        } catch (SQLException e) {
            System.err.println(e);
            vehiculo = new Modelo_Almacen();
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
