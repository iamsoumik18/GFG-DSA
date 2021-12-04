import java.util.*;

/*
    Given n integer ranges, the task is to find 
    the maximum occurring integer in these ranges. 
    If more than one such integer exits, find the 
    smallest one. The ranges are given as two arrays 
    L[] and R[].  L[i] consists of starting point of range 
    and R[i] consists of corresponding end point of the range.

    Input:
    4
    1 4 3 1
    15 8 5 4

    Output:
    4
*/

class MaximumOccuredInteger{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L[] = new int[n];
        int R[] = new int[n];
        for(int i=0; i<n; i++){
            L[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            R[i] = sc.nextInt();
        }
        int ans = maximumOcc(L, R, n);
        System.out.println(ans);
        sc.close();
    }

    static int maximumOcc(int L[], int R[], int n){
        int max = getMaximum(R);
        int freq[] = new int[max+2];
        for(int i=0; i<n; i++){
            freq[L[i]] += 1;
            freq[R[i]+1] -= 1;
        }
        int preSum = freq[0];
        int ans = 0;
        int maxSum = preSum;
        for(int i=1; i<max+2; i++){
            preSum += freq[i];
            if(preSum>maxSum){
                ans = i;
                maxSum = preSum;
            }
        }
        return ans;
    }

    static int getMaximum(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            max = Math.max(max, a[i]);
        }
        return max;
    }

}