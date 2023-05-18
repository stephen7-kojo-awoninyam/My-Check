import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale usLocale = new Locale("en","US");
        
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        
        String us = usFormat.format(payment); 
        
         Locale IndiaLocale = new Locale("en","IN");
        
        NumberFormat IndiaFormat = NumberFormat.getCurrencyInstance(IndiaLocale);
        String india = IndiaFormat.format(payment);
        
         Locale ChinaLocale = new Locale("zh","CN");
        
        NumberFormat ChinaFormat = NumberFormat.getCurrencyInstance(ChinaLocale);
        
        String china = ChinaFormat.format(payment);
        
         Locale FranceLocale = new Locale("fr","FR");
        
        NumberFormat FranceFormat = NumberFormat.getCurrencyInstance(FranceLocale);
        
        String france = FranceFormat.format(payment);
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}