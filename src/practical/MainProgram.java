/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical;

import com.sun.xml.internal.ws.util.StringUtils;
import dbo.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author tnnh
 */
public class MainProgram extends javax.swing.JFrame {
    
    PE2018Access dbAccess;
    ProductFullModel model;
    ProductList productList;
    
    public MainProgram() {
        initComponents();
        dbAccess = new PE2018Access();
        productList = new ProductList();
        productList.loadFromDB(dbAccess);
        model = new ProductFullModel(productList);
        tblProduct.setModel(model);
    }
    
    private boolean checkPrimaryKey(String id) {
        String sql = "select * from products where id=" + id;
        try {
            ResultSet rs = dbAccess.executeQuery(sql);
            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "This " + id + " is existed");
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonPanel = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        dataPanel = new javax.swing.JPanel();
        detailPanel = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        listPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Practical");
        setBounds(new java.awt.Rectangle(100, 100, 600, 450));
        setPreferredSize(new java.awt.Dimension(600, 450));

        buttonPanel.setLayout(new java.awt.GridBagLayout());

        btnNew.setText("New");
        btnNew.setPreferredSize(new java.awt.Dimension(70, 40));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        buttonPanel.add(btnNew, gridBagConstraints);

        btnExit.setText("Exit");
        btnExit.setPreferredSize(new java.awt.Dimension(70, 40));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        buttonPanel.add(btnExit, gridBagConstraints);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.SOUTH);

        dataPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Product Management"));
        dataPanel.setLayout(new java.awt.BorderLayout());

        detailPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Product Detail"));
        detailPanel.setLayout(new java.awt.GridBagLayout());

        txtId.setMinimumSize(new java.awt.Dimension(150, 30));
        txtId.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        detailPanel.add(txtId, gridBagConstraints);

        jLabel1.setText("ID");
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        detailPanel.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Name");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        detailPanel.add(jLabel2, gridBagConstraints);

        txtName.setMinimumSize(new java.awt.Dimension(150, 30));
        txtName.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        detailPanel.add(txtName, gridBagConstraints);

        jLabel3.setText("Price");
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        detailPanel.add(jLabel3, gridBagConstraints);

        txtPrice.setMinimumSize(new java.awt.Dimension(150, 30));
        txtPrice.setPreferredSize(new java.awt.Dimension(150, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        detailPanel.add(txtPrice, gridBagConstraints);

        btnAdd.setText("Add");
        btnAdd.setPreferredSize(new java.awt.Dimension(70, 40));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        detailPanel.add(btnAdd, gridBagConstraints);

        dataPanel.add(detailPanel, java.awt.BorderLayout.LINE_END);

        listPanel.setLayout(new java.awt.BorderLayout());

        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblProductMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblProduct);

        listPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        dataPanel.add(listPanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(dataPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseClicked
        // TODO add your handling code here:
        int pos = tblProduct.getSelectedRow();
        Product selectedProduct = model.getProductList().get(pos);
        txtId.setText("" + selectedProduct.getId());
        txtId.setEditable(false);
        txtName.setText(selectedProduct.getName());
        txtName.setEditable(false);
        txtPrice.setText("" + selectedProduct.getPrice());
        txtPrice.setEditable(false);
        btnAdd.setText("Delete");
    }//GEN-LAST:event_tblProductMouseClicked

    private void tblProductMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProductMouseReleased

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText().trim();
        String name = StringUtils.capitalize(txtName.getText().trim());
        String price = txtPrice.getText().trim();
        if (btnAdd.getText().equals("Add")) {
            if (!id.matches("\\d{3,5}")) {
                JOptionPane.showMessageDialog(rootPane, "Invalid ID!(3-5 digits)");
                txtId.setText("");
                txtId.requestFocus();
                return;
            }
            if (!checkPrimaryKey(id)) {
                txtId.setText("");
                txtId.requestFocus();
                return;
            }
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Invalid Name!(Must be filled)");
                txtName.setText("");
                txtName.requestFocus();
                return;
            }
            if (!price.matches("\\d+(.\\d+)?")) {
                JOptionPane.showMessageDialog(rootPane, "Invalid price");
                txtPrice.setText("");
                return;
            }
            String sql = "insert into products values(" + Integer.parseInt(id) + ",'" + name + "',"
                    + Float.parseFloat(price) + ")";
            try {
                int n = dbAccess.executeUpdate(sql);
                if (n > 0) {
                    JOptionPane.showMessageDialog(rootPane, "A new product has been added!");
                    model.getProductList().add(new Product(Integer.parseInt(id), name, Float.parseFloat(price)));
                    tblProduct.updateUI();
                    btnNewActionPerformed(null);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (btnAdd.getText().equals("Delete")) {
            int pos = tblProduct.getSelectedRow();
            String sql = "delete from products where id=" + id ;
            int choice = JOptionPane.showConfirmDialog(rootPane, "Do you want to delete "+id,"Choose option",JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                String msg = "The product " + id + " has been deleted from database!";
                try {
                    int n = dbAccess.executeUpdate(sql);
                    if (n > 0) {
                        model.getProductList().remove(pos);
                        tblProduct.updateUI();
                        btnNewActionPerformed(null);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            }
        }
        

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        btnAdd.setText("Add");
        txtId.setText("");
        txtId.setEditable(true);
        txtId.requestFocus();
        txtName.setText("");
        txtName.setEditable(true);
        txtPrice.setText("");
        txtPrice.setEditable(true);
        getRootPane().setDefaultButton(btnAdd);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel listPanel;
    private javax.swing.JTable tblProduct;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
