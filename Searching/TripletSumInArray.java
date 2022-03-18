/*
    Given an array arr of size n and an integer X. Find if 
    there's a triplet in the array which sums up to the 
    given integer X.

    Input:
    6
    1 4 45 6 10 8
    13

    Output:
    Yes
*/

import java.util.*;

public class TripletSumInArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        if(find3Numbers(a, n, x)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }

    //If the array is not sorted
    static boolean find3Numbers(int a[], int n, int x) { 
        for(int i=0; i<n-2; i++){
            int sum = x-a[i];
            Map<Integer,Integer> mp = new HashMap<>();
            for(int j=i+1; j<n; j++){
                if(mp.containsKey(sum-a[j])){
                    return true;
                }
                mp.put(a[j],mp.getOrDefault(a[j],0)+1);
            }
        }
        return false;
    }

    //If the array is sorted
    static boolean findTriplet(int a[], int n, int x){
        for(int i=0; i<n-2; i++){
            int sum = x-a[i];
            int l = i+1, r = n-1;
            while(l<r){
                if(a[l]+a[r]==sum){
                    return true;
                }else if(a[l]+a[r]<sum){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return false;
    }

}