
package oodj_assignment;

import java.io.*;
import javax.swing.JOptionPane;

public class Item implements Record {
    FileAccess f = new FileAccess("Item");
    String Category,Item_Id,Item_Name,Supplier;
    int Stock;
    double Price;
        
    public Item(String Category,String Item_Id,String Item_Name,String Supplier,int Stock,double Price){
        this.Category = Category;
        this.Item_Id = Item_Id;
        this.Item_Name = Item_Name;
        this.Supplier = Supplier;
        this.Stock = Stock;
        this.Price = Price;

    public void edit(String s){
 
    }
        
    
    public void remove(){
        
    }
    public void viewItem(){
        
    }
    public void viewItem(String s){
        
    }

    @Override
    public void add() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
