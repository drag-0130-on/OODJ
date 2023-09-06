
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class Item implements Record {
    
    private static FileAccess itemFile = new FileAccess("Item.txt");
    private String itemID, itemName;
    private ItemCategory category;
    private int stock;
    private double price;     
    private Supplier supplier;
      
    public Item(String itemID, String itemName, String category,int stock, double price, Supplier supplier){
          this.itemID = itemID;
          this.itemName = itemName;
          this.category = ItemCategory.valueOf(category);
          this.stock = stock;
          this.price = price;
          this.supplier = supplier;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
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
    
    public static ArrayList<String[]> view()throws IOException{
        return itemFile.viewFile();
    }
    public static ArrayList<String[]> view(String filter)throws IOException{
        return itemFile.viewFile(filter);
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL, int attIndex, String filter){
        return itemFile.viewFile(AL,attIndex,filter);
    }
    public boolean verifyUniqueness()throws IOException{
        return itemFile.verifyDataUniqueness(itemID, 0);
    }
    public String toString(){
        return (itemID + "|"+itemName + "|" + category.toString() + "|" + stock + "|" + price + "|" + supplier.getID() + "|" + supplier.getName());
//        return category+"|"+tem_Id+"|"+Item_Name+"|"+Stock+"|"+Price+"|"+Supplier_Name;
    }
    public String toStringForDIS(){
        return (itemID + "|"+itemName + "|" + category.toString() + "|" + price + "|" + supplier.getID() + "|" + supplier.getName());
    }
    

}
