import java.io.*;
import java.util.*;

public class MissingNumberInArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n-1];
        for(int i=0; i<n-1; i++){
            a[i] = sc.nextInt();
        }
        int ans = missingNumberInArray(a,n);
        System.out.println(ans);
        sc.close();
    }

    static int missingNumberInArray(int a[], int n){
        int num = 0;
        for(int i=1; i<=n; i++)
            num = num ^ i;
        for(int i: a)
            num = num ^ i;
        return num;
    }
    
}
