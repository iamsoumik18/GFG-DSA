import java.util.*;

/*
    Given an unsorted array a[] of size n. 
    Rotate the array to the left (counter-clockwise direction) 
    by d steps, where d is a positive integer.
    
    Input:
    5 2
    1 2 3 4 5

    Output:
    3 4 5 1 2
*/

class RotateArray{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        rotateArr(a, n, d);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    static void rotateArr(int a[], int n, int d){
        d = d%n;
        reverse(a, 0, d-1);
        reverse(a, d, n-1);
        reverse(a, 0, n-1);
    }

    static void reverse(int a[], int start, int end){
        int i = start, j = end;
        while(i<j){
            swap(a, i, j);
            i++;
            j--;
        }
    }

    static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}