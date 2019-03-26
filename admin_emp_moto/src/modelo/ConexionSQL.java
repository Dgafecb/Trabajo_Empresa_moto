package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
   
    public static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String URL="jdbc:sqlserver://sistemagestion.database.windows.net:1433; DatabaseName = sistemaGestion";
    public static final String USERNAME="myadmin";
    public static final String PASSWORD="Support2019";
    
    public ConexionSQL(){
        super();
    }
    
    public Connection getConnection(){
       Connection conn = null;
       try{
           Class.forName(DRIVER);
           conn = (Connection)DriverManager.getConnection(URL, USERNAME, PASSWORD);
       }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
       }
       return conn;
    }
}
