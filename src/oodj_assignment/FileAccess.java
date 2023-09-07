
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
        ArrayList<String[]> content = new ArrayList<String[]>();
        String line;
        try{
            br = new BufferedReader(new FileReader(new File(fileName)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
       
        while ((line = br.readLine())!= null){
            content.add(line.split("\\|"));
        }
        br.close();
        return content;
    }
    public ArrayList<String[]> viewFile(ArrayList<String[]> AL, String filter) throws IOException{
        ArrayList<String[]> content = new ArrayList<String[]>();
        for (String[] line: AL){
            if (String.join("|", line).contains(filter)){
                content.add(line);
            } 
        }
        return content;
    }
    public ArrayList<String[]> viewFile(ArrayList<String[]> AL, int attIndex, String filter){
        ArrayList<String[]> content = new ArrayList<String[]>();
        for (String[] line: AL){
            if (line[attIndex] == filter){
                content.add(line);
            } 
        }
        return content;
    }
    public boolean addToFile(String data) throws IOException{
        ArrayList<String[]> content = viewFile();
        try{
            bw = new BufferedWriter(new FileWriter(new File(fileName)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        content.add(data.split("\\|"));  
        for (String[] line:content){
            bw.write(String.join("|",line));
            bw.newLine();
        }
        bw.close();
        return true;
    }
    public boolean editFile(String oldData, String newData) throws IOException{
        ArrayList<String[]> content = viewFile();
        try{
            bw = new BufferedWriter(new FileWriter(new File(fileName)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        for (String[] line:content){
            if (oldData.matches(String.join("|", line))){
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
        ArrayList<String[]> content = viewFile();
        try{
            bw = new BufferedWriter(new FileWriter(new File(fileName)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        for (String[] line:content){
            if (!(data.matches(String.join("\\|",line)))){
                bw.write(String.join("|",line));
                bw.newLine();
            }
                
        }
        bw.close();
        return true;
    }
    public boolean verifyDataUniqueness(String data, int i) throws IOException{
        ArrayList<String[]> content = viewFile();
        for (String[] line:content){
            if (line[i].equals(data)){
                return false;
            }
        }
        return true;
    }
}
