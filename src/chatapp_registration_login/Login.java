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
    
  }
   public boolean checkPasswordComplexity(String password){
    boolean lengthCheck = storedpassword.length()>=8;
    boolean hasUppercase = storedpassword.matches(".*[A-Z]*.");
    boolean hasNumber = storedpassword.matches(".*[0-9].*");
    boolean hasSpecial = storedpassword.matches(".*[^a-zA-Z0-9].*");
    if(lengthCheck && hasUppercase && hasNumber && hasSpecial){
        System.out.println("password succesfully captured");
        return true;
    }else{
        System.out.println("password is not correctly formmated;please ensure that the password contains at least * characters,a capital letter, a number,amd a special character.");
        return false;
    }
  }
    public boolean checkCellPhoneNumber(String cell){
        String regex ="^\\+27[0-9]{9}$";
    if (storedcellphonenumber.matches(regex)){
        System.out.println("cell phone number successfully added");
        return true;
    }else{
        System.out.println("cell phone number incorrectly formatted or does not contain international code");
        return false;
    }    
  }
    public String registerUser(String username, String password, String cellphonenumber, String firstName, String lastName){
       Scanner scan= new Scanner(System.in);
    
     if(checkUserName(username) && checkPasswordComplexity(password) && checkCellPhoneNumber(cellphonenumber)){
         System.out.println("Registered successfully");
     }else{
         System.out.println("Username is incorrectly formatted or your password does not meet the complexity requirements");
         
     }
        return null;
    }
    public String loginUser(String username, String password){
        String firstName=null;
        String lastName=null;
      System.out.println("\n======LOGIN======");
      System.out.println("Enter Username");
      username=scan.nextLine();
      System.out.println("Enter password");
      password=scan.nextLine();
      if(checkUserName(username) && checkPasswordComplexity(password)){
          System.out.println("Welcome" + firstName + " " + lastName + ". It is great to see you again.");
      }else{
          System.out.println("Username or password incorrect. Please try agin.");
      }
        return null;
       
    }
    
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        Login login = new Login();
        int choice;
        
        do{
        System.out.println("\n======MENU======");
        System.out.println("1.Register");
        System.out.println("2.Login");
        System.out.println("Enter Menu option");
        choice =scan.nextInt();
        
        switch (choice){
            case 1:
                login.registerUser("Ka_1", "Pass@123", "+27831234567", "Karl", "Smith");
                break;
            case 2:
                login.loginUser("Ka_1", "Pass@123");
                break;
            default:   
                System.out.println("Invalid choice");
        }
        }while(choice!=2);
        scan.close();
    }
    }
    

