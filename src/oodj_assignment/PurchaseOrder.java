
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
    public void edit(String s)throws IOException{
        poFile.editFile(toString(), s);
    }
    public void remove() throws IOException{
        poFile.removeFromFile(toString());
    }
    public static ArrayList<String[]> view()throws IOException{
        return poFile.viewFile();
    }
    public static ArrayList<String[]> filter(String filter) throws IOException{
        return poFile.viewFileWithFilter(filter);
    }
    public static ArrayList<String[]> filter(ArrayList<String[]> AL, int attIndex, String filter){
        return poFile.viewFileWithFilter(AL,attIndex,filter);
    }
    public String toString(){
        return (poID + "|" + pr.toString() + "|" + pmID);
    }
    
     
}
