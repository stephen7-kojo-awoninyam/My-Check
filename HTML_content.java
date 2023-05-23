import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
          	//Write your code here
              
              String regex = "<([^<>/]+)>([^<>/]+)</(\\1)>";
              
              Pattern pattern = Pattern.compile(regex);
              
              Matcher matcher = pattern.matcher(line);
              
              if(matcher.find()){
                  
                  System.out.println(matcher.group(2));
                  
                  while(matcher.find()){
                      
                    System.out.println(matcher.group(2));
                  }
                  
              }else{
                  
                  System.out.println("None");
              }
              
        
			testCases--;
		}
        in.close();
	}
}



