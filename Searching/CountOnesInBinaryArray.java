/*
    Given a binary sorted non-increasing array of 1s and 0s. 
    You need to print the count of 1s in the binary array.
    NOTE: Expected Time Complexity: O(LogN)

    Example 1:
    
    Input:
    n = 8
    a[] = {1,1,1,1,1,0,0,0}

    Output: 5

    Explanation: Number of 1's in given 
    binary array : 1 1 1 1 1 0 0 0 is 5.

    Example 2:

    Input:
    n = 8
    a[] = {1,1,0,0,0,0,0,0}

    Output: 2

    Explanation: Number of 1's in given 
    binary array : 1 1 0 0 0 0 0 0 is 2.
*/

import java.util.*;

public class CountOnesInBinaryArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int cnt = countOnes(a, n);
        System.out.println(cnt);
        sc.close();
    }

    static int countOnes(int a[], int n){
        int l = 0, r = n-1, id = -1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(a[m]==1){
                id = m+1;
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return id!=-1?id:0;
    }

}