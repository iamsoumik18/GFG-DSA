import java.io.*;
import java.util.*;

public class SieveOfEratosthenes {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime[] = sieveOfEratosthenes(n);
        for(int i=2; i<=n; i++){
            if(isPrime[i])
                System.out.print(i+" ");
        }
        System.out.println();
        sc.close();
    }

    static boolean[] sieveOfEratosthenes(int n){
        boolean isPrime[] = new boolean[n+1];
        for(int i=2; i<=n; i++){
            isPrime[i] = true;
        }
        for(int p = 2; p*p<=n; p++){
            if(isPrime[p]){
                for(int i=p*p; i<=n; i+=p){
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }
    
}
