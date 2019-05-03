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
                + "( id, marca,valor,titulo,descripcion ) "
                + "values ( ?, ?,?,?,?)";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getId());
            ps.setString(2, user.getDato());
            ps.setString(3, user.getValor());
            ps.setString(4, user.getTitulo());
            ps.setString(5, user.getDescripcion());

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
                user.setTitulo(rs.getString("titulo"));
                user.setDescripcion(rs.getString("descripcion"));

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
                + "dato = ?, valor = ?,titulo = ?,descripcion = ?"
                + " WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getDato());
            ps.setString(2, user.getValor());
            ps.setString(3, user.getTitulo());
            ps.setString(4, user.getDescripcion());
            ps.setInt(5, user.getId());
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
        Modelo_Ajustes ajustes = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Configuracion";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                ajustes = new Modelo_Ajustes();

                ajustes.setId(rs.getInt("id"));
                ajustes.setDato(rs.getString("dato"));
                ajustes.setValor(rs.getString("valor"));
                ajustes.setTitulo(rs.getString("titulo"));
                ajustes.setDescripcion(rs.getString("descripcion"));

                listausers.add(ajustes);

            }

            ps.close();
            return listausers;

        } catch (SQLException e) {
            System.err.println(e);
            ajustes = new Modelo_Ajustes();

            listausers.add(ajustes);
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
