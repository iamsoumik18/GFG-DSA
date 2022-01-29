/*
    Given an array a[] of n distinct integers, check if this array 
    is Sorted (non-increasing or non-decreasing) and Rotated counter-clockwise. 
    Note that input array may be sorted in either increasing or decreasing order, 
    then rotated. A sorted array is not considered as sorted and rotated, i.e., 
    there should be at least one rotation.

    Example 1:

    Input:
    n = 4
    a[] = {3,4,1,2}

    Output: Yes
    
    Explanation: The array is sorted 
    (1, 2, 3, 4) and rotated twice 
    (3, 4, 1, 2).

    Example 2:

    Input:
    n = 3
    a[] = {1,2,3}

    Output: No

    Explanation: The array is sorted 
    (1, 2, 3) but it is not rotated.
*/
import java.util.*;

class ArrayIsSortedAndRotated{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        if(checkRotatedAndSorted(a, n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }

    public static boolean checkRotatedAndSorted(int a[], int n){
        int min = Integer.MAX_VALUE;
        int minId = 0;
        int max = Integer.MIN_VALUE;
        int maxId = 0;
        for(int i=0; i<n; i++){
            if(a[i]<min){
                min = a[i];
                minId = i;
            }
            if(a[i]>max){
                max = a[i];
                maxId = i;
            }
        }
        if((minId+1)%n==maxId && maxId!=0){
            int i = maxId;
            while(i!=minId){
                if(a[i]>a[(i+1)%n]){
                    i = (i+1)%n;
                }else{
                    return false;
                }
            }
            
        }else if((maxId+1)%n==minId && minId!=0){
            int i = minId;
            while(i!=maxId){
                if(a[i]<a[(i+1)%n]){
                    i = (i+1)%n;
                }else{
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }

}