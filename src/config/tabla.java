
package config;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

   
public class tabla {

    
    
    public void vertabla(JTable tabla){
        conexion conn=new conexion();
        Connection con=conn.getConnection();
        ResultSet rs=conn.Visualizar();
        
        
        tabla.setDefaultRenderer(Object.class,new tablaimagen());
        
        DefaultTableModel dt=new DefaultTableModel();
        dt.addColumn("nombre");
        dt.addColumn("foto");
        
        try {
            
            while(rs.next()){
                Object[] fila =new Object[2];
                
                
                fila[0]=rs.getObject(2);
                
                Blob blob = rs.getBlob(3);
                
                byte[] data=blob.getBytes(1,(int)blob.length());
                BufferedImage img= null;
                try {
                    img =ImageIO.read(new ByteArrayInputStream(data));
                } catch (Exception e) {
                 
                }
                
                ImageIcon icono=new ImageIcon(img);
                fila[1]=new JLabel(icono);
                dt.addRow(fila);
               
            }
            
            
            tabla.setModel(dt);
            tabla.setRowHeight(64);
        } catch (Exception e) {
            System.out.println("Error al visualizar en la tablaa");
        }
        
        
        
    }
    
    
    
}
