
package oodj_assignment;
import java.util.ArrayList;
import java.io.*;


public class FileAccess {
    private String fileName;
    private File f;
    private BufferedReader br;
    
    public FileAccess(String fileName){
        this.fileName = fileName;
        f = new File(fileName);
        try{
            br = new BufferedReader(new FileReader(f));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<String[]> viewFile() throws IOException{
        String line;
        ArrayList<String[]> as = new ArrayList<String[]>();
        while ((line = br.readLine())!= null){
            as.add(line.split("|"));
        }
        return as;
    }
    public ArrayList<String[]> viewFile(String s) throws IOException{
        String line;
        ArrayList<String[]> as = new ArrayList<String[]>();
        while ((line = br.readLine())!= null){
            if (line.contains(s)){
                as.add(line.split("|"));
            }
        }
        return as;
    }
    public boolean addToFile(){
        return false;
    }
    public boolean editFile(){
        return false;
    }
    public boolean removeFromFile(){
        return false;
    }
    public boolean verifyUniqueness(String data){
        return true;
    }
}
