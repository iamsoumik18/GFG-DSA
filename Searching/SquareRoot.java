/*
    Given an integer x, find the square root of x. 
    If x is not a perfect square, then return floor(√x).

    Input:
    25

    Output:
    5
*/

import java.util.*;

public class SquareRoot {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = floorSqrt(n);
        System.out.println(ans);
        sc.close();
    }

    static long floorSqrt(long n){
        long l = 1, r = n, ans = 0;
        while(l<=r){
            long m = l+(r-l)/2;
            if(m*m==n){
                return m;
            }else if(m*m>n){
                r = m-1;
            }else{
                ans = m;
                l = m+1;
            }
        }
        return ans;
    }
    
}
