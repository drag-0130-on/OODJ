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
    String supplierID, supplierName, email, contactNo;
    FileAccess supplierFile = new FileAccess("supplier.txt");
    
    public Supplier(String supplierID, String supplierName, String email, String contactNo){
        this.supplierID = supplierID;
        this.supplierName = supplierName;
        this.email = email;
        this.contactNo = contactNo;
    }
    public String getID(){
        return supplierID;
    }
    public String getName(){
        return supplierName;
    }
    public void add() throws IOException{
        supplierFile.addToFile(toString());
    }
    public void edit(String newData) throws IOException{
        supplierFile.editFile(toString(),newData);
    }
    public void remove() throws IOException{
        supplierFile.removeFromFile(toString());
    }
    public ArrayList<String[]> view() throws IOException{
        return supplierFile.viewFile(); 
    }
    public ArrayList<String[]> view(String filter)throws IOException{
        return supplierFile.viewFile(filter);
    }
    public String toString(){
        return (supplierID + "|" + supplierName + "|" + email + "|" + contactNo);
    }
}
                                                   