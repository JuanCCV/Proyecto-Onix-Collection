
package config;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class tablaimagen extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable tabla, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        if(value instanceof JLabel){
            JLabel lbl=(JLabel)value;
            return lbl;
            
        }
        
        return super.getTableCellRendererComponent(tabla, value, isSelected, hasFocus, row, column);
    }
    
    
    
}
