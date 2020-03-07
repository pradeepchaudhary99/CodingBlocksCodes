package leetcode;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
public class Permutation {

    public static ArrayList permutationList(String processed, String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            ArrayList list=new ArrayList();
            list.add(processed);

            return list;
        }

        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        String first="",second="";

        ArrayList list=new ArrayList();

        for(int i=0;i<=processed.length();i++)
        {
            first=processed.substring(0,i);
            second=processed.substring(i);

            list.addAll(permutationList(first+ch+second,unprocessed));
        }
        return list;
    }

    public static void permutation(String processed,String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }

        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        String first="",second="";
        for(int i=0;i<=processed.length();i++)
        {
            first=processed.substring(0,i);
            second=processed.substring(i);
            permutation(first+ch+second,unprocessed);
        }
    }

    public static void main(String[] args) {

//        permutation("","abc");
//        System.out.println();
//        permutation("","cba");


        String str="pradeep";

        char arr[]=str.toCharArray();

        Arrays.sort(arr);


        System.out.println(arr);



    }

}
