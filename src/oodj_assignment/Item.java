
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class Item implements Record {
    
    private static FileAccess itemFile = new FileAccess("item.txt");
    String itemID;
    private String itemName,supplierID,supplierName;
    private ItemCategory category;
    private int stock;
    private double buyprice, sellprice;     
      
    public Item(String itemID, String itemName, String category,int stock, String supplierID,String supplierName, double sellprice, double buyprice){
          this.itemID = itemID;
          this.itemName = itemName;
          this.category = ItemCategory.valueOf(category);
          this.stock = stock;
          this.supplierID = supplierID;
          this.supplierName = supplierName;
          this.buyprice = buyprice;
          this.sellprice = sellprice;
    }
    public Item(String itemID, String itemName, String category, String supplierID,String supplierName, double sellprice, double buyprice){
          this.itemID = itemID;
          this.itemName = itemName;
          this.category = ItemCategory.valueOf(category);
          this.stock = 0;
          this.supplierID = supplierID;
          this.supplierName = supplierName;
          this.buyprice = buyprice;
          this.sellprice = sellprice;
    }
  

    public String getItemID() {
        return itemID;
    }
    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ItemCategory getCategory() {
        return category;
    }

    public void setCategory(ItemCategory category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
        String[] data = {itemID,itemName,supplierID};
        int[] i = {0,1,4};
        return itemFile.verifyDataUniqueness(data,i);
    }
    
    public static String generateID() throws IOException{
        ArrayList<String[]> AL = view();
        if (AL.size()==0){
            return "I0001";
        } else{
            int idNo = Integer.parseInt((AL.get((AL.size()-1))[0]).substring(1)) + 1;
            int idLength = String.valueOf(idNo).length();
            String id = "I";
            for (int i = 0;i < (4-idLength);i++){
                id += "0";
            }
            id += idNo;
            return id;
        }
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
        return (itemID + "|"+itemName + "|" + category.toString() + "|" + stock + "|" + supplierID + "|" + supplierName+ "|" + sellprice + "|" + buyprice);
    }
    public String toStringForDIS(){
        return (itemID + "|"+itemName + "|" + category.toString() + "|" + supplierID + "|" + supplierName+ "|" + sellprice);
    }
    public String toStringForPR(){
        return (itemID + "|"+itemName + "|" + category.toString() + "|"  + supplierID + "|" + supplierName+ "|" + buyprice);
    }
    
    

}
