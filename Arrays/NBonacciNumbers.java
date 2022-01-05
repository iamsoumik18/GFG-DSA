import java.util.*;

/*
    Print first M N-Bonacci Numbers.
    Input:
    4 10

    Output: 
    0 0 0 1 1 2 4 8 15 29
*/

public class NBonacciNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printNBonacci(n, m);
        sc.close();
    }

    static void printNBonacci(int n, int m){
        int sum = 0;
        int a[] = new int[m];
        for(int i=0; i<n-1; i++){
            a[i] = 0;
        }
        a[n-1] = 1;
        sum = 1;
        for(int i=n; i<m; i++){
            a[i] = sum;
            sum -= a[i-n];
            sum += a[i];
        }
        for(int i=0; i<m; i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
