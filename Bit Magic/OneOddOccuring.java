import java.io.*;
import java.util.*;

public class OneOddOccuring {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ans = oneOddOccuring(a);
        System.out.println(ans);
        sc.close();
    }

    static int oneOddOccuring(int a[]){
        int num = 0;
        for(int i: a){
            num = num ^i;
        }
        return num;
    }
    
}
