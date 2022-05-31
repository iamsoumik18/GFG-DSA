/*
    Given N intervals of the form [A, B]. The task is to return the maximum 
    number of overlap among these intervals at any time.

    Input:
    3
    1 2
    2 4
    3 6

    Output:
    2

    Explanation: 
    The maximum overlapping is 2(between (1 2) and 
    (2 4) or between (2 4) and (3 6)) 
*/

import java.util.*;

public class MaximumNumberOfOverlappingIntervals {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int intervals[][] = new int[n][2];
        for(int i=0; i<n; i++){
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        int res = overlap(n, intervals);
        System.out.println(res);
        sc.close();
    }

    static int overlap(int n, int[][] intervals) {
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = intervals[i][0];
            b[i] = intervals[i][1];
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int res=0, cur=0, i=0, j=0;
        while(i<n && j<n){
            if(a[i]<=b[j]){
                cur++;
                i++;
            }else{
                cur--;
                j++;
            }
            res = Math.max(res,cur);
        }
        return res;
    }
    
}
