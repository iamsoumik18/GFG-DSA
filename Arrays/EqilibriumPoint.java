import java.util.*;

/*
    Given an array a of n numbers. The task is to find 
    the first Equilibium Point in the array. Equilibrium Point 
    in an array is a position such that the sum of elements before 
    it is equal to the sum of elements after it.

    Input:
    6
    3 4 8 -9 20 6

    Output:
    5
*/

public class EqilibriumPoint {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a[] = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
        }
        int idx = getEqilibriumPoint(a, n);
        System.out.println(idx);
        sc.close();
    }

    static int getEqilibriumPoint(long a[], int n){
        long left = 0, sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i];
        }
        for(int i=0; i<n; i++){
            sum -= a[i];
            if(sum==left){
                return i+1;
            }
            left += a[i];
        }
        return -1;
    }
    
}
