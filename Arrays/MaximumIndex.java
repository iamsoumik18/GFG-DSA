/*
    Given an array a[] of n positive integers. 
    The task is to find the maximum of j - i 
    subjected to the constraint of a[i] <= a[j] 
    and i <= j.

    Input:
    n = 9
    a[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}

    Output:
    6

    Explanation:
    In the given array a[1] < a[7]
    satisfying the required 
    condition(a[i] <= a[j]) thus giving 
    the maximum difference of j - i 
    which is 6(7-1).
*/

import java.util.*;

public class MaximumIndex {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int max = maximumIndexDifference(a, n);
        System.out.println(max);
        sc.close();
    }

    static int maximumIndexDifference(int a[], int n){
        int leftMin[] = new int[n];
        leftMin[0] = a[0];
        for(int i=1; i<n; i++){
            leftMin[i] = Math.min(leftMin[i-1], a[i]);
        }
        int max = Integer.MIN_VALUE;
        int i=n-1, j=n-1;
        while(i>=0 && j>=0){
            if(leftMin[i]<=a[j]){
                max = Math.max(max, j-i);
                i--;
            }else{
                j--;
            }
        }
        return max;
    }
    
}
