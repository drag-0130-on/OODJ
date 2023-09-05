
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class Item implements Record {
    public enum Category {Vegetable, Dairy, Meat, Fruit, Snack, Beverage, Other }
    private static FileAccess itemFile = new FileAccess("Item.txt");
    private String itemID, itemName;
    private Category category;
    private int stock;
    private double price;     
    private Supplier supplier;
      
    public Item(String itemID, String itemName, String category,int stock, double price, Supplier supplier){
          this.itemID = itemID;
          this.itemName = itemName;
          this.category = Category.valueOf(category);
          this.stock = stock;
          this.price = price;
          this.supplier = supplier;
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
    public static ArrayList<String[]> filter(String filter)throws IOException{
        return itemFile.viewFileWithFilter(filter);
    }
    public static ArrayList<String[]> filter(ArrayList<String[]> AL, int attIndex, String filter){
        return itemFile.viewFileWithFilter(AL,attIndex,filter);
    }
    public String toString(){
        return (itemID + "|"+itemName + "|" + category.toString() + "|" + stock + "|" + price + "|" + supplier.getID() + "|" + supplier.getName());
//        return category+"|"+tem_Id+"|"+Item_Name+"|"+Stock+"|"+Price+"|"+Supplier_Name;
    }

}
