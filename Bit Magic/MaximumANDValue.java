import java.io.*;
import java.util.*;

public class MaximumANDValue {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ans = maximumAND(a, n);
        System.out.println(ans);
        sc.close();
    }

    static int maximumAND(int a[], int n){
        int res = 0;
        for(int bit=31; bit>=0; bit--){
            int count = checkBit((res|(1<<bit)), a, n);
            if(count>=2)
                res = res | (1<<bit);
        }
        return res;
    }

    static int checkBit(int pattern, int a[], int n){
        int count = 0;
        for(int i=0; i<n; i++){
            if((pattern&a[i])==pattern)
                count++;
        }
        return count;
    }

}