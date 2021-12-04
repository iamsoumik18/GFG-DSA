import java.util.*;

/*
    Given an array a of n integers.
    Find the maximum difference a[j]-a[i]
    such that j>i.

    Input:
    7
    2 3 10 6 4 8 1

    Output:
    8
*/

class MaximumDifference{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ans = maximumDiff(a, n);
        System.out.println(ans);
        sc.close();
    }

    static int maximumDiff(int a[], int n){
        int ans = a[1]-a[0];
        int min = a[0];
        for(int i=1; i<n; i++){
            ans = Math.max(ans, a[i]-min);
            min = Math.min(min,a[i]);
        }
        return ans;
    }

}