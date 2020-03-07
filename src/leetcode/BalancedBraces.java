package leetcode;

import java.util.*;

public class BalancedBraces {

    //program for balanced parenthesis
    //check balancing
    public static boolean checkBalancing(String stack, String unprocessed)
    {
        if(unprocessed.isEmpty() && stack.isEmpty() )
        {
            return true;
        }
        //work

        char ch=unprocessed.charAt(0);

        if(ch=='[' || ch=='{' || ch=='(')
        {
            if(ch=='[')
                stack=stack+']';
            else if(ch=='{')
                stack=stack+'}';
            else
                stack=stack+')';

            return checkBalancing(stack,unprocessed.substring(1));
        }
        else if(ch==']' || ch=='}' || ch==')')
        {
            if(stack.isEmpty())
                return false;

            if(stack.charAt(stack.length()-1)!=ch)
                return false;
            else
            {
                return checkBalancing(stack.substring(0,stack.length()-1),unprocessed.substring(1));
            }

        }
        else
        {
            return checkBalancing(stack,unprocessed.substring(1));
        }

    }
    //return the content between the parenthesis
    //I need to return the content between the pair of parenthesis

    public static boolean flag=false;
    public static String contentParenthesis(String content,String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            return content;
        }
        //work
        if(unprocessed.charAt(0)=='(')
        {
            //start storing the content
            flag=true;
            return contentParenthesis(content,unprocessed.substring(1));
        }
        if(!flag)
        {
            return contentParenthesis(content, unprocessed.substring(1));
        }

        if(flag && unprocessed.charAt(0)!=')')
        {
            return contentParenthesis(content+unprocessed.charAt(0),unprocessed.substring(1));
        }
        else
        {
            return content;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            temp.add(i+1);
        }

        for(int i:temp)
        {
            System.out.print(i+" ");
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<temp.size()+1;i++)
        {
            ans.add(0);
        }


        int j=temp.size(); //last index of ans
        int carry=(temp.get(temp.size()-1)+1);
        int sum=temp.get(temp.size()-1)+1;

        for(int i=temp.size()-2;i>=0;i--)
        {
            ans.add(j--,sum%10);
        }







        System.out.println();
        for(int i:ans)
        {
            System.out.print(i+" ");
        }

//        System.out.println(temp.size());




    }

}
