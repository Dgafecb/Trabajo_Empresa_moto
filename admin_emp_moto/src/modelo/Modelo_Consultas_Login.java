package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Modelo_Consultas_Login extends Modelo_Connection{
    
    public boolean create(Modelo_user user)
    {
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String query = "INSERT INTO user "
                    + "( email, password, privilege)"
                    + "values ( ?, ?, ?)";
        
        try{
            ps=con.prepareStatement(query);
            ps.setString(1,user.getEmail());
            ps.setString(2,user.getPassword());
            ps.setInt(3,user.getPrivilege());
            ps.execute();
            ps.close();
            return true;
            
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
        
        public boolean update(Modelo_user user){
            PreparedStatement ps = null;
            Connection con = getConnection();
            
            String query = "INSERT user SET"
                    + "email = ? , password = ?, privilege = ?"
                    + "WHERE id = ? ";
            
            try{
                ps=con.prepareStatement(query);
                ps.setString(1,user.getEmail());
                ps.setString(2,user.getPassword());
                ps.setInt(3,user.getPrivilege());
                ps.setInt(4,user.getID());
                ps.execute();
                ps.close();
                return true;
            
            }catch(SQLException e){
                System.err.println(e);
                return false;
            }finally{
                try{
                    con.close();
                }catch(SQLException e){
                    System.err.println(e);
                }
            }    
        }
        
    
    
    
}
