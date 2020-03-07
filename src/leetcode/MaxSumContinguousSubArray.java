package leetcode;

public class MaxSumContinguousSubArray
{
    public static int maxSum(int arr[])
    {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(max<sum)
                {
                    max=sum;
                }
            }
        }
        return max;

    }

    public static void main(String args[])
    {
        int arr[]={1, 2, 3, 4, -10};
        System.out.println(maxSum(arr));


    }

}
