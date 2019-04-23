package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;


public class Consultas_Trabajadores extends ConexionSQL {

    public boolean create(Modelo_Trabajadores user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO Trabajadores "
                + "( dni, password, nombre,apellido,privilege,fecha_creacion,sueldo)"
                + "values ( ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getDni());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNombre());
            ps.setString(4, user.getApellido());
            ps.setInt(5, user.getPrivilege());
            ps.setString(6, user.getFecha_creacion());
            ps.setFloat(7, user.getSueldo());
            ps.execute();
            ps.close();
            return true;

        }
        catch(SQLIntegrityConstraintViolationException e){
            System.err.println(e);
            return false;
        }catch (SQLException e) {
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

    public boolean read(Modelo_Trabajadores user) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Trabajadores WHERE dni=?";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getDni());
            rs = ps.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setDni(rs.getString("dni"));
                user.setPassword(rs.getString("password"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setPrivilege(rs.getInt("privilege"));
                user.setFecha_creacion(rs.getString("fecha_creacion"));
                user.setSueldo(rs.getFloat("sueldo"));
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

    public boolean update(Modelo_Trabajadores user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE Trabajadores SET "
                + "dni = ? , password = ?,nombre = ?,apellido=?, privilege = ?, fecha_creacion=?,sueldo=? "
                + "WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getDni());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNombre());
            ps.setString(4, user.getApellido());
            ps.setInt(5, user.getPrivilege());
            ps.setString(6, user.getFecha_creacion());
            ps.setFloat(7, user.getSueldo());
            ps.setInt(8, user.getId());
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

    public boolean delete(Modelo_Trabajadores user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM Trabajadores WHERE id = ?";

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
        Linked_List<Modelo_Trabajadores> listaTrabajadores = new Linked_List();
        Modelo_Trabajadores trabajador = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Trabajadores";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                trabajador = new Modelo_Trabajadores();
                trabajador.setId(rs.getInt("id"));
                trabajador.setDni(rs.getString("dni"));
                trabajador.setPassword(rs.getString("password"));
                trabajador.setNombre(rs.getString("nombre"));
                trabajador.setApellido(rs.getString("apellido"));
                trabajador.setSueldo(rs.getFloat("sueldo"));
                trabajador.setFecha_creacion("fecha_creacion");
                trabajador.setPrivilege(rs.getInt("privilege"));
                listaTrabajadores.add(trabajador);

            }

            ps.close();
            return listaTrabajadores;

        } catch (SQLException e) {
            System.err.println(e);
            trabajador = new Modelo_Trabajadores();
            trabajador.setDni("0");
            trabajador.setNombre("Sin Datos");
            listaTrabajadores.add(trabajador);
            return listaTrabajadores;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
