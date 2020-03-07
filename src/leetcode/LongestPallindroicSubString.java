package leetcode;
import java.util.Scanner;



public class LongestPallindroicSubString {

    public static String long_str="";

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        RecursiveCheck(str);
        System.out.println(long_str);
    }

    public static boolean checkPallindrome(String str) {
        int lo=0;
        int hi=str.length()-1;

        while(lo<hi) {

            if(str.charAt(lo) !=str.charAt(hi))
                return false;

            lo++;
            hi--;
        }
        return true;
    }

    public static void RecursiveCheck(String str) {
        if(str.length()==0)
            return;
        for(int i=1;i<=str.length();i++) {

            String s1=str.substring(0,i);
            String s2=str.substring(i);

            if(checkPallindrome(s1)) {
                if(s1.length()>long_str.length())
                    long_str=s1;
                RecursiveCheck(s2);
            }
        }
    }
}

