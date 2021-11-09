import java.io.*;
import java.util.*;

public class StringPermutation {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        helper(s, 0);
        sc.close();
    }

    static void helper(String s, int i){
        if(i==s.length()){
            System.out.println(s);
            return;
        }
        for(int j=i; j<s.length(); j++){
            s = swap(s, i, j);
            helper(s, i+1);
        }
    }

    static String swap(String s, int i, int j){
        StringBuilder sb = new StringBuilder(s);
        char x = s.charAt(i);
        char y = s.charAt(j);
        sb.setCharAt(i, y);
        sb.setCharAt(j, x);
        return sb.toString();
    }
    
}
