import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        BigInteger b = new BigInteger(n);
        
        boolean prime = b.isProbablePrime(1);
        
        if(prime){
            
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        BigInteger b = new BigInteger(n);
        
        boolean prime = b.isProbablePrime(1);
        
        if(prime){
            
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
