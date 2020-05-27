
package capaPresentacion;

public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        trans();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new resoluciones.menu();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RegistroClientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        ListaInventarios = new javax.swing.JButton();
        ListaEmpleados = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        RegistroEmpleados = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        RegistroInventarios = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Imagenes = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btlSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btlLogin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        menu1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 70, 40));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setText("Lista Inventarios");
        menu1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        RegistroClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registro.png"))); // NOI18N
        RegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroClientesActionPerformed(evt);
            }
        });
        menu1.add(RegistroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 142, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel2.setText("Registro Clientes");
        menu1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        ListaInventarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lista.png"))); // NOI18N
        ListaInventarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaInventariosActionPerformed(evt);
            }
        });
        menu1.add(ListaInventarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 142, -1));

        ListaEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lista.png"))); // NOI18N
        ListaEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaEmpleadosActionPerformed(evt);
            }
        });
        menu1.add(ListaEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 92, 142, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel3.setText("Lista Empleados");
        menu1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 240, -1, -1));

        RegistroEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registro.png"))); // NOI18N
        RegistroEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroEmpleadosActionPerformed(evt);
            }
        });
        menu1.add(RegistroEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 142, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel4.setText("Registro Empleados");
        menu1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        RegistroInventarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registro.png"))); // NOI18N
        RegistroInventarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroInventariosActionPerformed(evt);
            }
        });
        menu1.add(RegistroInventarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 142, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel5.setText("Registro Inventarios");
        menu1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 430, -1, -1));

        Imagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagenes.png"))); // NOI18N
        Imagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagenesActionPerformed(evt);
            }
        });
        menu1.add(Imagenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 130, 130));

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel6.setText("Subir Imagenes De Productos");
        menu1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 900, 590));

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

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
         Acceso AC= new Acceso();
        AC.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_SalirActionPerformed

    private void ListaInventariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaInventariosActionPerformed
        Inventarios IN= new Inventarios();
        IN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ListaInventariosActionPerformed

    private void ListaEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaEmpleadosActionPerformed
        Nomina NO= new Nomina();
        NO.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ListaEmpleadosActionPerformed

    private void ImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagenesActionPerformed
        imagenesproducto IP= new imagenesproducto();
        IP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ImagenesActionPerformed

    private void RegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroClientesActionPerformed
        AccesoCliente AC= new AccesoCliente();
        AC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistroClientesActionPerformed

    private void RegistroEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroEmpleadosActionPerformed
        AccesoNomina AN= new AccesoNomina();
        AN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistroEmpleadosActionPerformed

    private void RegistroInventariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroInventariosActionPerformed
        AccesoInventario AI= new AccesoInventario();
        AI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegistroInventariosActionPerformed

   
    public void trans(){
        ListaInventarios.setOpaque(false);
        ListaInventarios.setContentAreaFilled(false);
        ListaInventarios.setBorderPainted(false);
        ListaEmpleados.setOpaque(false);
        ListaEmpleados.setContentAreaFilled(false);
        ListaEmpleados.setBorderPainted(false);
        RegistroEmpleados.setOpaque(false);
        RegistroEmpleados.setContentAreaFilled(false);
        RegistroEmpleados.setBorderPainted(false);
        RegistroInventarios.setOpaque(false);
        RegistroInventarios.setContentAreaFilled(false);
        RegistroInventarios.setBorderPainted(false);
        RegistroClientes.setOpaque(false);
        RegistroClientes.setContentAreaFilled(false);
        RegistroClientes.setBorderPainted(false);
        Imagenes.setOpaque(false);
        Imagenes.setContentAreaFilled(false);
        Imagenes.setBorderPainted(false);
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imagenes;
    private javax.swing.JButton ListaEmpleados;
    private javax.swing.JButton ListaInventarios;
    private javax.swing.JButton RegistroClientes;
    private javax.swing.JButton RegistroEmpleados;
    private javax.swing.JButton RegistroInventarios;
    private javax.swing.JButton Salir;
    private javax.swing.JMenuItem btlLogin;
    private javax.swing.JMenuItem btlSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private resoluciones.menu menu1;
    // End of variables declaration//GEN-END:variables
}
