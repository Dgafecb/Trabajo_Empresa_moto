package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas_Ajustes extends ConexionSQL {

    public boolean create(Modelo_Ajustes user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO Configuracion "
                + "( id, marca,valor ) "
                + "values ( ?, ?,?)";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getId());
            ps.setString(2, user.getDato());
            ps.setString(3, user.getValor());

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

    public boolean read(Modelo_Ajustes user) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Configuracion WHERE id=?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                user.setDato(rs.getString("dato"));
                user.setValor(rs.getString("valor"));

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

    public boolean update(Modelo_Ajustes user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE Configuracion SET "
                + "datos = ?, valor = ?"
                + "WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getDato());

            ps.setString(2, user.getValor());
            ps.setInt(3, user.getId());
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

    public boolean delete(Modelo_Ajustes user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM Configuracion WHERE id = ?";

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
        Linked_List<Modelo_Ajustes> listausers = new Linked_List();
        Modelo_Ajustes user = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Configuracion";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                user = new Modelo_Ajustes();

                user.setId(rs.getInt("id"));

                user.setDato(rs.getString("dato"));
                user.setValor(rs.getString("valor"));

                listausers.add(user);

            }

            ps.close();
            return listausers;

        } catch (SQLException e) {
            System.err.println(e);
            user = new Modelo_Ajustes();

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
