/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

/**
 *
 * @author adamc
 */
public class Admin_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin_GUI() {
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

        jLabel1 = new javax.swing.JLabel();
        buttonItemEntry = new javax.swing.JButton();
        buttonSupplierEntry = new javax.swing.JButton();
        buttonDailyEntry = new javax.swing.JButton();
        buttonPREntry = new javax.swing.JButton();
        buttonPOEntry = new javax.swing.JButton();
        buttonProfileEntry = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Admin Home Page");

        buttonItemEntry.setText("Item Entry");
        buttonItemEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonItemEntryActionPerformed(evt);
            }
        });

        buttonSupplierEntry.setText("Supplier Entry");
        buttonSupplierEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSupplierEntryActionPerformed(evt);
            }
        });

        buttonDailyEntry.setText("Daily Item-wise Sales Entry");
        buttonDailyEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDailyEntryActionPerformed(evt);
            }
        });

        buttonPREntry.setText("Purchase Requisition");
        buttonPREntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPREntryActionPerformed(evt);
            }
        });

        buttonPOEntry.setText("Purchase Order");
        buttonPOEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPOEntryActionPerformed(evt);
            }
        });

        buttonProfileEntry.setText("User Profile");
        buttonProfileEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProfileEntryActionPerformed(evt);
            }
        });

        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonDailyEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonItemEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSupplierEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(buttonPREntry, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(buttonPOEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonProfileEntry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(buttonLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonItemEntry)
                    .addComponent(buttonPREntry))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSupplierEntry)
                    .addComponent(buttonPOEntry))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDailyEntry)
                    .addComponent(buttonProfileEntry))
                .addGap(92, 92, 92)
                .addComponent(buttonLogout)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonItemEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonItemEntryActionPerformed
        Item_Entry_GUI ie = new Item_Entry_GUI();
        ie.show();
    }//GEN-LAST:event_buttonItemEntryActionPerformed

    private void buttonSupplierEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSupplierEntryActionPerformed
        Supplier_Entry_GUI se = new Supplier_Entry_GUI();
        se.show();
    }//GEN-LAST:event_buttonSupplierEntryActionPerformed

    private void buttonDailyEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDailyEntryActionPerformed
        Daily_item_Entry_GUI die = new Daily_item_Entry_GUI();
        die.show();
    }//GEN-LAST:event_buttonDailyEntryActionPerformed

    private void buttonPREntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPREntryActionPerformed
        Daily_item_Entry_GUI die = new Daily_item_Entry_GUI();
        die.show();
    }//GEN-LAST:event_buttonPREntryActionPerformed

    private void buttonProfileEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProfileEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonProfileEntryActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonPOEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPOEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPOEntryActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDailyEntry;
    private javax.swing.JButton buttonItemEntry;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonPOEntry;
    private javax.swing.JButton buttonPREntry;
    private javax.swing.JButton buttonProfileEntry;
    private javax.swing.JButton buttonSupplierEntry;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
