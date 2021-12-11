import java.util.*;

/*
    You are given an array of size n. Find the maximum possible length 
    of a subarray such that its elements are arranged alternately either 
    as even and odd or odd and even.

    Input:
    5
    10 12 14 7 8

    Output:
    3
*/

class LongestEvenOddSubarray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int ans = countLongSub(a, n);
        System.out.println(ans);
        sc.close();
    }

    static int countLongSub(int a[], int n){
        int cnt = 1, maxCnt = 1;
        for(int i=1; i<n; i++){
            if(a[i]%2==0 && a[i-1]%2!=0 || a[i]%2!=0 && a[i-1]%2==0){
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);
            }else{
                cnt = 1;
            }
        }
        return maxCnt;
    }

}