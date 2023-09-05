
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
    public static ArrayList<String[]> filter(String filter) throws IOException{
        return dailyFile.viewFileWithFilter(filter);
    }
    public static ArrayList<String[]> filter(ArrayList<String[]> AL, int attIndex, String filter){
        return dailyFile.viewFileWithFilter(AL,attIndex,filter);
    }
    public String toString(){
        return (date + "|" + amountSold + "|" + item.toString());
    }
}
                                                                    