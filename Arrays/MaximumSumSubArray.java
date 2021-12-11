import java.util.*;

/*
    Given an array a[] of n integers. 
    Find the contiguous sub-array(containing at least one number) 
    which has the maximum sum and return its sum.

    Input:
    7
    2 3 -8 7 2 -1 3

    Output:
    11
*/

class MaximumSumSubArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ans = maximumSum(a, n);
        System.out.println(ans);
        sc.close();
    }

    //Kadane's Algorithm
    static int maximumSum(int a[], int n){
        int curSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            curSum += a[i];
            maxSum = Math.max(maxSum, curSum);
            curSum = curSum<0?0:curSum;
        }
        return maxSum;
    }

}