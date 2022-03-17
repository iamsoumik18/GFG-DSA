/*

    Given a sorted and rotated array A of N distinct elements 
    which is rotated at some point, and given an element key. 
    The task is to find the index of the given element key in 
    the array A.

    Input:
    9
    5 6 7 8 9 10 1 2 3
    10

    Output:
    5
*/

import java.util.*;

public class SearchInARotatedArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(search(a, n, x));
        sc.close();
    }

    static int search(int a[], int n, int x){
        int l = 0, r = n-1;
        while(l<=r){
            int m = (l+r)/2;
            if(a[m]==x){
                return m;
            }else if(a[l]<=a[m]){
                if(a[l]<=x && x<=a[m]){
                    r = m - 1;
                }else{
                    l = m + 1;
                }
            }else{
                if(a[m]<=x && x<=a[r]){
                    l = m + 1;
                }else{
                    r = m - 1;
                }
            }
        }
        return -1;
    }
    
}
