import java.io.*;
import java.util.*;

public class PalindromeCheck {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(isPalindrome(s, 0, s.length()-1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }

    static boolean isPalindrome(String s, int i, int j){
        if(i>=j){
            return true;
        }
        return s.charAt(i)==s.charAt(j) && isPalindrome(s,i+1,j-1);
    }

}