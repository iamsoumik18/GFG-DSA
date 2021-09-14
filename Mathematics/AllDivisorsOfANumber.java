import java.io.*;
import java.util.*;

public class AllDivisorsOfANumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> ans = allDivisorsOfANumber(n);
        for(long num: ans){
            System.out.print(num+" ");
        }
        System.out.println();
        sc.close();
    }

    static List<Long> allDivisorsOfANumber(long n){
        List<Long> lst = new ArrayList<>();
        for(long i=1; i*i<n; i++){
            if(n%i==0){
                lst.add(i);
            }
        }
        for(long i = (long)Math.sqrt(n); i>=1; i--){
            if(n%i==0){
                lst.add(n/i);
            }
        }
        return lst;
    }
    
}
