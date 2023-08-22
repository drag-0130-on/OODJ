
package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;

public class DailyItemSales implements Record {
    FileAccess dailyFile = new FileAccess("daily.txt");
    String Item_name,Date;
    int Amount_sold;
    
    public DailyItemSales(String Item_name, int Amount_sold,String Date){
        this.Item_name = Item_name;
        this.Amount_sold = Amount_sold;
        this.Date = Date;
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
    public ArrayList<String[]> viewDaily()throws IOException{
        return dailyFile.viewFile();
    }
    public ArrayList<String[]> viewDaily(String s)throws IOException{
        return dailyFile.viewFile(s);
    }
    public String toString(){
        return Item_name+"|"+Date+"|"+Amount_sold;
    }
}
