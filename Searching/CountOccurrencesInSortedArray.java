/*
    Given a sorted array a of size n and an element x, 
    we need to count occurrences of x in the array.

    Input:
    6
    10 20 20 20 30 30
    20

    Output:
    3
*/

import java.util.*;

public class CountOccurrencesInSortedArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int cnt = findCount(a, n, x);
        System.out.println(cnt);
        sc.close();
    }

    static int findCount(int a[], int n, int x){
        int lb = lowerBound(a, n, x);
        return lb!=-1?upperBound(a, n, x)-lb+1:0;
    }

    static int lowerBound(int a[], int n, int x){
        int l = 0, r = n-1, id = -1;
        while(l<=r){
            int m = (l+r)/2;
            if(a[m]==x){
                id = m;
                r = m-1;
            }else if(a[m]<x){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return id;
    }

    static int upperBound(int a[], int n, int x){
        int l = 0, r = n-1, id = -1;
        while(l<=r){
            int m = (l+r)/2;
            if(a[m]==x){
                id = m;
                l = m+1;
            }else if(a[m]<x){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return id;
    }
    
}
