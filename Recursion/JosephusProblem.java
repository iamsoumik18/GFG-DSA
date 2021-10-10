import java.util.*;

public class JosephusProblem {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(josephus(n, k));
        sc.close();
    }

    static int josephus(int n, int k){
        if(n==1){
            return 1;
        }
        return (josephus(n-1, k) + k - 1) % n + 1;
    }
    
}
