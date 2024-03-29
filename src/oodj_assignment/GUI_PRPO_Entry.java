package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI_PRPO_Entry extends javax.swing.JFrame {

    Admin admin;
    SalesManager sm;
    PurchaseManager pm;
    public GUI_PRPO_Entry(Admin admin) {
        initComponents();
        this.admin = admin;
        try {
            showTable();
            loadStatus();
        } catch (IOException ex) {
            Logger.getLogger(GUI_PRPO_Entry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public GUI_PRPO_Entry(SalesManager sm) {
        initComponents();
        this.sm = sm;
        btnApprovePR.disable();
        btnRejectPR.disable();
        btnRemovePO.disable();
        try {
            showTable();
            loadStatus();
        } catch (IOException ex) {
            Logger.getLogger(GUI_PRPO_Entry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public GUI_PRPO_Entry(PurchaseManager pm) {
        initComponents();
        this.pm = pm;
        btnAddPR.disable();
        btnEditPR.disable();
        btnRemovePR.disable();
        try {
            showTable();
            loadStatus();
        } catch (IOException ex) {
            Logger.getLogger(GUI_PRPO_Entry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showTable() throws IOException {
        DefaultTableModel model = (DefaultTableModel) PRTable.getModel();
        DefaultTableModel model2 = (DefaultTableModel) POTable.getModel();
        model.setRowCount(0);
        model2.setRowCount(0);
        
        String[] columnNames = {"PR ID", "Item ID", "Item","Category", "Supplier ID", "Supplier","Single Price","Quantity","Total Price","Generator","Status"};
        String[] columnNames2 = {"PR ID", "Item ID", "Item","Category", "Supplier ID", "Supplier","Single Price","Quantity","Total Price","Generator","Status","Approved By"};
        model.setColumnIdentifiers(columnNames);
        model2.setColumnIdentifiers(columnNames2);
        
        ArrayList<String[]> prt = PurchaseRequisition.view();
        for (String[] prl: prt) {
            model.addRow(prl);
        }
        ArrayList<String[]> pot = PurchaseOrder.view();
        for (String[] pol: pot) {
            model2.addRow(pol);
        }
    }
    public void loadStatus(){
        DefaultComboBoxModel roleModel = (DefaultComboBoxModel) cmbStatus.getModel();
        cmbStatus.removeAllItems();
        roleModel.addElement("Pending");
        roleModel.addElement("Approved");
        roleModel.addElement("Rejected");
        roleModel.addElement("");
        cmbStatus.setSelectedIndex(-1);
        
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PRTable = new javax.swing.JTable();
        btnApprovePR = new javax.swing.JButton();
        btnAddPR = new javax.swing.JButton();
        btnEditPR = new javax.swing.JButton();
        btnRemovePR = new javax.swing.JButton();
        btnRejectPR = new javax.swing.JButton();
        txtSearchPR = new javax.swing.JTextField();
        btnSearchPR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        POTable = new javax.swing.JTable();
        btnRemovePO = new javax.swing.JButton();
        txtSearchPO = new javax.swing.JTextField();
        btnSearchPO = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Purchase Requisition & Purchase Order");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Purchase Requisition"));

        PRTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null", "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(PRTable);

        btnApprovePR.setText("Approve");
        btnApprovePR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApprovePRActionPerformed(evt);
            }
        });

        btnAddPR.setText("Add");
        btnAddPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPRActionPerformed(evt);
            }
        });

        btnEditPR.setText("Edit");
        btnEditPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditPRActionPerformed(evt);
            }
        });

        btnRemovePR.setText("Remove");
        btnRemovePR.setActionCommand("");
        btnRemovePR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePRActionPerformed(evt);
            }
        });

        btnRejectPR.setText("Reject");
        btnRejectPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectPRActionPerformed(evt);
            }
        });

        txtSearchPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchPRActionPerformed(evt);
            }
        });

        btnSearchPR.setText("Search");
        btnSearchPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPRActionPerformed(evt);
            }
        });

        jLabel3.setText("Status: ");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSearchPR, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchPR, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAddPR, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEditPR, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRemovePR, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnApprovePR)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnRejectPR))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPR)
                    .addComponent(btnEditPR)
                    .addComponent(btnRemovePR)
                    .addComponent(btnApprovePR)
                    .addComponent(btnRejectPR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchPR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchPR)
                    .addComponent(jLabel3)
                    .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(294, 294, 294))
        );

        btnBack.setText("Back");
        btnBack.setToolTipText("");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Purchase Order"));

        POTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null", "null", "null", "null", "null", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(POTable);

        btnRemovePO.setText("Remove");
        btnRemovePO.setActionCommand("");
        btnRemovePO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePOActionPerformed(evt);
            }
        });

        btnSearchPO.setText("Search");
        btnSearchPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRemovePO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSearchPO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchPO, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRemovePO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchPO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("PURCHASE ORDER MANAGEMENT SYSTEM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(302, 302, 302))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemovePOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePOActionPerformed
        int prRow = POTable.getSelectedRow();
        if (prRow != -1){
            String prID = POTable.getModel().getValueAt(prRow, 0).toString();
            String itemID = POTable.getModel().getValueAt(prRow, 1).toString();
            String itemName = POTable.getModel().getValueAt(prRow, 2).toString();
            String category = POTable.getModel().getValueAt(prRow, 3).toString();
            String supplierID = POTable.getModel().getValueAt(prRow, 4).toString();
            String supplierName = POTable.getModel().getValueAt(prRow, 5).toString();
            double price = Double.parseDouble(POTable.getModel().getValueAt(prRow, 6).toString());
            int quantity = Integer.parseInt(POTable.getModel().getValueAt(prRow, 7).toString());
            String generator = POTable.getModel().getValueAt(prRow, 9).toString();
            String status = POTable.getModel().getValueAt(prRow, 10).toString();
            String approvedby = POTable.getModel().getValueAt(prRow, 11).toString();
            Item item = new Item(itemID,itemName,category,supplierID,supplierName,0,price);
            PurchaseRequisition pr = new PurchaseRequisition(prID,item,quantity,generator,status);
            PurchaseOrder po = new PurchaseOrder(pr,approvedby);
            try {
                if(admin!=null){
                    admin.removePO(po);
                    showTable();
                }
                else if(pm!=null){
                    pm.removePO(po);
                    showTable();
                }
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(null,"No Purchase Order is Removed.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"No Purchase Order is Selected.");
        }
    }//GEN-LAST:event_btnRemovePOActionPerformed

    private void btnRemovePRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePRActionPerformed
        int prRow = PRTable.getSelectedRow();
        if (prRow != -1){
            String prID = PRTable.getModel().getValueAt(prRow, 0).toString();
            String itemID = PRTable.getModel().getValueAt(prRow, 1).toString();
            String itemName = PRTable.getModel().getValueAt(prRow, 2).toString();
            String category = PRTable.getModel().getValueAt(prRow, 3).toString();
            String supplierID = PRTable.getModel().getValueAt(prRow, 4).toString();
            String supplierName = PRTable.getModel().getValueAt(prRow, 5).toString();
            double price = Double.parseDouble(PRTable.getModel().getValueAt(prRow, 6).toString());
            int quantity = Integer.parseInt(PRTable.getModel().getValueAt(prRow, 7).toString());
            String generator = PRTable.getModel().getValueAt(prRow, 9).toString();
            String status = PRTable.getModel().getValueAt(prRow, 10).toString();
            Item item = new Item(itemID,itemName,category,supplierID,supplierName,0,price);
            PurchaseRequisition pr = new PurchaseRequisition(prID,item,quantity,generator,status);
            if (pr.isApproved()){
                JOptionPane.showMessageDialog(null,"Approved Purchase Requisition Cannot be Modified.");
            } else{
                try {
                    if(admin!=null){
                        admin.removePR(pr);
                        showTable();
                    }
                    else if(sm!=null){
                        sm.removePR(pr);
                        showTable();
                    }
                } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,"No Purchase Requisition is Removed.");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,"No Purchase Requisition is Selected.");
        }
    }//GEN-LAST:event_btnRemovePRActionPerformed

    private void btnRejectPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectPRActionPerformed
        int prRow = PRTable.getSelectedRow();
        if (prRow != -1){
            String prID = PRTable.getModel().getValueAt(prRow, 0).toString();
            String itemID = PRTable.getModel().getValueAt(prRow, 1).toString();
            String itemName = PRTable.getModel().getValueAt(prRow, 2).toString();
            String category = PRTable.getModel().getValueAt(prRow, 3).toString();
            String supplierID = PRTable.getModel().getValueAt(prRow, 4).toString();
            String supplierName = PRTable.getModel().getValueAt(prRow, 5).toString();
            double price = Double.parseDouble(PRTable.getModel().getValueAt(prRow, 6).toString());
            int quantity = Integer.parseInt(PRTable.getModel().getValueAt(prRow, 7).toString());
            String generator = PRTable.getModel().getValueAt(prRow, 9).toString();
            String status = PRTable.getModel().getValueAt(prRow, 10).toString();
            Item item = new Item(itemID,itemName,category,supplierID,supplierName,0,price);
            PurchaseRequisition pr = new PurchaseRequisition(prID,item,quantity,generator,status);
            if (pr.isRejected()){
                JOptionPane.showMessageDialog(null,"Purchase Requisition is Rejected");
            } else{
                try{
                    if(admin!=null){
                        admin.rejectPR(pr);
                        showTable();
                    } else if(pm!=null){
                        pm.rejectPR(pr);
                        showTable();
                    }
                } catch (IOException e){
                    JOptionPane.showMessageDialog(null,"No Purchase Requisition is Rejected.");
                }
            }       
        } else {
            JOptionPane.showMessageDialog(null,"No Purchase Requisition is Selected.");
        }
    }//GEN-LAST:event_btnRejectPRActionPerformed

    private void btnApprovePRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApprovePRActionPerformed
        int prRow = PRTable.getSelectedRow();
        if (prRow != -1){
            String prID = PRTable.getModel().getValueAt(prRow, 0).toString();
            String itemID = PRTable.getModel().getValueAt(prRow, 1).toString();
            String itemName = PRTable.getModel().getValueAt(prRow, 2).toString();
            String category = PRTable.getModel().getValueAt(prRow, 3).toString();
            String supplierID = PRTable.getModel().getValueAt(prRow, 4).toString();
            String supplierName = PRTable.getModel().getValueAt(prRow, 5).toString();
            double price = Double.parseDouble(PRTable.getModel().getValueAt(prRow, 6).toString());
            int quantity = Integer.parseInt(PRTable.getModel().getValueAt(prRow, 7).toString());
            String generator = PRTable.getModel().getValueAt(prRow, 9).toString();
            String status = PRTable.getModel().getValueAt(prRow, 10).toString();
            Item item = new Item(itemID,itemName,category,supplierID,supplierName,0,price);
            PurchaseRequisition pr = new PurchaseRequisition(prID,item,quantity,generator,status);
            if (pr.isApproved()){
                JOptionPane.showMessageDialog(null,"Purchase Requisition is Approved");
            } else {
                try{
                    if(admin!=null){
                        admin.approvePR(pr);
                        showTable();
                    } else if(pm!=null){
                        pm.approvePR(pr);
                        showTable();
                    }
                } catch (IOException e){
                    JOptionPane.showMessageDialog(null,"No Purchase Requisition is Approved.");
                }
            }
                                                            
        } else {
            JOptionPane.showMessageDialog(null,"No Purchase Requisition is Selected.");
        }
    }//GEN-LAST:event_btnApprovePRActionPerformed

    private void btnAddPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPRActionPerformed
        if (admin != null){
            GUI_Add_pr addPR = new GUI_Add_pr(admin);
            addPR.show();
            this.dispose();
        } else if (sm != null){
            GUI_Add_pr addPR = new GUI_Add_pr(sm);
            addPR.show();
            this.dispose();
        }
    }//GEN-LAST:event_btnAddPRActionPerformed
//"PR ID", "Item ID", "Item","Category", "Supplier ID", "Supplier","Single Price","Quantity","Total Price","Generator","Status"
    private void btnEditPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditPRActionPerformed
        int prRow = PRTable.getSelectedRow();
        if (prRow != -1){
            String prID = PRTable.getModel().getValueAt(prRow, 0).toString();
            String itemID = PRTable.getModel().getValueAt(prRow, 1).toString();
            String itemName = PRTable.getModel().getValueAt(prRow, 2).toString();
            String category = PRTable.getModel().getValueAt(prRow, 3).toString();
            String supplierID = PRTable.getModel().getValueAt(prRow, 4).toString();
            String supplierName = PRTable.getModel().getValueAt(prRow, 5).toString();
            double price = Double.parseDouble(PRTable.getModel().getValueAt(prRow, 6).toString());
            int quantity = Integer.parseInt(PRTable.getModel().getValueAt(prRow, 7).toString());
            String generator = PRTable.getModel().getValueAt(prRow, 9).toString();
            String status = PRTable.getModel().getValueAt(prRow, 10).toString();
            Item item = new Item(itemID,itemName,category,supplierID,supplierName,0,price);
            PurchaseRequisition pr = new PurchaseRequisition(prID,item,quantity,generator,status);
            if (pr.isApproved()){
                JOptionPane.showMessageDialog(null,"Approved Purchase Requisition Cannot be Modified.");
            } else{
                if(admin!=null){
                    GUI_Edit_pr editPR = new GUI_Edit_pr(admin,pr);
                    editPR.show();
                    this.dispose();
                } else if(sm!=null){
                    GUI_Edit_pr editPR = new GUI_Edit_pr(sm,pr);
                    editPR.show();
                    this.dispose();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,"No Purchase Requisition is Selected.");
        }
    }//GEN-LAST:event_btnEditPRActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        if (admin != null){
            GUI_Admin adminHP = new GUI_Admin(admin);
            adminHP.show();
            this.dispose();
        } else if (sm != null){
            GUI_Sales_Manager smHP = new GUI_Sales_Manager(sm);
            smHP.show();
            this.dispose();
        } else if (pm != null){
            GUI_PurchaseManager pmHP = new GUI_PurchaseManager(pm);
            pmHP.show();
            this.dispose();
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPRActionPerformed
        DefaultTableModel model = (DefaultTableModel) PRTable.getModel();
        model.setRowCount(0);
        ArrayList<String[]> prList = new ArrayList<String[]>();
        try {
            prList = PurchaseRequisition.view();
        } catch (IOException ex) {
        }
        while (txtSearchPR.getText()!= null){
            try {
                prList = PurchaseRequisition.view(prList,txtSearchPR.getText());
                break;
            } catch (IOException ex) {
                break;
            }
        } 
        while (cmbStatus.getSelectedIndex() != -1 && cmbStatus.getSelectedItem()!= null && cmbStatus.getSelectedItem().toString().length()>1){
            prList = PurchaseRequisition.view(prList,10,cmbStatus.getSelectedItem().toString());
            break;
        }
        
        for (String[] line:prList){
            model.addRow(line);
        }
    }//GEN-LAST:event_btnSearchPRActionPerformed

    private void txtSearchPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchPRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchPRActionPerformed

    private void btnSearchPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPOActionPerformed
        DefaultTableModel model = (DefaultTableModel) POTable.getModel();
        model.setRowCount(0);
        ArrayList<String[]> poList = new ArrayList<String[]>();
        try {
            poList = PurchaseOrder.view();
        } catch (IOException ex) {
        }
        while (txtSearchPO.getText()!= null){
            try {
                poList = PurchaseOrder.view(poList,txtSearchPO.getText());
                break;
            } catch (IOException ex) {
                break;
            }
        } 
        for (String[] line:poList){
            model.addRow(line);
        }
    }//GEN-LAST:event_btnSearchPOActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_PRPO_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_PRPO_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_PRPO_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_PRPO_Entry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GUI_PRPO_Entry(new Admin()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable POTable;
    private javax.swing.JTable PRTable;
    private javax.swing.JButton btnAddPR;
    private javax.swing.JButton btnApprovePR;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditPR;
    private javax.swing.JButton btnRejectPR;
    private javax.swing.JButton btnRemovePO;
    private javax.swing.JButton btnRemovePR;
    private javax.swing.JButton btnSearchPO;
    private javax.swing.JButton btnSearchPR;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtSearchPO;
    private javax.swing.JTextField txtSearchPR;
    // End of variables declaration//GEN-END:variables
}
