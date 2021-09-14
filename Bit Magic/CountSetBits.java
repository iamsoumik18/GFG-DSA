import java.io.*;
import java.util.Scanner;

public class CountSetBits {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = countSetBits(n);
        System.out.println(ans);
        sc.close();
    }

    static int countSetBits(int n){
        int cnt = 0;
        while(n>0){
            cnt++;
            //Brian Kernighan’s Algorithm
            n = n&(n-1);
        }
        return cnt;
    }
    
}
