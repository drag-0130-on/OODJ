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
    private String supplierID, supplierName, email, contactNo;
    private static FileAccess supplierFile = new FileAccess("supplier.txt");
    
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
    public static ArrayList<String[]> view() throws IOException{
        return supplierFile.viewFile(); 
    }
    public static ArrayList<String[]> view(String filter) throws IOException{
        return supplierFile.viewFile(filter);
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL, int attIndex, String filter){
        return supplierFile.viewFile(AL,attIndex,filter);
    }
    public boolean verifyUniqueness()throws IOException{
        return supplierFile.verifyDataUniqueness(supplierID, 0);
    }
    public String toString(){
        return (supplierID + "|" + supplierName + "|" + email + "|" + contactNo);
    }
}
                                                   