import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        String input = scan.nextLine();
        
        MessageDigest md = MessageDigest.getInstance("MD5");           
        
        StringBuilder hexString = new StringBuilder();
        
        byte[] digest = md.digest(input.getBytes());
        
        
        for(byte b : digest){
            
           hexString.append(String.format("%02x",b)); 
            
            
        }
        
        System.out.println(hexString.toString());
    }
}
