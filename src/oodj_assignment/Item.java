
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class Item implements Record {
    
    private static FileAccess itemFile = new FileAccess("Item.txt");
    private String itemID, itemName;
    private ItemCategory category;
    private int stock;
    private double buyprice, sellprice;     
    private Supplier supplier;
      
    public Item(String itemID, String itemName, String category,int stock, double price, Supplier supplier){
          this.itemID = itemID;
          this.itemName = itemName;
          this.category = ItemCategory.valueOf(category);
          this.stock = stock;
          this.buyprice = buyprice;
          this.supplier = supplier;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public double getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(double buyprice) {
        this.buyprice = buyprice;
    }

    public double getSellprice() {
        return sellprice;
    }

    public void setSellprice(double sellprice) {
        this.sellprice = sellprice;
    }

    public void add() throws IOException{
        itemFile.addToFile(toString());
    }     
    public void edit(Object newData) throws IOException{
        itemFile.editFile(toString(),newData.toString());
    }
    public void remove() throws IOException{
        itemFile.removeFromFile(toString());
    }
    public static ArrayList<String[]> view()throws IOException{
        return itemFile.viewFile();
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL,String filter)throws IOException{
        return itemFile.viewFile(AL,filter);
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL, int attIndex, String filter){
        return itemFile.viewFile(AL,attIndex,filter);
    }
    public boolean verifyUniqueness()throws IOException{
        return itemFile.verifyDataUniqueness(itemID, 0);
    }
    public boolean verifyStockAvailability(int amount){
        return stock >= amount;
    }
    public void addStock(int amount) throws IOException{
        edit(toString().replace(String.valueOf(stock),String.valueOf((stock+amount))));
    }   
    public void reduceStock(int amount) throws IOException{
        edit(toString().replace(String.valueOf(stock),String.valueOf((stock-amount))));
    }
    public String toString(){
        return (itemID + "|"+itemName + "|" + category.toString() + "|" + stock + "|" + sellprice + "|" + supplier.getID() + "|" + supplier.getName());
    }
    public String toStringForDIS(){
        return (itemID + "|"+itemName + "|" + category.toString() + "|" + sellprice + "|" + supplier.getID() + "|" + supplier.getName());
    }
    public String toStringForPR(){
        return (itemID + "|"+itemName + "|" + category.toString() + "|" + buyprice + "|" + supplier.getID() + "|" + supplier.getName());
    }
    
    

}
