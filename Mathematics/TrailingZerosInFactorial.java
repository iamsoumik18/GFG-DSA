import java.io.*;
import java.util.*;

public class TrailingZerosInFactorial {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = countTrailingZeros(n);
        System.out.println(ans);
        sc.close();
    }

    static int countTrailingZeros(int n){
        int res = 0;
        for(int i=5; i<=n; i*=5){
            res += n/i;
        }
        return res;
    }
    
}
