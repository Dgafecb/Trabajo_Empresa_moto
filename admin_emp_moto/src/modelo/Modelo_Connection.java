package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Modelo_Connection {
   
    public static final String DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://pequiva.mysql.database.azure.com:3306/pequiva"
            + "?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";            
//?autoReconnect=true&useSSL=false";
    public static final String USERNAME="myadmin@pequiva";
    public static final String PASSWORD="Support2019";
    
    public Modelo_Connection(){
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
