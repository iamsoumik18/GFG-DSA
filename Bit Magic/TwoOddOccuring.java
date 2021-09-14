import java.io.*;
import java.util.*;

public class TwoOddOccuring {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        List<Integer> ans = twoOddOccuring(a);
        for(int i: ans){
            System.out.print(i+" ");
        }
        System.out.println();
        sc.close();
    }

    static List<Integer> twoOddOccuring(int a[]){
        List<Integer> list = new ArrayList<>();

        int xor = 0;
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

        list.add(x);
        list.add(y);
        
        return list; 
    }
    
}
