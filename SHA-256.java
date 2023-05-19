import java.io.*;
import java.util.*;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);   
        
        String input = scan.next();
        
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        
        byte[] digest = md.digest(input.getBytes()); 
        
      StringBuilder string = new StringBuilder();
      
      for(byte b : digest){
          
          string.append(String.format("%02x",b));
      } 
       
        System.out.println(string.toString());
        
        scan.close();     
        
    }
}