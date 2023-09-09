/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class GUI_Daily_item_Entry extends javax.swing.JFrame {
    Admin admin;
    SalesManager sm;
    public GUI_Daily_item_Entry(Admin admin) {
        initComponents();
        this.admin = admin;
        try {
            showTable();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Daily_item_Entry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public GUI_Daily_item_Entry(SalesManager sm) {
        initComponents();
        this.sm = sm;
        try {
            showTable();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Daily_item_Entry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void showTable() throws IOException {
        DefaultTableModel model = (DefaultTableModel) DailyTable.getModel();
        model.setRowCount(0);
        
        String[] columnNames = { "Item ID", "Item Name", "Amount sold","Date"}; 
        model.setColumnIdentifiers(columnNames);
        
        ArrayList<String[]> dt = DailyItemSales.view();
        for (String[] dl: dt) {
            model.addRow(dl);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonRemove = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DailyTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        tSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonRemove.setText("Remove sales");
        buttonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveActionPerformed(evt);
            }
        });

        buttonEdit.setText("Edit sales");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("PURCHASE ORDER MANAGEMENT SYSTEM");

        DailyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(DailyTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Daily Item-wise Sales Entry");

        txtSearch.setToolTipText("");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        buttonAdd.setText("Add sales");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        tSearch.setText("Search");
        tSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRemove))
                            .addComponent(back)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdd)
                    .addComponent(buttonEdit)
                    .addComponent(buttonRemove))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveActionPerformed
        int salesRow = DailyTable.getSelectedRow();
        if (salesRow != -1){
            String date = DailyTable.getModel().getValueAt(salesRow, 0).toString();
            String itemID = DailyTable.getModel().getValueAt(salesRow, 1).toString();
            String itemName = DailyTable.getModel().getValueAt(salesRow, 2).toString();
            String category = DailyTable.getModel().getValueAt(salesRow, 3).toString();
            String supplierID = DailyTable.getModel().getValueAt(salesRow, 4).toString();
            String supplierName = DailyTable.getModel().getValueAt(salesRow, 5).toString();
            double sellPrice = Double.parseDouble(DailyTable.getModel().getValueAt(salesRow, 6).toString());
            int amountSold = Integer.parseInt(DailyTable.getModel().getValueAt(salesRow, 7).toString());
            Item item = new Item(itemID,itemName,category,supplierID,supplierName,sellPrice,0);
            DailyItemSales dis = new DailyItemSales(date,amountSold,item);
            try {
                if(admin!=null){
                    admin.removeDIS(dis);
                } else if(sm!=null){
                    sm.removeDIS(dis);
                }
            } catch(IOException e){
                JOptionPane.showMessageDialog(null,"No Sales Record is Removed.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"No Sales Record is Selected.");
        }
    }//GEN-LAST:event_buttonRemoveActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        int salesRow = DailyTable.getSelectedRow();
        if (salesRow != -1){
            String date = DailyTable.getModel().getValueAt(salesRow, 0).toString();
            String itemID = DailyTable.getModel().getValueAt(salesRow, 1).toString();
            String itemName = DailyTable.getModel().getValueAt(salesRow, 2).toString();
            String category = DailyTable.getModel().getValueAt(salesRow, 3).toString();
            String supplierID = DailyTable.getModel().getValueAt(salesRow, 4).toString();
            String supplierName = DailyTable.getModel().getValueAt(salesRow, 5).toString();
            double sellPrice = Double.parseDouble(DailyTable.getModel().getValueAt(salesRow, 6).toString());
            int amountSold = Integer.parseInt(DailyTable.getModel().getValueAt(salesRow, 7).toString());
            Item item = new Item(itemID,itemName,category,supplierID,supplierName,sellPrice,0);
            DailyItemSales dis = new DailyItemSales(date,amountSold,item);
           
            if(admin!=null){
                GUI_Edit_daily_item editDIS = new GUI_Edit_daily_item(admin,dis);
                editDIS.show();
                this.dispose();
            } else if(sm!=null){
                GUI_Edit_daily_item editDIS = new GUI_Edit_daily_item(sm,dis);
                editDIS.show();
                this.dispose();
            }
           
        } else {
            JOptionPane.showMessageDialog(null,"No Sales Record is Selected.");
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        if (admin != null){
            GUI_Admin adminHP = new GUI_Admin(admin);
            adminHP.show();
            this.dispose();
        } else if (sm != null){
            GUI_Sales_Manager smHP = new GUI_Sales_Manager(sm);
            smHP.show();
            this.dispose();
        }
    }//GEN-LAST:event_backActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        if (admin != null){
            GUI_Add_daily_item daily = new GUI_Add_daily_item(admin);
            daily.show();
            this.dispose();
        } else if (sm != null){
            GUI_Add_daily_item daily = new GUI_Add_daily_item(sm);
            daily.show();
            this.dispose();
        }    
    }//GEN-LAST:event_buttonAddActionPerformed

    private void tSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSearchActionPerformed
        DefaultTableModel model = (DefaultTableModel) DailyTable.getModel();
        String input = txtSearch.getText();

        try {
            ArrayList<String[]> it = DailyItemSales.view(DailyItemSales.view(),input);
            model.setRowCount(0);

            for (String[] il : it) {
                model.addRow(il);
            }

        } catch (IOException ex) {
            Logger.getLogger(GUI_Daily_item_Entry.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tSearchActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Daily_item_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Daily_item_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Daily_item_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Daily_item_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new GUI_Daily_item_Entry(new Admin()).setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DailyTable;
    private javax.swing.JButton back;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton tSearch;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
