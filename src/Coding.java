import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Coding {

//program to print all the subsequence of a string
    public static void subsequence(String processed, String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }

        //2 recursive calls will be made
        char ch=unprocessed.charAt(0);  //take the first character
        unprocessed=unprocessed.substring(1);   //shorten the string

        subsequence(processed+ch,unprocessed);
        subsequence(processed,unprocessed);

    }

    public static void skipi(String processed,String unprocessed)
    {
        // from hihihi remove all i's and print the remaining characters
        if(unprocessed.isEmpty())
        {
            System.out.println(processed);
            return;
        }

        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        if(ch!='i')
        {
            skipi(processed+ch,unprocessed);
        }
        else
        {
            skipi(processed,unprocessed);
        }
    }


    public static void dice(String processed,int target)
    {
        //dice problem has various application
        if(target==0)
        {
            System.out.println(processed);
            return;
        }

        for(int i=1; i<=6 && i<=target ; i++)       // condition i<=target is neccessary required to avoid inf. loop
        {
            dice(processed+i,target-i);
        }

    }

    public static void frequencyArray(String str)
    {
        //create a frequency array for characters
        char ch[]=new char[26];
        // 0-a, 1-b....25-z
        for(int i=0;i<str.length();i++)
        {
            ++ch[(str.charAt(i)-'a')];
        }

        for(int i=0;i<ch.length;i++)
            System.out.print((int)ch[i]+" ");

    }

    static int value=0;

    public static void numpad(String processed,String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            value++;
            System.out.println(processed);
            return;
        }

        int digit=unprocessed.charAt(0)-'0';    //obtain the digit

        unprocessed=unprocessed.substring(1);

        for(int i=3*(digit-1);i<3*digit;i++)
        {
            if(i==26)
                continue;
            numpad(processed+(char)(i+'a'),unprocessed);
        }

    }



    public static int countNumpad(String processed,String unprocessed)
    {
        if(unprocessed.isEmpty())
        {
            return 1;
        }

        int digit=unprocessed.charAt(0)-'0';
        unprocessed=unprocessed.substring(1);

        for(int i=3*(digit-1);i<3*digit;i++)
        {
            if(i==26)
                continue;
            return countNumpad(processed+(char)(i+'a'),unprocessed)+1;
        }

        return 1;
    }

    public static void pathFinder(String path,int row,int col)
    {
        if(row==1 && col==1)
        {
            System.out.println(path);
            return;
        }

        if(row!=1)
        {
            path=path+"V ";
            pathFinder(path,row-1,col);
        }

        if(col!=1)
        {
            path=path+"H ";
            pathFinder(path,row,col-1);
        }

    }


    public static int pathFinderCount(int row,int col)
    {
        if(row==1 && col==1)
        {
            return 1;

        }
        int count=0;
        if(row!=1)
        {
            count+=pathFinderCount(row-1,col);

//            return pathFinderCount(row-1,col);

        }

        if(col!=1)
        {
//            path=path+"H ";
            count+=pathFinderCount(row,col-1);
        }

        return count;
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

//return all permutation in a arrayList




    public static ArrayList permutationList(String processed,String unprocessed)
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




//returning count value from the function itself.

    public static ArrayList pathFinderList(int row,int col,String processed)
    {
        if(row==1 && col==1)
        {
            ArrayList list=new ArrayList();
            list.add(processed);
            return list;
        }

        ArrayList list=new ArrayList();


        if(row!=1)
        {
            list.addAll(pathFinderList(row-1,col,processed+'V'));

//            return pathFinderCount(row-1,col);
        }
        if(col!=1)
        {
//            path=path+"H ";
            list.addAll(pathFinderList(row,col-1,processed+'H'));

        }
        return list;
    }



    public static void rotateArray(int arr[][])
    {
        //first take transpose


        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();











        int temp;
        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=i;j<arr[0].length;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();




        //swapping the column itself

//        int rownumber=0;
        int low=0,high=arr[0].length-1;

        while(low<high)
        {
//            rownumber< arr[0].length-1

            for(int i=0;i<arr[0].length;i++)
            {
                temp=arr[i][low];
                arr[i][low] = arr[i][high];
                arr[i][high]=temp;
            }
            low++; high--;
        }


        for(int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String args[])
    {



        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotateArray(arr);



















//        ArrayList<String> list=pathFinderList(3,3,"");

        //list inside the base condition
        //list.addAll(recursiveFunction Returning the list);

//        ArrayList<String> list=permutationList("","ab");
//
//        for( String str : list)
//        {
//            System.out.println(str);
//        }



//      System.out.println(pathFinderCount(3,3));

//        permutation("","abc");
    }


}
