import java.io.*;
import java.util.*;

public class LuckyNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(helper(n, 2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }

    static boolean helper(int curPos, int pos){
        if(curPos/pos==0){
            return true;
        }
        if(curPos%pos==0){
            return false;
        }
        return helper(curPos - (curPos/pos), pos+1);
    }

}