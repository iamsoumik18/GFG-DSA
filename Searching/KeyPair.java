/*
    Given an array Arr of N positive integers and another number X. 
    Determine whether or not there exist two elements in Arr whose sum 
    is exactly X.

    Input:
    6
    1 4 45 6 10 8
    16

    Output:
    Yes
*/

import java.util.*;

public class KeyPair {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        if(hasArrayTwoCandidates(a, n, x)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }

    //This can be used when array is not sorted.
    //This takes O(n) time and O(n) auxiliary space.
    //Hashing
    static boolean hasArrayTwoCandidates(int a[], int n, int x) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            if(mp.containsKey(x-a[i])){
                return true;
            }
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
        }
        return false;
    }

    //This can be used when array is sorted
    //It takes O(n) time 
    //Two Pointer approach
    static boolean isPresent(int a[], int n, int x){
        int l = 0, r = n-1;
        while(l<r){
            if(a[l]+a[r]==x){
                return true;
            }else if(a[l]+a[r]<x){
                l++;
            }else{
                r--;
            }
        }
        return false;
    }
    
}
