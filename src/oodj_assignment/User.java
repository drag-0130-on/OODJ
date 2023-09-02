package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
    private String name, username, password, email, role;
    double contact;
    FileAccess userFile = new FileAccess("user.txt");
    
    public User(String name, String username, String password, String email, double contact,String role){
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.contact = contact;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getContact() {
        return contact;
    }

    public void setContact(double contact) {
        this.contact = contact;
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
                        role = line[3];
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
}        