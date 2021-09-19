import java.io.*;
import java.util.*;
public class GenerateSubsequence {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sol(s,"",0);
        sc.close();
    }

    static void sol(String s, String st, int i){
        if(i==s.length()){
            System.out.println(st);
            return;
        }
        sol(s, st+s.charAt(i), i+1);
        sol(s, st, i+1);
    }
    
}
