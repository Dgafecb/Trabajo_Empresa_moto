/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Dgafecb
 */
public class Consultas_Clientes extends ConexionSQL {

    public boolean create(Modelo_Clientes cliente) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO Clientes"
                + "(nombre_apellido,nombre_apellido_2,dni,dni_2, correo, direccion, telefono, ciudad, pais,facebook)"
                + "VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNombre_apellido());
            ps.setString(2, cliente.getNombre_apellido_2());
            ps.setString(3, cliente.getDni());
            ps.setString(4, cliente.getDni_2());
            ps.setString(5, cliente.getCorreo());
            ps.setString(6, cliente.getDireccion());
            ps.setString(7, cliente.getTelefono());
            ps.setString(8, cliente.getCiudad());
            ps.setString(9, cliente.getPais());
            ps.setString(10, cliente.getFacebook());
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

    public boolean read(Modelo_Clientes cliente) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Clientes WHERE id=?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, cliente.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                cliente.setId(rs.getInt("id"));
                cliente.setNombre_apellido(rs.getString("nombre_apellido"));
                cliente.setNombre_apellido_2(rs.getString("nombre_apellido_2"));
                if (rs.wasNull()) {
                    cliente.setNombre_apellido_2("");
                }
                cliente.setDni(rs.getString("dni"));
                cliente.setDni_2(rs.getString("dni_2"));
                if (rs.wasNull()) {
                    cliente.setDni_2("");
                }
                cliente.setCorreo(rs.getString("correo"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setPais(rs.getString("pais"));
                cliente.setFacebook(rs.getString("facebook"));
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

    public boolean update(Modelo_Clientes cliente) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE Clientes SET "
                + "nombre_apellido = ? , nombre_apellido_2 = ?,dni = ?,dni_2=?, correo= ?, direccion=?,telefono=?,ciudad=?,pais=?,facebook=? "
                + "WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, cliente.getNombre_apellido());
            ps.setString(2, cliente.getNombre_apellido_2());
            ps.setString(3, cliente.getDni());
            ps.setString(4, cliente.getDni_2());
            ps.setString(5, cliente.getCorreo());
            ps.setString(6, cliente.getDireccion());
            ps.setString(7, cliente.getTelefono());
            ps.setString(8, cliente.getCiudad());
            ps.setString(9, cliente.getPais());
             ps.setString(10, cliente.getFacebook());
            ps.setInt(11, cliente.getId());
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

    public boolean delete(Modelo_Clientes cliente) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM Clientes WHERE id = ?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, cliente.getId());
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
        Linked_List<Modelo_Clientes> listaClientes = new Linked_List<Modelo_Clientes>();
        Modelo_Clientes cliente = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM Clientes";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                cliente = new Modelo_Clientes();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre_apellido(rs.getString("nombre_apellido"));
                cliente.setNombre_apellido_2(rs.getString("nombre_apellido_2"));
                cliente.setDni(rs.getString("dni"));
                cliente.setDni_2(rs.getString("dni_2"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setCiudad(rs.getString("ciudad"));
                cliente.setPais(rs.getString("pais"));
                cliente.setFacebook(rs.getString("facebook"));
                listaClientes.add(cliente);

            }

            ps.close();
            return listaClientes;

        } catch (SQLException e) {
            System.err.println(e);
            cliente = new Modelo_Clientes();
            cliente.setDni("0");
            cliente.setNombre_apellido("Sin Datos");
            listaClientes.add(cliente);
            return listaClientes;

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}
