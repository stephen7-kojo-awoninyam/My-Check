import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());
        
        int result = B.compareTo(A);
        
         if (result >= 0){
            
            System.out.println("No");
            
        }else{
            
            System.out.println("Yes");
        }
        
        String FirstCharOfA = A.substring(0,1).toUpperCase();
        
        String RestCharOfA = A.substring(1);
        
        String CharOfA = FirstCharOfA + RestCharOfA;
        
         String FirstCharOfB = B.substring(0,1).toUpperCase();
         
        String RestCharOfB = B.substring(1);
        
        String CharOfB = FirstCharOfB + RestCharOfB;
        
        System.out.println(CharOfA +" "+CharOfB);
        
      sc.close();
    }
   
}



