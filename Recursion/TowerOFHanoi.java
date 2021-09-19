import java.io.*;
import java.util.*;

public class TowerOFHanoi {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = towerOfHanoi(n, 1, 3, 2);
        System.out.println(ans);
        sc.close();
    }

    static long towerOfHanoi(int n, int from, int to, int aux){
        long cnt = 1;
        if(n==1){
            System.out.println("Move disk "+n+" from rod "+from+" to rod "+to);
            return cnt;
        }
        cnt += towerOfHanoi(n-1, from, aux, to);
        System.out.println("Move disk "+n+" from rod "+from+" to rod "+to);
        cnt += towerOfHanoi(n-1, aux, to, from);
        return cnt;
    }
    
}
