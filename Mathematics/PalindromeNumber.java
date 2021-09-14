import java.io.*;
import java.util.*;

public class PalindromeNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(isPalindrome(n)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
    
    static boolean isPalindrome(long n){
        long num = n;
        long res = 0;
        while(num>0){
            res = res*10 + num%10;
            num /= 10;
        }
        if(res==n)
            return true;
        return false;
    }

}
