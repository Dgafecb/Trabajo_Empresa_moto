package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas_Login extends ConexionSQL {

    public boolean create(Modelo_user user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "INSERT INTO user "
                + "( email, password, privilege)"
                + "values ( ?, ?, ?)";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getPrivilege());
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
    
    public boolean read(Modelo_user user){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String query = "SELECT * FROM user WHERE email=?";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getEmail());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
              user.setID(rs.getInt("ID"));
              user.setEmail(rs.getString("email"));
              user.setPassword(rs.getString("password"));
              user.setPrivilege(rs.getInt("privilege"));
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

    public boolean update(Modelo_user user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "UPDATE user SET"
                + "email = ? , password = ?, privilege = ?"
                + "WHERE id = ? ";

        try {
            ps = con.prepareStatement(query);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setInt(3, user.getPrivilege());
            ps.setInt(4, user.getID());
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

    public  boolean delete(Modelo_user user) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String query = "DELETE FROM user WHERE ID = ?"; 

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
