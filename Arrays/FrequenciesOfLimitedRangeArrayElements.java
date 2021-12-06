import java.util.*;

/*
    Given an array A[] of N positive integers 
    which can contain integers from 1 to P where 
    elements can be repeated or can be absent from 
    the array. Your task is to count the frequency 
    of all elements from 1 to N.

    Input:
    5
    2 3 2 10 9
    10

    Output:
    0 2 1 0 0
*/

class FrequenciesOfLimitedRangeArrayElements{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int p = sc.nextInt();
        frequencyCount(a, n, p);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    static void frequencyCount(int a[], int n, int p){
        for(int i=0; i<n; i++){
            a[i] -= 1;
        }
        for(int i=0; i<n; i++){
            if(a[i]%p<n){
                a[a[i]%p] += p;
            }
        }
        for(int i=0; i<n; i++){
            a[i] /= p;
        }
    }

}