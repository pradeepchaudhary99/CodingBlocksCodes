//import java.util.*;
//public class DynamicProgramming
//{
//
//    public static int KnapsackZeroOne(int weight[],int value[],int matrix[][],int n,int s)
//    {
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=s;j++)           //j is the current weight of the knapsack
//            {
//                if(j>=weight[i])
//                {
//                    //2 cases 1. accept the item, 2. reject the item
//                    //accept the item
//                    matrix[i][j]=Math.max( value[i]+ matrix[i-1][j-weight[i]], matrix[i-1][j]);
//                }
//                else
//                {
//                    matrix[i][j]=matrix[i-1][j];
//                }
//            }
//        }
//        return matrix[n][s];
//    }
//
//    //printing longest common subsequence
//
//    public static void lcs(String m, String n)
//    {
//        int matrix[][]=new int[m.length()+1][n.length()+1];
//
//        for(int i=0;i<m.length();i++)
//        {
//            for(int j=0;j<n.length();j++)
//            {
//                if(m.charAt(i)==n.charAt(j))
//                {
//                    matrix[i+1][j+1]=1+matrix[i][j];
//                }
//                else
//                {
//                    matrix[i+1][j+1]= Math.max( matrix[i][j+1] , matrix[i+1][j] );
//                }
//            }
//
//        }
//
//
//        //we have our matrix field with the lengths
//
//        printlcs(matrix);
//    }
//
//
//
//    public static void printlcs(String processed,int matrix[][],int row,int col,String m,String n)
//    {
//
//        if(row==0 || col==0)
//        {
//            //you have reached the end
//            if(processed.length()==matrix[m.length()][n.length()])
//            {
//
//            }
//
//        }
//
//
//
//
//
//
//
//
//
//    }
//
//
//    public static void main(String args[]) {
//
//
//        lcs("abc","acd");
//
//
//    }
//
//}
