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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juanp
 */
public class RegistroDeInventarios extends javax.swing.JFrame {
    conexion con=new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    
    int ID=0;
    private String TipoDeprenda;
    private String TipoDeTela;
    private String Precio;
    
    
    public RegistroDeInventarios() {
        initComponents();
        setLocationRelativeTo(null);
        listainventario();
        trans();
    }

   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfondonomina = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabladatos = new javax.swing.JTable();
        btlAgregar = new javax.swing.JButton();
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
        jButton1 = new javax.swing.JButton();
        btlEliminar = new javax.swing.JButton();
        btlAgregarNuevoDato = new javax.swing.JButton();
        panelfondonomina1 = new javax.swing.JPanel();
        btlAgregar1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btlEliminar1 = new javax.swing.JButton();
        btlAgregarNuevoDato1 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        registro1 = new resoluciones.registro();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaInventarios = new javax.swing.JTable();
        txtPrecio = new javax.swing.JTextField();
        ibPrecio = new javax.swing.JLabel();
        txtTipoDeTela = new javax.swing.JTextField();
        txtTipoDeprenda = new javax.swing.JTextField();
        ibTipoDeTela = new javax.swing.JLabel();
        ibTopoDePrenda = new javax.swing.JLabel();
        ibID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        btlSalir1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btlLogin1 = new javax.swing.JMenuItem();

        panelfondonomina.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro De Nomina Onix", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Goudy Stout", 0, 12))); // NOI18N

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

        btlAgregar.setText("Agregar");
        btlAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlAgregarActionPerformed(evt);
            }
        });

        lbCedula.setText("Cedula:");

        lbNombre.setText("Nombre:");

        lbApellido.setText("Apellido:");

        lbCelular.setText("Celular:");

        lbCorreo.setText("Correo:");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btlEliminar.setText("Eliminar");
        btlEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlEliminarActionPerformed(evt);
            }
        });

        btlAgregarNuevoDato.setText("Agregar Nuevo Dato");
        btlAgregarNuevoDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlAgregarNuevoDatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelfondonominaLayout = new javax.swing.GroupLayout(panelfondonomina);
        panelfondonomina.setLayout(panelfondonominaLayout);
        panelfondonominaLayout.setHorizontalGroup(
            panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfondonominaLayout.createSequentialGroup()
                .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfondonominaLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelfondonominaLayout.createSequentialGroup()
                                .addComponent(lbCedula)
                                .addGap(22, 22, 22)
                                .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                            .addGroup(panelfondonominaLayout.createSequentialGroup()
                                .addComponent(lbNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre))
                            .addGroup(panelfondonominaLayout.createSequentialGroup()
                                .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbApellido)
                                    .addComponent(lbCelular)
                                    .addComponent(lbCorreo))
                                .addGap(18, 18, 18)
                                .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCorreo)
                                    .addComponent(txtCelular)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)))))
                    .addGroup(panelfondonominaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelfondonominaLayout.createSequentialGroup()
                                .addComponent(btlAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(99, 99, 99)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btlEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(panelfondonominaLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btlAgregarNuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelfondonominaLayout.setVerticalGroup(
            panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfondonominaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfondonominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btlAgregar))
                    .addComponent(btlEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btlAgregarNuevoDato)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelfondonomina1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Inventarios Onix", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Goudy Stout", 0, 12))); // NOI18N
        panelfondonomina1.setPreferredSize(new java.awt.Dimension(686, 675));
        panelfondonomina1.setRequestFocusEnabled(false);
        panelfondonomina1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btlAgregar1.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        btlAgregar1.setText("Agregar");
        btlAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlAgregar1ActionPerformed(evt);
            }
        });
        panelfondonomina1.add(btlAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 473, 120, 20));

        jButton2.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panelfondonomina1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 473, 100, 20));

        btlEliminar1.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        btlEliminar1.setText("Eliminar");
        btlEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlEliminar1ActionPerformed(evt);
            }
        });
        panelfondonomina1.add(btlEliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 473, 120, 20));

        btlAgregarNuevoDato1.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        btlAgregarNuevoDato1.setText("Agregar Nuevo Dato");
        btlAgregarNuevoDato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlAgregarNuevoDato1ActionPerformed(evt);
            }
        });
        panelfondonomina1.add(btlAgregarNuevoDato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 551, 380, -1));

        Salir.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        panelfondonomina1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 614, 220, 34));

        TablaInventarios.setFont(new java.awt.Font("Rockwell", 2, 11)); // NOI18N
        TablaInventarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Celular", "Correo"
            }
        ));
        TablaInventarios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TablaInventariosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TablaInventarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaInventariosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaInventarios);

        txtPrecio.setBackground(new java.awt.Color(255, 204, 51));

        ibPrecio.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        ibPrecio.setText("Precio:");

        txtTipoDeTela.setBackground(new java.awt.Color(255, 204, 51));
        txtTipoDeTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoDeTelaActionPerformed(evt);
            }
        });

        txtTipoDeprenda.setBackground(new java.awt.Color(255, 204, 51));

        ibTipoDeTela.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        ibTipoDeTela.setText("Tipo De Tela:");

        ibTopoDePrenda.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        ibTopoDePrenda.setText("Tipo De Prenda:");

        ibID.setFont(new java.awt.Font("Rockwell", 2, 14)); // NOI18N
        ibID.setText("ID:");

        txtID.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout registro1Layout = new javax.swing.GroupLayout(registro1);
        registro1.setLayout(registro1Layout);
        registro1Layout.setHorizontalGroup(
            registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registro1Layout.createSequentialGroup()
                .addGroup(registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registro1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ibTipoDeTela)
                            .addComponent(ibPrecio)
                            .addComponent(ibTopoDePrenda)
                            .addComponent(ibID))
                        .addGap(36, 36, 36)
                        .addGroup(registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoDeprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoDeTela, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(registro1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        registro1Layout.setVerticalGroup(
            registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registro1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ibID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDeprenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibTopoDePrenda))
                .addGap(18, 18, 18)
                .addGroup(registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoDeTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibTipoDeTela))
                .addGap(18, 18, 18)
                .addGroup(registro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibPrecio))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );

        panelfondonomina1.add(registro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 710, 690));

        getContentPane().add(panelfondonomina1, java.awt.BorderLayout.PAGE_START);

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

    private void btlSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlSalir1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btlSalir1ActionPerformed

    private void btlLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlLogin1ActionPerformed
        Acceso AC= new Acceso();
        AC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btlLogin1ActionPerformed

    private void TabladatosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TabladatosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TabladatosAncestorAdded

    private void TabladatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabladatosMouseClicked
        int fila=TablaInventarios.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null,"Producto No Seleccionado");
        }else{
            ID=Integer.parseInt((String)TablaInventarios.getValueAt(fila,0).toString());
            String TipoDeprenda=(String)TablaInventarios.getValueAt(fila,1);
            String TipoDeTela=(String)TablaInventarios.getValueAt(fila,2);
            String Precio=(String)TablaInventarios.getValueAt(fila,3);
            
            txtID.setText(" "+ ID);
            txtTipoDeprenda.setText(TipoDeprenda);
            txtTipoDeTela.setText(TipoDeTela);
            txtPrecio.setText(Precio);
            

        }

    }//GEN-LAST:event_TabladatosMouseClicked

    private void btlAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlAgregarActionPerformed
        Agregarinventario();
        listainventario();
        NuevoDatoinventario();
    }//GEN-LAST:event_btlAgregarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        modificarinventario();
        listainventario();
        NuevoDatoinventario();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btlEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlEliminarActionPerformed
        eliminarinventario();
        listainventario();
        NuevoDatoinventario();
    }//GEN-LAST:event_btlEliminarActionPerformed

    private void btlAgregarNuevoDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlAgregarNuevoDatoActionPerformed
        NuevoDatoinventario();
    }//GEN-LAST:event_btlAgregarNuevoDatoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        Menu ME= new Menu();
        ME.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_SalirActionPerformed

    private void TablaInventariosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TablaInventariosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaInventariosAncestorAdded

    private void TablaInventariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInventariosMouseClicked
        int fila=TablaInventarios.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null," Producto No Seleccionado");
        }else{
            ID=Integer.parseInt((String)TablaInventarios.getValueAt(fila,0).toString());
            String TipoDeprenda=(String)TablaInventarios.getValueAt(fila,1);
            String TipoDeTela=(String)TablaInventarios.getValueAt(fila,2);
            String Precio=(String)TablaInventarios.getValueAt(fila,3);
            txtID.setText(" "+ ID);
            txtTipoDeprenda.setText(TipoDeprenda);
            txtTipoDeTela.setText(TipoDeTela);
            txtPrecio.setText(Precio);
            

        }

    }//GEN-LAST:event_TablaInventariosMouseClicked

    private void btlAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlAgregar1ActionPerformed
        Agregarinventario();
        listainventario();
        NuevoDatoinventario();
    }//GEN-LAST:event_btlAgregar1ActionPerformed

    private void txtTipoDeTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoDeTelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoDeTelaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modificarinventario();
        listainventario();
        NuevoDatoinventario();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btlEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlEliminar1ActionPerformed
        eliminarinventario();
        listainventario();
        NuevoDatoinventario();
    }//GEN-LAST:event_btlEliminar1ActionPerformed

    private void btlAgregarNuevoDato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlAgregarNuevoDato1ActionPerformed
        NuevoDatoinventario();
    }//GEN-LAST:event_btlAgregarNuevoDato1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroDeInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeInventarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeInventarios().setVisible(true);
            }
        });
    }
    
     void listainventario(){
        
        String sql="select * from inventario";
        try{
          cn =con.getConnection();
          st=cn.createStatement();
          rs=st.executeQuery(sql);
          Object[]inventario=new Object[4];
          modelo=(DefaultTableModel)TablaInventarios.getModel();
          while(rs.next()){
              inventario[0]=rs.getInt("ID");
              inventario[1]=rs.getString("TipoDeprenda");
              inventario[2]=rs.getString("TipoDeTela");
              inventario[3]=rs.getString("Precio");
             
              
              modelo.addRow(inventario);
              
              
          }
          TablaInventarios.setModel(modelo);
        }catch (Exception e){
            
            
            
        }
        
    }
     void Agregarinventario(){
        String ID=txtID.getText();
        String TipoDeprenda=txtTipoDeprenda.getText();
        String TipoDeTela=txtTipoDeTela.getText();
        String Precio=txtPrecio.getText();
       
               
        if (ID.equals("")||TipoDeprenda.equals("")||TipoDeTela.equals("")||Precio.equals("")){
            JOptionPane.showMessageDialog(null," Todas las celdas necesitan estar llenas ");
          
        }else{
            String sql="insert into inventario (ID,TipoDeprenda,TipoDeTela,Precio)values('"+ID+"','"+TipoDeprenda+"','"+TipoDeTela+"','"+Precio+"')";
            try{
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null," Producto Agregado ");
                limpiartabla();
            }catch (Exception e){
                
            }
            
        }
    }
     
     void modificarinventario(){
        String ID=txtID.getText();
        String TipoDeprenda=txtTipoDeprenda.getText();
        String TipoDeTela=txtTipoDeTela.getText();
        String Precio=txtPrecio.getText();
        String sql ="update inventario set ID='"+ ID +"',TipoDeprenda='" + TipoDeprenda + "',TipoDeTela='" + TipoDeTela + "',Precio='" + Precio + "' where ID=" + ID;
        if(TipoDeprenda.equals("")){
            
            JOptionPane.showMessageDialog(null, " Ingresar Datos ");
        }else
            try{
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null," Inventario Actualizado ");
                
                limpiartabla();
            }catch (Exception e){
                
            }
    }
     
    void limpiartabla(){
        for (int i=0;i<=TablaInventarios.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
            
        }
    }
   
    void eliminarinventario(){
        int filaseleccionado=TablaInventarios.getSelectedRow();
        if(filaseleccionado==-1){
        
        JOptionPane.showMessageDialog(null,"Debe Seleccionar una Dato");
        
    }else{
            String sql="delete from inventario where ID="+ ID;
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
    
    void NuevoDatoinventario(){
        
        txtID.setText("");
        txtTipoDeprenda.setText("");
        txtTipoDeTela.setText("");
        txtPrecio.setText("");
        txtID.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JTable TablaInventarios;
    private javax.swing.JTable Tabladatos;
    private javax.swing.JButton btlAgregar;
    private javax.swing.JButton btlAgregar1;
    private javax.swing.JButton btlAgregarNuevoDato;
    private javax.swing.JButton btlAgregarNuevoDato1;
    private javax.swing.JButton btlEliminar;
    private javax.swing.JButton btlEliminar1;
    private javax.swing.JMenuItem btlLogin1;
    private javax.swing.JMenuItem btlSalir1;
    private javax.swing.JLabel ibID;
    private javax.swing.JLabel ibPrecio;
    private javax.swing.JLabel ibTipoDeTela;
    private javax.swing.JLabel ibTopoDePrenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCorreo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JPanel panelfondonomina;
    private javax.swing.JPanel panelfondonomina1;
    private resoluciones.registro registro1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipoDeTela;
    private javax.swing.JTextField txtTipoDeprenda;
    // End of variables declaration//GEN-END:variables
}
