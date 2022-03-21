/*
    You are given N number of books. Every ith book has Ai number of pages. You have to allocate 
    contiguous books to M number of students. There can be many ways or permutations to do so. 
    In each permutation, one of the M students will be allocated the maximum number of pages. 
    Out of all these permutations, the task is to find that particular permutation in which the 
    maximum number of pages allocated to a student is the minimum of those in all the other permutations 
    and print this minimum value. Each book will be allocated to exactly one student. Each student 
    has to be allocated at least one book.

    Note: Return -1 if a valid assignment is not possible, and allotment should be in 
    contiguous order (see the explanation for better understanding).

    Input:
    4
    12 34 67 90
    2

    Output:
    113
*/

import java.util.*;

public class AllocateMinimumNumberOfPages {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(findPages(a, n, k));
        sc.close();
    }

    static int findPages(int a[], int n, int k){
        int sum = 0, max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum += a[i];
            max = Math.max(max, a[i]);
        }
        int l = max, r = sum, res = -1;
        while(l<=r){
            int m = (l+r)/2;
            if(isFeasible(a, n, k, m)){
                res = m;
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return res;
    }

    static boolean isFeasible(int a[], int n, int k, int m){
        int req = 1, sum = 0;
        for(int i=0; i<n; i++){
            if(sum+a[i]>m){
                req++;
                sum = a[i];
            }else{
                sum += a[i];
            }
        }
        return (req<=k);
    }
    
}
