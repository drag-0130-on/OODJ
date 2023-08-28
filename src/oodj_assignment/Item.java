
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class Item implements Record {
    
    String Category,Item_Id,Item_Name,Supplier_Name;
    int Stock;
    double Price;
    FileAccess itemFile = new FileAccess("Item.txt");
        
    public Item(String Category,String Item_Id,String Item_Name,String Supplier_Name,int Stock,double Price){
        this.Category = Category;
        this.Item_Id = Item_Id;
        this.Item_Name = Item_Name;
        this.Supplier_Name = Supplier_Name;
        this.Stock = Stock;
        this.Price = Price;
    }
    public void add() throws IOException{
        itemFile.addToFile(toString());
    }     
    public void edit(String newData) throws IOException{
        itemFile.editFile(toString(),newData);
    }
    public void remove() throws IOException{
        itemFile.removeFromFile(toString());
    }
    public ArrayList<String[]> view()throws IOException{
        return itemFile.viewFile();
    }
    public ArrayList<String[]> view(String s)throws IOException{
        return itemFile.viewFile(s);
    }
    public String toString(){
        return Category+"|"+Item_Id+"|"+Item_Name+"|"+Stock+"|"+Price+"|"+Supplier_Name;
    }

}
