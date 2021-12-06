import java.util.*;

/*
    Given an array arr[] of N non-negative integers representing 
    the height of blocks. If width of each block is 1, compute 
    how much water can be trapped between the blocks during the 
    rainy season.

    Input:
    5
    5 0 6 2 3

    Output:
    6
*/

class TrappingRainWater{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        long ans = trappingWater(a, n);
        System.out.println(ans);
        sc.close();
    }

    static long trappingWater(int a[], int n) { 
        int l[] = new int[n];
        int r[] = new int[n];
        long ans = 0;
        l[0] = a[0];
        for(int i=1; i<n; i++){
            l[i] = Math.max(l[i-1],a[i]);
        }
        r[n-1] = a[n-1];
        for(int i=n-2; i>=0; i--){
            r[i] = Math.max(r[i+1],a[i]);
        }
        for(int i=1; i<n-1; i++){
            ans += Math.min(l[i],r[i]) - a[i];
        }
        return ans;
    }

}