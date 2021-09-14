import java.io.*;
import java.util.*;

public class ComputingPower {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long n = sc.nextLong();
        long M = 1000000007L;
        long ans = iterativePower(a, n, M);
        System.out.println(ans);
        sc.close();
    }

    static long power(long a, long n){
        if(n==0)
            return 1;
        long temp = power(a*a,n/2);
        if(n%2==0)
            return temp;
        return temp*a;
    }

    static long iterativePower(long a, long n, long M){
        long res = 1;
        while(n>0){
            if((n&1)==1)
                res = (res * a)%M;
            a = (a * a)%M;
            n = n>>1;
        }
        return res;
    }
    
}
