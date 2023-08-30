
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
            content.add(line.split("|"));
        }
        br.close();
        return content;
    }
    public ArrayList<String[]> viewFile(String s) throws IOException{
        try{
            br = new BufferedReader(new FileReader(new File(fileName)));
        }
        catch(Exception e){
            e.printStackTrace();
        }
        String line;
        ArrayList<String[]> content = new ArrayList<String[]>();
        while ((line = br.readLine())!= null){
            if (line.contains(s)){
                content.add(line.split("|"));
            }
        }
        br.close();
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
        content.add(data.split("|"));
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
    public boolean verifyUniqueness(String data) throws IOException{
        ArrayList<String[]> content = viewFile();
        for (String[] line:content){
            if (String.join("|",line).contains(data)){
                return false;
            }
        }
        return true;
    }
}
