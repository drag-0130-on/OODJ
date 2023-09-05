/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Lenovo
 */
public class Admin extends User {
    public Admin(String name, String userID, String password, String email, String contact) {
        super(name,userID,password,email,contact);
        setRole("Admin");
    }
    public void approvePR(String poID, PurchaseRequisition pr)throws IOException {
        pr.approve();
        PurchaseOrder po = new PurchaseOrder(poID,pr,getUserID());
        po.add();
    }
    public void rejectPR(PurchaseRequisition pr)throws IOException{
        pr.reject();
    }
    public void editPO(PurchaseOrder po,String editedPO)throws IOException{
        po.edit(editedPO);
    }
    public void removePO(PurchaseOrder po)throws IOException{
        po.getPR().disapprove();
        po.remove();
    }   
    public void generatePR(String prID,Item item,int quantity)throws IOException{
        PurchaseRequisition pr = new PurchaseRequisition(prID,item,quantity,getUserID());
        pr.add();
    }   
    public void editPR(PurchaseRequisition pr, String editedPR)throws IOException{
        pr.edit(editedPR);
    }
    public void removePR(PurchaseRequisition pr)throws IOException{
        pr.remove();
    }
    public void addItem(Item item)throws IOException{
        item.add();
    }
    public void editItem(Item item, String editedItem)throws IOException{
        item.edit(editedItem);
    }
    public void removeItem(Item item)throws IOException{
        item.remove();
    }
    public void addSupplier(Supplier supplier)throws IOException{
        supplier.add();
    }
    public void editSupplier(Supplier supplier, String editedSupplier)throws IOException{
        supplier.edit(editedSupplier);
    }
    public void removeSupplier(Supplier supplier)throws IOException{
        supplier.remove();
    }
    public void addDIS(DailyItemSales DIS)throws IOException {
        DIS.add();
    }
    public void editDIS(DailyItemSales DIS,String editedDIS)throws IOException {
        DIS.edit(editedDIS);
    }
    public void removeDIS(DailyItemSales DIS)throws IOException {
        DIS.remove();
    }
    public void addUser(User user)throws IOException{
        user.add();
    }
    public void editUser(User user, String editedUser)throws IOException{
        user.edit(editedUser);
    }
    public void removeUser(User user)throws IOException{
        user.remove();
    }
    
}
