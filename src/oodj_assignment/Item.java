
package oodj_assignment;

import java.io.*;
import javax.swing.JOptionPane;

public class Item implements Record {
        String line;
        int lineCount = 0;
        String Category,Item_id,Item_name,Supplier;
        int Stock;
        double Price;
        
    public Item(){
        try {
            FileReader fr = new FileReader("Item.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("Item.txt",true);
            PrintWriter pw = new PrintWriter(fw);          
            while((line = br.readLine()) != null){
                lineCount++;
            }           
            String id = "P"+lineCount;
            pw.println(Category+"|"+ Item_id+"|"+Item_name+"|"+Stock+"|"+Price+"|"+Supplier);
            pw.close();    
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void add(){
        try {
            FileReader fr = new FileReader("Item.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("Item.txt",true);
            PrintWriter pw = new PrintWriter(fw);          
            while((line = br.readLine()) != null){
                lineCount++;
            }           
            String id = "P"+lineCount;
            pw.println(Category+"|"+ Item_id+"|"+Item_name+"|"+Stock+"|"+Price+"|"+Supplier);
            pw.close();    
        }catch (IOException e) {
            e.printStackTrace();
        }
    
    }                                     


    public void edit(String s){
        
    }
    public void remove(){
        
    }
    public void viewItem(){
        
    }
    public void viewItem(String s){
        
    }
}
