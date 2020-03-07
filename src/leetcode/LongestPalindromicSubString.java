package leetcode;

public class LongestPalindromicSubString {


    //longest palindromic

    //check palindrom
    public static boolean checkPalindrome(String str)
    {
        if(str.isEmpty())
        {
            return true;
        }
        if(str.length()==1)
            return true;
        //our work
        if(str.charAt(0)!=str.charAt(str.length()-1))
        {
            return false;
        }
        else
        {
            return checkPalindrome(str.substring( 1,str.length()-1 ) );
        }
    }



















    public static void main(String[] args) {




    }

}

