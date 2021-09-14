import java.io.*;
import java.util.*;

public class CheckPowerOfTwo {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(powerOfTwo(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }

    static boolean powerOfTwo(long n){
        return n>0 && ((n&(n-1))==0);
    }
    
}
