/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chatapp_registration_login;

import java.util.Scanner;

 public class Login {

    /**
     * @param args the command line arguments
     */
    String storedusername;
    String storedpassword;
    String storedcellphonenumber;
    Scanner scan= new Scanner(System.in);
    public boolean checkUserName(String username){
    if(username!=null && username.contains("_")&& username.length()<=5){
    System.out.println("username successfully captured");
    return true;
    }else{
        System.out.println("username is not correctly formmatted;please ensure that your username contains an underscore and is no more than 5 characters in length");
        return false; 
    }
  