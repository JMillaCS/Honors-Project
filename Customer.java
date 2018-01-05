import java.util.Scanner;
import java.util.ArrayList;
public class Customer<E>{
   private String name; 
   private String email;
   private String phone;
   private String password;
   private String address;
   private String billingAddress;
   private String shippingAddress;
   private ArrayList<IPaymentMethod> paymentMethods;
   
   public Scanner scan = new Scanner(System.in);
   public Customer(String name, String email, String password){
       this.name = name;
       this.email = email;
       this.password = password;
   }
   
   public String getName(){
       return name;
   }
   
   public String getEmail(){
       return email;
   }
    
   public String getPhone(){
       return phone;
   }
    
   public String getPassword(){
       return password;
   }
   
   public void setPassword(String newPass){
       if(passwordValid(newPass)){
         password = newPass;    
       }
   }
    
   public void changePassword(String newPass){
        if(passwordValid(newPass)){
          password = newPass;
        }
        else{
         System.out.println("Password Invalid.");
         System.out.print("New Password: ");
         newPass = scan.next();
        }
   }
   
   public boolean validChange(String valid){
       if(valid == password){
         return true; 
       }   
       else{return false;}
   }
   
   private boolean passwordValid(String pass){
     boolean global = false;
     boolean containsLength = false;
     boolean containsUpper = false;
     boolean containsLower = false;
     boolean containsNumber = false;
     while(5 > pass.length() || pass.length() > 8){
         System.out.println("Password is not the correct length.");
         System.out.print("New Password: ");
         pass = scan.next();
     }
     containsLength = true;
     while(containsLower == false){
      for(int i = 0; i < pass.length(); i++){
          char ch = pass.charAt(i);
          if(containsLower == Character.isLowerCase(ch) == true){
              containsLower = true;
          }
          else{
             System.out.println("Password contains no lower case letters.");
             System.out.print("New Password: ");
             pass = scan.next();
          }
      }
     } 
     
     while(containsUpper == false){
      for(int i = 0; i < pass.length(); i++){
          char ch = pass.charAt(i);
          if(Character.isUpperCase(ch)){
              containsUpper = true;
          }
          else{
             System.out.println("Password contains no upper case letters.");
             System.out.print("New Password: ");
             pass = scan.next();
          }
      }
     }
     
     while(containsNumber == false){
      for(int i = 0; i < pass.length(); i++){
          char ch = pass.charAt(i);
          if(Character.isDigit(ch)){
              containsNumber = true;
          }
          else{
             System.out.println("Password contains no numbers.");
             System.out.print("New Password: ");
             pass = scan.next();
          }
      }
     }
     
     if (containsLower && containsUpper && containsNumber){
         global = true;
     }
    
     return global;
   }
   
   
}
