/*
    Given a binary array A[] of size N. The task is to arrange the array in increasing order.
    Note: The binary array contains only 0  and 1.

    Input:
    7
    0 1 1 0 1 0 1

    Output:
    0 0 0 1 1 1 1
*/
import java.util.*;

public class BinaryArraySorting {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        binSort(a, n);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    static void binSort(int a[], int n){
        int j = 0;
        for(int i=0; i<n; i++){
            if(a[i]==0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
    }

}
