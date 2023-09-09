
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class GUI_Edit_item extends javax.swing.JFrame {
    
    Admin admin;
    SalesManager sm;
    Item item;
    public GUI_Edit_item(Admin admin, Item item) {
        initComponents();
        this.admin =admin;
        this.item = item;
        loadCategory();
        try {
            txtItemID.setText(User.generateID());
            txtItemID.disable();
            txtItemID.setText(User.generateID());
            txtItemID.disable();
            txtItemName.setText(item.getItemName());
            cmbCategory.getSelectedItem();
            txtStock.setText(String.valueOf(item.getStock()));
            cmbSupplier.getSelectedItem();
            txtSellPrice.setText(String.valueOf(item.getSellprice()));
            txtBuyPrice.setText(String.valueOf(item.getBuyprice()));
            
            loadSupplier();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Edit_item.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public GUI_Edit_item(SalesManager sm, Item item) {
        initComponents();
        this.sm =sm;
        this.item = item;
        loadCategory();
        try {
            txtItemID.setText(User.generateID());
            txtItemID.disable();
            txtItemID.setText(User.generateID());
            txtItemID.disable();
            txtItemName.setText(item.getItemName());
            cmbCategory.getSelectedItem();
            txtStock.setText(String.valueOf(item.getStock()));
            cmbSupplier.getSelectedItem();
            txtSellPrice.setText(String.valueOf(item.getSellprice()));
            txtBuyPrice.setText(String.valueOf(item.getBuyprice()));
            
            loadSupplier();
        } catch (IOException ex) {
            Logger.getLogger(GUI_Edit_item.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    public void loadCategory(){
        ItemCategory[] categories = ItemCategory.values();
        DefaultComboBoxModel categoryModel = (DefaultComboBoxModel) cmbCategory.getModel();
        cmbCategory.removeAllItems();
        for (ItemCategory category:categories){
            categoryModel.addElement(category.toString());
        }
        cmbCategory.setSelectedIndex(-1);
    }
    
    public void loadSupplier()throws IOException{
        ArrayList<String[]> supplierList = Supplier.view();
        DefaultComboBoxModel supplierModel = (DefaultComboBoxModel) cmbSupplier.getModel();
        cmbSupplier.removeAllItems();
        for (String[] supplier: supplierList){
            supplierModel.addElement(supplier[0]+"|"+supplier[1]);
        } 
        cmbSupplier.setSelectedIndex(-1);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtItemID = new javax.swing.JTextField();
        cmbSupplier = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSellPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBuyPrice = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Edit item");

        jButton3.setText("Cancel");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("PURCHASE ORDER MANAGEMENT SYSTEM");

        txtItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemIDActionPerformed(evt);
            }
        });

        cmbSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Sell Price:");

        jLabel2.setText("Category: ");

        jLabel6.setText("Supplier:");

        jLabel3.setText("Item Name:");

        jLabel4.setText("Stock: ");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Buy Price:");

        txtItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNameActionPerformed(evt);
            }
        });

        jLabel8.setText("Item ID:");

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
                .addGap(53, 53, 53)
                .addComponent(buttonSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel1))
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(306, 306, 306)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtItemID, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(39, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(51, 51, 51)
                .addComponent(jLabel9)
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(buttonSave))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(txtItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(86, 86, 86)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(txtSellPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(txtBuyPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(74, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemIDActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        String errorMessage = null;
        while(true){
            if(!(InputValidation.isValidName(txtItemName.getText()))){
                errorMessage = "Invalid item name\nLength of input should be between 0 and 30";
                break;
            }
            else if(cmbCategory.getSelectedItem()!=null){
                errorMessage = "Please select a category";
                break;
            }
            else if(!(InputValidation.isValidQuantity(txtStock.getText()))){
                errorMessage = "Invalid number";
                break;
            }
            else if(cmbSupplier.getSelectedItem()!=null){
                errorMessage = "Please select a supplier";
            }
            else if(!(InputValidation.isValidPrice(txtSellPrice.getText()))){
                errorMessage = "Invalid price";
                break;
            }
            else{
                if(!(InputValidation.isValidPrice(txtBuyPrice.getText()))){
                    errorMessage = "Invalid price";
                    break;
                }
            }
            if (errorMessage != null){ //还没改
                JOptionPane.showMessageDialog(new GUI_Edit_item(new Admin(),item),errorMessage);
            }
        }
        String[] supplierInfo = cmbSupplier.getSelectedItem().toString().split("\\|");
        Item item = new Item( txtItemID.getText(),txtItemName.getText(),cmbCategory.getSelectedItem().toString(),Integer.parseInt(txtStock.getText()),supplierInfo[0],supplierInfo[1],Double.parseDouble(txtSellPrice.getText()),Double.parseDouble(txtBuyPrice.getText()));
        try {
            if(admin!=null){
                admin.editItem(item, item);
                System.out.println("Admin");
            }
            else if(sm!=null){
                sm.editItem(item, item);
            }
        } catch (IOException ex) {
            Logger.getLogger(GUI_Edit_item.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void txtItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNameActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Edit_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Edit_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Edit_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Edit_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Item item = new Item();
                new GUI_Edit_item(new Admin(),item).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbSupplier;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBuyPrice;
    private javax.swing.JTextField txtItemID;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtSellPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
