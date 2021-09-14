import java.io.*;
import java.util.*;

public class TwoMissingNumberInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n-2];
        for(int i=0; i<n-2; i++){
            a[i] = sc.nextInt();
        }
        List<Integer> ans = twoMissingNumber(a, n);
        for(int num: ans){
            System.out.print(num+" ");
        }
        System.out.println();
        sc.close();
    }

    static List<Integer> twoMissingNumber(int a[], int n){
        List<Integer> list = new ArrayList<>();

        int xor = 0;
        for(int i=1; i<=n; i++){
            xor ^= i;
        }
        for(int num: a){
            xor ^= num;
        }

        //rightmost set bit
        int setBit = xor & (~(xor-1));

        int x = 0;
        int y = 0;

        for(int num: a){
            if((num&setBit)==0){
                x ^= num;
            }else{
                y ^= num;
            }
        }
        for(int i=1; i<=n; i++){
            if((i&setBit)==0){
                x ^= i;
            }else{
                y ^= i;
            }
        }

        list.add(x);
        list.add(y);
        
        return list;
    }
    
}
