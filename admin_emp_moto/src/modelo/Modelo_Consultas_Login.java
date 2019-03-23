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
                    + "(ID, User, Password, Privilege)"
                    + "values (?, ?, ?, ?)";
        
        try{
            ps=con.prepareStatement(query);
            //ps.setString(0,user.id);
            ps.setString(1,"user.user");
            ps.setString(2,"user.password");
            ps.setString(3,"user.privilege");
            ps.execute();
            ps.close();
            return true;
            
        }catch(SQLException e){
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
