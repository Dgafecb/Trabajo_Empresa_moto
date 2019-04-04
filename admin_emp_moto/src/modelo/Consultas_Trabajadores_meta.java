package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class Consultas_Trabajadores_meta extends ConexionSQL {

    public boolean create(Modelo_Trabajadores_meta trabajador_meta) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO Trabajadores_meta "
                + "(id, correo, telefono, direccion, ciudad)"
                + "values ( ?, ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, trabajador_meta.getId());
            ps.setString(2, trabajador_meta.getCorreo());
            ps.setString(3, trabajador_meta.getTelefono());
            ps.setString(4, trabajador_meta.getDireccion());
            ps.setString(5, trabajador_meta.getCiudad());
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

    public boolean read(Modelo_Trabajadores_meta trabajador_meta) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM trabajadores WHERE id=?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, trabajador_meta.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                trabajador_meta.setCorreo(rs.getString("correo"));
                trabajador_meta.setTelefono(rs.getString("telefono"));
                trabajador_meta.setDireccion(rs.getString("direccion"));
                trabajador_meta.setCiudad(rs.getString("ciudad"));
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

    public boolean update(Modelo_Trabajadores_meta trabajador_meta) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE trabajadores SET"
                + "correo = ? , telefono = ?, direccion= ? ciudad = ?"
                + "WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, trabajador_meta.getCorreo());
            ps.setString(2, trabajador_meta.getTelefono());
            ps.setString(3, trabajador_meta.getDireccion());
            ps.setString(4, trabajador_meta.getCiudad());
            ps.setInt(5, trabajador_meta.getId());
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

    public boolean delete(Modelo_Trabajadores_meta trabajador_meta) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM trabajadores WHERE id = ?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, trabajador_meta.getId());
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
}
