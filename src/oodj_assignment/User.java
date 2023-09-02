package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String username, password;
    FileAccess userFile = new FileAccess("user.txt");
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public ArrayList<String[]> view() throws IOException{
        return userFile.viewFile();
    }
    
    public void login() throws IOException{
        ArrayList<String[]> content = view();

        for (String[] line:content){
            System.out.println(Arrays.toString(line));
            if (line.length >= 3) {
                if (username.equals(line[1])){
                    if(password.equals(line[2])){
                        String role = line[3];
                        System.out.println("Welcome "+role);
                    }
                    else{
                        System.out.println("Wrong username or password");
                    }
                }
                else{
                    System.out.println("Wrong username or password");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        try {
            User userManager = new User("b","c"); // Create an instance of UserManager
            userManager.login(); // Call the login method
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}        