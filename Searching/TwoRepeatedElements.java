/*
    You are given an array of N+2 integer elements. 
    All elements of the array are in range 1 to N. 
    Also, all elements occur once except two numbers
    which occur twice. Find the two repeating numbers.

    Input:
    4
    1 2 1 3 4 3

    Output:
    1 3
*/

import java.util.*;

public class TwoRepeatedElements{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+2];
        for(int i=0; i<n+2; i++){
            a[i] = sc.nextInt();
        }
        int ans[] = twoRepeated(a, n);
        for(int num: ans){
            System.out.print(num+" ");
        }
        sc.close();
    }

    static int[] twoRepeated(int a[], int n){
        int ans[] = new int[2];
        int cnt = 0;
        for(int i=0; i<a.length && cnt<2; i++){
            if(a[Math.abs(a[i])-1]<0){
                ans[cnt++] = Math.abs(a[i]);
            }else{
                a[Math.abs(a[i])-1] *= -1;
            }
        }
        return ans;
    }


}