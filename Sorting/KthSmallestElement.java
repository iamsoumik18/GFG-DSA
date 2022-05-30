/*
    Given an array arr[] of N positive integers and a number K. 
    The task is to find the kth smallest element in the array.

    Input:
    5
    3 5 4 2 9
    3

    Output:
    4
*/

import java.util.*;

public class KthSmallestElement{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ele = kthSmallest(a, n, k);
        System.out.println(ele);
        sc.close();
    }

    static int kthSmallest(int a[], int n, int k){
        int l=0, r=n-1;
        while(l<=r){
            int p = partition(a,l,r);
            if(p==k-1){
                return a[p];
            }else if(p<k-1){
                l = p+1;
            }else{
                r = p-1;
            }
        }
        return -1;
    }
    
    static int partition(int a[], int l, int r){
        int pivot = a[r];
        int pIndex = l;
        for(int i=l; i<r; i++){
            if(a[i]<=pivot){
                int temp = a[i];
                a[i] = a[pIndex];
                a[pIndex] = temp;
                pIndex++;
            }
        }
        int temp = a[pIndex];
        a[pIndex] = a[r];
        a[r] = temp;
        return pIndex;
    }

}