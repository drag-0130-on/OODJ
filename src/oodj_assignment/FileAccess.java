
package oodj_assignment;
import java.util.ArrayList;
import java.io.*;
import java.util.Arrays;


public class FileAccess {
    private String fileName;
    private BufferedReader br;
    private BufferedWriter bw;
    
    public FileAccess(String fileName){
        this.fileName = fileName;
        try{
            br = new BufferedReader(new FileReader(new File(fileName)));
            bw = new BufferedWriter(new FileWriter(new File(fileName)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<String[]> viewFile() throws IOException{
        String line;
        ArrayList<String[]> content = new ArrayList<String[]>();
        while ((line = br.readLine())!= null){
            content.add(line.split("|"));
        }
        return content;
    }
    public ArrayList<String[]> viewFile(String s) throws IOException{
        String line;
        ArrayList<String[]> content = new ArrayList<String[]>();
        while ((line = br.readLine())!= null){
            if (line.contains(s)){
                content.add(line.split("|"));
            }
        }
        return content;
    }
    public boolean addToFile(String[] data) throws IOException{
        ArrayList<String[]> content = viewFile();
        for (String[] line:content){
            bw.write(String.join("|",line));
            bw.newLine();
        }
        bw.write(String.join("|", data));
        return true;
    }
    public boolean editFile(String[] data, String[] newData) throws IOException{
        ArrayList<String[]> content = viewFile();
        for (String[] line:content){
            if (Arrays.equals(data,line)){
                bw.write(String.join("|",newData));
                bw.newLine();      
            } else {
                bw.write(String.join("|", line));
                bw.newLine();
            }
        }
        return true;
    }
    public boolean removeFromFile(String[] data) throws IOException{
        ArrayList<String[]> content = viewFile();
        for (String[] line:content){
            if (Arrays.equals(data,line)==false){
                bw.write(String.join("|",line));
                bw.newLine();      
            }
           
        }
        return true;
    }
    public boolean verifyUniqueness(String[] data) throws IOException{
        ArrayList<String[]> content = viewFile();
        for (String[] line:content){
            if (Arrays.equals(data,line)){
                return false;
            }
        }
        return true;
    }
}
