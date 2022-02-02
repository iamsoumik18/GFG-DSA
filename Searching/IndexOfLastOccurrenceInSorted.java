/*
    Given a sorted array a containing n elements with possibly 
    duplicate elements, the task is to find index of last occurrence 
    of an element x in the given array.

    Input:
    5
    10 15 15 15 20
    15

    Output:
    3
*/

import java.util.*;

public class IndexOfLastOccurrenceInSorted {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int id = findLastOccur(a, n, x);
        System.out.println(id);
        sc.close();
    }

    static int findLastOccur(int a[], int n, int x){
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
