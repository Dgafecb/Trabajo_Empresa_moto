/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dgafecb
 */
public class Modelo_Consultas_inventario extends Modelo_Connection {

    public boolean create(Modelo_inventario user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO inventario "
                + "( ID_Prod, nombre_producto, cantidad, limite_advertencia)"
                + "values ( ?, ?, ?, ?)";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getID_Prod());
            ps.setString(2, user.getNombreProducto());
            ps.setInt(3, user.getCantidad());
            ps.setInt(4, user.getLimiteAdvertencia());
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

    public boolean update(Modelo_inventario user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT inventario SET"
                + "ID_Prod = ? , nombre_producto = ?, cantidad = ?, limite_advertencia"
                + "WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, user.getID_Prod());
            ps.setString(2, user.getNombreProducto());
            ps.setInt(3, user.getCantidad());
            ps.setInt(4, user.getLimiteAdvertencia());
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

    public boolean delete(Modelo_inventario user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM inventario WHERE ID = ?";

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
