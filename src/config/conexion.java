
package config;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class conexion {
    
    Connection con;
    public   conexion(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/registro","root","");
            
            
        }catch (Exception e){
       
    }
      
    }
    
    

    public Connection getConnection() {
        return con;
    }

    
    
    
    
    
    
    
     public ResultSet Visualizar(){
        Connection con=getConnection();
        ResultSet rs=null;
        try {
            PreparedStatement ps=con.prepareStatement("select * from imagenes");
            rs=ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error De consulta");
        }
        
        return rs;
    }
    
    
    public void guardar_imagen(String ruta, String nombre){
        
        Connection con=getConnection();
        String insert = "insert into imagenes (nombre,foto) values (?,?)";
        FileInputStream fi=null;
        PreparedStatement ps=null;
        try {
            File file=new File(ruta);
            fi =new FileInputStream(file);
            
            ps =con.prepareStatement(insert);
            ps.setString(1,nombre);
            ps.setBinaryStream(2, fi);
            
            ps.executeUpdate();
            
            
        } catch (Exception e) {
            System.out.println("Error al guardar");
        }
        
        
    }

    
    
       
 
    
}

    
   
