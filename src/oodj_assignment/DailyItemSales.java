
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class DailyItemSales implements Record {
    private static FileAccess dailyFile = new FileAccess("daily.txt");
    private String date;
    private int amountSold;
    private Item item;
    
    public DailyItemSales(String date, int amountSold, Item item){
        this.date = date;
        this.amountSold = amountSold;
        this.item = item;
    }   
    public void add() throws IOException{
        dailyFile.addToFile(toString());
    }
    public void edit(String s) throws IOException{
        dailyFile.editFile(toString(),s);
    }
    public void remove() throws IOException{
        dailyFile.removeFromFile(toString());
    }
    public static ArrayList<String[]> view()throws IOException{
        return dailyFile.viewFile();
    }
    public static ArrayList<String[]> view(String filter) throws IOException{
        return dailyFile.viewFile(filter);
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL, int attIndex, String filter){
        return dailyFile.viewFile(AL,attIndex,filter);
    }
    public boolean verifyUniqueness()throws IOException{
        return dailyFile.verifyDataUniqueness(item.getItemID(), 0);
    }
    public String toString(){
        return (date + "|" + amountSold + "|" + item.toStringForDIS());
    }
    public Item getItem(){
        return item;
    }
}
                                                                    