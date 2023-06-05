import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        try{
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        
        int M = scan.nextInt();
        
        scan.nextLine();
        
        BitSet B1 = new BitSet(N);

        BitSet B2 = new BitSet(N);

        
       for(int i = 0; i < M;i++){
           
           String opera = scan.next();
           
           int x = scan.nextInt();
           
           int y = scan.nextInt();
           switch(opera){
            
            case "AND": if(x==1){
                B1.and(B2);
            }else{
                B2.and(B1);
            }
            break;   
             case "OR": if(x==1){
                 B1.or(B2);
             } else{
                 B2.or(B1);
             }
             break;
             case "FLIP":if(x==1){
                 B1.flip(y);
             }else{
                 B2.flip(y);
             }
             break;
             case "SET":if(x==1){
                 B1.set(y);
             }else{
                 B2.set(y);
             }
               break;
               case "XOR":if(x==1){
                   B1.xor(B2);
               }else{
                   B2.xor(B1);
               }
               break;
           }
                System.out.println(B1.cardinality() +" "+ B2.cardinality());
               
       }
  
      scan.close(); 
        }catch(InputMismatchException e){
            System.out.println("Invalid input: Please enter an integer");
        } 
    }
}
