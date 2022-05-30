/*
    You are given an array of 0, 1 and 2.
    Sort the array with O(n) time complexity.

    Input:
    9
    0 2 2 1 0 2 1 1 0

    Output:
    0 0 0 1 1 1 2 2 2
*/

import java.util.*;

public class ThreeWayPartitioning {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        threeWayPartition(a, n);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    //Dutch National Flag Algorithm
    static void threeWayPartition(int a[], int n){
        int low=0, mid=0, high = n-1;
        while(mid<=high){
            if(a[mid]==0){
                swap(a,low,mid);
                low++;
                mid++;
            }else if(a[mid]==1){
                mid++;
            }else{
                swap(a,mid,high);
                high--;
            }
        }
    }
    
    static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}