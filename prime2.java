import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int prime;
        
        String s = "";
        
        for(int i = 1; i<=5; i++){
            
            prime = scan.nextInt(); 
            
            if(Prime.checkprime(prime) | prime == 5 | prime== 7){
                 
            s += prime + " "; 
            
            }
            if(i==4){
                continue;
            }
            System.out.println(s);
        }
        
        
        scan.close();
    
     
    }
}

 class Prime{
    
    static boolean checkprime(int n){
        
        if(n <= 1){
            
            return false;
            
        }
        
        for(int i = 2; i <= Math.sqrt(n); i++){
            
            if(i % 2 == 0){
                
                return false;
            }
             
        }
        
        return true;
        
    }
    
}
