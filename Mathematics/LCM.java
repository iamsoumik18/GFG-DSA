import java.io.*;
import java.util.*;

public class LCM {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = lcm(a, b);
        System.out.println(ans);
        sc.close();
    }

    static long lcm(long a, long b){
        return ((a*b)/gcd(a,b));
    }

    static long gcd(long a, long b){
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    
}
