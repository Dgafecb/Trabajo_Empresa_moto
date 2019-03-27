package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class Consultas_Trabajadores extends ConexionSQL {

    public boolean create(Modelo_Trabajadores trabajador) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO trabajadores "
                + "( dni,nombre, apellido_paterno,apellido_materno,fecha_nac,email)"
                + "values ( ?, ?, ?, ?, ?,?)";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, trabajador.getDni());
            ps.setString(2, trabajador.getNombre());
            ps.setString(3, trabajador.getApellido_paterno());
            ps.setString(4, trabajador.getApellido_materno());
            ps.setString(5, trabajador.getFechanac());
            ps.setString(6, trabajador.getEmail());
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
    
    public boolean read(Modelo_Trabajadores trabajador){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM trabajadores WHERE dni=?";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, trabajador.getEmail());
            rs = ps.executeQuery();

            if(rs.next())
            {
              trabajador.setDni(rs.getInt("dni"));
              trabajador.setNombre(rs.getString("nombre"));
              trabajador.setApellido_paterno(rs.getString("apellido_paterno"));
              trabajador.setApellido_paterno(rs.getString("apellido_materno"));
              trabajador.setFechanac(rs.getString("fecha_nac"));
              trabajador.setEmail(rs.getString("email"));
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
    
    
    public boolean update(Modelo_Trabajadores trabajador) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE trabajadores SET"
                + "nombre = ? , apellido_paterno = ?,apellido_materno = ? fecha_nac = ?, email = ?"
                + "WHERE dni = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, trabajador.getNombre());
            ps.setString(2, trabajador.getApellido_paterno());
            ps.setString(3, trabajador.getApellido_materno());
            ps.setString(4, trabajador.getFechanac());
            ps.setString(5, trabajador.getEmail());
            ps.setInt(6, trabajador.getDni());
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

    public boolean delete(Modelo_Trabajadores trabajador) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM trabajadores WHERE dni = ?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, trabajador.getDni());
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
    
    public LinkedList readAll(){
        LinkedList<Modelo_Trabajadores> listaTrabajadores = new LinkedList<Modelo_Trabajadores>();
        Modelo_Trabajadores trabajador = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM trabajadores";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
 
            while(rs.next())
            {
              trabajador = new  Modelo_Trabajadores();
              trabajador.setDni(rs.getInt("dni"));
              trabajador.setNombre(rs.getString("nombre"));
              trabajador.setApellido_paterno(rs.getString("apellido_paterno"));
              trabajador.setApellido_materno(rs.getString("apellido_materno"));
              trabajador.setFechanac(rs.getString("fecha_nac"));
              trabajador.setEmail(rs.getString("email"));
              listaTrabajadores.add(trabajador);
              
            }
            
            ps.close();
            return listaTrabajadores ;

        } catch (SQLException e) {
            System.err.println(e);
            trabajador = new Modelo_Trabajadores();
            trabajador.setDni(0);
            trabajador.setNombre("Sin Datos");
            listaTrabajadores.add(trabajador);
            return listaTrabajadores ;
            
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    

}