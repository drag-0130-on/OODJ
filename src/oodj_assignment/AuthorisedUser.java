/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

enum Role{ADMIN,SM,PM}
public class AuthorisedUser {
    private String username;
    private String password;
    private Role role;
     
    public AuthorisedUser(){
        
    }
    public void changePassword(){
        
    }
    public void logout(){
        
    }
    public PurchaseRequisition viewPR(){
        return null;
    }
    public PurchaseOrder[] viewPO(){
        return null;
    }
}
