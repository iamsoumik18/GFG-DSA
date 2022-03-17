/*
    When the constrains of the problem is very large, this solution will be useful.
    The time complexity is O(log(pos)).
    This will work when the element to be searched is present and the 
    position of it is to the left of the array.

*/

import java.util.*;

public class SearchInInfiniteSizedArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(unboundedBinarySearch(a, x));
        sc.close();
    }

    static int unboundedBinarySearch(int a[], int x){
        if(a[0]==x)
            return 0;
        int i = 1;
        while(a[i]<x){
            i *= 2;
        }
        if(a[i]==x)
            return i;
        return binarySearch(a, x, (i/2)+1, i-1);
    }

    static int binarySearch(int a[], int x, int l, int r){
        while(l<=r){
            int m = (l+r)/2;
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