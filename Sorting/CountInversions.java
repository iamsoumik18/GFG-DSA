/*
    Given an array of integers. Find the Inversion Count in the array. 
    Inversion Count: For an array, inversion count indicates how far (or close) 
    the array is from being sorted. If array is already sorted then the inversion 
    count is 0. If an array is sorted in the reverse order then the inversion count 
    is the maximum. Formally, two elements a[i] and a[j] form an inversion if 
    a[i] > a[j] and i < j.

    Input:
    5
    2 4 1 3 5

    Output:
    3
*/

import java.util.*;

public class CountInversions {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        long count = mergeSortAndCount(a, 0, n-1);
        System.out.println(count);
        sc.close();
    }
    
    static long mergeSortAndCount(long a[], int l, int r){
        long count = 0;
        if(l<r){
            int m = l + (r-l)/2;
            count += mergeSortAndCount(a,l,m);
            count += mergeSortAndCount(a,m+1,r);
            count += mergeAndCount(a,l,m,r);
        }
        return count;
    }
    
    static long mergeAndCount(long a[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        long L[] = new long[n1];
        for(int i=0; i<n1; i++){
            L[i] = a[l+i];
        }
        long R[] = new long[n2];
        for(int i=0; i<n2; i++){
            R[i] = a[i+m+1];
        }
        int i=0, j=0;
		int k=l;
		long swaps = 0;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				a[k++] = L[i++];
			}else {
				a[k++] = R[j++];
				swaps += n1-i;
			}
		}
		while(i<n1) {
			a[k++] = L[i++];
		}
		while(j<n2) {
			a[k++] = R[j++];
		}
		return swaps;
    }
    
}
