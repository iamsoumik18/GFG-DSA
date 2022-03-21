/*
    Given an array of distinct elements which was initially sorted. 
    This array is rotated at some unknown point. The task is to find 
    the minimum element in the given sorted and rotated array. 

    Input:
    5
    3 4 5 1 2

    Output:
    1
*/

import java.util.*;

public class MinimumNumberInSortedRotatedArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(findMin(a, n));
        sc.close();
    }

    static int findMin(int[] a, int n) {
        if(n==1){
            return a[0];
        }
        int l = 0, h = n-1;
        while(l<=h){
            int m = (l+h)/2;
            if(m==0 && a[m]<a[m+1]){
                return a[m];
            }else if(m>0 && a[m-1]>a[m]){
                return a[m];
            }else if(a[m]>a[h]){
                l = m+1;
            }else{
                h = m-1;
            }
        }
        return -1;
    }
    
}
