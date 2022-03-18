/*
    Given two sorted arrays of sizes N and M respectively. The task is to find 
    the median of the two arrays when they get merged. If there are even number 
    of elements in the resulting array, find the floor of the average of two medians.

    Input:
    6
    10 12 14 16 18 20
    4
    2 3 5 8

    Output:
    11.0
*/

import java.util.*;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int b[] = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        System.out.println(findMedian(a, b));
        sc.close();
    }

    static double findMedian(int a[], int b[]){
        int n = a.length;
        int m = b.length;
        if(n>m){
            return findMedian(b, a);
        }
        int l = 0;
        int r = n;
        while(l<=r){
            int i1 = (l+r)/2;
            int i2 = ((n+m+1)/2) - i1;
            int min1 = i1==n?Integer.MAX_VALUE:a[i1];
            int max1 = i1==0?Integer.MIN_VALUE:a[i1-1];
            int min2 = i2==m?Integer.MAX_VALUE:b[i2];
            int max2 = i2==0?Integer.MIN_VALUE:b[i2-1];
            if(max1<=min2 && max2<=min1){
                if((n+m)%2==0){
                    return ((double)Math.max(max1, max2) + Math.min(min1, min2))/2;
                }else{
                    return ((double)Math.max(max1, max2));
                }
            }else if(max1>min2){
                r = i1-1;
            }else{
                l = i1+1;
            }
        }
        return 0.0;       
    }
    
}
