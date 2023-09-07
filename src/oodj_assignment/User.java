package oodj_assignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class User implements Record{                      
    private String name, userID, password, email, contact;
    private static FileAccess userFile = new FileAccess("user.txt");
    private Role role = Role.Unauthorized;
    
    public User(String userID, String name, String password, String email, String contact){
        this.name = name;
        this.userID = userID;
        this.password = password;
        this.email = email;
        this.contact = contact;
    }
    public User(String userID, String password){
        this.userID = userID;
        this.password = password;
    }
    public void add() throws IOException{
        userFile.addToFile(toString());
    }
    public void edit(Object newData) throws IOException{
        userFile.editFile(toString(), newData.toString());
    }
    public void remove() throws IOException{
        userFile.removeFromFile(toString());
    }
    public static ArrayList<String[]> view() throws IOException{
        return userFile.viewFile();
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL,String filter) throws IOException{
        return userFile.viewFile(AL,filter);
    }
    public static ArrayList<String[]> view(ArrayList<String[]> AL, int attIndex, String filter){
        return userFile.viewFile(AL, attIndex, filter);
    }
    public String toString(){
        return(userID + "|" + name + "|" + password + "|" + email + "|" + contact+ "|" + role);
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
    public void setUserID(String userID) {
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
    public String[] login() throws IOException{
        ArrayList<String[]> content = view();

        for (String[] line:content){
            System.out.println(Arrays.toString(line));
            if (userID.equals(line[0])){
                if(password.equals(line[2])){
                    return line;
                }
            }
        }
        return null;
    }
    public boolean verifyUniqueness()throws IOException{
        return userFile.verifyDataUniqueness(userID, 0);
    }
}        