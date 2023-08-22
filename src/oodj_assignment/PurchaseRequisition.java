
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class PurchaseRequisition implements Record {
    FileAccess prFile = new FileAccess("pr.txt");
    String Item_Id,Item_Name,Required_Before,Supplier_Id,Approved_By;
    int Quantity;
    
    public PurchaseRequisition(String Item_Id,String Item_Name,String Required_Before,int Quantity,String Supplier_Id,String Approved_By){
        this.Item_Id = Item_Id;
        this.Item_Name = Item_Name;
        this.Required_Before = Required_Before;
        this.Quantity = Quantity;
        this.Supplier_Id = Supplier_Id;
        this.Approved_By = Approved_By;
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
    public ArrayList<String[]> viewPR()throws IOException{
        return prFile.viewFile();
    }
    public ArrayList<String[]> viewPR(String s)throws IOException{
        return prFile.viewFile(s);
    }
    public String toString(){
        return Item_Id+"|"+Item_Name+"|"+Required_Before+"|"+Quantity+"|"+Supplier_Id+"|"+Approved_By;
    }
}
