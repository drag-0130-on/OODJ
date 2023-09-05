package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class User {
    public enum Role {Admin,SalesManager,PurchaseManager,None}                      
    private String name, userID, password, email, contact;
    private static FileAccess userFile = new FileAccess("user.txt");
    private Role role = Role.None;
    
    public User(String name, String userID, String password, String email, String contact){
        this.name = name;
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.contact = contact;
    }
    public void add() throws IOException{
        userFile.addToFile(toString());
    }
    public void edit(String newData) throws IOException{
        userFile.editFile(toString(), newData);
    }
    public void remove() throws IOException{
        userFile.removeFromFile(toString());
    }
    public static ArrayList<String[]> view() throws IOException{
        return userFile.viewFile();
    }
    public static ArrayList<String[]> filter(String filter) throws IOException{
        return userFile.viewFileWithFilter(filter);
    }
    public static ArrayList<String[]> filter(ArrayList<String[]> AL, int attIndex, String filter){
        return userFile.viewFileWithFilter(AL, attIndex, filter);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUserID() {
        return userID;
    }
    public void setUserID(String username) {
        this.userID = userID;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    public void setRole(String role){
        this.role = Role.valueOf(role);
    }
    public void login() throws IOException{
        ArrayList<String[]> content = view();

        for (String[] line:content){
            System.out.println(Arrays.toString(line));
            if (line.length >= 3) {
                if (userID.equals(line[1])){
                    if(password.equals(line[2])){
                        role = Role.valueOf(line[3]);
                        System.out.println("Welcome "+role.toString());
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