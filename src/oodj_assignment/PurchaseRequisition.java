
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class PurchaseRequisition implements Record {
    private FileAccess prFile = new FileAccess("pr.txt");
    private String prID,smID;
    private Item item;
    private int quantity;
    private String status = "Unapproved";
            
    
    public PurchaseRequisition(String prID,Item item,int quantity,String smID){
        this.prID = prID;
        this.item = item;
        this.quantity = quantity;
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
    public ArrayList<String[]> filter(String filter) throws IOException{
        return prFile.viewFileWithFilter(filter);
    }
    public ArrayList<String[]> filter(ArrayList<String[]> AL, int attIndex, String filter){
        return prFile.viewFileWithFilter(AL,attIndex,filter);
    }
    public String toString(){
        return (prID + "|" + item.toString() + "|" + quantity + "|" + smID + "|" + status);
    }
    public void approve() throws IOException{
        edit(toString().replace("Unapproved","Approved"));
    }
    public void reject() throws IOException{
        edit(toString().replace("Unapproved","Rejected"));
    }
}       
   
                                                                                                                                                            