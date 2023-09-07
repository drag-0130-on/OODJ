
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class PurchaseOrder implements Record {
    private static FileAccess poFile = new FileAccess("po.txt");
    private String poID, pmID;
    private PurchaseRequisition pr;
    
    public PurchaseOrder(String poID,PurchaseRequisition pr,String pmID){
        this.poID = poID;
        this.pr = pr;
        this.pmID = pmID;
    }
    public PurchaseRequisition getPR(){
        return pr;
    }
    public void add()throws IOException{
        poFile.addToFile(toString());
    }
    public void edit(Object newData)throws IOException{
        poFile.editFile(toString(), newData.toString());
    }
    public void remove() throws IOException{
        poFile.removeFromFile(toString());
        pr.disapprove();
    }
    public static ArrayList<String[]> view()throws IOException{
        return poFile.viewFile();
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL,String filter) throws IOException{
        return poFile.viewFile(AL,filter);
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL, int attIndex, String filter){
        return poFile.viewFile(AL,attIndex,filter);
    }
    public String toString(){
        return (pr.toString() + "|" + pmID);
    }
    
     
}
