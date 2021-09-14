import java.io.*;
import java.util.*;

public class Exactly3Divisors {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = exactly3Divisors(n);
        System.out.println(ans);
        sc.close();
    }

    static int exactly3Divisors(int n){
        int cnt = 0;
        for(int i=2; i*i<=n; i++)
            if(isPrime(i))
                cnt++;
        return cnt;
    }

    static boolean isPrime(int n){
        if(n==1)return false;
        if(n==2 || n==3)return true;
        if(n%2==0 || n%3==0)return false;
        for(int i=5; i*i<=n; i+=6){
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
    
}
