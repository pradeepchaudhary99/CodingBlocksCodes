package leetcode;

public class LexoPermute {


    //Methods
    //1. Sort the string and find the permutation
    //2. Store the all permutation in array list and sort it
    //3. Solution using Backtracking

    //permutation


    //f[ch-'a']++;

    public static void main(String[] args) {
        String str="aab";
        int[] f=new int[26];
        freq(str,f);
    }




    public static void lexoPermutation(String proc,int [] f,int length)
    {
        if(length==0)
        {
            System.out.print(proc+" ");
            return;
        }

        for(int i=0;i<26;i++)
        {
            if(f[i]>0)
            {
                f[i]--;

                lexoPermutation(proc+(char)(i+'a'),f,length);

                f[i]++;
            }


        }

    }

    public static void freq(String str,int []f)
    {
        for (int i = 0; i <str.length() ; i++) {

        }



    }







}
