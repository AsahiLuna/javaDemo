package cc.alpgo.utils;
 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
 
public class ConnUtil 
{ 
    public static Connection getConn() 
    { 
        Connection conn = null; 
        try 
        { 
            Class.forName("org.postgresql.Driver"); 
            String url = "jdbc:postgresql://localhost:5432/postgres"; 
            try 
            { 
                conn = DriverManager.getConnection(url, "postgres", "postgres"); 
            } 
            catch (SQLException e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        catch (ClassNotFoundException e) 
        { 
            e.printStackTrace(); 
        } 
 
        return conn; 
    } 
 
} 