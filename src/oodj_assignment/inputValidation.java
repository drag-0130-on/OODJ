
package oodj_assignment;

import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDate;


public class inputValidation {

    public static void main(String[] args) {
        
    }
    public static boolean isValidDate(String day,String month,String year){
        int dayInt = Integer.parseInt(day);
        int monthInt = Integer.parseInt(month);
        int yearInt = Integer.parseInt(year);
        try {
            LocalDate date = LocalDate.of(yearInt, monthInt, dayInt);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }

    public static boolean isValidName(String name) {
        return (name!=null) && (!name.isEmpty()) && (name.length()<=30);
    }

    public static boolean isValidItemName(String item_Name) {
        return item_Name != null && !item_Name.isEmpty();
    }

    public static boolean isValidQuantity(int quantity) {
        return quantity >= 0;
    }

    public static boolean isValidPrice(double price) {
        return price >= 0.00;
    }
    
    public static boolean isValidEmail(String email) {
        return (email!=null) && (!email.isEmpty()) && (email.contains("@")) && (email.indexOf("@") !=0);
    }
    
    public static boolean isValidContact(String contact) {
        return (contact!=null) && (!contact.isEmpty()) && (contact.length()<=11) && (contact.length()>=10);
    }
}
