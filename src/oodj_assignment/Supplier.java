/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author drag0
 */
public class Supplier implements Record {
    FileAccess f = new FileAccess("supplier");
    public Supplier(){
        
    }
    public void add(){
        
    }
    public void edit(String s){
        
    }
    public void remove(){
        
    }
    public ArrayList<String[]> viewSupplier() throws IOException{
        return f.viewFile(); 
    }
    public ArrayList<String[]> viewSupplier(String s)throws IOException{
        return f.viewFile(s);
    }
}
                                                   