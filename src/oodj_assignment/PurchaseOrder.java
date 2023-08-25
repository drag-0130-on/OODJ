
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class PurchaseOrder implements Record {
    FileAccess poFile = new FileAccess("pr.txt");
    String Item_Id,Item_Name,Required_Before,Supplier_Id,Approved_By,Checked_By;
    int Quantity;
    
    public PurchaseOrder(String Item_Id,String Item_Name,String Required_Before,int Quantity,String Supplier_Id,String Approved_By,String Checked_By){
        this.Item_Id = Item_Id;
        this.Item_Name = Item_Name;
        this.Required_Before = Required_Before;
        this.Quantity = Quantity;
        this.Supplier_Id = Supplier_Id;
        this.Approved_By = Approved_By;
        this.Checked_By = Checked_By;
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
        return Item_Id+"|"+Item_Name+"|"+Required_Before+"|"+Quantity+"|"+Supplier_Id+"|"+Approved_By+"|"+Checked_By;
    }
}
