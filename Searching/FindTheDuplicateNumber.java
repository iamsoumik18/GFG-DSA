/*
    Given an array of integers a containing n + 1 integers where each integer is in 
    the range [1, n] inclusive. There is only one repeated number in a, return this repeated number.
    You must solve the problem without modifying the array a and uses only constant extra space.

    Input:
    5
    1 3 4 2 2

    Output:
    2
*/

import java.util.*;

public class FindTheDuplicateNumber{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(a, n));
        sc.close();
    }

    //Floyd's Tortoise and Hare (Cycle Detection)
    static int findDuplicate(int a[], int n){
        int slow = a[0], fast = a[0];
        do{
            slow = a[slow];
            fast = a[a[fast]];
        }while(slow!=fast);
        slow = a[0];
        while(slow!=fast){
            slow = a[slow];
            fast = a[fast];
        }
        return slow;
    }

}