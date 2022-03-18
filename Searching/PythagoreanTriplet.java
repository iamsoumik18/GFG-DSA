/*
    Given an array arr of N integers, write a function that returns 
    true if there is a triplet (a, b, c) that satisfies 
    a^2 + b^2 = c^2, otherwise false.

    Input:
    5
    3 2 4 6 5

    Output:
    Yes
*/

import java.util.*;

public class PythagoreanTriplet {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        if(checkTriplet(a, n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }

    static boolean checkTriplet(int[] a, int n) {
        Arrays.sort(a);
        for(int i=n-1; i>1; i--){
            int sum = a[i]*a[i];
            Map<Integer,Integer> mp = new HashMap<>();
            for(int j=i-1; j>=0; j--){
                if(mp.containsKey(sum-(a[j]*a[j]))){
                    return true;
                }
                mp.put((a[j]*a[j]),mp.getOrDefault((a[j]*a[j]),0)+1);
            }
        }
        return false;
    }
    
}
