/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodj_assignment;

/**
 *
 * @author adamc
 */
public class GUI_PurchaseManager extends javax.swing.JFrame {
    PurchaseManager pm;
    public GUI_PurchaseManager() {
        initComponents();
    }
    public GUI_PurchaseManager(PurchaseManager pm) {
        initComponents();
        this.pm = pm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        buttonViewItem = new javax.swing.JButton();
        buttonViewSup = new javax.swing.JButton();
        buttonViewPR = new javax.swing.JButton();
        buttonPO = new javax.swing.JButton();
        buttonMyprofile = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Purchase Manager Home Page");

        buttonViewItem.setText("View Items");
        buttonViewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewItemActionPerformed(evt);
            }
        });

        buttonViewSup.setText("View Suppliers");
        buttonViewSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewSupActionPerformed(evt);
            }
        });

        buttonViewPR.setText("View Purchase Requisition");
        buttonViewPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewPRActionPerformed(evt);
            }
        });

        buttonPO.setText("Purchase Order");
        buttonPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPOActionPerformed(evt);
            }
        });

        buttonMyprofile.setText("My Profile");
        buttonMyprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMyprofileActionPerformed(evt);
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
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonViewSup, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(buttonMyprofile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonViewItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonViewPR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonPO, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(buttonLogout)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonViewItem)
                        .addGap(18, 18, 18)
                        .addComponent(buttonViewSup))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonViewPR)
                        .addGap(18, 18, 18)
                        .addComponent(buttonPO)))
                .addGap(18, 18, 18)
                .addComponent(buttonMyprofile)
                .addGap(54, 54, 54)
                .addComponent(buttonLogout)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonViewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewItemActionPerformed
//        GUI_ViewItems vi = new GUI_ViewItems();
//        vi.show();
    }//GEN-LAST:event_buttonViewItemActionPerformed

    private void buttonViewSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewSupActionPerformed
//        GUI_ViewSuppliers vs = new GUI_ViewSuppliers();
//        vs.show();
    }//GEN-LAST:event_buttonViewSupActionPerformed

    private void buttonViewPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewPRActionPerformed
//        GUI_ViewPR vpr = new GUI_ViewPR();
//        vpr.show();
    }//GEN-LAST:event_buttonViewPRActionPerformed

    private void buttonPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPOActionPerformed
//        GUI_PM_PO poe = new GUI_PM_PO();
//        poe.show();
    }//GEN-LAST:event_buttonPOActionPerformed

    private void buttonMyprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMyprofileActionPerformed
        GUI_MyProfile mp = new GUI_MyProfile();
        mp.show();
    }//GEN-LAST:event_buttonMyprofileActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        GUI_Login le = new GUI_Login();
        le.show();
    }//GEN-LAST:event_buttonLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_PurchaseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PurchaseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PurchaseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PurchaseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new GUI_PurchaseManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonMyprofile;
    private javax.swing.JButton buttonPO;
    private javax.swing.JButton buttonViewItem;
    private javax.swing.JButton buttonViewPR;
    private javax.swing.JButton buttonViewSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
