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
        po.getPR().disapprove();
        po.remove();
    }   
    public void generatePR(String prID,Item item,int quantity)throws IOException{
        PurchaseRequisition pr = new PurchaseRequisition(prID,item,quantity,getUserID());
        pr.add();
    }   
    public void editPR(PurchaseRequisition pr, PurchaseRequisition newPR)throws IOException{
        pr.edit(newPR);
    }
    public void removePR(PurchaseRequisition pr)throws IOException{
        pr.remove();
    }
    public void addItem(Item item)throws IOException{
        item.add();
    }
    public void editItem(Item item, Item newItem)throws IOException{
        item.edit(newItem);
    }
    public void removeItem(Item item)throws IOException{
        item.remove();
    }
    public void addSupplier(Supplier supplier)throws IOException{
        supplier.add();
    }
    public void editSupplier(Supplier supplier, Supplier newSupplier)throws IOException{
        supplier.edit(newSupplier);
    }
    public void removeSupplier(Supplier supplier)throws IOException{
        supplier.remove();
    }
    public void addDIS(DailyItemSales DIS)throws IOException {
        if (DIS.getItem().verifyStockAvailability(DIS.getAmountSold())){
            DIS.add();
            DIS.getItem().reduceStock(DIS.getAmountSold());
        }
    }
    public void editDIS(DailyItemSales DIS,DailyItemSales newDIS)throws IOException {
        DIS.edit(newDIS);
    }
    public void removeDIS(DailyItemSales DIS)throws IOException {
        DIS.remove();
        DIS.getItem().addStock(DIS.getAmountSold());
    }
    public void addUser(User user)throws IOException{
        user.add();
    }
    public void editUser(User user, User newUser)throws IOException{
        user.edit(newUser);
    }
    public void removeUser(User user)throws IOException{
        user.remove();
    }
}
