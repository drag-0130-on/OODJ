
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class Item implements Record {
    enum Category {Vegetable, Dairy, Meat, Fruit, Snack, Beverage, Other }
    private FileAccess itemFile = new FileAccess("Item.txt");
    private String itemID, itemName;
    private Category category;
    private int stock;
    private double price;     
    private Supplier supplier;
      
    public Item(String itemID, String itemName, Category category,int stock, double Price, Supplier supplier){
          this.itemID = itemID;
          this.itemName = itemName;
          this.category = category;
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
    public void changeStock() {
        
    }
    public ArrayList<String[]> view()throws IOException{
        return itemFile.viewFile();
    }
    public ArrayList<String[]> filter(String filter)throws IOException{
        return itemFile.viewFileWithFilter(filter);
    }
    public ArrayList<String[]> filter(ArrayList<String[]> AL, int attIndex, String filter){
        return itemFile.viewFileWithFilter(AL,attIndex,filter);
    }
    public String toString(){
        return (itemID + "|"+itemName + "|" + category + "|" + stock + "|" + price + "|" + supplier.getID() + "|" + supplier.getName());
//        return category+"|"+tem_Id+"|"+Item_Name+"|"+Stock+"|"+Price+"|"+Supplier_Name;
    }

}
