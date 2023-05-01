import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0; j<n; j++){
            
            int k = (int)(a + Math.pow(2,j)*b);
            
             if(j == 0){
                 
                 System.out.print(k + " ");
                 
             }else{
                 
                 k = (int)(k + Math.pow(2,j)*b);
                 
                 System.out.print(k-b + " ");
             }   
                
                
            }
            System.out.println(" ");
        }  
        
        in.close();     
    }
}
