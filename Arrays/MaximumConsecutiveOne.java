import java.util.*;

/*
    Find count of maximum consecutive 1s in a binary array.

    Input:
    9
    1 0 1 1 1 1 0 1 0

    Output:
    4
*/

class MaximumConsecutiveOne{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ans = countConsecutive(a, n);
        System.out.println(ans);
        sc.close();
    }

    static int countConsecutive(int a[], int n){
        int cnt = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            if(a[i]==1){
                cnt++;
                ans = Math.max(ans, cnt);
            }else{
                cnt = 0;
            }
        }
        return ans;
    }

}