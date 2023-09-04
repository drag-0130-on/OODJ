/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

/**
 *
 * @author Lenovo
 */
public class Admin extends User {
    Role role = Role.Admin;
    public Admin(String name, String userID, String password, String email, String contact) {
        super(name,userID,password,email,contact);
    }
}
