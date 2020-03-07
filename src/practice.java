import java.util.*;
public class practice {

    public static void printreverse(String result)
    {
        for(int i=result.length()-1;i>=0;i--)
        {
            System.out.print(result.charAt(i));
        }
        System.out.println();
    }

    public static String list[]=new String[1000];
    public static int counter=0;


    public static void printSubset(String result,int arr[],int sum,int index)
    {
        if(sum==0)
        {
            list[counter++]=result;
            return;
        }
        if(sum<0)
        {
            return;
        }

        int element=0;
        if(arr.length-1>=index)
            element=arr[index];
        else
            return;
        //include it
        printSubset(result+element+" ",arr,sum-element,index+1);

        //not including
        printSubset(result,arr,sum,index+1);


        //work
        //either to include the array first element or leave it.
    }


    public static void oddEven(int n)
    {
        if(n==0)
        {
            return;
        }

        //our work
        if(n%2!=0){
            System.out.println(n);
            oddEven(n-1);
        }
        else
        {
            oddEven(n-1);
            System.out.println(n);
        }
    }









//    static ArrayList<String> str=new ArrayList<>();
    //print subsequence in lexographical order

    //printing the subsequence
//    public static void subsequence(String processed,String unprocessed)
//    {
//        if(unprocessed.isEmpty())
//        {
//            str.add(processed);
//            return;
//        }
//        //work
//        char ch=unprocessed.charAt(0);
//        //include it
//        //not include it
//        subsequence(processed+ch,unprocessed.substring(1));
//        subsequence(processed,unprocessed.substring(1));
//    }


    static ArrayList<String> str;
    //print subsequence in lexographical order

    //printing the subsequence
    public static void subsequence(String processed,String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            str.add(processed);
            return;
        }
        //work
        char ch=unprocessed.charAt(0);
        //include it
        //not include it
        subsequence(processed+ch,unprocessed.substring(1));
        subsequence(processed,unprocessed.substring(1));
    }




    public static void main(String args[]) {





    }

}