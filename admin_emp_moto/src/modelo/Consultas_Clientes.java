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
                + "(nombre_apellido,nombre_apellido_2,dni,dni_2, correo, direccion, telefono, ciudad, pais)"
                + "VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?)";

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

        String query = "UPDATE Clientes SET"
                + "nombre_apellido = ? , nombre_apellido_2 = ?,dni = ?,dni_2=?, correo= ?, direccion=?,telefono=?,ciudad=?,pais=?"
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
            ps.setInt(10, cliente.getId());
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

        String query = "DELETE FROM Cliente WHERE id = ?";

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

    public LinkedList readAll() {
        LinkedList<Modelo_Trabajadores> listaTrabajadores = new LinkedList<Modelo_Trabajadores>();
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
                trabajador.setDni(rs.getString("dni"));
                trabajador.setNombre(rs.getString("nombre"));
                trabajador.setApellido(rs.getString("apellido"));
                trabajador.setSueldo(rs.getInt("sueldo"));
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
