package oodj_assignment;

public class PurchaseManager extends User{ 
    public PurchaseManager(String name, String userID, String password, String email, String contact){
        super(name,userID,password,email,contact);
        setRole("PurchaseManager");
    }
    public void approvePR(){
        
    }
    public void rejectPR(){
        
    }
   
}
