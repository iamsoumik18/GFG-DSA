/*
    An element is called a peak element if its value is not smaller 
    than the value of its adjacent elements(if they exists). Given an 
    array arr[] of size N, find the index of any one of its peak elements.

    Input:
    6
    1 4 3 8 9 5

    Output:
    1

    Note: Output can vary.
*/

import java.util.*;

public class FindAPeakElement{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(findPeak(a, n));
        sc.close();
    }

    static int findPeak(int a[], int n){
        int l = 0, r = n-1;
        while(l<=r){
            int m = (l+r)/2;
            if((m==0 || a[m-1]<=a[m]) && (m==n-1 || a[m+1]<=a[m])){
                return m;
            }else if(m>0 && a[m-1]>=a[m]){
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return -1;
    }

}