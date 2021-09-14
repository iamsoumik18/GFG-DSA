import java.io.*;
import java.util.*;

public class DigitsInFactorial {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = digitsInFactorial(n);
        System.out.println(ans);
        sc.close();
    }

    static int digitsInFactorial(int n){
        double d = 0;
        for(int i=n; i>0; i--){
            d += Math.log10(i);
        }
        return (int)d + 1;
    }
    
}