/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Dgafecb
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dgafecb
 */
public class Modelo_Consultas_trabajadores extends Modelo_Connection {

    public boolean create(Modelo_trabajadores user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO trabajadores "
                + "( nombre_trabajador, apellido_trabajador, edad, email)"
                + "values ( ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getNombre_trabajador());
            ps.setString(2, user.getApellido_trabajador());
            ps.setInt(3, user.getEdad());
            ps.setString(4, user.getEmail());
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

    public boolean update(Modelo_trabajadores user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE trabajadores SET"
                + "nombre_trabajador = ? , apellido_trabajador = ?, edad = ?, email = ?"
                + "WHERE ID = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getNombre_trabajador());
            ps.setString(2, user.getApellido_trabajador());
            ps.setInt(3, user.getEdad());
            ps.setString(4, user.getEmail());
            ps.setInt(5,user.getID());
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

    public boolean delete(Modelo_trabajadores user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM trabajadores WHERE ID = ?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getID());
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