
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class PurchaseRequisition implements Record {
    FileAccess prFile = new FileAccess("pr.txt");
    String prID, status;
    Item item;
    int quantity;
    SalesManager salesManager;
    
    
    public PurchaseRequisition(String prID,Item item,int quantity, SalesManager sm){
        this.prID = prID;
        this.item = item;
        this.quantity = quantity;
        this.salesManager = sm;
        
    }
    public void add()throws IOException{
        prFile.addToFile(toString());
    }
    public void edit(String s)throws IOException{
        prFile.editFile(toString(), s);
    }
    public void remove() throws IOException{
        prFile.removeFromFile(toString());
    }
    public ArrayList<String[]> view()throws IOException{
        return prFile.viewFile();
    }
    public ArrayList<String[]> view(String s)throws IOException{
        return prFile.viewFile(s);
    }
    public String toString(){
        return (prID + "|" + item.toString() + "|" + quantity);
    }
}
