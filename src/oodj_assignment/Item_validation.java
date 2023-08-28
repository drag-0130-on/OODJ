
package oodj_assignment;


public class Item_validation {

    public static void main(String[] args) {
        String category = "Food";
        String item_Id = "E12345";
        String item_Name = "Smartphone";
        String supplier_Name = "Tech Supplier";
        int stock = 50;
        double price = 599.99;

        if (isValidCategory(category) &&
            isValidItemId(item_Id) &&
            isValidItemName(item_Name) &&
            isValidSupplierName(supplier_Name) &&
            isValidStock(stock) &&
            isValidPrice(price)) {
            System.out.println("All data is valid.");
        } else {
            System.out.println("Invalid data found.");
        }
    }

    public static boolean isValidCategory(String category) {
        return category != null && !category.isEmpty();
    }

    public static boolean isValidItemId(String item_Id) {
        return item_Id != null && item_Id.matches("[A-Z]\\d{5}");
    }

    public static boolean isValidItemName(String item_Name) {
        return item_Name != null && !item_Name.isEmpty();
    }

    public static boolean isValidSupplierName(String supplier_Name) {
        return supplier_Name != null && !supplier_Name.isEmpty();
    }

    public static boolean isValidStock(int stock) {
        return stock >= 0;
    }

    public static boolean isValidPrice(double price) {
        return price >= 0.00;
    }

}
