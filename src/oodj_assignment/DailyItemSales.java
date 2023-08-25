
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class DailyItemSales implements Record {
    FileAccess dailyFile = new FileAccess("daily.txt");
    String Item_Id,Item_Name,Date,Supplier_Id;
    int Amount_Sold;
    
    public DailyItemSales(String Item_Id,String Item_Name, int Amount_Sold,String Date,String Supplier_Id){
        this.Item_Id = Item_Id;
        this.Item_Name = Item_Name;
        this.Amount_Sold = Amount_Sold;
        this.Date = Date;
        this.Supplier_Id = Supplier_Id;
    }   
    public void add() throws IOException{
        dailyFile.addToFile(toString());
    }
    public void edit(String s) throws IOException{
        dailyFile.editFile(toString(),s);
    }
    public void remove() throws IOException{
        dailyFile.removeFromFile(toString());
    }
    public ArrayList<String[]> view()throws IOException{
        return dailyFile.viewFile();
    }
    public ArrayList<String[]> view(String s)throws IOException{
        return dailyFile.viewFile(s);
    }
    public String toString(){
        return Item_Id+"|"+Item_Name+"|"+Date+"|"+Amount_Sold+"|"+Supplier_Id;
    }
}
