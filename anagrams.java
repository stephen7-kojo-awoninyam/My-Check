import java.util.Scanner;
import java.util.Arrays;


public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        String k = a.toLowerCase();

        String s = b.toLowerCase();

        char[] chara = k.toCharArray();

        Arrays.sort(chara);

        String sortedA = new String(chara);

        char[] charb = s.toCharArray();

        Arrays.sort(charb);

        String sortedB = new String(charb);

        if(sortedA.compareTo(sortedB)==0){

            return true;

        }else{

            return false;

        }

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
