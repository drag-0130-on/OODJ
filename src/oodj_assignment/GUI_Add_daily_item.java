/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI_Add_daily_item extends javax.swing.JFrame {
    Admin admin;
    SalesManager sm;
    public GUI_Add_daily_item(Admin admin) {
        initComponents();
        this.admin = admin;
        try {
            showTable();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Add_daily_item.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public GUI_Add_daily_item(SalesManager sm) {
        initComponents();
        this.sm = sm;
        try {
            showTable();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Add_daily_item.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showTable() throws IOException {
        DefaultTableModel model = (DefaultTableModel) ItemTable.getModel();
        model.setRowCount(0);
        
        String[] columnNames = {"Item ID","Item Name", "Category","Stock","Supplier ID","Supplier Name","Sell Price","Buy Price"}; 
        model.setColumnIdentifiers(columnNames);
        
        ArrayList<String[]> it = Item.view();
        for (String[] il: it) {
            model.addRow(il);
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

        add_daily_item = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        System_name = new javax.swing.JLabel();
        buttonCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        cmbDay = new javax.swing.JComboBox<>();
        cmbMonth = new javax.swing.JComboBox<>();
        cmbYear = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ItemTable = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        buttonSearch3 = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        add_daily_item.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add_daily_item.setText("Add Daily Item-wise Sales ");

        jLabel2.setText("Date(DD/MM/YY):");

        System_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        System_name.setText("PURCHASE ORDER MANAGEMENT SYSTEM");

        buttonCancel.setText("Cancel");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        jLabel4.setText("Amount Sold:");

        cmbDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        cmbMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));

        ItemTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(ItemTable);

        txtSearch.setToolTipText("");

        buttonSearch3.setText("Search");
        buttonSearch3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearch3ActionPerformed(evt);
            }
        });

        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(add_daily_item)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCancel)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(System_name)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonSearch3))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(System_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_daily_item)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSearch3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancel)
                    .addComponent(buttonSave))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSearch3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearch3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) ItemTable.getModel();
        String input = txtSearch.getText();

        try {
            ArrayList<String[]> it = Item.view(DailyItemSales.view(),input);
            model.setRowCount(0);

            for (String[] il : it) {
                model.addRow(il);
            }

        } catch (IOException ex) {
            Logger.getLogger(GUI_Supplier_Entry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSearch3ActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        String selectedYear = (String) cmbYear.getSelectedItem();
        String selectedMonth = (String) cmbMonth.getSelectedItem();
        String selectedDay = (String) cmbDay.getSelectedItem();
        String date = (selectedDay+"-"+selectedMonth+"-"+selectedYear);
        System.out.println(date);
        String errorMessage = null;
       
        while(true){
            if(!(InputValidation.isValidDate(selectedDay,selectedMonth,selectedYear))){
                errorMessage = "Invalid Date";
                break;
            }
            else if(!(InputValidation.isValidQuantity(txtAmount.getText()))){
                errorMessage = "Invalid Amount";
                break;
            } else {
                int itemRow = ItemTable.getSelectedRow();
                if (itemRow != -1){
                    String itemID = ItemTable.getModel().getValueAt(itemRow, 0).toString();
                    String itemName = ItemTable.getModel().getValueAt(itemRow, 1).toString();
                    String category = ItemTable.getModel().getValueAt(itemRow, 2).toString();
                    int stock = Integer.parseInt(ItemTable.getModel().getValueAt(itemRow, 3).toString());
                    String supplierID = ItemTable.getModel().getValueAt(itemRow, 4).toString();
                    String supplierName = ItemTable.getModel().getValueAt(itemRow, 5).toString();
                    double sellPrice = Double.parseDouble(ItemTable.getModel().getValueAt(itemRow, 6).toString());
                    double buyPrice = Double.parseDouble(ItemTable.getModel().getValueAt(itemRow, 7).toString());
                    Item item = new Item(itemID,itemName,category,stock,supplierID,supplierName,sellPrice,buyPrice);
                    DailyItemSales dis = new DailyItemSales(date,Integer.parseInt(txtAmount.getText()),item);
                    try {
                        if (dis.verifyUniqueness()){
                            if (admin != null){
                                admin.addDIS(dis);
                                break;
                            } else if (sm != null){
                                sm.addDIS(dis);
                                break;
                            } 
                        } else {
                            errorMessage = "Invalid Daily Item Sales";
                            break;
                        }
                    } catch (IOException ex) {
                        break;
                    }
                } else{
                    errorMessage = "No Item is Selected.";
                    break;
                }
            }
        }
        if (errorMessage != null){
            JOptionPane.showMessageDialog(null,errorMessage);
        } else{
            if (admin != null) {
                GUI_Daily_item_Entry disEntry = new GUI_Daily_item_Entry(admin);
                disEntry.show();
                this.dispose();
;           } else if (sm != null) {
                GUI_Daily_item_Entry disEntry = new GUI_Daily_item_Entry(sm);
                disEntry.show();
                this.dispose();
            }    
        }
       
        
       
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        if (admin != null) {
            GUI_Daily_item_Entry disEntry = new GUI_Daily_item_Entry(admin);
            disEntry.show();
            this.dispose();
;        } else if (sm != null) {
            GUI_Daily_item_Entry disEntry = new GUI_Daily_item_Entry(sm);
            disEntry.show();
            this.dispose();
        }
   
    }//GEN-LAST:event_buttonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Add_daily_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Add_daily_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Add_daily_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Add_daily_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Add_daily_item(new Admin()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ItemTable;
    private javax.swing.JLabel System_name;
    private javax.swing.JLabel add_daily_item;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonSearch3;
    private javax.swing.JComboBox<String> cmbDay;
    private javax.swing.JComboBox<String> cmbMonth;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
