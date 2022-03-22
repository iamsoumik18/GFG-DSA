/*
    Given an unsorted array A of size N that contains only non-negative integers, 
    find a continuous sub-array which adds to a given number S. In case of multiple 
    subarrays, return the subarray which comes first on moving from left to right.
    If no such subarray is found, return an array consisting only one element that is -1.

    Input:
    5
    1 2 3 7 5
    12

    Output:
    2 4
*/

import java.util.*;

public class SubarrayWithGivenSum{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        ArrayList<Integer> list = subarraySum(a, n, s);
        for(int num: list){
            System.out.print(num+" ");
        }
        sc.close();
    }

    static ArrayList<Integer> subarraySum(int a[], int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        int sum = a[0], i = 0, j=1;
        while(j<=n) {
            while (sum > s && i < j-1) {
                sum -= a[i];
                i++;
            }
            if (sum==s) {
                ans.add(i+1);
                ans.add(j);
                return ans;
            }
            if (j<n)
                sum += a[j];
            j++;
        }
        ans.add(-1);
        return ans;
    }

}