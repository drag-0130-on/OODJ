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
public class GUI_Edit_pr extends javax.swing.JFrame {
    Admin admin;
    SalesManager sm;
    PurchaseRequisition pr;
    
    public GUI_Edit_pr(Admin admin, PurchaseRequisition pr) {
        initComponents();
        this.admin = admin;
        this.pr = pr;
        txtQuantity.setText(String.valueOf(pr.getQuantity()));
    }
    public GUI_Edit_pr(SalesManager sm, PurchaseRequisition pr) {
        initComponents();
        this.sm = sm;
        this.pr = pr;
        txtQuantity.setText(String.valueOf(pr.getQuantity()));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cancel = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        Add_pr = new javax.swing.JLabel();
        System_name = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        Add_pr.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Add_pr.setText("Edit Purchase Requisition ");

        System_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        System_name.setText("PURCHASE ORDER MANAGEMENT SYSTEM");

        Save.setText("Save");
        Save.setToolTipText("");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        jLabel4.setText("Quantity");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(Add_pr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(System_name))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(System_name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Add_pr)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Cancel))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        if (admin != null){
            GUI_PRPO_Entry prpoEntry = new GUI_PRPO_Entry(admin);
            prpoEntry.show();
            this.dispose();
        } else if(sm != null){
            GUI_PRPO_Entry prpoEntry = new GUI_PRPO_Entry(sm);
            prpoEntry.show();
            this.dispose();
        }
    }//GEN-LAST:event_CancelActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        String errorMessage = null;
        while (true){
            if (!(InputValidation.isValidQuantity(txtQuantity.getText()))){
                errorMessage = "Invalid Quantity";
                break;
            } else{
                PurchaseRequisition newPR = new PurchaseRequisition(pr.getPRID(),pr.getItem(),Integer.parseInt(txtQuantity.getText()),pr.getSMID(),pr.getStatus());
                try{    
                    if (admin != null){
                        admin.editPR(pr,newPR);
                        break;
                    } else if (sm != null){
                        sm.editPR(pr,newPR);
                        break;
                    }
                } catch(IOException e){
                    break;
                }
            }
        }
        if (errorMessage != null){
            JOptionPane.showMessageDialog(null,errorMessage);
        } else{
            if (admin != null){
                GUI_PRPO_Entry prpoEntry = new GUI_PRPO_Entry(admin);
                prpoEntry.show();
                this.dispose();
            } else if(sm != null){
                GUI_PRPO_Entry prpoEntry = new GUI_PRPO_Entry(sm);
                prpoEntry.show();
                this.dispose();
            }
        }
    }//GEN-LAST:event_SaveActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Edit_pr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Edit_pr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Edit_pr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Edit_pr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new GUI_Edit_pr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_pr;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Save;
    private javax.swing.JLabel System_name;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
