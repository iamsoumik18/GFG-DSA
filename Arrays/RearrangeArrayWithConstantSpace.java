/*

    Given an array a[] of size n where every element is 
    in the range from 0 to n-1. Rearrange the given array 
    so that a[i] becomes a[a[i]].

    Input:
    n = 5
    a[] = {4,0,2,1,3}

    Output: 3 4 2 0 1
    
    Explanation: 
    a[a[0]] = a[4] = 3.
    a[a[1]] = a[0] = 4.
    and so on.

*/

import java.util.*;

public class RearrangeArrayWithConstantSpace{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        rearrange(a, n);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    /*
    Here we are going to use the following formula
    Divident = Divisor*Quotient + Remainder
    where,
    Divident = modified value in the array
    Divisor = size of array
    Quotient = new value
    Remainder = old value

    Since it is mentioned the value is in range 0 to n-1,
    we will try to modify the array in such a way such that we get 
    the old and new value by performing some operations.
    After using the above formula, we observe that we can get the old 
    value by taking modulo of the new value with n and also we can get 
    our required value by dividing the new value with n.

    */

    static void rearrange(long a[], int n){
        for(int i=0; i<n; i++){
            a[i] = ((a[(int)(a[i]%n)]%n)*n) + (a[i]%n);
        }
        for(int i=0; i<n; i++){
            a[i] = a[i]/n;
        }
    }

}