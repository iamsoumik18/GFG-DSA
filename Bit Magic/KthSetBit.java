import java.io.*;
import java.util.*;

public class KthSetBit {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(kthSetBit(n, k)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }

    static boolean kthSetBit(int n, int k){
        if((n&(1<<(k-1)))!=0){
            return true;
        }
        return false;
    }
    
}
