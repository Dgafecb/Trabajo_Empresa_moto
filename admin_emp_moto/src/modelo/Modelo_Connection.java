package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Modelo_Connection {
   
    public static final String DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://localhost:3306/empresa?autoReconnect=true&useSSL=false";
    public static final String USERNAME="root";
    public static final String PASSWORD="root";
    
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
