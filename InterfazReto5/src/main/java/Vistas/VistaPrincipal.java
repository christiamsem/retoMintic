/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author chrit
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabRegistrar = new javax.swing.JPanel();
        txtNombreRegistrar = new javax.swing.JLabel();
        boxNombreRegistrar = new javax.swing.JTextField();
        txtCantidadRegistrar = new javax.swing.JLabel();
        boxCantRegistrar = new javax.swing.JTextField();
        txtPrecioRegistrar = new javax.swing.JLabel();
        boxPrecioRegistro = new javax.swing.JTextField();
        txtCategoriaRegistrar = new javax.swing.JLabel();
        comboCategoriaRegistrar = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        tabConsultar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        txtNombreConsultar = new javax.swing.JLabel();
        boxNombreConsultar = new javax.swing.JTextField();
        txtCantidadConsultar = new javax.swing.JLabel();
        boxCantConsultar = new javax.swing.JTextField();
        txtPrecioConsultar = new javax.swing.JLabel();
        boxPrecioConsultar = new javax.swing.JTextField();
        txtCategoriaConsultar = new javax.swing.JLabel();
        comboCategoriaConsultar = new javax.swing.JComboBox<>();
        txtIdConsultar = new javax.swing.JLabel();
        boxIdConsultar = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setToolTipText("Consultar");

        txtNombreRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombreRegistrar.setText("Nombre:");

        txtCantidadRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidadRegistrar.setText("Cantidad:");

        txtPrecioRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecioRegistrar.setText("Precio:");

        txtCategoriaRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCategoriaRegistrar.setText("Categoria:");

        comboCategoriaRegistrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASEO", "VIVERES" }));

        btnGuardar.setText("Guardar");

        javax.swing.GroupLayout tabRegistrarLayout = new javax.swing.GroupLayout(tabRegistrar);
        tabRegistrar.setLayout(tabRegistrarLayout);
        tabRegistrarLayout.setHorizontalGroup(
            tabRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabRegistrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(tabRegistrarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(tabRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tabRegistrarLayout.createSequentialGroup()
                        .addComponent(txtCantidadRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(boxCantRegistrar))
                    .addGroup(tabRegistrarLayout.createSequentialGroup()
                        .addGroup(tabRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreRegistrar)
                            .addComponent(txtPrecioRegistrar))
                        .addGap(23, 23, 23)
                        .addGroup(tabRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxNombreRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxPrecioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabRegistrarLayout.createSequentialGroup()
                        .addComponent(txtCategoriaRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(comboCategoriaRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(348, Short.MAX_VALUE))
        );
        tabRegistrarLayout.setVerticalGroup(
            tabRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRegistrarLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(tabRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreRegistrar)
                    .addComponent(boxNombreRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadRegistrar)
                    .addComponent(boxCantRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioRegistrar)
                    .addComponent(boxPrecioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoriaRegistrar)
                    .addComponent(comboCategoriaRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registar", tabRegistrar);

        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Cantidad", "Categoria", "Precio"
            }
        ));
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
            }
        });
        tableProductos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableProductosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableProductos);

        txtNombreConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombreConsultar.setText("Nombre:");

        boxNombreConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNombreConsultarActionPerformed(evt);
            }
        });

        txtCantidadConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidadConsultar.setText("Cantidad:");

        txtPrecioConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrecioConsultar.setText("Precio:");

        txtCategoriaConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCategoriaConsultar.setText("Categoria:");

        comboCategoriaConsultar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ASEO", "VIVERES" }));

        txtIdConsultar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdConsultar.setText("Id");

        boxIdConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIdConsultarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");

        btnActualizar.setText("Actualizar");

        btnEliminar.setForeground(new java.awt.Color(255, 0, 51));
        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout tabConsultarLayout = new javax.swing.GroupLayout(tabConsultar);
        tabConsultar.setLayout(tabConsultarLayout);
        tabConsultarLayout.setHorizontalGroup(
            tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConsultarLayout.createSequentialGroup()
                .addGroup(tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabConsultarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(tabConsultarLayout.createSequentialGroup()
                                .addComponent(txtCantidadConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(boxCantConsultar))
                            .addGroup(tabConsultarLayout.createSequentialGroup()
                                .addComponent(txtCategoriaConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(comboCategoriaConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabConsultarLayout.createSequentialGroup()
                                .addGroup(tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreConsultar)
                                    .addComponent(txtPrecioConsultar)
                                    .addComponent(txtIdConsultar))
                                .addGroup(tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(tabConsultarLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boxIdConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(boxPrecioConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabConsultarLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boxNombreConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(72, 72, 72)
                        .addGroup(tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(tabConsultarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        tabConsultarLayout.setVerticalGroup(
            tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConsultarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdConsultar)
                    .addComponent(boxIdConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreConsultar)
                    .addComponent(boxNombreConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadConsultar)
                    .addComponent(boxCantConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addGroup(tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioConsultar)
                    .addComponent(boxPrecioConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoriaConsultar)
                    .addComponent(comboCategoriaConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar", tabConsultar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("tab2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxIdConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIdConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxIdConsultarActionPerformed

    private void boxNombreConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNombreConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNombreConsultarActionPerformed

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked
        // TODO add your handling code here:
        rellenarDatos();
    }//GEN-LAST:event_tableProductosMouseClicked

    private void tableProductosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableProductosKeyReleased
        // TODO add your handling code here:
        rellenarDatos();
        
    }//GEN-LAST:event_tableProductosKeyReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField boxCantConsultar;
    public javax.swing.JTextField boxCantRegistrar;
    public javax.swing.JTextField boxIdConsultar;
    public javax.swing.JTextField boxNombreConsultar;
    public javax.swing.JTextField boxNombreRegistrar;
    public javax.swing.JTextField boxPrecioConsultar;
    public javax.swing.JTextField boxPrecioRegistro;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnConsultar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JComboBox<String> comboCategoriaConsultar;
    public javax.swing.JComboBox<String> comboCategoriaRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel tabConsultar;
    private javax.swing.JPanel tabRegistrar;
    public javax.swing.JTable tableProductos;
    private javax.swing.JLabel txtCantidadConsultar;
    private javax.swing.JLabel txtCantidadRegistrar;
    private javax.swing.JLabel txtCategoriaConsultar;
    private javax.swing.JLabel txtCategoriaRegistrar;
    private javax.swing.JLabel txtIdConsultar;
    private javax.swing.JLabel txtNombreConsultar;
    private javax.swing.JLabel txtNombreRegistrar;
    private javax.swing.JLabel txtPrecioConsultar;
    private javax.swing.JLabel txtPrecioRegistrar;
    // End of variables declaration//GEN-END:variables

    private void rellenarDatos(){
        int numRow = tableProductos.getSelectedRow();
        
        boxIdConsultar.setText(String.valueOf((tableProductos.getValueAt(numRow, 0))));
        boxNombreConsultar.setText(String.valueOf((tableProductos.getValueAt(numRow, 1))));
        boxCantConsultar.setText(String.valueOf((tableProductos.getValueAt(numRow, 2))));
        comboCategoriaConsultar.setSelectedItem(String.valueOf((tableProductos.getValueAt(numRow, 3))));
        boxPrecioConsultar.setText(String.valueOf((tableProductos.getValueAt(numRow, 4))));
        
        
    }



}
