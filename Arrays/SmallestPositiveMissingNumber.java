/*
    You are given an array arr[] of N integers including 0. 
    The task is to find the smallest positive number missing from the array.

    Input:
    5
    0 -10 1 3 -20

    Output:
    2
*/

import java.util.*;

public class SmallestPositiveMissingNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ans = missingNumber(a, n);
        System.out.println(ans);
        sc.close();
    }

    static int missingNumber(int a[], int n){
        int ptr = 0;
        for(int i=0; i<n; i++){
            if(a[i]==1){
                ptr = 1;
                break;
            }
        }
        if(ptr==0){
            return 1;
        }
        for(int i=0; i<n; i++){
            if(a[i]<=0 || a[i]>n){
                a[i] = 1;
            }
        }
        for(int i=0; i<n; i++){
            a[(a[i]-1)%n] += n;
        }
        for(int i=0; i<n; i++){
            if(a[i]<n){
                return i+1;
            }
        }
        return n+1;
    }
    
}
