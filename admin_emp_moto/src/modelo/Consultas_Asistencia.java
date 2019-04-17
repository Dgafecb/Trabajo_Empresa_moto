package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class Consultas_Asistencia extends ConexionSQL {

    public boolean create(Modelo_Asistencia user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO Asistencia "
                + "( dni,fecha,hora_entrada)"
                + "values ( ?, ?, ?)";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getDni());
            ps.setString(2, user.getFecha());
            ps.setString(3, user.getHora_entrada());

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

    public boolean read(Modelo_Asistencia user) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Asistencia WHERE dni=?";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getDni());
            rs = ps.executeQuery();

            if (rs.next()) {

                user.setDni(rs.getString("dni"));
                user.setFecha(rs.getString("fecha"));
                user.setHora_entrada(rs.getString("hora_entrada"));

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

    public boolean update(Modelo_Asistencia user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE Asistencia SET "
                + "dni = ? , fecha = ?, hora_entrada = ? "
                + "WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getDni());
            ps.setString(2, user.getFecha());
            ps.setString(3, user.getHora_entrada());
            ps.setInt(4, user.getId());

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

    public boolean delete(Modelo_Asistencia user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM Asistencia WHERE id = ?";

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
        Linked_List<Modelo_Asistencia> listaTrabajadores = new Linked_List();
        Modelo_Asistencia asistencia = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Asistencia";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                asistencia = new Modelo_Asistencia();
                asistencia.setId(rs.getInt("id"));
                asistencia.setDni(rs.getString("dni"));
                asistencia.setFecha(rs.getString("fecha"));
                asistencia.setHora_entrada(rs.getString("hora_entrada"));
                listaTrabajadores.add(asistencia);

            }

            ps.close();
            return listaTrabajadores;

        } catch (SQLException e) {
            System.err.println(e);
            asistencia = new Modelo_Asistencia();
            asistencia.setDni("0");
        
            listaTrabajadores.add(asistencia);
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
