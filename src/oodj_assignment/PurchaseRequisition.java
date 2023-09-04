
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class PurchaseRequisition implements Record {
    FileAccess prFile = new FileAccess("pr.txt");
    String prID, status,smID;
    Item item;
    int quantity;
            
    
    public PurchaseRequisition(String prID,Item item,int quantity,String status, String smID){
        this.prID = prID;
        this.item = item;
        this.quantity = quantity;
        this.status = status;
        this.smID = smID;
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
    public ArrayList<String[]> filter(ArrayList<String[]> AL, int attIndex, String filter){
        return prFile.viewFileWithFilter(AL,attIndex,filter);
    }
    public String toString(){
        return (prID + "|" + item.toString() + "|" + quantity + "|" + status + "|");
    }
}       
   
                                                                                                                                                            