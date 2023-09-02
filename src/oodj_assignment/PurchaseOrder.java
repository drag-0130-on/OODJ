
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class PurchaseOrder implements Record {
    FileAccess poFile = new FileAccess("pr.txt");
    String poID;
    PurchaseRequisition pr;
    
   
    
    public PurchaseOrder(){
        
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
    public ArrayList<String[]> view()throws IOException{
        return poFile.viewFile();
    }
    public ArrayList<String[]> view(String s)throws IOException{
        return poFile.viewFile(s);
    }
    public String toString(){
        return (poID + "|" + pr.toString());
    }
}
