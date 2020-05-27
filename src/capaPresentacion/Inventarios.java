/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaPresentacion;

import config.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;



public class Inventarios extends javax.swing.JFrame {

    conexion con=new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int ID;
    
    
    public Inventarios() {
        initComponents();
        setLocationRelativeTo(null);
        listainventario();
        trans();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lista1 = new resoluciones.lista();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabladatos = new javax.swing.JTable();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btlSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btlLogin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabladatos.setFont(new java.awt.Font("Rockwell", 0, 11)); // NOI18N
        Tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo de prenda", "Tipo de tela", "Precio"
            }
        ));
        Tabladatos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TabladatosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(Tabladatos);

        Salir.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Old English Text MT", 2, 18)); // NOI18N
        jLabel1.setText("Lista De Inventarios");

        javax.swing.GroupLayout lista1Layout = new javax.swing.GroupLayout(lista1);
        lista1.setLayout(lista1Layout);
        lista1Layout.setHorizontalGroup(
            lista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lista1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(lista1Layout.createSequentialGroup()
                .addGroup(lista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lista1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lista1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lista1Layout.setVerticalGroup(
            lista1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lista1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(Salir)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(lista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 670, 530));

        jMenu1.setText("Archivo");

        btlSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btlSalir.setText("Salir");
        btlSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlSalirActionPerformed(evt);
            }
        });
        jMenu1.add(btlSalir);

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

    private void btlSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btlSalirActionPerformed

    private void btlLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlLoginActionPerformed
        Acceso AC= new Acceso();
        AC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btlLoginActionPerformed

    private void TabladatosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabladatosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TabladatosAncestorAdded

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Menu MU= new Menu();
        MU.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventarios().setVisible(true);
            }
        });
    }
    
   private void listainventario(){
                
        String sql="select * from inventario";
        try{
          cn =con.getConnection();
          st=cn.createStatement();
          rs=st.executeQuery(sql);
          Object[]inventario=new Object[4];
          modelo=(DefaultTableModel)Tabladatos.getModel();
          while(rs.next()){
              inventario[0]=rs.getInt("ID");
              inventario[1]=rs.getString("TipoDeprenda");
              inventario[2]=rs.getString("TipoDeTela");
              inventario[3]=rs.getString("Precio");
              
           
              modelo.addRow(inventario);
              
              
          }
          Tabladatos.setModel(modelo);
        }catch (Exception e){
            
            
            
        }
        
    }
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JTable Tabladatos;
    private javax.swing.JMenuItem btlLogin;
    private javax.swing.JMenuItem btlSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private resoluciones.lista lista1;
    // End of variables declaration//GEN-END:variables
}
