import java.io.*;
import java.util.*;

public class FactorialOfANumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = factorial(n);
        System.out.println(ans);
        sc.close();
    }

    static long factorial(long n){
        long res = 1;
        for(long i=2; i<=n; i++){
            res *= i;
        }
        return res;
    }
    
}
