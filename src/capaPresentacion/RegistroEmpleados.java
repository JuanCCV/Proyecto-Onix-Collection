
package capaPresentacion;

import config.conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class RegistroEmpleados extends javax.swing.JFrame {
   conexion con=new conexion();
   Connection cn;
   Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    private int Cedula=0;
    private String Nombre;
    private String Apellido;
    private String Celular;
    private String Correo;
    
    
    public RegistroEmpleados() {
        initComponents();
        setLocationRelativeTo(null);
        listaNomina();
        trans();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jDialog5 = new javax.swing.JDialog();
        jDialog6 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btlSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btlLogin = new javax.swing.JMenuItem();
        panelfondonomina = new javax.swing.JPanel();
        lbCedula = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbApellido = new javax.swing.JLabel();
        lbCelular = new javax.swing.JLabel();
        lbCorreo = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        registro1 = new resoluciones.registro();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabladatos = new javax.swing.JTable();
        btlAgregarNuevoDato = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        btlAgregar = new javax.swing.JButton();
        btlEliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btlSalir1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btlLogin1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelfondonomina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro De Nomina Onix", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Goudy Stout", 0, 12))); // NOI18N
        panelfondonomina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCedula.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        lbCedula.setText("Cedula:");
        panelfondonomina.add(lbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 83, -1, -1));

        lbNombre.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        lbNombre.setText("Nombre:");
        panelfondonomina.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 114, -1, -1));

        lbApellido.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        lbApellido.setText("Apellido:");
        panelfondonomina.add(lbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 152, -1, -1));

        lbCelular.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        lbCelular.setText("Celular:");
        panelfondonomina.add(lbCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 190, -1, -1));

        lbCorreo.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        lbCorreo.setText("Correo:");
        panelfondonomina.add(lbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 228, -1, -1));

        txtCedula.setBackground(new java.awt.Color(255, 204, 51));
        panelfondonomina.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 80, 468, -1));

        txtNombre.setBackground(new java.awt.Color(255, 204, 51));
        panelfondonomina.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 111, 468, -1));

        txtApellido.setBackground(new java.awt.Color(255, 204, 51));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        panelfondonomina.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 149, 468, -1));

        txtCelular.setBackground(new java.awt.Color(255, 204, 51));
        panelfondonomina.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 187, 468, -1));

        txtCorreo.setBackground(new java.awt.Color(255, 204, 51));
        panelfondonomina.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 225, 468, -1));

        Tabladatos.setFont(new java.awt.Font("Rockwell", 2, 11)); // NOI18N
        Tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Celular", "Correo"
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
        Tabladatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabladatosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tabladatos);
        if (Tabladatos.getColumnModel().getColumnCount() > 0) {
            Tabladatos.getColumnModel().getColumn(1).setResizable(false);
        }

        btlAgregarNuevoDato.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        btlAgregarNuevoDato.setText("Agregar Nuevo Dato");
        btlAgregarNuevoDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlAgregarNuevoDatoActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        btlAgregar.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        btlAgregar.setText("Agregar");
        btlAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlAgregarActionPerformed(evt);
            }
        });

        btlEliminar.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        btlEliminar.setText("Eliminar");
        btlEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlEliminarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registro1Layout = new javax.swing.GroupLayout(registro1);
        registro1.setLayout(registro1Layout);
        registro1Layout.setHorizontalGroup(
            registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registro1Layout.createSequentialGroup()
                .addGroup(registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registro1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registro1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btlAgregarNuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(registro1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btlAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btlEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registro1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        registro1Layout.setVerticalGroup(
            registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registro1Layout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlAgregar)
                    .addComponent(btlEliminar)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addComponent(btlAgregarNuevoDato)
                .addGap(45, 45, 45)
                .addComponent(Salir)
                .addGap(21, 21, 21))
        );

        panelfondonomina.add(registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 690, 710));

        getContentPane().add(panelfondonomina, java.awt.BorderLayout.CENTER);

        jMenu3.setText("Archivo");

        btlSalir1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btlSalir1.setText("Salir");
        btlSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlSalir1ActionPerformed(evt);
            }
        });
        jMenu3.add(btlSalir1);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("View");

        btlLogin1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        btlLogin1.setText("Login");
        btlLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlLogin1ActionPerformed(evt);
            }
        });
        jMenu4.add(btlLogin1);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       
       Menu ME= new Menu();
       ME.setVisible(true);
       this.setVisible(false);
        
        
        
    }//GEN-LAST:event_SalirActionPerformed

    private void TabladatosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabladatosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TabladatosAncestorAdded

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btlAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlAgregarActionPerformed
       Agregar();
       listaNomina();
       NuevoDato();
    }//GEN-LAST:event_btlAgregarActionPerformed

    private void btlSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btlSalirActionPerformed

    private void btlLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlLoginActionPerformed
        Acceso AC= new Acceso();
        AC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btlLoginActionPerformed

    private void btlSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlSalir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btlSalir1ActionPerformed

    private void btlLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlLogin1ActionPerformed
        Acceso AC= new Acceso();
        AC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btlLogin1ActionPerformed

    private void btlEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlEliminarActionPerformed
        eliminar();
        listaNomina();
        NuevoDato();
    }//GEN-LAST:event_btlEliminarActionPerformed

    private void TabladatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabladatosMouseClicked
       int fila=Tabladatos.getSelectedRow();
       if(fila==-1){
           JOptionPane.showMessageDialog(null,"Empleado No Seleccionado");
       }else{
           Cedula=Integer.parseInt((String)Tabladatos.getValueAt(fila,0).toString());
           String Nombre=(String)Tabladatos.getValueAt(fila,1);
           String Apellido=(String)Tabladatos.getValueAt(fila,2);
           String Celular=(String)Tabladatos.getValueAt(fila,3);
           String Correo=(String)Tabladatos.getValueAt(fila,4);
           txtCedula.setText(" "+ Cedula);
           txtNombre.setText(Nombre);
           txtApellido.setText(Apellido);
           txtCelular.setText(Celular);
           txtCorreo.setText(Correo);
           
       }
       
       
       
    }//GEN-LAST:event_TabladatosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modificar();
        listaNomina();
        NuevoDato();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btlAgregarNuevoDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlAgregarNuevoDatoActionPerformed
        NuevoDato();
    }//GEN-LAST:event_btlAgregarNuevoDatoActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEmpleados().setVisible(true);
            }
        });
    }
    
    private void listaNomina(){
        
        String sql="select * from persona";
        try{
            cn =con.getConnection();
          st=cn.createStatement();
          rs=st.executeQuery(sql);
          Object[]persona=new Object[5];
          modelo=(DefaultTableModel)Tabladatos.getModel();
          while(rs.next()){
              persona[0]=rs.getInt("Cedula");
              persona[1]=rs.getString("Nombre");
              persona[2]=rs.getString("Apellido");
              persona[3]=rs.getString("Celular");
              persona[4]=rs.getString("Correo");
           
              modelo.addRow(persona);
              
              
          }
          Tabladatos.setModel(modelo);
        }catch (Exception e){
            
            
            
        }
        
    }
     private void Agregar(){
        String Cedula=txtCedula.getText();
        String Nombre=txtNombre.getText();
        String Apellido=txtApellido.getText();
        String Celular=txtCelular.getText();
        String Correo=txtCorreo.getText();
               
        if (Cedula.equals("")||Nombre.equals("")||Correo.equals("")){
            JOptionPane.showMessageDialog(null," Las Celdas Cedula,Nombre,Correo.....Estan Vacias");
          
        }else{
            String sql="insert into persona (Cedula,Nombre,Apellido,Celular,Correo)values('"+Cedula+"','"+Nombre+"','"+Apellido+"','"+Celular+"','"+Correo+"')";
            try{
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"usuario agregado");
                limpiartabla();
            }catch (Exception e){
                
            }
            
        }
    }
     
     private void modificar(){
        String Cedula=txtCedula.getText();
        String Nombre=txtNombre.getText();
        String Apellido=txtApellido.getText();
        String Celular=txtCelular.getText();
        String Correo=txtCorreo.getText();
        String sql ="update persona set Cedula='"+ Cedula +"',Nombre='" + Nombre + "',Apellido='" + Apellido + "',Celular='" + Celular + "',Correo='" + Correo + "' where Cedula=" + Cedula;
        if(Nombre.equals("")||Correo.equals("")){
            
            JOptionPane.showMessageDialog(null, " Ingresar Datos ");
        }else
            try{
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null," Usuario Actualizado ");
                
                limpiartabla();
            }catch (Exception e){
                
            }
    }
     
    private void limpiartabla(){
        for (int i=0;i<=Tabladatos.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
            
        }
    }
   
    private void eliminar(){
        int filaseleccionado=Tabladatos.getSelectedRow();
        if(filaseleccionado==-1){
        
        JOptionPane.showMessageDialog(null,"Debe Seleccionar una Dato");
        
    }else{
            String sql="delete from persona where Cedula="+ Cedula;
            try{
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null," Dato Eliminado ");
           limpiartabla();
            }catch (Exception e){
                
                
            }
            
        }
        
    }
    
    void NuevoDato(){
        
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtCelular.setText("");
        txtCorreo.setText("");
        txtCedula.requestFocus();
    }
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JTable Tabladatos;
    private javax.swing.JButton btlAgregar;
    private javax.swing.JButton btlAgregarNuevoDato;
    private javax.swing.JButton btlEliminar;
    private javax.swing.JMenuItem btlLogin;
    private javax.swing.JMenuItem btlLogin1;
    private javax.swing.JMenuItem btlSalir;
    private javax.swing.JMenuItem btlSalir1;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPanel panelfondonomina;
    private resoluciones.registro registro1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
