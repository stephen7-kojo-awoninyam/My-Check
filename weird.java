import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");

        int N = scanner.nextInt();

        if( N % 2 == 1){

            System.out.println("Wierd");

        }else if( N % 2 == 0 && (N >= 2 && N <=5 ) ){

            System.out.println("Not Wierd");

        }else if(N % 2 == 0 && (N >= 6 && N <=20 )){

            System.out.println("Wierd");

        }else if(N % 2 == 0 && N > 20){

            System.out.println("Not Wierd");

        }




    }
}
