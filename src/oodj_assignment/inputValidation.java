
package oodj_assignment;


public class inputValidation {

    public static void main(String[] args) {
        

    }
    
    public static boolean isValidName(String name) {
        return (name!=null) && (!name.isEmpty()) && (name.length()<=30);
    }
    
/*    public static boolean isValidCategory(String category) {
        return category != null && !category.isEmpty();
    }*/

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
