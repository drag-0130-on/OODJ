package oodj_assignment;

import java.io.IOException;

public class PurchaseManager extends User{ 
    public PurchaseManager(String name, String userID, String password, String email, String contact){
        super(name,userID,password,email,contact);
        setRole("PurchaseManager");
    }
    
    public void generatePR(String prID,Item item,int quantity)throws IOException{
        PurchaseRequisition pr = new PurchaseRequisition(prID,item,quantity,getUserID());
        pr.add();
    }   
    public void editPR(PurchaseRequisition pr, String editedPR)throws IOException{
        if (pr.getSMID().equals(getUserID())){
           pr.edit(editedPR); 
        }  
    }
    public void removePR(PurchaseRequisition pr)throws IOException{
        pr.remove();
    }
    public void approvePR(String poID, PurchaseRequisition pr)throws IOException {
        pr.approve();
        PurchaseOrder po = new PurchaseOrder(poID,pr,getUserID());
        po.add();
    }
    public void rejectPR(PurchaseRequisition pr)throws IOException{
        pr.reject();
    }
    
   
}
