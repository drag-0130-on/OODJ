
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
    }
    public ArrayList<String[]> viewFile() throws IOException{
        try{
            br = new BufferedReader(new FileReader(new File(fileName)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        String line;
        ArrayList<String[]> content = new ArrayList<String[]>();
        while ((line = br.readLine())!= null){
            content.add(line.split("\\|"));
        }
        br.close();
        return content;
    }
    public ArrayList<String[]> viewFileWithFilter(String filter) throws IOException{
        ArrayList<String[]> ogcontent = viewFile();
        ArrayList<String[]> content = new ArrayList<String[]>();
        for (String[] line: ogcontent){
            if (String.join("|", line).contains(filter)){
                content.add(line);
            } 
        }
        return content;
    }
    public ArrayList<String[]> viewFileWithFilter(ArrayList<String[]> AL, int attIndex, String filter){
        ArrayList<String[]> content = new ArrayList<String[]>();
        for (String[] line: AL){
            if (line[attIndex] == filter){
                content.add(line);
            } 
        }
        return content;
    }
    public boolean addToFile(String data) throws IOException{
        try{
            bw = new BufferedWriter(new FileWriter(new File(fileName)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        ArrayList<String[]> content = viewFile();
        content.add(data.split("\\|"));
        for (String[] line:content){
            bw.write(String.join("|",line));
            bw.newLine();
        }
        bw.close();
        return true;
    }
    public boolean editFile(String oldData, String newData) throws IOException{
        try{
            bw = new BufferedWriter(new FileWriter(new File(fileName)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        ArrayList<String[]> content = viewFile();
        for (String[] line:content){
            if (oldData.equals(String.join("|", line))){
                bw.write(newData);
                bw.newLine();      
            } else {
                bw.write(String.join("|", line));
                bw.newLine();
            }
        }
        bw.close();
        return true;
    }
    public boolean removeFromFile(String data) throws IOException{
        try{
            bw = new BufferedWriter(new FileWriter(new File(fileName)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        ArrayList<String[]> content = viewFile();
        for (String[] line:content){
            if (!(data.equals(String.join("|",line)))){
                bw.write(String.join("|",line));
                bw.newLine();
            } 
           
        }
        bw.close();
        return true;
    }
    public boolean verifyUniqueness(String data, int i) throws IOException{
        ArrayList<String[]> content = viewFile();
        for (String[] line:content){
            if (line[i].equals(data)){
                return false;
            }
        }
        return true;
    }
}
