
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class PurchaseRequisition implements Record {
    private static FileAccess prFile = new FileAccess("pr.txt");
    private String prID,smID;
    private Item item;
    private int quantity;
    private String status = "Pending";
            
    public PurchaseRequisition(String prID,Item item,int quantity,String smID){
        this.prID = prID;
        this.item = item;
        this.quantity = quantity;
        this.smID = smID;
    }
    public PurchaseRequisition(String prID,Item item,int quantity){
        this.prID = prID;
        this.item = item;
        this.quantity = quantity;
    }
    
    public void setSMID(String smID){
        this.smID = smID;
    }
    public String getSMID(){
        return smID;
    }
    public double totalprice(){
        return quantity*item.getBuyprice();
    }
    public void add()throws IOException{
        prFile.addToFile(toString());
    }
    public void edit(Object newData)throws IOException{
        prFile.editFile(toString(), newData.toString());        
    }
    public void remove() throws IOException{
        prFile.removeFromFile(toString());
    }
    public static ArrayList<String[]> view()throws IOException{
        return prFile.viewFile();
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL,String filter) throws IOException{
        return prFile.viewFile(AL,filter);
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL, int attIndex, String filter){
        return prFile.viewFile(AL,attIndex,filter);
    }
    public static String generateID() throws IOException{
        ArrayList<String[]> AL = view();
        if (AL.size()==0){
            return "P0001";
        } else{
            int idNo = Integer.parseInt((AL.get((AL.size()-1))[0]).substring(1)) + 1;
            int idLength = String.valueOf(idNo).length();
            String id = "P";
            for (int i = 0;i < (4-idLength);i++){
                id += "0";
            }
            id += idNo;
            return id;
        }
    }
    public String toString(){
        return (prID + "|" + item.toStringForPR() + "|" + quantity + "|" + totalprice() + "|" + smID + "|" + status);
    }
    public void approve() throws IOException{
        edit(toString().replace("Pending","Approved"));
    }
    public void disapprove() throws IOException{
        edit(toString().replace("Approved","Rejected"));
    }
    public void reject() throws IOException{
        edit(toString().replace("Pending","Rejected"));
    }
   
}       
   
                                                                                                                                                            