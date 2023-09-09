package oodj_assignment;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SalesManager extends User {
    
    public SalesManager(String userID, String name, String password, String email, String contact) {
        super(userID,name,password,email,contact,"SalesManager");
        
    }
    public SalesManager(){
        super();
        
    }
    public void addItem(Item item)throws IOException{
        item.add();
    }
    public void editItem(Item item,Item editedItem)throws IOException{
        item.edit(editedItem);
    }
    public void removeItem(Item item)throws IOException{
        item.remove();
    }
    public void addSupplier(Supplier supplier)throws IOException{
        supplier.add();
    }
    public void editSupplier(Supplier supplier, Supplier editedSupplier)throws IOException{
        supplier.edit(editedSupplier);
    }
    public void removeSupplier(Supplier supplier)throws IOException{
        supplier.remove();
    }
    public void addDIS(DailyItemSales DIS)throws IOException {
        DIS.add();
    }
    public void editDIS(DailyItemSales DIS,DailyItemSales editedDIS)throws IOException {
        DIS.edit(editedDIS);
    }
    public void removeDIS(DailyItemSales DIS)throws IOException {
        DIS.remove();
    }
    public void addPR(PurchaseRequisition pr)throws IOException{
        pr.setSMID(getUserID());
        pr.add();
    }   
    public void editPR(PurchaseRequisition pr, PurchaseRequisition newPR)throws IOException{
        if (!pr.isApproved()){
            pr.edit(newPR);
        }
    }
    public void removePR(PurchaseRequisition pr)throws IOException{
        pr.remove();
    }
    
    
}


