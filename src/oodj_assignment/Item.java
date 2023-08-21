
package oodj_assignment;

import java.io.*;
import javax.swing.JOptionPane;

public class Item implements Record {
    FileAccess f = new FileAccess("Item");
    String Category,Item_Id,Item_Name,Supplier;
    int Stock;
    double Price;
        
    public Item(){

    }
    public void add() throws IOException{
    
    }                                     

    public Item(String Category,String Item_Id,String Item_Name,String Supplier,int Stock,double Price){
        this.Category = Category;
        this.Item_Id = Item_Id;
        this.Item_Name = Item_Name;
        this.Supplier = Supplier;
        this.Stock = Stock;
        this.Price = Price;

    public void edit(String s) throws IOException{
        
    }
    public void remove() throws IOException{
        
    }
    public void viewItem(){
        
    }
    public void viewItem(String s){
        
    }

}
