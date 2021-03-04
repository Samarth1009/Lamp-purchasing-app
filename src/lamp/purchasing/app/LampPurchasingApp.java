
package lamp.purchasing.app;

import java.util.Scanner;

public class LampPurchasingApp {

    
    public static void main(String[] args) {
        
        System.out.print("Press\n"+
                         "1-Signup\n"+
                         "2-SigIn\n"+
                         "3-Lamp Store\n");
        
        Integer x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        
        switch(x)
        {
            case 1:
                    //signup
//                System.out.println(x);
                     break;
            case 2:
                   //sigin
//                System.out.println(x);
                    break;
            case 3:
                   //Lamp Store
//                System.out.println(x);
                    break;
            default:
                    break;
                  
        
        }
    }
    
}
