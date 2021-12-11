import java.util.*;

/*
    Given an array a[] of n integers arranged in a 
    circular fashion. Your task is to find the maximum 
    contiguous subarray sum.

    Input:
    7
    8 -8 9 -9 10 -11 12

    Output:
    22

    Explanation:
    Starting from the last element
    of the array, i.e, 12, and 
    moving in a circular fashion, we 
    have max subarray as 12, 8, -8, 9, 
    -9, 10, which gives maximum sum 
    as 22.
*/

class MaximumCircularSumSubarray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ans = maximumcircularSubarray(a, n);
        System.out.println(ans);
        sc.close();
    }

    /*
    Approach: Modify Kadane's algorithm to find a minimum contiguous subarray 
    sum and the maximum contiguous subarray sum, then check for the maximum value 
    between the maxSum and the value left after subtracting minSum from the total sum.
    */

    static int maximumcircularSubarray(int a[], int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i];
        }

        int curMax = 0, maxSum = Integer.MIN_VALUE, curMin = 0, minSum = Integer.MAX_VALUE;

        //Modified Kadane's Algorithm
        for(int i=0; i<n; i++){

            //Maximum Subarray Sum
            curMax += a[i];
            maxSum = Math.max(maxSum, curMax);
            curMax = curMax<0?0:curMax;

            //Minimum Subarray Sum
            curMin += a[i];
            minSum = Math.min(minSum,curMin);
            curMin = curMin>0?0:curMin;
        }

        /*
        If all elements are -ve then maximum of
        normal subarray is the answer.
        */
        if(maxSum<0){
            return maxSum;
        }

        //(sum - minSum) gives the maximum sum of circular subarray.
        int maxCircularSum = sum - minSum;
        
        //The answer is maximum of normal and circular subarray.
        return Math.max(maxSum, maxCircularSum);

    }

}