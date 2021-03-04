
package lamp.purchasing.app;

import java.util.Scanner;

public class LampPurchasingApp {
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
     static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

        //  Database credentials
        static final String USER = "system";
        static final String PASS = "12345";

    
    public static void main(String[] args) {
        
        System.out.println("__  LAMP STORE   _");
        System.out.print( "Press\n"+
                         "1-Signup\n"+
                         "2-SigIn\n");
        
        //Creating Customer Table
        String customerTable = "CREATE TABLE CUSTOMER ("
                              +"NAME varchar(50),"
                              +"EMAIL varchar(25),"
                              +"CONTACT int"
                              +"PASSWORD varchar(50)"
                              +"ADDRESS varchar(100) )";
        
        //Creating Product Table
        String productTable = "CREATE TABLE PRODUCT ("
                              +"NAME varchar(50),"
                              +"PRODUCTID int"
                              +"PRICE int"
                              +"AVAILABILITY int )";
        
                
        Integer x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        
        switch(x)
        {
            case 1:
                    String name ,email,contact,password,address;
                    Scanner signup = new Scanner(System.in);
                    
                    System.out.print("Enter your name: ");
                    name = signup.nextLine();
//                    System.out.println(name);
                    
                    System.out.print("Enter your email: ");
                    email = signup.nextLine();
//                    System.out.println(email);
                    
                    System.out.print("Enter your contact: ");
                    contact = signup.nextLine();
//                    System.out.println(contact);
                    
                    System.out.print("Enter your password: ");
                    password = signup.nextLine();
//                    System.out.println(password);
                    
                    System.out.print("Enter your address: ");
                    address = signup.nextLine();
//                    System.out.println(address);
                    
                    
                    
                    
//                System.out.println(x);
                     break;
            case 2:
                   String semail,spassword;
                   Scanner signin = new Scanner(System.in);
                   
                    System.out.print("Enter your email: ");
                    email = signin.nextLine();
                    System.out.println(email);
                    
                    System.out.print("Enter your password: ");
                    password = signin.nextLine();
                    System.out.println(password);
                    
                   
//                System.out.println(x);
                //Lamp Store will open
                    break;
 
            default:
                    break;
                  
        
        }
    }
    
}
