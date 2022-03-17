/*
    Check whether an element is present in a sorted array.
    If the element is present return any index. Return
    -1 if it is not present.

    Input:
    5
    10 20 30 40 50
    30

    Output:
    2
*/

import java.util.*;

public class BinarySearch{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int id = binarySearch(a, n, x);
        System.out.println(id);
        sc.close();
    }

    static int binarySearch(int a[], int n, int x){
        int l = 0, r = n-1;
        while(l<=r){
            int m = l + (r-l) /2;
            if(a[m]==x){
                return m;
            }else if(a[m]<x){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return -1;
    }

}