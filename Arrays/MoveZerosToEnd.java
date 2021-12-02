import java.util.*;

/*
    Given an array a[] of N positive integers. 
    Push all the zero’s of the given array to the right end 
    of the array while maitaining the order of non-zero elements.

    Input:
    6
    2 4 0 3 0 6

    Output:
    2 4 3 6 0 0
*/

class MoveZerosToEnd{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        moveZerosToEnd(a);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    static void moveZerosToEnd(int a[]){
        int cnt = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                swap(a, i, cnt);
                cnt++;
            }
        }
    }

    static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}