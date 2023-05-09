import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String k = a.toLowerCase();
        
        String s = b.toLowerCase();
        
        char[] K = k.toCharArray();
        
        char[] S = s.toCharArray();
        
        int sumK = 0;
        
        int sumS = 0;
        
            for(char c : K){
                
                sumK += (int)c;
            }
            for(char c : S){
                
                sumS += (int)c;
            }
       
        return sumK == sumS;          
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}