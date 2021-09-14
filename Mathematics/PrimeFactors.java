import java.io.*;
import java.util.*;

public class PrimeFactors {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> ans = primeFactors(n);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
        sc.close();
    }

    static List<Long> primeFactors(long n){
        List<Long> lst = new ArrayList<>();
        if(n<=1)
            return lst;
        while(n%2==0){
            lst.add((long)2);
            n /= 2;
        }
        while(n%3==0){
            lst.add((long)3);
            n /= 3;
        }
        for(long i = 5; i*i<=n; i += 6){
            while(n%i==0){
                lst.add(i);
                n /= i;
            }
            while(n%(i+2)==0){
                lst.add((i+2));
                n /= (i+2);
            }
        }
        if(n>3)
            lst.add(n);
        return lst;
    }
    
}
