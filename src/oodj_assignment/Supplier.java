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
    public void edit(Object newData) throws IOException{
        supplierFile.editFile(toString(),newData.toString());
    }
    public void remove() throws IOException{
        supplierFile.removeFromFile(toString());
    }
    public static ArrayList<String[]> view() throws IOException{
        return supplierFile.viewFile(); 
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL,String filter) throws IOException{
        return supplierFile.viewFile(AL,filter);
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL, int attIndex, String filter){
        return supplierFile.viewFile(AL,attIndex,filter);
    }
    public static String generateID() throws IOException{
        ArrayList<String[]> AL = view();
        if (AL.size()==0){
            return "S0001";
        } else{
            int idNo = Integer.parseInt(AL.get((AL.size()-1))[0]) + 1;
            int idLength = String.valueOf(idNo).length();
            String id = "S";
            for (int i = 0;i < (4-idLength);i++){
                id += "0";
            }
            id += idNo;
            return id;
        }
    }
    public boolean verifyUniqueness()throws IOException{
       String[] d1 = {email};
       int[] i1 = {3};
       String[] d2 = {contactNo};
       int[] i2 = {4};
       String[] d3 = {supplierName};
       int[] i3 = {1};
       if (supplierFile.verifyDataUniqueness(d1,i1)){
           if(supplierFile.verifyDataUniqueness(d2, i2)){
               return supplierFile.verifyDataUniqueness(d3, i3);
           }
           return false;
       }
       return false;
    }
    public String toString(){
        return (supplierID + "|" + supplierName + "|" + email + "|" + contactNo);
    }
}
                                                   