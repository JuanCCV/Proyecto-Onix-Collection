
package capaPresentacion;

import config.conexion;
import config.tabla;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class imagenesproducto extends javax.swing.JFrame {

   String ruta=null;
   conexion con=new conexion();
   Connection cn;
   Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
   
   private String nombre;
    private int ID=0;
    
    
    
    
    
    
    public imagenesproducto() {
        initComponents();
        setLocationRelativeTo(null);
        trans();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagenes1 = new resoluciones.imagenes();
        Salir = new javax.swing.JButton();
        btlGuardar = new javax.swing.JButton();
        verimagen = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btlabrir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();
        lblurl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaimagen = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btlsalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btlLogin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        btlGuardar.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        btlGuardar.setText("Guardar producto");
        btlGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlGuardarActionPerformed(evt);
            }
        });

        verimagen.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        verimagen.setText("Ver Tabla");
        verimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verimagenActionPerformed(evt);
            }
        });

        txtnombre.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setFont(new java.awt.Font("Rockwell", 2, 12)); // NOI18N
        jLabel1.setText("Nombre del Producto: ");

        btlabrir.setFont(new java.awt.Font("Rockwell", 2, 11)); // NOI18N
        btlabrir.setText("Abrir");
        btlabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlabrirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        jLabel2.setText("Subir Imagen");

        tablaimagen.setFont(new java.awt.Font("Rockwell", 2, 11)); // NOI18N
        tablaimagen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaimagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaimagenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaimagen);

        javax.swing.GroupLayout imagenes1Layout = new javax.swing.GroupLayout(imagenes1);
        imagenes1.setLayout(imagenes1Layout);
        imagenes1Layout.setHorizontalGroup(
            imagenes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(imagenes1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(imagenes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                    .addComponent(verimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(imagenes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagenes1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(imagenes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(imagenes1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(btlabrir)
                                .addGap(23, 23, 23))
                            .addGroup(imagenes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(imagenes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(imagenes1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(imagenes1Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(imagenes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblurl, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(imagenes1Layout.createSequentialGroup()
                                    .addComponent(btlGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(Salir))))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        imagenes1Layout.setVerticalGroup(
            imagenes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, imagenes1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(imagenes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(imagenes1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addGroup(imagenes1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(imagenes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btlabrir))
                        .addGap(18, 18, 18)
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblurl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(imagenes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btlGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        getContentPane().add(imagenes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 780, 580));

        jMenu1.setText("Archivo");

        btlsalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btlsalir.setText("Salir");
        btlsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlsalirActionPerformed(evt);
            }
        });
        jMenu1.add(btlsalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("View");

        btlLogin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        btlLogin.setText("Login");
        btlLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlLoginActionPerformed(evt);
            }
        });
        jMenu2.add(btlLogin);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verimagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verimagenActionPerformed
       
        tabla t= new tabla();
        
        t.vertabla(tablaimagen);
        
        
        
        
    }//GEN-LAST:event_verimagenActionPerformed

    private void btlabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlabrirActionPerformed
        
        JFileChooser j=new JFileChooser();
        int ap=j.showOpenDialog(this);
        if (ap == JFileChooser.APPROVE_OPTION) {
            ruta=j.getSelectedFile().getAbsolutePath();
            lblimagen.setIcon(new ImageIcon(ruta));
            lblurl.setText(ruta);
        }
        
        
    }//GEN-LAST:event_btlabrirActionPerformed

    private void btlGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlGuardarActionPerformed
        
        conexion conn=new conexion();
        String nombre=txtnombre.getText();
        String url = lblurl.getText();
        if (url.trim().length()!=0 && nombre.trim().length() !=0) {
            conn.guardar_imagen(ruta, nombre);
        }else{
            JOptionPane.showMessageDialog(null," No se admiten campos vacios");
           
        }
         
    }//GEN-LAST:event_btlGuardarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        
        Menu ME= new Menu();
        ME.setVisible(true);
        this.setVisible(false);
        
        
        
        
    }//GEN-LAST:event_SalirActionPerformed

    private void btlsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btlsalirActionPerformed

    private void btlLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlLoginActionPerformed
        Acceso AC=new Acceso();

        AC.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btlLoginActionPerformed

    private void tablaimagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaimagenMouseClicked
        
         int fila=tablaimagen.getSelectedRow();
       if(fila==-1){
           JOptionPane.showMessageDialog(null,"Empleado No Seleccionado");
       }else{
           ID=Integer.parseInt((String)tablaimagen.getValueAt(fila,0).toString());
           String nombre=(String)tablaimagen.getValueAt(fila,1);
          
           txtnombre.setText(nombre);
           
           
       }
        
        
        
        
    }//GEN-LAST:event_tablaimagenMouseClicked

    
    public void trans(){
        
    
    Salir.setOpaque(false);
    Salir.setContentAreaFilled(false);
    Salir.setBorderPainted(false);
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(imagenesproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(imagenesproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(imagenesproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(imagenesproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new imagenesproducto().setVisible(true);
            }
        });
    }
     
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btlGuardar;
    private javax.swing.JMenuItem btlLogin;
    private javax.swing.JButton btlabrir;
    private javax.swing.JMenuItem btlsalir;
    private resoluciones.imagenes imagenes1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblurl;
    private javax.swing.JTable tablaimagen;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JButton verimagen;
    // End of variables declaration//GEN-END:variables
}
