import java.io.*;
import java.util.*;

public class SubsetSum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        int ans = helper(a, n, sum);
        System.out.println(ans);
        sc.close();
    }

    static int helper(int a[], int n, int sum){
        if(n==0){
            return sum==0?1:0;
        }
        return helper(a, n-1, sum - a[n-1]) + helper(a, n-1, sum);
    }
    
}
