package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas_Marca extends ConexionSQL {

    public boolean create(Modelo_Marcas user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO Marcas "
                + "( id, marca)"
                + "values ( ?, ?)";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getId());
            ps.setString(2, user.getMarca());

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

    public boolean read(Modelo_Marcas user) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Marcas WHERE id=?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                user.setMarca(rs.getString("marca"));

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

    public boolean update(Modelo_Marcas user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE Marcas SET "
                + "marca = ? "
                + "WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getMarca());
            ps.setInt(2, user.getId());
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

    public boolean delete(Modelo_Marcas user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM Marcas WHERE id = ?";

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
        Linked_List<Modelo_Marcas> listausers = new Linked_List();
        Modelo_Marcas user = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Marcas";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                user = new Modelo_Marcas();

                user.setId(rs.getInt("id"));

                user.setMarca(rs.getString("marca"));

                listausers.add(user);

            }

            ps.close();
            return listausers;

        } catch (SQLException e) {
            System.err.println(e);
            user = new Modelo_Marcas();

            listausers.add(user);
            return listausers;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

}
