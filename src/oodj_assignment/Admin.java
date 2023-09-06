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
    public void editPO(PurchaseOrder po,PurchaseOrder newPO)throws IOException{
        po.edit(newPO);
    }
    public void removePO(PurchaseOrder po)throws IOException{
        po.remove();
    }   
    public void addPR(PurchaseRequisition pr)throws IOException{
        pr.add();
    }   
    //edit everything
    public void editPR(PurchaseRequisition pr, PurchaseRequisition newPR)throws IOException{
        pr.edit(newPR);
    }
    public void removePR(PurchaseRequisition pr)throws IOException{
        pr.remove();
    }
    public void addItem(Item item)throws IOException{
        item.add();
    }
    //edit price, category, stock
    public void editItem(Item item, Item newItem)throws IOException{
        item.edit(newItem);
    }
    public void removeItem(Item item)throws IOException{
        item.remove();
    }
    public void addSupplier(Supplier supplier)throws IOException{
        supplier.add();
    }
    //edit contact only
    public void editSupplier(Supplier supplier, Supplier newSupplier)throws IOException{
        supplier.edit(newSupplier);
    }
    public void removeSupplier(Supplier supplier)throws IOException{
        supplier.remove();
    }
    public void addDIS(DailyItemSales DIS)throws IOException {
        if (DIS.getItem().verifyStockAvailability(DIS.getAmountSold())){
            DIS.add();
        }
    }
    //edit everything
    public void editDIS(DailyItemSales DIS,DailyItemSales newDIS)throws IOException {
        if (newDIS.getItem().verifyStockAvailability(newDIS.getAmountSold())){
            DIS.remove();
            newDIS.add();
        }
    }
    public void removeDIS(DailyItemSales DIS)throws IOException {
        DIS.remove();
    }
    public void addUser(User user)throws IOException{
        user.add();
    }
    //edit everything excluding id
    public void editUser(User user, User newUser)throws IOException{
        user.edit(newUser);
    }
    public void removeUser(User user)throws IOException{
        user.remove();
    }
}
