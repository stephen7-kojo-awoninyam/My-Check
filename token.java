import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
      
      
        String[] K = s.split("[,\\?\\.\\_\\'\\@\\! \0\\s]+");
        
        int x = K.length;
        if(s.equals("")){
             x = 0;
            System.out.println(x);
        }else{
            System.out.println(x);
        }
        
        
        for(String a : K){
            
              System.out.println(a);  
             
        }
        scan.close();
    }
}


