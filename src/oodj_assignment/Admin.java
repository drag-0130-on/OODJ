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
    private Role role = Role.Admin;
    public Admin(String name, String userID, String password, String email, String contact) {
        super(name,userID,password,email,contact);
    }
    public void approvePR(String poID, PurchaseRequisition pr) throws IOException {
        pr.approve();
        PurchaseOrder po = new PurchaseOrder(poID,pr,getUserID());
        po.add();
    }
    public void rejectPR(String prID,Item item,int quantity,String smID) throws IOException{
        PurchaseRequisition pr = new PurchaseRequisition(prID,item,quantity,smID);
        pr.reject();
    }
    public void generatePR(String prID,Item item,int quantity,String smID)throws IOException{
        PurchaseRequisition pr = new PurchaseRequisition(prID,item,quantity,smID);
        pr.add();
    }   
    public void editPR(PurchaseRequisition pr, String change) throws IOException{
        pr.edit(change);
    }
    public void removePR(PurchaseRequisition pr) throws IOException{
        pr.remove();
    }
    
    public void addItem(){
        
    }
    public void editItem(){
        
    }
    public void removeItem(){
        
    }
    public void addSupplier(){
        
    }
    public void editSupplier(){
        
    }
    public void removeSupplier(){
        
    }
    public void addDIS(){
        
    }
    public void editDIS(){
        
    }
    public void removeDIS(){
        
    }
    public void 
}
