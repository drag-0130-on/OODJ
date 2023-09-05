package oodj_assignment;

import java.io.IOException;

public class PurchaseManager extends User{ 
    public PurchaseManager(String name, String userID, String password, String email, String contact){
        super(name,userID,password,email,contact);
        setRole("PurchaseManager");
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
    
   
}
