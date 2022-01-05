import java.util.*;

/*
    Given an array of integers a of size n and a number k. 
    Return the maximum sum of a subarray of size k.

    Input:
    5
    5 -10 6 90 3
    2

    Output:
    96
*/

public class MaximumSumOfKConsecutiveElements{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = maxSumK(a, n, k);
        System.out.println(ans);
        sc.close();
    }

    static int maxSumK(int a[], int n, int k){
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for(int i=0; i<k; i++){
            sum += a[i]; 
        }
        maxSum = Math.max(maxSum, sum);
        for(int i=k; i<n; i++){
            sum -= a[i-k];
            sum += a[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

}