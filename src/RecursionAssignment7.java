public class RecursionAssignment7 {

    /*
        1. Take as input str, a number in form of a string. Write a recursive function to find
        the sum of digits in the string. Print the value returned.
    */

    public static int recursiveSum(String input,int sum)
    {
        if(input.isEmpty())
        {
            return sum;
        }

        int digit=input.charAt(0)-'0';
        return recursiveSum(input.substring(1),sum+digit);
    }

    /*
         2.Take as input str, a number in form of a string. Write a recursive function to
           convert the number in string form to number in integer form. E.g. for “1234” return
           1234. Print the value returned.
    */

public static int recursiveStringToNum(String input,int num)
    {
        if(input.isEmpty())
        {
            return num;
        }
        int digit=input.charAt(0)-'0';

        num=num+digit*(int)Math.pow(10,input.length()-1);
        return recursiveStringToNum(input.substring(1),num);

    }

    /*
      3.Take as input str1 and str2, both strings. Write a function which tests if str2 is
        reverse of str1 or not and returns a Boolean value. Print the value returned.
    */


    public static boolean recursiveTestReverse(String str1,String str2)
    {
        if(str1.isEmpty() && str2.isEmpty())
        {
            return true;
        }

        if(str1.length()!=str2.length())
            return false;

        if(str1.charAt(0)!=str2.charAt(str2.length()-1))
        {
            return false;
        }
        else
        {
            return recursiveTestReverse(str1.substring(1),str2.substring(0,str2.length()-1));
        }

    }

    /*
    4. Take as input str, a string. Write a function which tests if the string is a palindrome
       or not and returns a Boolean value. Print the value returned.
    */

    public static boolean recursiveCheckPalindrome(String input)
    {
        if(input.isEmpty())        //recursion termination
        {
            return true;
        }
        if(input.length()==1)
            return true;
        if(input.charAt(0)!=input.charAt(input.length()-1))
        {
            return false;
        }
        return recursiveCheckPalindrome(input.substring(1,input.length()-1));

    }

    /*
      5. Take as input str, a string. Write a recursive function which returns a new string in
      which all duplicate consecutive characters are separated by a ‘*’. E.g. for
     “hello” return “hel*lo”. Print the value returned.
    */

    public static String recursiveDuplicateChar(String processed,String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            return processed;
        }
        //our work
        if(unprocessed.length()==1)
        {
            return processed+unprocessed.charAt(0);
        }

        if(unprocessed.charAt(0)==unprocessed.charAt(1))
        {
            //duplicate character found
            processed=processed+unprocessed.charAt(0)+"*";

            return recursiveDuplicateChar(processed,unprocessed.substring(1));
        }
        else
        {
         return  recursiveDuplicateChar(processed+unprocessed.charAt(0),unprocessed.substring(1));

        }
    }

/*
    6. Take as input str, a string. Write a recursive function which returns a new string in
    which all duplicate consecutive characters are reduced to a single char. E.g. for
    “hello” return “helo”. Print the value returned.
 */
    public static String recursiveRemoveDuplicate(String processed,String unprocessed)
    {
     if(unprocessed.isEmpty())
     {
         return processed;
     }

     if(unprocessed.length()==1)
         return processed+unprocessed.charAt(0);

     //work
        if(unprocessed.charAt(0)!=unprocessed.charAt(1))
        {
            processed=processed+unprocessed.charAt(0);
            return recursiveRemoveDuplicate(processed,unprocessed.substring(1));
        }

        return recursiveRemoveDuplicate(processed,unprocessed.substring(1));
    }

/*
    7. Take as input str, a string. Write a recursive function which moves all ‘x’ from the
    string to its end. E.g. for “abexexdexed” return “abeedeedxxx”. Print the value
    returned.

 */

public static String moveX(String processed,String unprocessed,String allX)
{
    if(unprocessed.isEmpty())
    {
        return processed+allX;
    }
    //work
    char ch=unprocessed.charAt(0);
    if(ch=='x')
    {
        allX+=ch;
        return moveX(processed,unprocessed.substring(1),allX);
    }

    else
    {
        processed+=unprocessed.charAt(0);
        return moveX(processed,unprocessed.substring(1),allX);
    }
}

/*
    8. Take as input str, a string.
    a. Write a recursive function which counts the number of times ‘hi’ appears
    in the string. Print the value returned.
    b. Write a recursive function which removes all ‘hi’ in the string. Print the
    value returned.
    c. Write a recursive function which replaces all ‘hi’ in the string with ‘bye’.
    Print the value returned.

 */

public static int countHi(String input,int count)
{
    if(input.isEmpty())
    {
        return count;
    }

    //case-1 when string size is 1
    if(input.length()==1)
        return count;
    //work
    if(input.charAt(0)=='h' && input.charAt(1)=='i')
    {
        return countHi(input.substring(1),count+1);
    }
    else
    {
        return countHi(input.substring(1),count);
    }

}

public static String removeHi(String processed,String unprocessed)
{
    if(unprocessed.isEmpty())
    {
        return processed;
    }
    //handling the case when string contains only 1 character
    if(unprocessed.length()==1)
        return processed+unprocessed.charAt(0);

    //work
    if(unprocessed.charAt(0)=='h' && unprocessed.charAt(1)=='i')
    {
        return removeHi(processed,unprocessed.substring(2));
    }
    else
    {
        processed+=unprocessed.charAt(0);
        return removeHi(processed,unprocessed.substring(1));
    }

}

public static String replaceHiwithBye(String processed,String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            return processed;
        }
        //handling the case when string length is 1
        if(unprocessed.length()==1)
            return processed+unprocessed.charAt(0);

        //work
        if(unprocessed.charAt(0)=='h' && unprocessed.charAt(1)=='i')
        {
            return replaceHiwithBye(processed+"bye",unprocessed.substring(2));
        }
        else
        {
            return replaceHiwithBye(processed+unprocessed.charAt(0),unprocessed.substring(1));
        }

    }



    /*

       9. Take as input str, a string.
        a. Write a recursive function which counts the number of times ‘hi’ appears
        in the string – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’.
        Print the value returned.

        b. Write a recursive function which removes all ‘hi’ in the string – but skip all
        such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.

        c. Write a recursive function which replaces all ‘hi’ in the string with ‘bye’ –
        but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value
        returned.

     */

    public static int countHiType2(String unprocessed,int count)
    {
        if(unprocessed.isEmpty())
        {
            return count;
        }

        //if length is 1 do nothing
        if(unprocessed.length()==1)
            return count;

        //work
        if(unprocessed.charAt(0)=='h' && unprocessed.charAt(1)=='i')
        {
            if(unprocessed.length()==2)
            {
                return countHiType2(unprocessed.substring(1),count+1);
            }

            if(unprocessed.charAt(2)!='t')
            {
                return countHiType2(unprocessed.substring(1),count+1);
            }
            else {
                return countHiType2(unprocessed.substring(1), count);
            }
        }
        else
        {
            return countHiType2(unprocessed.substring(1),count);
        }

    }

    /*
      10. Take as input str, a string. A “twin” is defined as two instances of a char
      separated by a char. E.g. "AxA" the A's make a “twin”. “twins” can overlap, so
      "AxAxA" contains 3 “twins” - 2 for A and 1 for x. Write a function which recursively
      counts number of “twins” in a string. Print the value returned.
    */

    public static int countTwins(String unprocessed,int count)
    {
        if(unprocessed.length()<=2)
        {
            return count;
        }

        //work

        if(unprocessed.charAt(0)==unprocessed.charAt(2))
            return countTwins(unprocessed.substring(1),count+1);

        else
        {
            return countTwins(unprocessed.substring(1),count);
        }
    }

/*

    12. Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, .... z=26. Write
    a recursive function (return type void) to print all possible codes for the string. E.g.
    for “1123” possible codes are aabc, kbc, alc, aaw, kw.

 */



/*
    15. Take as input str, a string. The string is a mathematical expression e.g. “[a + {b +
    (c + d) + e} + f]”. Write a recursive function which tests if the brackets in
    expression are balanced or not and returns a Boolean value. Print the value
    returned.
 */
//public static boolean checkbalanced(String input,String chain)
//{
//    if(input.isEmpty() && chain.isEmpty())
//    {
//        return true;
//    }
//    //work
//
//    if(input.length()==1 && chain.isEmpty())
//        return true;
//
//    if(input.charAt(0)=='{' || input.charAt(0)=='[' || input.charAt(0)=='(')
//    {
//        if(input.charAt(0)=='{')
//            chain=chain+'}';
//      else if(input.charAt(0)=='(')
//            chain=chain+')';
//        else
//            chain=chain+']';
//
//        return checkbalanced(input.substring(1),chain);
//    }
//    else if(input.charAt(0)=='}' || input.charAt(0)==']' || input.charAt(0)==')')
//    {
//        if(input.charAt(0)==chain.charAt(chain.length()-1))
//        {
//            return checkbalanced(input.substring(1),chain.substring(0,chain.length()-1));
//        }
//        else
//        {
//            return false;
//        }
//    }
//    else
//    {   if(input.length()!=1)
//          return checkbalanced(input.substring(1),chain);
//    }
//
//
//}



    public static void main(String args[])
    {

          String str="pradeep";
          System.out.println();


//        System.out.println(countHiType2("hihiy",0));
//        System.out.print(replaceHiwithBye("","hi"));
//        System.out.print(removeHi("","hihihip"));
//        System.out.print(countHi("hihiihi",0));
//        System.out.print(moveX("","abexexdexed",""));
//        System.out.print(recursiveRemoveDuplicate("","lllll"));
//    System.out.print(recursiveDuplicateChar("","lllll"));


//        String str="abc";
//        System.out.println(recursiveCheckPalindrome(""));



//        System.out.println(recursiveTestReverse("a",""));





//        System.out.println(recursiveStringToNum("98765667",0));


    }






}
