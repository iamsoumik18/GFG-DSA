import java.io.*;
import java.util.*;

public class MaximiseNumberOfCutsInARod {

    /*
    Given a rod of length N meters, and the rod can be cut in only 3 sizes A, B and C. 
    The task is to maximizes the number of cuts in rod. 
    If it is impossible to make cut then print -1.
    */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans = helper(n, a, b, c);
        System.out.println(ans);
        sc.close();
    }

    static int helper(int n, int a, int b, int c){
        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int res = Math.max(helper(n-a,a,b,c), Math.max(helper(n-b,a,b,c),helper(n-c,a,b,c)));
        if(res==-1){
            return -1;
        }
        return res+1;
    }
    
}